package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class FallAsleep extends Location {
	public FallAsleep () {
		super(false);
	}
	@Override
	public void eventStart() {
		  GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("AS YOU ARE DRIVING ALONG YOU START TO FALL ASLEEP WHICH WAS A BAD MOVE BECAUSE YOU AWAKE IN A FIARY INFERNO WHICH USED TO BE YOUR CAR FOR ONLY A MOMENT BEFORE");
	        GameCode.getTextInterface().println("YOUR GONE");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("GAME OVER");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "DARN IT" });
	}
	 @Override
	public void runEventCode () {
		if (this.checkSelected("DARN IT")) {
			DataManager.inzialize();
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 0;
			if (GameCode.getDataManager().tiredness > 120) {
				probablity = (int) Math.ceil(GameCode.getDataManager().tiredness/20);
			}
			return probablity;
	 }
}
