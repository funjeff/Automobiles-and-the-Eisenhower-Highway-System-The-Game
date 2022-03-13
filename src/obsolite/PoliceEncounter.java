package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class PoliceEncounter extends Location {
	public PoliceEncounter () {
		super(false);
	}
	@Override
	public void eventStart() {
	     GameCode.getTextInterface().println("YOU ARE GOING A BIT FAST AND YOU GET PULLED OVER BY A COP FOR A SPEEDING TICKET THE COP INSPECTS YOUR CAR");
	     if (!GameCode.getDataManager().diplomaticImmunity) {
	        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	        if ((GameCode.getDataManager().isCommunist()) || (GameCode.getDataManager().isCriminal)) {
	          if (GameCode.getDataManager().isCommunist()) {
	            GameCode.getTextInterface().print("HE NOTICES THAT COMMUNIST NOTE IN YOUR CAR AND DECIDES TO TAKE YOU IN OBVIOSLY");
	            GameCode.getTextInterface().println(" GIVING YOURSELF UP TO THE POLICE IS NOT GOING TO HELP YOU WITH YOUR QUEST SO YOU RUN");
	            GameCode.getTextInterface().query(new String[] { "SEE YOU LOSERS" });
	          } else {
	            GameCode.getTextInterface().print("HE NOTICES THAT YOU HAVE A CRIMINAL RECORD (YOU DIDEN'T PAY FOR TOLL BOOTHS OR PREVIOUS SPEEDING TICKETS) AND DECIDES TO TAKE YOU IN OBVIOSLY");
	            GameCode.getTextInterface().println(" GIVING YOURSELF UP TO THE POLICE IS NOT GOING TO HELP YOU WITH YOUR QUEST SO YOU RUN");
	            GameCode.getTextInterface().query(new String[] { "SEE YOU LOSERS" });
	          }
	        } else {
	          GameCode.getTextInterface().print("BUT DOESEN'T FIND ANYTHING PARTICULARLY INCRIMINATING HE ASKS FOR 120 DOLLARS");
	          GameCode.getTextInterface().println(" FOR SPEEDING TICKET YOU COULD RUN INSTEAD OF PAYING IT BUT IT WOULD BE A VERY BAD IDEA ");
	          GameCode.getTextInterface().println(" ");
	          
	          GameCode.getTextInterface().println("");
	          GameCode.getTextInterface().query(new String[] { "PAY HIM LIKE A GOOD CHRISTIAN BOY", "SEE YOU LOSERS" });
	        }
	     } else {
	    	  GameCode.getTextInterface().println("BUT HE SEES YOUR DIPLOMATIC PLATES AND LETS YOU GO HE ALSO GIVES YOU A FREE CUP OF COFFEE");
	    	  GameCode.getDataManager().tiredness = -120;
	    	  GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	      }
	}
	 @Override
	public void runEventCode () {
 	      if (GameCode.getTextInterface().selected.equals("PAY HIM LIKE A GOOD CHRISTIAN BOY")) {
 	        if (GameCode.getDataManager().money >= 250) {
 	          GameCode.getTextInterface().println("HE TAKES THE MONEY THANKS YOU FOR YOUR TIME THEN LEAVES");
 	          GameCode.getTextInterface().println(" ");
 	          GameCode.getTextInterface().println("PAY 250 DOLLARS");
 	          GameCode.getDataManager().money -= 250;
 	          GameCode.getTextInterface().println(" ");
 	          GameCode.getTextInterface().println("THANK GOD FOR BUERAUCRACY AND THE EISENHOWER HIGHWAY SYSTEM");
 	          GameCode.getTextInterface().selected = "unimportant";
 	          GameCode.getTextInterface().println(" ");
 	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
 	        } else {
 	          GameCode.getTextInterface().println("YOU TRY TO PAY HIM BUT YOU DON'T HAVE THE CASH HE GROWS IMPATIANT AND TRYS TO TAKE YOU BACK TO THE POLICE STATION YOU HAVE NO CHOICE LEFT BUT TO RUN");
 	          GameCode.getTextInterface().query(new String[] { "SEE YOU LOSERS" });
 	          GameCode.getTextInterface().selected = "unimportant";
 	        }
 	      }
 	      if (GameCode.getTextInterface().selected.equals("SEE YOU LOSERS")) {
 	        GameCode.setCurrentEvent(new PoliceChase());
 	      }
 	      if (GameCode.getTextInterface().selected.equals("DARN IT")) {
 	        DataManager.inzialize();
 	        }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 5;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
