package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class DetourDrive extends Location {
	int detourMiles = 0;
	int detourLength = 0;
	private long oldTime = System.currentTimeMillis();
	/** 
	 * uses the original constructer
	 */
	public DetourDrive () {
		super(true);
	}
	@Override
	public void eventStart() {
		Random RNG = new Random ();
		detourLength = RNG.nextInt(51) + 21;
	}
	 
	public void runEventCode () {
		if (System.currentTimeMillis() - oldTime >= 1000) {
	      GameCode.getDataManager().gas -= 0.1D;
	      detourMiles += 1;
	     if (detourMiles == detourLength) {
	       GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	       }
		}
	}
}
