package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class FailedEscape extends Location {
	/** 
	 * uses the original constructer
	 */
	public FailedEscape () {
		super(true);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("YOUR CAR COMES TO A STOP UNABLE TO COUNTINUE THIS POINTLESS BATTLE AGAINST THE POLICE AS YOU GET OUT YOU SEE IT BREAK INTO A BUNCH OF USSLESS SCRAP METAL");
	        GameCode.getTextInterface().println("YOU EXIT WITH YOUR HANDS UP AS THE COPS HANDCUFF YOU AND PUT YOU INTO THE POLICE CAR YOU SPEND THE NEXT 3 YEARS IN PRISON BY THE TIME YOU ARE LET OUT");
	        GameCode.getTextInterface().println("ALL THE GRAIN IS RUINED AND YOU HAVE LONG GIVEN UP ON NEW YORK");
	        GameCode.getTextInterface().query(new String[] { "DARN IT" });
	}
	 
	public void runEventCode () {
		if (this.checkSelected("DARN IT")) {
		DataManager.inzialize();	
		}
	}
}
