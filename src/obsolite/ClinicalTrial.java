package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class ClinicalTrial extends Location {
	int eventRandom = 0;
	Random RNG = new Random ();
	public ClinicalTrial () {
		super(false);
	}
	@Override
	public void eventStart() {
		    eventRandom = (RNG.nextInt(9) + 1);
	        GameCode.getTextInterface().println("AS YOU ARE DRIVEING A LARGE SIGN THE SIGN MENTIONS AN EXPERMENT THAT NEEDS TEST SUBJECTS IT SAYS IT PAYS HANDSOMLY IT COULD BE A RISK BUT SEEMS LIKE A GOOD DEAL");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "SIGN ME UP", "YEAH NO" });
	}
	 @Override
	public void runEventCode () {
		      if (GameCode.getTextInterface().selected.equals("SIGN ME UP")) {
		        GameCode.getTextInterface().println("YOU GO INTO A STRAGE LAB THE DOCTOR INJECTS YOU WITH SOME STUFF ( AND HAD YOU START SMOKEING) AFTERWARDS");
		        if (eventRandom >= 8) {
		          GameCode.getTextInterface().println("YOU FEEL FINE SEEMS LIKE THE DRUGS DID NOTHING AFTER ALL BAD NEWS FOR THEM BUT GOOD NEWS FOR YOU THEY PAY YOU WITH 350 DOLLARS ");
		          GameCode.getTextInterface().println("GAIN 350 DOLLARS");
		          GameCode.getDataManager().money += 350;
		          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if (eventRandom <= 7) {
		          GameCode.getTextInterface().print("YOU FEEL VERY SICK BUT THE DOCTOR STILL PAYS WITH 350 DOLLARS");
		          GameCode.getTextInterface().selected = "unimportant";
		          GameCode.getDataManager().money += 350;
		          GameCode.getDataManager().setPoisoned(true);
		          GameCode.getTextInterface().println(" ");
		          this.playSoundEffect(6.0F, "soundEffects/hee hee hee.wav");
		          GameCode.getTextInterface().println("GAIN 350 DOLLARS");
		          GameCode.getTextInterface().println("GAIN POISON");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("YEAH NO")) {
		        GameCode.getTextInterface().println("YOU DECIDE NOT TO RISK YOUR HEALTH AND WELLNESS FOR SOME EXTRA CASH HOW BORRING");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 7;
			if (GameCode.getDataManager().getKarma() == 1) {
				probablity = probablity + 3;
			}
			return probablity;
	 }
}
