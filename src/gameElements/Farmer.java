package gameElements;

import main.Actor;
import main.GameAPI;
import main.GameCode;
import main.Status;
import resources.Sprite;

public class Farmer extends Actor {
	
	public static final Sprite FARMER_SPRITE_FORWARD = new Sprite ("resources/sprites/config/farmerFront.txt");
	public static final Sprite FARMER_SPRITE_BACKWARD = new Sprite ("resources/sprites/config/farmerBack.txt");
	public static final Sprite FARMER_SPRITE_SIDES = new Sprite ("resources/sprites/config/farmer sides.txt");
	public static final Sprite FARMER_SPRITE_BACKRIGHT = new Sprite ("resources/sprites/config/farmerUpRight.txt");
	public static final Sprite FARMER_SPRITE_BACKLEFT = new Sprite ("resources/sprites/config/farmerUpLeft.txt");
	public static final Sprite FARMER_SPRITE_FRONTRIGHT = new Sprite ("resources/sprites/config/farmerDownRight.txt");
	public static final Sprite FARMER_SPRITE_FRONTLEFT = new Sprite ("resources/sprites/config/farmerDownLeft.txt");
	
	public static Status status = new Status();
	
	public Farmer() {
		this.adjustHitboxBorders();
		this.getAnimationHandler().setFrameTime(100);
		this.setSprite(FARMER_SPRITE_FORWARD);
	}
	
	@Override
	public void frameEvent () {
		
		if (!GameAPI.keyCheck('W') && !GameAPI.keyCheck('S') && !GameAPI.keyCheck('A') && !GameAPI.keyCheck('D')) {
			if (this.getAnimationHandler().getFrameTime() != 0) {
				this.getAnimationHandler().setFrameTime(0);
			}
		} else {
			if (this.getAnimationHandler().getFrameTime() != 100 && !this.getSprite().equals(FARMER_SPRITE_SIDES)) {
				this.getAnimationHandler().setFrameTime(100);
			}
			if (!GameAPI.keyCheck('W') && !GameAPI.keyCheck('S') && (GameAPI.keyCheck('A') || GameAPI.keyCheck('D'))) {
				if (this.getAnimationHandler().getFrameTime() != 30) {
					this.getAnimationHandler().setFrameTime(30);
				}	
			}
		}

		//Ill adjust this later
		if (GameAPI.keyCheck ('W')) {
			
			if (!this.getSprite().equals(FARMER_SPRITE_BACKWARD) && !GameAPI.keyCheck('D') && !GameAPI.keyCheck('A')) {
				this.setSprite(FARMER_SPRITE_BACKWARD);
			}
			
			
			
			if ( this.goY(this.getY() - 3) && this.getY() < 300) {
				this.setDistanceFromCamera(this.getDistanceFromCamera() + .01);
			}
		}
		
		if (GameAPI.keyCheck('S')) {
			if (!this.getSprite().equals(FARMER_SPRITE_FORWARD) && !GameAPI.keyCheck('D') && !GameAPI.keyCheck('A')) {
				this.setSprite(FARMER_SPRITE_FORWARD);
			}
			if ( this.goY(this.getY() + 3) && this.getY() < 300) {
				this.setDistanceFromCamera(this.getDistanceFromCamera() - .01);
			}
		}
		
		if (GameAPI.keyCheck('D')) {
			if (GameAPI.keyCheck('W')) {
				if (!this.getSprite().equals(FARMER_SPRITE_BACKRIGHT)) {
					this.setSprite(FARMER_SPRITE_BACKRIGHT);
				}
			} else {
				if (GameAPI.keyCheck('S')) {
	
					if (!this.getSprite().equals(FARMER_SPRITE_FRONTRIGHT)) {
						this.setSprite(FARMER_SPRITE_FRONTRIGHT);
					}
			} else {
					if (!this.getSprite().equals(FARMER_SPRITE_SIDES)) {
						this.setSprite(FARMER_SPRITE_SIDES);
					}
				}
			}
			
			this.getAnimationHandler().setFlipHorizontal(false);
			
			if ( this.goX(this.getX() + 3) && this.getX() - GameCode.getVeiwX() > 550) {
				GameCode.setVeiw(GameCode.getVeiwX() + 3, GameCode.getVeiwY());
			}
			
		}
		
		if (GameAPI.keyCheck('A')) {
			
			if (GameAPI.keyCheck('W')) {
				if (!this.getSprite().equals(FARMER_SPRITE_BACKLEFT)) {
					this.setSprite(FARMER_SPRITE_BACKLEFT);
					this.getAnimationHandler().setFlipHorizontal(false);
				}
			} else {
				if (GameAPI.keyCheck('S')) {
					if (!this.getSprite().equals(FARMER_SPRITE_FRONTLEFT)) {
						this.setSprite(FARMER_SPRITE_FRONTLEFT);
						this.getAnimationHandler().setFlipHorizontal(false);
					}
			} else {
					if (!this.getSprite().equals(FARMER_SPRITE_SIDES)) {
						this.setSprite(FARMER_SPRITE_SIDES);
					}
					this.getAnimationHandler().setFlipHorizontal(true);
				}
			}
			
			
			if (this.goX(this.getX() - 3) && this.getX() - GameCode.getVeiwX() < 60) {
				GameCode.setVeiw(GameCode.getVeiwX() - 3, GameCode.getVeiwY());
			}
		}
		
		
		
	}

}
