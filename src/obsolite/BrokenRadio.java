package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class BrokenRadio extends Location {
	public BrokenRadio () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println("YOU ARE DRIVING AND JAMMING OUT TO YOUR RADIO WHEN SUDDENLY IT GOES OUT ITS ANNONYING BUT NOT A DEALBREAKER ");
	        this.playSoundEffect(6.0F, "soundEffects/short circut.wav");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getDataManager().workingRadio = false;
	        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	 @Override
	public void runEventCode () {
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 4;
			GameCode.getDataManager();
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 5;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().workingRadio) {
				return probablity;
			} else {
				return 0;
			}
	 }
}
