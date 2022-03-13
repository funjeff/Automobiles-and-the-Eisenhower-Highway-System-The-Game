package location;

import main.GameCode;
import obsolite.Codes;
import obsolite.CustomEventConfig;
import obsolite.FontChoice;
import obsolite.FunFacts;
import obsolite.MobiusBattle;
import obsolite.SoundTest;
import obsolite.VolumeControl;
import obsolite.calculus;
import resources.DataManager;

public class TitleScreen extends Location {
	/** 
	 * uses the original constructer
	 */
	public TitleScreen () {
		super(true);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().query(DataManager.getMenuOptions());
	}
	 
	public void runEventCode () {
	super.runEventCode();
	
	
	
	
	
//		if (this.checkSelected("START GAME")) {
//			GameCode.setCurrentEvent(new StartGame());
//		}
//		if (this.checkSelected("RULES")) {
//			GameCode.setCurrentEvent(new Rules());
//		}
//		if (this.checkSelected("ADVANCED CALCULUS")) {
//			GameCode.setCurrentEvent(new calculus());
//		}
//		if (this.checkSelected("CODES")) {
//			GameCode.setCurrentEvent(new Codes());
//		}
//		if (this.checkSelected("FONT")) {
//			GameCode.setCurrentEvent(new FontChoice());
//		}
//		if (this.checkSelected("CUSTOM EVENTS")) {
//			GameCode.setCurrentEvent(new CustomEventConfig());
//		}
//		if (this.checkSelected("FUN FACTS")) {
//			GameCode.setCurrentEvent(new FunFacts());
//		}
//		if (this.checkSelected("VOLUME CONTROL")) {
//			GameCode.setCurrentEvent(new VolumeControl());
//		}
//		if (this.checkSelected("HARD MODE")) {
//			GameCode.setCurrentEvent(new StartGame());
//			this.print("GOOD LUCK WITH HARD MODE");
//			DataManager.setHardModeEnabled(true);
//		}
//		if (this.checkSelected("SOUND TEST")) {
//			GameCode.setCurrentEvent(new SoundTest());
//		}
//		if (this.checkSelected("FINAL BATTLE")) {
//			GameCode.setCurrentEvent(new MobiusBattle());
//		}
	}
}
