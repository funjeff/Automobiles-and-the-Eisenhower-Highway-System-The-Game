package obsolite;

import location.Location;
import main.GameCode;

public class TollBooth extends Location {
	public TollBooth () {
		super(false);
	}
	@Override
	public void eventStart() {
		if (!GameCode.getDataManager().diplomaticImmunity) {
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("YOU PASS BY A TOLL BOOTH THIS IS PRETTY STANDARD AND IT ONLY COSTS 50 BUCKS TO PASS BY");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        if (GameCode.getDataManager().money >= 50) {
	          GameCode.getDataManager().money -= 50;
	          GameCode.getTextInterface().println("PAY 50 DOLLARS");
	        } else {
	          GameCode.getTextInterface().println("BUT YOU CAN'T EVEN AFFORD THAT SMALL TOLL SO YOUR JUST DECIDE TO PASS BY ANYWAY WHOS GONNA CARE (POLICE WILL NOW GET VIOLET DURRING ENCOUNTERS)");
	          GameCode.getDataManager().isCriminal = true;
	        }
	    	} else {
	    		GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println("YOU PASS BY A TOLL BOOTH BUT WHO CARES YOU HAVE DIPLOMATIC IMMUNITY YOU JUST PASS THROUGH");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println(" ");
	    	}
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
			int probablity = 8;
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
