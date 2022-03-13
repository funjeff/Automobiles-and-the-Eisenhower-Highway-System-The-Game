package obsolite;

import location.Location;
import main.GameCode;

public class PoisonedBottle extends Location {
	public PoisonedBottle () {
		super(false);
	}
	@Override
	public void eventStart() {
		   GameCode.getTextInterface().println("A MAN GIVES YOU A FREE WATER BOTTLE YOU THANK HIM AND DRINK IT BUT IT TURNS OUT IT WAS POISONS AND NOW YOUR POISONED");
           GameCode.getDataManager().setPoisoned(true);
           GameCode.getTextInterface().println(" ");
           GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	}
	 @Override
	public void runEventCode () {
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
		if (GameCode.getDataManager().isPoisoned()) {
			return 0;
		} else {
			if (GameCode.getDataManager().getKarma() == 2) {
				return 8;
			} else {
				return 4;
			}
		}
		 
	 }
}
