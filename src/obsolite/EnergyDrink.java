package obsolite;

import location.Location;
import main.GameCode;

public class EnergyDrink extends Location {
	public EnergyDrink () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println("YOU SEE AN ENERGY DRINK IN THE WINDOW OF A NEARBY SHOP THE OWNER OFFERS IT TO YOU FOR THE LOW PRICE OF 45 BUCKS");
         if (GameCode.getDataManager().money >= 45) {
        	 GameCode.getTextInterface().query(new String[] { "ACCEPT", "DECLINE" });
         } else {
        	 this.print("BUT YOU DON'T HAVE ENOUGH MONEY TOO BAD");
        	 this.query(new String[] {"GET BACK ON THE ROAD"});
         }
        
	}
	 @Override
	public void runEventCode () {
		 if (this.checkSelected("ACCEPT")) {
			 GameCode.getDataManager().tiredness = -120;
			 GameCode.getDataManager().money = GameCode.getDataManager().money - 45;
	         GameCode.getTextInterface().println("TASTY YOU FEEL ENERGIZED");
	         this.query(new String[] {"GET BACK ON THE ROAD"});
		 }
		 if (this.checkSelected("DECLINE")) {
	         GameCode.getTextInterface().println("YOU ARE MISSING OUT MAN");
	         this.query(new String[] {"GET BACK ON THE ROAD"});
		 }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
		if (GameCode.getDataManager().getKarma() == 1) {
			return 8;
		} else {
			return 4;
		}
	 }
}
