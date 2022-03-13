package resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import location.Location;
import location.TitleScreen;
import main.GameCode;
import main.MainLoop;
import main.thingy;
import obsolite.Credits;
import obsolite.RegularDrive;

public class DataManager {
	// custom event stuff
	 public static boolean customEventsEnabled;
	 private static boolean regularEventsEnabled;
	 
	// no Idea pile 
	 private static boolean noError;
	 
	// file control
	  private static int fileNumber;
	 
	// codes I think
	  private static String code2;
	  
    // all of the games sprites
	  protected static SpriteContainer sprites = MainLoop.getSprites ();
	  
	// controls the music
	  private static SoundPlayer player = new SoundPlayer();
	  private static float volume;
	  private static boolean inTest;
	
	// bonus modes
	  private static boolean endlessMode;
	  private static boolean hardModeEnabled;
	  
	
	  
	// interal values for event generation
	  private int calamityCount;
	  
	  // the max value of the RNG
	  private static int maxRNGValue;
	  
	  //I dunno
	 private static String absolutePath = new File(".").getAbsolutePath();
	
	  // affects unlocks
	  public boolean pothole = false;
	  public boolean hasTimeShare = false;
	  // the health of the player
	   int playerHealth = 700;
	   
	 
	   // the comunity regular drive object
	 //  private RegularDrive comunityDrive = new RegularDrive();
	   
	   public DataManager() {
		   
	   }
	   public static void inzialize () {
		   GameCode.setCurrentEvent(new TitleScreen ());
		   GameCode.resetDataManager();
	   }
	   public static String [] getMenuOptions () {
		   String [] unmodifiedArgs = { "START GAME", "RULES", "ADVANCED CALCULUS", "CODES", "FONT", "CUSTOM EVENTS", "FUN FACTS", "VOLUME CONTROL"};
		   ArrayList <String> working = new ArrayList <String>();
		   for (int i = 0; i < unmodifiedArgs.length; i++) {
			   working.add(unmodifiedArgs[i]);
		   }
		   if (loadFile("Endless.txt")) {
			   working.add("ENDLESS MODE");
		   }
		   if (loadFile("Hardmode.txt")) {
			   working.add("HARD MODE");
		   }
		   if (loadFile("SoundTest.txt")) {
			   working.add("SOUND TEST");
		   }
		   if (loadFile("FinalBattle.txt")) {
			   working.add("FINAL BATTLE");
		   }
		   String [] finalArgs = new String [working.size()];
		   for (int i = 0; i < working.size(); i++) {
			   finalArgs[i] = working.get(i);
		   }
		   return finalArgs;
	   }
	   public static void saveFile (String fileName) {
		   try {
             	File fakeFile = new File ("./SavesDir");
                 File realFile = new File (fakeFile, fileName);
                 FileWriter fw = new FileWriter (realFile);
                 PrintWriter pw = new PrintWriter (fw);
                 pw.println("true");
                 pw.close();
             } catch (IOException e) {
              // GameCode.getTextInterface().println("THE SAVE FAILED PROBABLY CAUSE YOU MESSED WITH THE FILES OR SOMETHING TYPE NICE INTO THE CODES MENU TO RE UNLOCK THE BOSS ");
             }
	   }
	  public static boolean loadFile (String fileName) {
		  try {
	 	        FileReader fr = new FileReader("./SavesDir/" + fileName);
	 	        BufferedReader br = new BufferedReader(fr);
	 	        if (br.readLine().equals("true")) {
	 	          br.close();
	 	          return true;
	 	        }
	 	      } catch (IOException localIOException3) {
	 	    	  return false;
	 	      }
		  return false;
	  }
	  public static void generateEvents () { 
		  //TODO create an instance of all the possible events
		  Random rand = new Random ();
		  ArrayList <Location> possibleEvents = Location.getRandomEvents();
		  
		 int prevResult = 0;
		 int dist = 0;
		  for (int i = 0; i < possibleEvents.size(); i++) {
			
			  if (possibleEvents.get(i).getProbablity() > rand.nextInt(10000) && prevResult > 10) {
				  prevResult = 0;
				  possibleEvents.get(i).setDist(dist);
				  
			  }
			  
			  dist = dist + 1;
			  
			  prevResult = prevResult + 1;
			  
			  
		  }
	  }
	  public static String [] getColorChoices () {
		 ArrayList<String> working = new ArrayList<String> ();
		 working.add("WHITE");
		 working.add("RED");
		 working.add("BLUE");
		 working.add("YELLOW");
		  try {
	          FileReader fr = new FileReader("./SavesDir/Chicken.txt");
	          BufferedReader br = new BufferedReader(fr);
	          if (br.readLine().equals("true")) {
	            working.add("CHICKEN SCRATCH");
	          }
	          br.close();
	        }
	        catch (IOException localIOException3) {}
	        try {
	          FileReader fr = new FileReader("./SavesDir/math.txt");
	          BufferedReader br = new BufferedReader(fr);
	          if (br.readLine().equals("true")) {
	            working.add("GREEN");
	          }
	          br.close();
	        }
	        catch (IOException localIOException4) {}
	        try {
	          FileReader fr = new FileReader("./SavesDir/Newspaper.txt");
	          BufferedReader br = new BufferedReader(fr);
	          if (br.readLine().equals("true")) {
	        	  working.add("CHICKEN SCRATCH");
	          }
	          br.close();
	        }
	        catch (IOException localIOException5) {}
	        try {
	          FileReader fr = new FileReader("./SavesDir/rainbow.txt");
	          BufferedReader br = new BufferedReader(fr);
	          if (br.readLine().equals("true")) {
	            working.add("RAINBOW");
	          }
	          br.close();
	        }
	        catch (IOException localIOException6) {}
	        String [] workingList = new String[working.size()];
	        for (int i = 0; i < workingList.length; i++) {
	        	workingList[i] = working.get(i);
	        }
	        if (workingList.length == 7) {
	        	 thingy.userStats.setAchievement("multilingual_1_5");
	        }
	        return workingList;
	  }
	  
	  
	  public static SpriteContainer getSprites () {
		  return sprites;
	  }
	  
	  public static boolean noError() {
			 return noError;
		 }
		 public static void setnoError (boolean ErrorInverse) {
		 noError = ErrorInverse;
	 }
	 
	 public static int fileNumber() {
		 return fileNumber;
	 }
	public static void setFileNumber (int newFileNumber) {
		 fileNumber = newFileNumber;
		} 
	 public static boolean regularEventsEnabled() {
		 return regularEventsEnabled;
	 }
	 public static void setRegularEventsEnabled (boolean shouldRegularEventsEnabled) {
		 regularEventsEnabled = shouldRegularEventsEnabled;
	 }
	 
	 public static boolean customEventsEnabled() {
		 return customEventsEnabled;
	 }
	 public static void setCustomEventsEnabled (boolean shouldCustomEventsEnabled) {
		 customEventsEnabled = shouldCustomEventsEnabled;
	 }
	public static String getCode2() {
		return code2;
	}
	public static void setCode2(String code2) {
		DataManager.code2 = code2;
	}

	public static SoundPlayer getPlayer() {
		return player;
	}

	public static void setPlayer(SoundPlayer player) {
		DataManager.player = player;
	}

	public static float getVolume() {
		return volume;
	}

	public static void setVolume(float volume) {
		DataManager.volume = volume;
	}

	public static boolean isInTest() {
		return inTest;
	}

	public static void setInTest(boolean inTest) {
		DataManager.inTest = inTest;
	}

	public static boolean isEndlessMode() {
		return endlessMode;
	}

	public static void setEndlessMode(boolean endlessMode) {
		DataManager.endlessMode = endlessMode;
	}

	

	public static boolean isHardModeEnabled() {
		return hardModeEnabled;
	}

	public static void setHardModeEnabled(boolean hardModeEnabled) {
		DataManager.hardModeEnabled = hardModeEnabled;
	}

	public int getCalamityCount() {
		return calamityCount;
	}

	public void setCalamityCount(int calamityCount) {
		this.calamityCount = calamityCount;
	}

	public static int getMaxRNGValue() {
		return maxRNGValue;
	}

	public static void setMaxRNGValue(int maxRNGValue) {
		DataManager.maxRNGValue = maxRNGValue;
	}

	public static String getAbsolutePath() {
		return absolutePath;
	}

	public static void setAbsolutePath(String path) {
		absolutePath = path;
	}



	public int getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(int health) {
		playerHealth = health;
	}

}
