package obsolite;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import location.Location;
import main.Actor;
import main.GameCode;
import main.MainLoop;
import resources.DataManager;
import resources.Sprite;

public class RegularDrive extends Location {
	int milesDriven = 0;
	Random RNG = new Random ();
	int gasCap = RNG.nextInt(50) + 50;
	int milesSienceLastStop = 0;
	public int posionMiles = 0;
	private long oldTime = System.currentTimeMillis();
	Actor road;
	Actor truck;
	boolean GG = true;
	int truckSpeed = 0;
	double accelerationTimer = 0;
	/** 
	 * uses the original constructer
	 */
	public RegularDrive () {
		super(true);
		road = new Actor (new Sprite ("resources/sprites/config/road.txt"));
		truck = new Actor (new Sprite ("resources/sprites/config/truck.txt"));
		road.setX(-150);
		truck.setY(300);
		truck.setX(360);
		this.addActor(road);
		this.addActor(truck);
	}
	@Override
	public void eventStart() {
	}
	 
	public void runEventCode () {
	
		if (truckSpeed != 0) {
	if (System.currentTimeMillis() - oldTime >= 1000 - (10*truckSpeed)) {
  	  if (milesSienceLastStop == gasCap) {
  		  gasCap = RNG.nextInt(50) + 50;
  		  milesSienceLastStop = 0;
  		  GameCode.setCurrentEvent(new GasStation());
  		  }
    	GameCode.getDataManager();
		Location nextEvent = DataManager.getNextEvent();
     
	if (DataManager.getNextEvent() == null) {
    	  this.print("YOU DROVE A MILE WITH NO PROBLEMS");  
      } else {
    	  GameCode.setCurrentEvent(nextEvent);
    	  Location.randomEvents.remove(nextEvent);
			try {
				Location.randomEvents.add(nextEvent.getClass().getConstructor().newInstance());
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					}
      			}
			}
		}
		this.dealWithTruck();
      if ((GameCode.getDataManager().grain <= 0) && (GG)) {
        GameCode.getTextInterface().println("HAVEING NO GRAIN LEFT TO SELL YOU DECIDE THAT YOUR QUEST IS NOW POINTLESS AND TURN BACK TOWARDS IOWA WITH NO PROFITS FROM THIS TRIP");
        GameCode.getTextInterface().print(" ");
        GameCode.getTextInterface().print("GAME OVER");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "DANG IT" });
        GG = false;
      }
      if ((GameCode.getDataManager().gas <= 0.0D) && (GG)) {
        GameCode.getTextInterface().println("WITH NO GAS LEFT YOUR CAR COMES TO ONE FINAL STOP BEFORE YOU ABANDON BOTH IT AND YOUR TRIP FOREVER");
        GameCode.getTextInterface().print(" ");
        GameCode.getTextInterface().print("GAME OVER");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "DANG IT" });
        GG = false;
      }
      if (GameCode.getTextInterface().selected.equals("DANG IT")) {
		DataManager.inzialize();
      }
      if ((GameCode.getDataManager().isPoisoned()) && (posionMiles == 50))  {
            GameCode.getTextInterface().println("YOUR POISONING STARTS TO ACT UP AND YOU WILL PROBABLY DIE IF YOU DON'T EAT 5 PERCENT OF YOUR GRAIN SO YOU EAT 5 PERCENT OF YOUR GRAIN");
            GameCode.getTextInterface().println("LOSE 5 PERCENT GRAIN");
            GameCode.getDataManager().grain -= 5;
            posionMiles = 0;
        }
    if (GameCode.getDataManager().getMilesLeft() == 0) {
    	GameCode.setCurrentEvent(new Credits ());
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
				GameCode.getDataManager().setMilesLeft(GameCode.getDataManager().getMilesLeft() - 1);
			if (DataManager.isEndlessMode()) {
		  	  milesDriven = milesDriven + 1;
		    }
		    GameCode.getDataManager().tiredness += 1;
		  	  milesSienceLastStop = milesSienceLastStop + 1;
		  	 if (!GameCode.getDataManager().marsianTech) {
		  	      GameCode.getDataManager().gas -= 0.1D;
		  	    } else {
		  	      GameCode.getDataManager().gas -= 0.05D;
		  	    }
		  	   if (GameCode.getDataManager().isPoisoned()) {
		  	      posionMiles += 1;
		  	    }
			}
		}
	}
}
