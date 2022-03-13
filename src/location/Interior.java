package location;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.awt.image.RasterFormatException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;

import json.JSONArray;
import json.JSONException;
import json.JSONObject;
import main.Actor;
import main.ColidableVector;
import main.GameCode;
import main.MainLoop;
import resources.HitboxFilter;
import resources.Pixel;
import resources.PixelParser;
import resources.Sprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


import java.awt.image.BufferedImage;

public class Interior{
	
	ArrayList <ColidableVector> buildingOutline = new ArrayList <ColidableVector>();
	ArrayList <Sprite> floorLines = new ArrayList <Sprite> (); //the floor is rendered by rendering tons of slim lines that go from one wall to the other I save them here so I don't have to generate them a bunch of times 
	BufferedImage floorPlan;
	ArrayList <Point> lineposs = new ArrayList <Point>(); //the pos's to draw the floorlines on
	
	ArrayList <Actor> actors = new ArrayList <Actor>();
	
	public Interior(String interiorPath) {
		
		//adds all lines from base image into the interior
		HitboxFilter filter = new HitboxFilter();
		
		String baseImage = interiorPath + "base.png";
		
		Sprite hitboxImage = new Sprite (baseImage);
		
		buildingOutline.addAll(filter.filterLines(new Sprite(hitboxImage)));
		
		ArrayList <Pixel> objectPlacement  = new ArrayList <Pixel>();
		
		//saves object info
		try {
		String objectInfo = interiorPath + "objects.png";
		Sprite objectImage = new Sprite (objectInfo);
		
		objectPlacement.addAll(PixelParser.parse(objectImage).get(0).getPixels());
		} catch (NullPointerException e) {
			
		}
		
		
		//adds lines from optional images into interior
		File directory = new File(interiorPath);
		
		String [] subDirs = directory.list();
		
		Random r = new Random();
		
		for (int i = 0; i < subDirs.length; i++) {
			
			File subDirectory = new File(interiorPath + subDirs[i]);
			if (subDirectory.isDirectory()) {
				String [] alternates = subDirectory.list();
				int random = r.nextInt(alternates.length);
				while (alternates[random].length() >= 8 && alternates[random].substring(0, 7).equals("objects")) {
					random = r.nextInt(alternates.length);
				}
				
				Sprite correctAlternate = new Sprite (subDirectory + "\\" + alternates[random]);
				
				//saves object info
				try {
				String objectInfo = subDirectory + "\\objects" + (random + 1) + ".png";
				
				File f = new File (objectInfo);
				BufferedImage img = ImageIO.read (f); // I fucking hate that I have to do this to get it to catch the error
				
				Sprite objectImage = new Sprite (objectInfo);
				
				objectPlacement.addAll(PixelParser.parse(objectImage).get(0).getPixels());
				} catch (IOException e) {
					
				}
				buildingOutline.addAll(filter.filterLines(new Sprite(correctAlternate)));
				
			} 
		}
		
		addActors(objectPlacement,interiorPath);
		
		//generates the sprites of the lines that make up the room
		floorPlan = Sprite.getImage(interiorPath + "background.png");
		
		
		
		double highestPoint = 10000000;
		double lowestPoint = 0;
		
		
		//the highest and lowest point of an outline will allways be on the end points of one of the lines
		for (int i = 0; i < buildingOutline.size(); i++) {
			ColidableVector cur = buildingOutline.get(i);
			//checks the startpoint
			if (cur.startPoint.getY() > lowestPoint) {
				lowestPoint = cur.startPoint.getY();
			}
			if (cur.startPoint.getY() < highestPoint) {
				highestPoint = cur.startPoint.getY();
			}
			
			//checks the endpoint
			if (cur.endPoint.getY() > lowestPoint) {
				lowestPoint = cur.endPoint.getY();
			}
			if (cur.endPoint.getY() < highestPoint) {
				highestPoint = cur.endPoint.getY();
			}
			
			
		}
		
		ArrayList <Point> xs = new ArrayList<Point>();
		//strips are 2 high
		for (double i = highestPoint; i < lowestPoint; i = i + 2) {
			for (int j = 0; j <buildingOutline.size(); j++) {
				ColidableVector curr = buildingOutline.get(j);
				
				double xOf = curr.getXof(i);
				
				if (xOf != -1 && xOf != -2) {	
					xs.add(new Point ((int)xOf,(int)i));
				} // else if (xOf == -2 && (curr.startPoint.y == i || curr.startPoint.y == i+1)) { //deals with directly horizontal lines (or at least lines close to it)
					
//					if (curr.startPoint.x < curr.endPoint.x) {
//						floorLines.add(new Sprite(floorPlan.getSubimage(curr.startPoint.x,curr.startPoint.y,curr.endPoint.x - curr.startPoint.x,2)));
//						lineposs.add(new Point (curr.startPoint.x, curr.startPoint.y));
//					} else {
//						floorLines.add(new Sprite(floorPlan.getSubimage(curr.endPoint.x,curr.endPoint.y,curr.startPoint.x - curr.endPoint.x,2)));
//						lineposs.add(new Point (curr.endPoint.x, curr.endPoint.y));
//					}
				//}
			}
		}
			//sorts the x positions so they go from left to right
			xs.sort(new sortByPoints());
			
			int curPos = 0;
			
			
			ArrayList <Point> subPoints = new ArrayList <Point>();
			
			while (true) {
				try {
					
					Point curr = xs.get(curPos);
					if (subPoints.isEmpty()) {
						subPoints.add(curr);
						
					} else if(subPoints.get(0).y == curr.y){
						subPoints.add(curr);
						
					} else {
						//for now we are going to assume there is 1 or 0 false positives per set 
						if (subPoints.size() % 2 == 0) {
							subPoints = new ArrayList <Point>();//even number of points no false positvies
							curPos = curPos -1;
						} else {
							//odd number of points a false positive exists lets eliminate it
							
							//for now our method of elimnating false positives is the remove the point that is closest to a point on the line segement that generated it
							//this way lines that drag on a bit too long will be caught
							//the disadvantage of this test is that we can't be certain that in every case the false positive is will be caught
							//in cases of juctions we may elimenate the real one instead this wont be a problem as using the false positive is fine in this case
							//the case that will cause problems is when the false positives line segement is longer than another line segement Ive been wracking my brain and I just can't think of any way to deal with this
							//it wont be noticable all the time but could be I should try to minimize this error in the line drawing itself
							
							//Note we diden't actually save the lines that these go with so Ill just compare them to every line hopefully its not too time consuming
							double minDist = 1000000;
							int distIndex = 0;
							
							for (int i = 0; i < subPoints.size(); i++) {
								Point cpmPoint = subPoints.get(i);
								for (int j = 0; j < buildingOutline.size(); j++) {
									Point startPoint = buildingOutline.get(j).startPoint;
									Point endPoint = buildingOutline.get(j).endPoint;

									double dist1 = Math.sqrt(Math.pow(cpmPoint.x - startPoint.x, 2) + Math.pow(cpmPoint.y - startPoint.y, 2));
									double dist2 = Math.sqrt(Math.pow(cpmPoint.x - endPoint.x, 2) + Math.pow(cpmPoint.y - endPoint.y, 2));
									
									if (dist1 < minDist) {
										minDist = dist1;
										distIndex = i;
									}
									if (dist2 < minDist) {
										minDist = dist2;
										distIndex = i;
									}
								}
							}
							curPos = curPos -2;
							xs.remove(subPoints.get(distIndex));//removes the odd man out
							subPoints = new ArrayList <Point>();
						}
					}
				
				curPos = curPos + 1;
				} catch (IndexOutOfBoundsException e) {
					break;
				}
			}
			
			for (int j = 0; j < xs.size(); j = j + 2) {
				//very funny cast
				if (j + 2 < floorPlan.getHeight()) {
					floorLines.add(new Sprite(floorPlan.getSubimage((int)((double)xs.get(j).x),(int)xs.get(j).y,(int)(xs.get(j+1).x -xs.get(j).x),2)));
					lineposs.add(new Point ((int)((double)xs.get(j).x), (int)((double)xs.get(j).y)));
				}
			}
		
	}
	
	public void renderInterior() {
		//System.out.println(floorLines.size());

//		Graphics g = MainLoop.getWindow().getBuffer();
//		
//		g.setColor(new Color (0xFFFFFFF));
//	
//		ArrayList <ColidableVector> outline = buildingOutline;
//		
//		for (int i = 0; i < outline.size(); i++) {
//			g.drawLine(outline.get(i).startPoint.x - GameCode.getVeiwX(), outline.get(i).startPoint.y - GameCode.getVeiwY(), outline.get(i).endPoint.x - GameCode.getVeiwX(), outline.get(i).endPoint.y - GameCode.getVeiwY());
//			System.out.println(outline.get(i).startPoint.x + ", " +outline.get(i).startPoint.y + " end " + outline.get(i).endPoint.x + ", " +outline.get(i).endPoint.y);
//		}
		for (int i = 0; i < floorLines.size();i++) {
			
			floorLines.get(i).draw(GameCode.getVeiwX() + lineposs.get(i).x, lineposs.get(i).y);
		}
		for (int i = 0; i < actors.size(); i++) {
			actors.get(i).draw();
			actors.get(i).frameEvent();
		}
	}

	public boolean isColidingInterior (Actor with) {
		if (with.isColliding(buildingOutline)) {
			return true;
		}
		
		for (int i = 0; i < actors.size(); i++) {
			if (with.isColliding(actors.get(i)) && actors.get(i).isSolid()) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * override to spawn actors in a specific way
	 * @param actors the pixels that represent positions to put actors 
	 */
	public void addActors(ArrayList <Pixel> actors, String folderPath) {
		try {
			JSONObject pixelInfo = new JSONObject(folderPath + "objects.txt");
			
			ArrayList <Object> pixels = ((JSONArray) pixelInfo.get("pixels")).getContents();
			
			for (int i = 0; i < actors.size(); i++) {
				JSONObject actorInfo = null;
				for (int j = 0; j < pixels.size(); j++) {
					JSONObject cur = (JSONObject)pixels.get(j);
					if (Integer.parseInt(cur.getString("color").substring(0,2),16) == actors.get(i).getRed() && Integer.parseInt(cur.getString("color").substring(2,4),16) == actors.get(i).getGreen() && Integer.parseInt(cur.getString("color").substring(4,6),16) == actors.get(i).getBlue()) {
						actorInfo = cur;
						break;
					}
				}
				if (actorInfo == null) {
					continue;
				}
				
				Random r = new Random ();
				
				if (actorInfo.getString("chance") == null || r.nextInt(100) < actorInfo.getInt("chance")) {
					JSONArray objects = actorInfo.getJSONArray("objects");
					
					String object;
					
					String params = actorInfo.getString("parameters");
					
					if (objects != null) {
						object = (String) objects.getContents().get(r.nextInt(objects.getContents().size()));
					} else {
						object = actorInfo.getString("object");
					}
					if (object == null) {
						continue;
					}
					
					Actor newA = null;
					
					try {
						Class<?> cls = Class.forName("gameElements." + object);
						
						if (params != null) {
							Class <?> string = Class.forName("java.lang.String");
							
							newA = (Actor)cls.getConstructor(string).newInstance(params);
						} else {
							newA = (Actor)cls.getConstructor().newInstance();
						}
					} catch (ClassNotFoundException  | InstantiationException | IllegalAccessException | IllegalArgumentException
							| InvocationTargetException | NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (newA == null) {
						continue;
					}
					
					if (actorInfo.getString("sprite") != null) {
						newA.setSprite(new Sprite(actorInfo.getString("sprite")));
					}
					
					this.actors.add(newA);
					
				}
				
			}
			
		} catch (JSONException e) {
			//e.printStackTrace();
		}
	}
	
	public class sortByPoints implements Comparator<Point>
	{

		@Override
		public int compare(Point o1, Point o2) {
			if (o1.y > o2.y) {
				return 1;
			}
			
			if (o1.y < o2.y) {
				return -1;
			}
			
			if (o1.x > o2.x) {
				return 1;
			}
			
			if (o1.x < o2.x) {
				return -1;
			}
			
			return 0;	
			}
		}
		
	}
	
//	private class Pair {
//		double left;
//		double right;
//		
//		public Pair () {
//			
//		}
//		
//		public void setLeft(double left) {
//			this.left = left;
//		}
//		public void setRight(double right) {
//			this.right = right;
//		}
//		
//		public double getLeft() {
//			return left;
//		}
//		public double getRight() {
//			return right;
//		}
//		
//	}
	
	
	

