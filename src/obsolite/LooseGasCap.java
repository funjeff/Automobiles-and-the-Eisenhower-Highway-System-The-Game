package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class LooseGasCap extends Location {
	public LooseGasCap () {
		super(false);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println(" ");
        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
        GameCode.getTextInterface().println("YOU REALISE YOU HAVE BEEN LOSING MUCH MORE GAS THAN USUAL AFTER A FEW MILES YOU GET OUT TO CHECK AND FIND YOUR GAS CAP IS LOOSE YOU MUST OF WASTED A LOT OF GAS");
        GameCode.getTextInterface().println(" ");
        this.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("LOSE 5 GAS");
        GameCode.getDataManager().gas -= 5.0;
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
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
			int probablity = 7;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
