package obsolite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import location.Location;
import location.TitleScreen;
import main.GameCode;
import main.MainLoop;
import main.thingy;
import resources.DataManager;

public class Codes extends Location {
	private static int iBasis;
	boolean started;
	boolean skippedEnter;
	String code = "";
	/** 
	 * uses the original constructer
	 */
	public Codes () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println(" ");
	     GameCode.getTextInterface().println(" ");
	     GameCode.getTextInterface().println("THANK YOU FOR ENTERING THE CODES MENU PLEASE PUT IN YOUR CODE PRESS ENTER TO CONFIRM USE CODE \"BACK\" TO LEAVE");
	     GameCode.getTextInterface().println(" ");
	     started = false;
	}
	public void runEventCode () {
	super.runEventCode();
      boolean dontType = false;
      int charictarNumber = 1;
      int i = MainLoop.getWindow().KeysPressed()[0];
      
	if ((i == 10) && (skippedEnter) && (code != "")) {
        GameCode.getTextInterface().println(" ");
        
		if (code.equals("ENDLESS")) {
        	GameCode.getTextInterface().println("YOUR NEXT GAME WILL NEVER END");
        	code = "";
			DataManager.setEndlessMode(true);
        }
		if ((code.equals("NINJA HAS LIGMA") || code.equals("LIGMA"))) {
        	GameCode.getTextInterface().println("WHATS LIGMA, I SAID WITH AN ETHUSED FACE ... I WAS SO NAIVE THEN WHERE HAS THE INNOCENCE OF YOUTH GONE?");
        	GameCode.getTextInterface().println(" ");
        	GameCode.getTextInterface().println(" ");
        	code = "";
        }

		if ((code.equals("UR MOM GAY")) || (code.equals("YOUR MOM GAY")) || (code.equals("YOUR MOM GAE")) || (code.equals("UR MOM GAE"))) {
          GameCode.getTextInterface().println("NO U (YOU HAVE UNLOCKED THE RAINBOW FONT)");
          thingy.userStats.setAchievement("pro wordsmith_1_0");
          
		code = "";
          try {
        	File fakeFile = new File ("./SavesDir");
            File realFile = new File (fakeFile, "rainbow.txt");
            FileWriter fw = new FileWriter (realFile);
            PrintWriter pw = new PrintWriter (fw);
            pw.println("true");
            pw.close();
          }
          catch (IOException localIOException7) {}
        }
        
		
		if (code.equals("GG EZ") || code.equals("GGEZ")) {
        	GameCode.getTextInterface().println("IM TWELVE I BOUGHT STOLE MY MOMS CREDIT CARD FOR THIS BAD GAME ... THATS YOU THATS WAHT YOU SOUND LIKE");
			code = "";
			GameCode.setCurrentEvent(new TitleScreen ());
            GameCode.getTextInterface().selected = "uniportant";
            skippedEnter = false; 
			started = true;
        }
        
		if (code.equals("HARD")) {
          GameCode.getTextInterface().println("SO YOU WANT TO TRY IT IN HARD MODE DO YOU WELL ITS PRETTY HAD YOU HAVE TO GO 1.2X THE MILES AND NEGITVE EVENTS ARE MORE COMMAN SO GOOD LUCK");
          GameCode.getTextInterface().query(new String[] { "START GAME" });
          GameCode.getDataManager().setMilesLeft(1200);
          
		DataManager.setHardModeEnabled(true);
          
		code = "";
          
        }
	}
          if ((i == 10) || (MainLoop.getWindow().keyPressed(8))) {
              dontType = true;
            }
			GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { code }, DataManager.getSprites().yellowfont);
			if ((MainLoop.getWindow().keyPressed(8)) && (code.length() > 1)) {
			code = code.substring(0, code.length() - 1);
            }
            if (MainLoop.getWindow().keyReleased(iBasis)) {
              iBasis = 0;
            }
            if ((iBasis != i) && (i != 0)) {
              iBasis = i;
              char a = (char)i;
              String typedCharictar = Character.toString(a);
              while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
                i = MainLoop.getWindow().KeysPressed()[charictarNumber];
                a = (char)i;
                typedCharictar = typedCharictar + a;
                charictarNumber++;
              }
              if (dontType) {
              	
				skippedEnter = true;
              }
              if (!dontType) {
                
				
				code = code + typedCharictar;
              }
          }
            if (code.equals("BACK")) {
      		  GameCode.setCurrentEvent(new TitleScreen());
      		 
              }
     }
}
