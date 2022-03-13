package obsolite;


import location.Location;
import location.TitleScreen;
import main.GameCode;
import main.thingy;
import resources.DataManager;

public class Credits extends Location {
	int creditsTimer = 0;
	
	/** 
	 * uses the original constructer
	 */
	public Credits () {
		super(true);
	}
	@Override
	public void eventStart() {
        GameCode.getTextInterface().println("CONGRADULATIONS YOU MADE IT TO NEW YORK");
        GameCode.getTextInterface().println(" ");
       
		if (DataManager.regularEventsEnabled()) {
        int timesbeat = thingy.userStats.getStatI("timesbeat", 0);
        thingy.userStats.setStatI("timesbeat", timesbeat + 1);
        thingy.userStats.indicateAchievementProgress("timesbeat", timesbeat, 50);
        if (GameCode.getDataManager().grain >= 100) {
          thingy.userStats.setAchievement("Max Profits_1_4");
        	}
        }
       
		this.changeMusic("music/tital theme.wav", DataManager.getVolume());
        GameCode.getTextInterface().query(new String[] { "COOL" });
        GameCode.getDataManager().setMilesLeft(1000);
	}
	 
	public void runEventCode () {
        if (GameCode.getTextInterface().selected.equals("COOL")) {
          GameCode.getTextInterface().selected = "unimportant";
          if (GameCode.getDataManager().pothole) {
            GameCode.getTextInterface().println("YOU PICK UP A NEWSPAPER AND READ THE HEADLINE IT SAYS HUNDEREDS DIE DO TO UNFIXED POTHOLE YOUR ASTONISHED NOT BECASUE YOU INENVERTANTLY CAUSED THE CRASH");
            GameCode.getTextInterface().println("BUT BECAUSE THE NEWSPAPER STARTS MORPHING INTO A EGG YOU PICK UP THE EGG ITS A EASTER EGG CONGRADULATIONS YOU FOUND ONE OF THE TWO EASTER EGGS");
            GameCode.getTextInterface().println("YOU UNLOCKED WINGDINGS AS A FONT OPTION");
           
			DataManager.saveFile("Newspaper.txt");
          }
          if (GameCode.getDataManager().hasTimeShare) {
            GameCode.getTextInterface().println("YOU FINISH SELLING YOUR GRAIN AND USE THE PROFITS TO TAKE A BOAT TO YOUR NEW TIMESHARE YOUR HAVEING A NICE TIME THERE UNTIL YOU ENCOUNTER A CHICKEN");
            GameCode.getTextInterface().println("THE CHICKEN DOESEN'T BOTHER YOU HOWEVER ALL IT DOES IS LAY ONE EGG THEN LEAVES YOU APPROCH THE EGG AND PICK IT UP ITS AN EASTER EGG CONGRADULATIONS");
            GameCode.getTextInterface().println("YOU FOUND 1 OF THE 2 EASTER EGGS YOU UNLOCKED CHICKEN SCRATCH AS A FONT OPTION");
           
			DataManager.saveFile("Chicken.txt");
          }
		if (DataManager.isHardModeEnabled()) {
			if (!DataManager.regularEventsEnabled()) {
              GameCode.getTextInterface().println("CONGRADULATIONS YOU BEAT SOME RANDOM ABOMINATION THAT YOU MADE MY GAME INTO IN HARD MODE IM HAPPY FOR YOU I REALLY AM BUT IF");
              GameCode.getTextInterface().println("YOU WANT TO UNLOCK THE FINAL BOSS TRY BEATING THE GAME I MADE IN HARD MODE");
            } else {
              GameCode.getTextInterface().println("CONGRADULATIONS YOU BEAT THE GAME IN HARD MODE YOU TRUELY ARE A SUPER PLAYER SOMEONE LIKE YOU WOULDEN'T NEED TO CHECK THE RULES BUT WHY DON'T YOU CHECK THEM");
              GameCode.getTextInterface().println("A FEW TIMES JUST FOR OLD TIMES SAKE");
            
			DataManager.saveFile("Hardmode.txt");
            }
          }
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().query(new String[] { "ROLL CREDITS" });
        }
        if (GameCode.getTextInterface().selected.equals("ROLL CREDITS")) {
          creditsTimer += 1;
        }
        if (creditsTimer == 30) {
          GameCode.getTextInterface().println("WRITEN BY JEFFREY MARSH");
        }
        if (creditsTimer == 60) {
      	 GameCode.getTextInterface().println("ART BY JEFFREY MARSH");
        }
        if (creditsTimer == 90) {
          GameCode.getTextInterface().println("PROGRAMING BY JEFFREY MARSH");
        }
        if (creditsTimer == 120) {
          GameCode.getTextInterface().println("MUSIC BY JEFFREY MARSH");
        }
        if (creditsTimer == 150) {
          GameCode.getTextInterface().println("I GUESS IN HINDSIGHT THESE ARE UNESSARY CREDITS");
        }
        if (creditsTimer == 180) {
            GameCode.getTextInterface().println("IT KINDA SAID EVERYTHING YOU NEEDED TO KNOW ON THE TITLE SCREEN");
          }
          
        if (creditsTimer == 210) {
          GameCode.getTextInterface().println("THANKS EVERYBODY THAT LIKED THE GAME");
        }
        if (creditsTimer == 240) {
          GameCode.getTextInterface().println("THANK YOU FOR PLAYING");
        }
        if (creditsTimer == 270) {
          GameCode.getTextInterface().println("AND MOST IMPORTANTLY");
        }
        if (creditsTimer == 300) {
          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISEHOWER HIGHWAY SYSTEM");
        }
        if (creditsTimer == 330) {
          GameCode.getTextInterface().println("THE END");
        }
        if (creditsTimer == 360) {
          GameCode.getTextInterface().println("?");
        }

        if (creditsTimer == 390) {
		if (!DataManager.isHardModeEnabled()) {
          GameCode.getTextInterface().println("AND HARD MODE IS NOW UNLOCKED IF YOU WANT TO TRY THAT TYPE IN HARD AT THE CODES MENU TO START A HARD MODE QUEST (IF YOU BEAT IT THERE MAY");
          GameCode.getTextInterface().println("BE A EXTRA REWARD IN IT FOR YOU)");
      	  } else {
      	GameCode.getTextInterface().println("ENDLESS MODE IS NOW UNLOCKED WHERE NEW YORK DOESEN'T EXIST AND YOU CAN DRIVE JUST TO DRIVE FOR A HIGH SCORE");
      	GameCode.getDataManager();
		DataManager.saveFile("Endless.txt");
      	GameCode.getDataManager();
		DataManager.saveFile("FinalBattle.txt");
      	//TODO add option to play endless mode
      	  }
        }
        if (creditsTimer == 420) {
          GameCode.getTextInterface().query(new String[] { "THE END (FOR REAL)" });
        }
        if (GameCode.getTextInterface().selected.equals("THE END (FOR REAL)")) {
          GameCode.setCurrentEvent(new TitleScreen ());
         
		DataManager.inzialize();
        }
     }
}
