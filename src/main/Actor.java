package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import resources.AnimationHandler;
import resources.HitboxFilter;
import resources.Sprite;

public class Actor {
	
	private int x;
	
	private int y;
	
	private Sprite sprite;
	
	private double xOffset;
	
	private double yOffset;
	
	private double hitboxWidth;
	
	/**
	 * The height of this GameObject's hitbox
	 */
	
	private double  hitboxHeight;
	
	/**
	 * The horizontal offset of this GameObject's hitbox
	 */
	
	private AnimationHandler handler;
	
	private boolean hitboxBorders = false;
	
	private double distanceFromCamera = 0;
	
	/** 
	 * not even sure if this works honestly
	 */
	int drawX;
	
	int prevHeight = -4200000;
	
	HitboxFilter filter = new HitboxFilter();
	
	private ArrayList <ColidableVector> outline;
	
	public boolean solid = true;
	

	public Actor () {
		handler = new AnimationHandler (new Sprite ("resources/sprites/blank.png"));
		this.setSprite(new Sprite ("resources/sprites/blank.png"));
	}
	public Actor (Sprite sprite) {
		handler = new AnimationHandler (sprite);
		this.setSprite(sprite);
	}
	
	public AnimationHandler getAnimationHandler () {
		return handler;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean goX(int x) {
		int oldX = this.x;
		this.x = x;
		if (LocationHandler.isCollidingLocation(this)) {
			this.x = oldX;
			return false;
		}
		return true;
	}
	
	public boolean goY(int y) {
		int oldY = this.y;
		this.y = y;
		if (LocationHandler.isCollidingLocation(this)) {
			this.y = oldY;
			return false;
		}
		return true;
	}
	
	public Sprite getSprite() {
		return sprite;
	}
	
	/**
	 * Returns all of this GameObject's hitboxs. Constructs a new Rectangle object each call.
	 * @return A Rectangle array representing this GameObject's hitboxs
	 */
	public Rectangle hitbox () {
		Rectangle hitbox = new Rectangle ((int)(x + xOffset), (int) (y + yOffset), (int)hitboxWidth, (int)hitboxHeight);
		return hitbox;
	}
	public void setSprite(Sprite sprite) {
		handler = new AnimationHandler (sprite);
		this.sprite = sprite;
		handler.resetImage(sprite);
	}
	public void draw () {
		if (distanceFromCamera != 0) {
			
			BufferedImage img = this.getSprite().getFrame(handler.getFrame());
	
			int scaleX = (int) (img.getWidth() * 1/distanceFromCamera);
			int scaleY = (int) (img.getHeight() * 1/distanceFromCamera);
			
			ArrayList <ColidableVector> lines = new ArrayList <ColidableVector>();
		
			Sprite hitboxImage;
			
			
			try {
				String [] path = this.getSprite().getImagePath().split("/");
				
				
				String parsepath = "";
				
				
				for (int i = 0; i < path.length - 1; i++) {
					if (!parsepath.equals("")) {
						parsepath = parsepath + "/" + path[i];
					} else {
						parsepath = path[i];
					}
				}
				
				
				parsepath = parsepath + "/masks/" + path[path.length -1]; //may cause problems if people like \ instead of /
				
				File f = new File (parsepath);
				BufferedImage unused = ImageIO.read (f);
				
				hitboxImage = new Sprite (parsepath);
				
				lines = filter.filterLines(new Sprite(hitboxImage)); //there has got to be some fucking reason I did this but I can't figure out what the hell it would have been
		
				
				} catch (IOException | NullPointerException e) {
					
					Rectangle old = this.hitbox();
					
					boolean coliding = false;
					
					if (old != null) {
						coliding = LocationHandler.isCollidingLocation(this);
					} else {
						coliding = false;
					}
					
					//updates hitbox
					this.setHitbox(new Rectangle (this.getX(),this.getY(),(int)(img.getWidth() * 1/distanceFromCamera),(int)(img.getHeight() * 1/distanceFromCamera)));
					
					if (!coliding && LocationHandler.isCollidingLocation(this)) {
						this.setHitbox(old); //if you werent coliding before but you are now don't change the hitbox
					}
					
				}
			for (int i =0; i < lines.size(); i++) {
			
				lines.get(i).endPoint.x = (int)  (lines.get(i).endPoint.x * 1/distanceFromCamera);
				lines.get(i).endPoint.y = (int) (lines.get(i).endPoint.y * 1/distanceFromCamera);
				
				lines.get(i).startPoint.x = (int) (lines.get(i).startPoint.x * 1/distanceFromCamera);
				lines.get(i).startPoint.y = (int) (lines.get(i).startPoint.y * 1/distanceFromCamera);
				
			}
			
			this.setLines(lines); 
				
			Image image = img.getScaledInstance(scaleX, scaleY, Image.SCALE_SMOOTH);
			BufferedImage buffered = new BufferedImage(scaleX, scaleY, 2);
			buffered.getGraphics().drawImage(image, 0, 0 , null);
			
			//slope of road is 1.5 (conviently)
		
//			if (prevHeight != -4200000) {
//				double slope = 1.5;
//				
//				double heightDisplacement = Math.abs(buffered.getHeight() - prevHeight);
//
//				double runOverRise = 1/slope;
//				
//								
//				this.setX((int)(this.getX() + runOverRise * heightDisplacement)); //run over rise times rise
//			
//			}
			//prevHeight = buffered.getHeight();
			
			handler.draw(x - GameCode.getVeiwX(), y - GameCode.getVeiwY(),new Sprite (buffered));
			
		} else {
			handler.draw(x - GameCode.getVeiwX(), y - GameCode.getVeiwY());
		}
		if (hitboxBorders) {
			if (outline == null || outline.isEmpty()) {
				
				Rectangle hitboxes = this.hitbox();
				
				Graphics g = MainLoop.getWindow().getBuffer();
				g.setColor(new Color (0xFFFFFFF));
				g.drawRect(hitboxes.x- GameCode.getVeiwX(), hitboxes.y - GameCode.getVeiwY(), hitboxes.width, hitboxes.height);
			} else {
				
				Graphics g = MainLoop.getWindow().getBuffer();
				
				g.setColor(new Color (0xFFFFFFF));
				
				ArrayList <ColidableVector> outline = this.getOutline();
				
				for (int i = 0; i < outline.size(); i++) {
					g.drawLine(outline.get(i).startPoint.x - GameCode.getVeiwX(), outline.get(i).startPoint.y - GameCode.getVeiwY(), outline.get(i).endPoint.x - GameCode.getVeiwX(), outline.get(i).endPoint.y - GameCode.getVeiwY());
				}
			}
		}
	}
	public void frameEvent () {
		
	}

	/**
	 * Runs a collision check between this GameObject and another GameObject. Does not generate a CollisionInfo object.
	 * @param obj The object to check for collision with
	 * @return True if the objects collide; false otherwise
	 */
	public boolean isColliding (Actor obj) {
		boolean thisOutLine = false;
		boolean otherOutLine = false;
		
		if (this.outline != null && !this.outline.isEmpty()) {
			thisOutLine = true;
		}
		
		if (obj.outline != null && !obj.outline.isEmpty()) {
			otherOutLine = true;
		}
		
		if (!thisOutLine && !otherOutLine) {
			Rectangle thisHitbox = hitbox ();
			Rectangle objHitbox = obj.hitbox ();
			
			if (thisHitbox == null || objHitbox == null) {
				return false;
			}
			if (thisHitbox.intersects (objHitbox)) {
				return true;
			}
		} else {
			if (thisOutLine && otherOutLine) {
				return this.runOutLineCollision(obj);
			} else {
				if (thisOutLine) {
					if (obj.hitbox() == null) {
						return false;
					}
					for (int i = 0; i < outline.size(); i++) {
						if (this.getOutline().get(i).isColliding(obj)) {
							return true;
						}
					}
				} else {
					if (hitbox() == null) {
						return false;
					}
					for (int i = 0; i < obj.outline.size(); i++) {
						if (obj.getOutline().get(i).isColliding(this)) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Runs a collision check between this GameObject and another GameObject. Does not generate a CollisionInfo object.
	 * @param obj The object to check for collision with
	 * @return True if the objects collide; false otherwise
	 */
	public boolean isColliding (ArrayList <ColidableVector> vect) {
		boolean thisOutLine = false;
		if (this.outline != null && !this.outline.isEmpty()) {
			thisOutLine = true;
		}
		
		
		if (!thisOutLine) {
			
			if (hitbox () == null) {
				return false;
			}
			for (int i = 0; i < outline.size(); i++) {
				if (vect.get(i).isColliding(this)) {
					return true;
				}
			}
		}
		
		return this.runOutLineCollision(vect);
	}
	
	public boolean runOutLineCollision(Actor obj) {
		ArrayList <ColidableVector> outThis = this.getOutline();
		ArrayList <ColidableVector> outThat = obj.getOutline();
		
		for (int i = 0; i < outThis.size(); i++) {
			for (int j = 0; j < outThat.size(); j++) {
				if (outThis.get(i).isColliding(outThat.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean runOutLineCollision(ArrayList <ColidableVector> vect) {
		ArrayList <ColidableVector> outThis = this.getOutline();
		ArrayList <ColidableVector> outThat = vect;
		
		for (int i = 0; i < outThis.size(); i++) {
			for (int j = 0; j < outThat.size(); j++) {
				if (outThis.get(i).isColliding(outThat.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isColliding (Rectangle hitbox) {
		Rectangle thisHitbox = hitbox ();
		Rectangle objHitbox = hitbox;
		if (thisHitbox == null || objHitbox == null) {
			return false;
		}
		if (thisHitbox.intersects (objHitbox)) {
			return true;
		}
		return false;
	}
	
	public double getHitboxWidth() {
		return hitboxWidth;
	}
	
	public void setHitboxWidth(double hitboxWidth) {
		this.hitboxWidth = hitboxWidth;
	}
	
	public double getHitboxHeight() {
		return hitboxHeight;
	}
	
	public void setHitboxHeight(double hitboxHeight) {
		this.hitboxHeight = hitboxHeight;
	}
	
	public void setHitbox (Rectangle  hitboxes) {
			xOffset = hitboxes.x - x;
			yOffset = hitboxes.y - y;
			hitboxWidth = hitboxes.width;
			hitboxHeight = hitboxes.height;
	}
	
	public ArrayList <ColidableVector> getOutline (){
		
		ArrayList <ColidableVector> translatedOutline = new ArrayList <ColidableVector>();
		
		for (int i = 0; i < outline.size(); i++) {
			translatedOutline.add(new ColidableVector (new Point (this.getX() + outline.get(i).startPoint.x, this.getY() + outline.get(i).startPoint.y), new Point (this.getX() + outline.get(i).endPoint.x, this.getY() + outline.get(i).endPoint.y)));
		}
		return translatedOutline;
	}
	public void setLines (ArrayList<ColidableVector> vects ) {
		outline = vects;
		
	}
	
	public void adjustHitboxBorders() {
		this.hitboxBorders = true;
	}

	public double getDistanceFromCamera() {
		return distanceFromCamera;
	}
	
	public boolean isSolid() {
		return solid;
	}

	public void setDistanceFromCamera(double distanceFromCamera) {
		this.distanceFromCamera = distanceFromCamera;
	}
}
