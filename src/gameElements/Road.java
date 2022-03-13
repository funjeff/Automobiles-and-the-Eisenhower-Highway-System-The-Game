package gameElements;


import java.util.Random;


import main.Actor;
import main.GameAPI;
import main.GameCode;
import main.LocationHandler;
import main.MainLoop;

import resources.Sprite;

public class Road {
	int milesDriven = 0;
	Random RNG = new Random ();
	int gasCap = RNG.nextInt(50) + 50;
	int milesSienceLastStop = 0;
	public int posionMiles = 0;
	private long oldTime = System.currentTimeMillis();
	Actor road;
	Actor truck;
	static Farmer farmer = new Farmer();
	boolean GG = true;
	int truckSpeed = 0;
	double accelerationTimer = 0;
	
	
	
	private boolean inTruck = true;
	
	/** 
	 * uses the original constructer
	 */
	public Road () {
		road = new Actor ();
		truck = new Actor ();
		road.setSprite(new Sprite ("resources/sprites/config/road.txt"));
		truck.setSprite(new Sprite ("resources/sprites/config/truck.txt"));
		road.setX(-150);
		truck.setY(300);
		truck.setX(360);
		farmer.setDistanceFromCamera(.5);
	}
	
	public void drive () {
	
		road.draw();
		truck.draw();
		
		if (inTruck) {
			this.dealWithTruck();
		} else {
			farmer.frameEvent();
			farmer.draw();
		}
		

		if (GameAPI.keyPressed('E') && inTruck && truckSpeed == 0) {
			inTruck = false;
			farmer.setX(truck.getX() - 20);
			farmer.setY(300);
		}
		
		
	}
	public void dealWithTruck() {
		
		if (MainLoop.getWindow().keyCheck('D') && truck.getX() < 400) {
			truck.setX(truck.getX() + 5);
		}
		if (MainLoop.getWindow().keyCheck('A') && truck.getX() > 100) {
			truck.setX(truck.getX() - 5);
		}
		if (MainLoop.getWindow().keyCheck('W') ) {
			if (accelerationTimer > truckSpeed) {
				if (truckSpeed < 49) {
					truckSpeed = truckSpeed + 1;
					road.getAnimationHandler().setFrameTime(300/truckSpeed);
					//truck.getAnimationHandler().setFrameTime(300/truckSpeed);
				}
				accelerationTimer = 0;
			}
			accelerationTimer = accelerationTimer + 1;
		} else {
			if (accelerationTimer < -1 *truckSpeed) {
				if (truckSpeed > 0) {
					road.getAnimationHandler().setFrameTime(300/truckSpeed);
					//truck.getAnimationHandler().setFrameTime(300/truckSpeed);
					truckSpeed = truckSpeed - 1;
				} else {
					truckSpeed = 0;
					road.getAnimationHandler().setFrameTime(0);
					truck.getAnimationHandler().setFrameTime(0);
				}
				accelerationTimer = 0;
			}
			accelerationTimer = accelerationTimer - .5;
		}
		if (MainLoop.getWindow().keyCheck('S')) {
			if (truckSpeed > 0) {
				road.getAnimationHandler().setFrameTime(300/truckSpeed);
				//truck.getAnimationHandler().setFrameTime(300/truckSpeed);
				truckSpeed = truckSpeed - 1;
			} else {
				truckSpeed = 0;
				road.getAnimationHandler().setFrameTime(0);
				truck.getAnimationHandler().setFrameTime(0);
			}
		}
		
		if (truckSpeed != 0) {
			if (System.currentTimeMillis() - oldTime >= 1000 - (10*truckSpeed)) {
			oldTime = System.currentTimeMillis();
		  	
		    Farmer.status.tiredness += 1;

		  	 if (!Farmer.status.marsianTech) {
		  		Farmer.status.gas -= 0.1D;
		  	    } else {
		  	    	Farmer.status.gas -= 0.05D;
		  	    }
		  	   if (Farmer.status.isPoisoned()) {
		  	      posionMiles += 1;
		  	    }
			}
			
			LocationHandler.drive(0.01 + truckSpeed/500.0);
		}
	}
	public static Farmer getFarmer () {
		return farmer;
	}
	public static Boolean isColidingFarmer (Actor with) {
		return farmer.isColliding(with);
	}
}
