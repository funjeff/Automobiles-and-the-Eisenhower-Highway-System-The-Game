package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Nuke extends Location {
	int eventRandom = 0;
	Random RNG = new Random ();
	public Nuke () {
		super(false);
	}
	@Override
	public void eventStart() {
		  eventRandom = (RNG.nextInt(9) + 1);
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("AS YOU ARE DRVING YOU SEE THE MOST PECULEAR SIGHT IN THE DISTANCE A MUSHROOM CLOUD THE CLOSER YOU GET THE MORE YOU REALISE IT IS NOT ILLUSION");
	        GameCode.getTextInterface().println("PILES OF RUBBLE ARE ARE SCATTERED EVERYWHERE AND IT SEEMS INCREADBLY DANGOURS TO KEEP GOING ALTERNATIVLY YOU COULD TAKE A DETOR AWAY FROM THE");
	        GameCode.getTextInterface().println("WASTELAND BUT IT WOULD REQUIRE MUCH MUCH MORE GAS");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "KEEP GOING", "TAKE A DETOUR" });
	        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	 @Override
	public void runEventCode () {
		      if (GameCode.getTextInterface().selected.equals("KEEP GOING")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 7) {
		          GameCode.getTextInterface().println("YOU GO THROUGH THE RADIATED AREA AND AFTER A WHILE YOU START TO NOT FEEL SO GOOD (YOU GOT RADIATION POISONING) ALSO");
		          GameCode.getTextInterface().println("35 PERCENT OF YOUR GRAIN HAS BEEN RADIATED AND IS NOW UNUASABLE");
		          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getDataManager().setPoisoned(true);
		          GameCode.getDataManager().grain -= 35;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		        if (eventRandom >= 8) {
		          GameCode.getTextInterface().println("YOU GO THROUGH THE RADIATED AREA BUT ARE FEELING NOT VERY AFFECTED BY IT HOW LUCKY NOT SO LUCKY HOWEVER 35 PERCENT OF YOUR GRAIN HAS BECOME UNASABLE");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("AT LEAST WE CAN THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getDataManager().grain -= 35;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("TAKE A DETOUR")) {
		        GameCode.getTextInterface().println("YOU DECIDE TO PLAY IT SAFE AND STAY AS FAR AWAY FROM THAT DEADLY NUEROTOXIN AS POSSIBLE UNFORCHANITLY THIS TOOK MORE GAS 4 TENTHS MORE GAS PER MILE FOR A WHILE");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().query(new String[] { "DETOUR IT IS THEN" });
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(new NukeDrive ());
		}
		if (this.checkSelected("DETOUR IT IS THEN")) {
			GameCode.setCurrentEvent(new DetourDrive ());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 4;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
