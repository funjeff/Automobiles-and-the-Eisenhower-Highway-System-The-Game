package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class NukeDrive extends Location {
	int detourMiles = 0;
	int detourLength = 0;
	long oldTime = System.currentTimeMillis();
	/** 
	 * uses the original constructer
	 */
	public NukeDrive () {
		super(true);
	}
	@Override
	public void eventStart() {
		Random RNG = new Random ();
		detourLength = RNG.nextInt(11) + 10;
	}
	 
	public void runEventCode () {
		if (System.currentTimeMillis() - oldTime >= 1000) {
	      GameCode.getDataManager().gas -= 0.1D;
	      Random rand = new Random ();
	      if (rand.nextInt(10) >= 1 ) {
	    	  System.out.println("A GRAIN WAS RUINED");
	    	  GameCode.getDataManager().grain = GameCode.getDataManager().grain -1;
	      }
	      detourMiles += 1;
	     if (detourMiles == detourLength) {
	       GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	       }
		}
	}
}
