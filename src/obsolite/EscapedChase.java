package obsolite;

import location.Location;
import main.GameCode;

public class EscapedChase extends Location {
	/** 
	 * uses the original constructer
	 */
	public EscapedChase () {
		super(true);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("YOU FEEL A RUSH AS YOU SEE MORE AND MORE OF THE COPS FALL BEHIND YOU AND EVENTUALLY YOU LOSE ALL OF THEM HOW LUCKY ARE YOU");
	    GameCode.getTextInterface().println("");
	    GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	    GameCode.getTextInterface().println("");
	    GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	}
	 
	public void runEventCode () {
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
}
