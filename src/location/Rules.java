package location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import main.GameCode;
import main.thingy;
import obsolite.AutomobilesBattle;
import obsolite.MobiusBattle;
import resources.DataManager;

public class Rules extends Location {
	static int ruleCheck;
	public Rules() {
		super(true);
	}
	@Override
	public void eventStart () {
		  ruleCheck += 1;
	      if (ruleCheck == 4) {
	    	 boolean superEgg = false;
	        GameCode.getTextInterface().selected = "unimportant";
	        ruleCheck = 0;
	        try {
	          FileReader fr = new FileReader("./SavesDir/Hardmode.txt");
	          BufferedReader br = new BufferedReader(fr);
	          if (br.readLine().equals("true")) {
	            superEgg = true;
	          }
	          br.close();
	        } catch (IOException e) {
	        	GameCode.getTextInterface().println("YOU CHECK THE RULES AND AS YOU DO YOU SEE ONE THAT ISENT VERY OBVIOS IT SAY COME BACK HERE AFTER BEATING HARD MODE FOR SOMETHING COOL");
	            GameCode.getTextInterface().println(" ");
	            GameCode.setCurrentEvent(new TitleScreen());
	        }
	        if (superEgg) {
		        if (AutomobilesBattle.fightUnlocked) {
		          GameCode.getTextInterface().println("DO YOU WANT TO SKIP THE FIRST PART OF THE FIGHT");
		          GameCode.getTextInterface().query(new String[] { "TAKE ME TO THE SECOND PHASE", "NO ILL START OVER" });
		        } else {
		          GameCode.getTextInterface().println("YOU HAVE BEATEN HARDMODE WHICH MEANS THERE IS ONLY ONE THING LEFT TO DO PREPARE FOR THE FINAL BOSS FIGHT");
		          GameCode.getTextInterface().query(new String[] { "LETS DO THIS!", "NO THANK YOU" });
		        }
	        }
	      } else {
	        GameCode.getTextInterface().println("GETTING TO NEW YORK IS A WIN IF YOU DO NOT MAKE IT FOR ANY REASON THAT IS AN AUTOMATIC LOSS");
	        GameCode.getTextInterface().println("RUNNING OUT OF GRAIN IS ALSO AN AUTOMATIC LOSS");
	        GameCode.getTextInterface().println("EVERY MILE YOU TRVEL HAS A CHANCE OR RUNNING INTO A EVENT WHICH CAN BE BENIFITAL OR DETRAMENTAL TO YOUR TRIP");
	        GameCode.getTextInterface().println("THERE ARE METERS ON THE TOP RIGHT OF YOUR SCREEN THAT TELL YOU ABOUT YOUR GAS MONEY GRAIN AND SLEEP PRESS G");
	        GameCode.getTextInterface().println("WHILE DRIVING TO STOP AT A GAS STATION OR HOTEL TO GET GAS AND SLEEP");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen());
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	}
	@Override
	public void runEventCode () {
		super.runEventCode();
		    if (GameCode.getTextInterface().selected.equals("NO THANK YOU")) {
		      GameCode.setCurrentEvent(this);
		    }
		    if (GameCode.getTextInterface().selected.equals("TAKE ME TO THE SECOND PHASE")) {
		    	GameCode.setCurrentEvent(new AutomobilesBattle());
		    }
		    if (GameCode.getTextInterface().selected.equals("NO ILL START OVER")) {
		    	GameCode.getTextInterface().selected = "LETS DO THIS!";
		    }
		    
		    if (GameCode.getTextInterface().selected.equals("LETS DO THIS!")) {
		      this.changeMusic("music/mobius batte.wav", DataManager.getVolume());
		      GameCode.getDataManager().setMilesLeft(200);
		      GameCode.setCurrentEvent(new MobiusBattle());
		    }	    
	}
}
