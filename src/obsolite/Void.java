package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Void extends Location {
	int eventRandom = 0;
	Random RNG = new Random ();
	public Void () {
		super(false);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("AS YOU ARE DRVING BY YOU ARE TERRIFIED TO NOTICE THAT BEHND YOU A ENORMUS VOID IN TIME AND SPACE HAS APPEARD AND IS SUCKING EVERYTHING INTO IT AND YOUR CAR");
        GameCode.getTextInterface().println("IS SURE TO BE NEXT THIS SITUATION SEEMS HOPELESS BUT ITS NOT WHAT DO YOU DO");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        this.playSoundEffect(2.0F, "soundEffects/black hole.wav");
        eventRandom = (RNG.nextInt(11) + 1);
        
        GameCode.getTextInterface().println(" ");
        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
        GameCode.getTextInterface().query(new String[] { "FLOOR IT", "ACCEPT YOUR FATE" });
	}
	 @Override
	public void runEventCode () {
		      if (GameCode.getTextInterface().selected.equals("ACCEPT YOUR FATE")) {
		        GameCode.getTextInterface().println("YOU GIVE UP AND LET YOUR CAR GO TO A HALT AND WHEN IT DOES IT GETS PICKED UP AND STARTS FLYING INTO THE VOID AND");
		        if (eventRandom >= 10) {
		          GameCode.getTextInterface().print("YOUR NOT DEAD YOU WAKE UP BUT EVERYTHING FEELS WIERD SOMEHOW YOU CHECK YOUR GRAIN AND ARE ASTONISHED TO FIND THAT YOU DON'T HAVE THE AMONT YOU HAD BUT THE");
		          GameCode.getTextInterface().println(" AMOUNT YOU HAD LOST SO FAR NOT ONLY THAT BUT THE MAP SAYS THAT NEW YORK IS THE AMOUNT OF MILES YOU HAVE TRAVELED SO FAR NOT THE AMOUNT IT WAS");
		          GameCode.getTextInterface().println("AND YOUR GAS TANK HAS EXACTLY 12 UNITS OF GAS IN IT");
		          GameCode.getDataManager().grain = (100 - GameCode.getDataManager().grain);
		          if (GameCode.getDataManager().grain == 0) {
		            GameCode.getDataManager().grain = 1;
		          }
		      
				if (!DataManager.isHardModeEnabled()) {
		            GameCode.getDataManager().setMilesLeft(1000 - GameCode.getDataManager().getMilesLeft());
		          } else {
		            GameCode.getDataManager().setMilesLeft(1200 - GameCode.getDataManager().getMilesLeft());
		          }
		          if (GameCode.getDataManager().getMilesLeft() == 0) {
		            GameCode.getDataManager().setMilesLeft(1);
		          }
		          GameCode.getDataManager().gas = 12.0D;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("METSYSYAWIHREWOHNESIEDNASLEIBOMOTUAROFDOGKNAHT");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if (eventRandom <= 7) {
		          GameCode.getTextInterface().print("YOU SCREAM MORE THAN EVER AS YOU EXPERENCE THE EXCRUCIATING PAIN OF BEING SUCKED INTO THE HOPELESS VOID AND THE EVERYTHING ENDED AND REALITY BECA................");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "..." });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("FLOOR IT")) {
		         this.playSoundEffect(6.0F, "soundEffects/rev.wav");  
		        GameCode.getTextInterface().println("YOU FLOOR IT AND YOU FIND YOUR NOT MOVEING THE FORCE FROM THE CAR IS MATCHING THE ONE FROM THE VOID YOU KEEP THIS UP FOR HOURS UNTIL");
		        GameCode.getTextInterface().selected = "unimportant";
		        if (GameCode.getDataManager().gas >= 20.0D) {
		          GameCode.getTextInterface().print("THE VOID FIZZLES OUT INTO UNEXISTANCE AND YOU ARE FINALLY SAFE OBVIOSLY YOU USED ALOT OF GAS KEEPING THE CAR SUSPENDED LIKE THAT BUT AT LEAST YOUR ALIVE");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("LOSE 20 GAS UNITS");
		          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getDataManager().gas -= 20.0D;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        } else {
		          GameCode.getTextInterface().print("YOU SEE YOUR GAS NEEDLE SLIDE MORE AND MORE TO THE LEFT, AND WHEN IT HITS THE E YOU KNOW THERE IS NOTHING LEFT YOU CAN DO");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("LOSE ALL GAS");
		          GameCode.getTextInterface().query(new String[] { "ACCEPT YOUR FATE" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("...")) {
		        DataManager.inzialize();
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 2;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
