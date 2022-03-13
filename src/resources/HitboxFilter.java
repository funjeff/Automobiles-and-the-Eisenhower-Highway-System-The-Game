package resources;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import main.ColidableVector;
import resources.Sprite;



public class HitboxFilter {

	public HitboxFilter () {
		
	}
	// glitchyness happens with this one when you use scalled images (it happens with the other one too just to a smaller degree)
	public ArrayList<Rectangle[]> filter (ArrayList<ParsedFrame> frames) {

		ArrayList<Rectangle[]> result = new ArrayList<Rectangle[]> ();
		Iterator<ParsedFrame> frameIter = frames.iterator ();
		Iterator<Pixel> pixelIter;
		while (frameIter.hasNext ()) {
			ArrayList<Pixel> hitboxPixels = new ArrayList<Pixel> ();
			pixelIter = frameIter.next ().getPixels ().iterator ();
			while (pixelIter.hasNext ()) {
				Pixel working = pixelIter.next ();
				hitboxPixels.add (working);
			}
			ArrayList <Rectangle> hitboxes = new ArrayList <Rectangle>();
			
				
				for (int i = 0; i < hitboxPixels.size(); i++) {
					Pixel topLeft = hitboxPixels.get (i);		
					for (int j = 0; j < hitboxPixels.size(); j++) {
						Pixel bottomRight = hitboxPixels.get (j);
						if (bottomRight.getRgb() == topLeft.getRgb() && !bottomRight.equals(topLeft) && bottomRight.getX() >= topLeft.getX() && topLeft.getY() <= bottomRight.getY()) {
							hitboxes.add(new Rectangle (topLeft.getX (), topLeft.getY (), bottomRight.getX () - topLeft.getX (), bottomRight.getY () - topLeft.getY ()));
							break;
						}
					}
				}
				
				
				Rectangle [] realRects = new Rectangle [hitboxes.size()];
				
				for (int i = 0; i < hitboxes.size(); i++) {
					realRects[i] = hitboxes.get(i);
				}
				
				result.add (realRects);
		}
		return result;
	}
	
	public ArrayList<ColidableVector> filterLines (ArrayList<ParsedFrame> frames) {

		ArrayList<Rectangle[]> result = new ArrayList<Rectangle[]> ();
		Iterator<ParsedFrame> frameIter = frames.iterator ();
		Iterator<Pixel> pixelIter;
		
		HashMap <Integer,int[]> colorToPos = new HashMap<Integer,int[]>();
		ArrayList <Integer> colors = new ArrayList <Integer>();
		while (frameIter.hasNext ()) {
			
			pixelIter = frameIter.next ().getPixels ().iterator ();
			while (pixelIter.hasNext ()) {
				Pixel working = pixelIter.next ();
				int [] posArr;
				if (!colors.contains(working.getColor())) {
					colors.add(working.getColor());
				}
				if (colorToPos.get(working.getColor()) == null) {
					posArr = new int [8];
					posArr[0] = working.getX(); //topleft x
					posArr[1] = working.getY(); //topleft y
					posArr[2] = working.getX(); // bottomright x
					posArr[3] = working.getY(); // bottomright y
					
					//in some cases it using the bottemleft-topright can be crutial to sucess so we will keep track of those too
					posArr[4] = working.getX(); //bottomleft x
					posArr[5] = working.getY(); //bottomleft y
					posArr[6] = working.getX(); // topright x
					posArr[7] = working.getY(); // topright y
				} else {
					posArr = colorToPos.get(working.getColor());
						//collect info about top left
						if (working.getY() < posArr[1] || (working.getY() == posArr[1] && working.getX() < posArr[0])) {
							posArr[0] = working.getX();
							posArr[1] = working.getY();
						}
						// collect info about the bottom right
						if (working.getY() > posArr[3] || (working.getY() == posArr[3] && working.getX() > posArr[2])) {
							posArr[2] = working.getX();
							posArr[3] = working.getY();
						}
						//collect info about bottom left
						if (working.getY() > posArr[5] || (working.getY() == posArr[5] && working.getX() < posArr[4])) {
							posArr[4] = working.getX();
							posArr[5] = working.getY();
						}
						// collect info about the top right
						if (working.getY() < posArr[7] || (working.getY() == posArr[7] && working.getX() > posArr[6])) {
							posArr[6] = working.getX();
							posArr[7] = working.getY();
						}
				}
				colorToPos.put(working.getColor(),posArr);
			}
		}
		ArrayList <ColidableVector> vectors = new ArrayList <ColidableVector>();
			
		for (int i = 0; i < colors.size(); i++) {
			//System.out.println(colorToPos.get(colors.get(i)));
			
			//use witchever set of points spans the largest x range if they are equal use whitchever one if funnyer
			int TLBRrange = colorToPos.get(colors.get(i))[2] - colorToPos.get(colors.get(i))[0];
			int BLTRrange = colorToPos.get(colors.get(i))[6] - colorToPos.get(colors.get(i))[4];
	
			if (TLBRrange < 0) {
				TLBRrange = TLBRrange * -1;
			}
			
			if (BLTRrange < 0) {
				BLTRrange = BLTRrange * -1;
			}
			
			if (TLBRrange > BLTRrange) {
				vectors.add(new ColidableVector(new Point(colorToPos.get(colors.get(i))[0],colorToPos.get(colors.get(i))[1]), new Point(colorToPos.get(colors.get(i))[2],colorToPos.get(colors.get(i))[3]) ));
			} else {
				vectors.add(new ColidableVector(new Point(colorToPos.get(colors.get(i))[4],colorToPos.get(colors.get(i))[5]), new Point(colorToPos.get(colors.get(i))[6],colorToPos.get(colors.get(i))[7]) ));
			}
		}
		
		return vectors;
}
	
	public ArrayList<Rectangle[]> filter (Sprite sprite) {
		return filter (PixelParser.parse (sprite));
	}
	public ArrayList<ColidableVector> filterLines(Sprite sprite) {
		// TODO Auto-generated method stub
		return filterLines (PixelParser.parse (sprite));
	}
}