package main;

import java.util.ArrayList;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;

import enemys.Enemy;
import gameElements.Road;
import indecators.Indecator;
import location.Location;
import location.TitleScreen;
import location.TollBooth;
import location.Truckstop;
import resources.DataManager;
import resources.Textbox;

public class GameCode extends GameAPI {
  //static TextInterface textInterface = new TextInterface(80, 41, DataManager.getSprites().selector);
  //static DataManager manager = new DataManager ();
  static Location currentEvent;
  static thingy thing;
  
  static int veiwX = 0;
  static int veiwY = 0;
  
  Road road = new Road();
  
  ArrayList <Indecator> indecators = new ArrayList <Indecator> ();
  
 // static Textbox t = new Textbox ("~S8~~P100~TESTY BOIIIIIIIIIIIIIS");
  static Enemy gasBoy;
  
  static BattleInterface meme;
  
  static ArrayList <Asker> askers = new ArrayList <Asker> ();
  
  
  public static void initialize(){
//      thing = new thingy();
//      try {
//        SteamAPI.init();
//        thing.RequestStats();
        Truckstop stop = new Truckstop (false);
        stop.setDist(11);
        LocationHandler.addLocation(stop);
//        t.setBox("Automobiles");
//        t.pushString("EPIC STRING DUDE");
//        t.pushString("~QCHOICE 1:CHOICE 2");
//      }
//      catch (SteamException localSteamException) {
//    	  
//      }
        gasBoy = new Enemy();
        gasBoy.importEnemyData("resources/enemies/gas boy.txt");
        //meme = new BattleInterface();
        //meme.setEnemy(gasBoy);
        
        
}

  public static void setVeiw (int x, int y) {
	  veiwX = x;
	  veiwY = y;
  }
  
  public static int getVeiwX() {
	  return veiwX;
  }
  public static int getVeiwY() {
	  return veiwY;
  }
  
  public static void removeAsker(Actor asker) {
	  Asker toAsk = getAsker(asker);
	  askers.remove(toAsk);
  }
  
  
  public void gameLoop() {
	  
   // GameCode.getTextInterface().frameEvent();
    
//    if (SteamAPI.isSteamRunning()) {
//      SteamAPI.runCallbacks();
//    }
    
	  for (int i = 0; i < askers.size(); i++) {
	    	for (int j = 0; j < askers.get(i).getKeys().size(); j++) {
	    		if (!super.keyCheck(askers.get(i).heldKeys.get(i))) {
	    			askers.get(i).getKeys().remove(j);
	    			j--;
	    		}
	    	}
	    }
    
    if (LocationHandler.isOutside()) {
    	road.drive();
    }
    
    if (LocationHandler.isOutside()) {
    	LocationHandler.renderClosestLocation();
    } else {
    	LocationHandler.renderInteriorLocation();
    }
    
    //meme.draw();
    //t.draw();
    //t.setX(200);
   // t.setY(200);
    
  
    
  }
  /**
	 * used to set witch type of indicators are present at the current point of the game
	 */
	public void addIndecator(Indecator indecatorType) {
		this.indecators.add(indecatorType);
	}
	/**
	 * used to set witch type of indicators are present at the current point of the game
	 */
	public void resetIndecators() {
		while (!indecators.isEmpty()) {
			this.indecators.remove(0);
		}
	}
	
	
	/**
	 * gives the path of the currently playing song
	 */
	protected String getSongString () {
		return DataManager.getPlayer().getSongPath();
	}
	
	/**
	 * changes the currently playing song to a new song 
	 * @param song a filepath to the new song to play 
	 * @param volume the volume to play the song at
	 */
	protected void changeMusic (String song, float volume) {
		if (!DataManager.isInTest()) {
			if (!DataManager.getPlayer().getSongPath().equals(song)) {
				DataManager.getPlayer().play(song, volume);
			}
		}
		DataManager.getPlayer().setVolume(volume);
	}
	
	public static int getResolutionX() {
		return MainLoop.getWindow().resolution[0];
	}
	public static int getResolutionY() {
		return MainLoop.getWindow().resolution[1];
	}
	
	public static boolean keyCheck(int keyCode, Actor whosAsking) {
		boolean returnValue = MainLoop.getWindow().keyCheck(keyCode);
	    
		Asker asking = getAsker(whosAsking);
		
		if (returnValue) {
			
			asking.getKeys().add(keyCode);
		}
		
		return returnValue;
	  }
	
	public static Asker getAsker (Actor whosAsking) {
	
		Asker asking = null;
		
		boolean foundAsker = false;
		
		for (int i = 0; i < askers.size(); i++) {
			if (askers.get(i).isAsker(whosAsking)) {
				asking = askers.get(i);
				foundAsker = true;
				break;
			}
		}
		
		if (!foundAsker) {
			askers.add(new Asker(whosAsking));
			asking = askers.get(askers.size() -1);
		}
		
		return asking;
	}
	  
	  public static boolean keyPressed(int keyCode, Actor whosAsking) {
		boolean returnValue = MainLoop.getWindow().keyPressed(keyCode);
		
		Asker asking = getAsker(whosAsking);
		
		if (returnValue && !asking.getKeys().contains(keyCode)) {
			asking.getKeys().add(keyCode);
			return returnValue;
		} else {
			return false;
		}
		
		
	  }
	  
	  public static boolean keyReleased(int keyCode) {
	    return MainLoop.getWindow().keyReleased(keyCode);
	  }
	
	  
	 
	  
	  
//  public void customEvent() {
//    int lowestnumber = 358;
//    int numberInQuestion = 0;
//    while (!urGay) {
//      numberInQuestion++;
//      try {
//        if ((decicion > lowestnumber) && (decicion <= lowestnumber + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(numberInQuestion) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1)))) {
//          urGay = true;
//          loadedCustomEvent = numberInQuestion;
//          
//        } else {
//          lowestnumber += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(numberInQuestion) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1));
//        }
//      } catch (IOException e) {
//    	  System.out.println("debug");
//        if (numberInQuestion == ) {
//          decicion = 1000000000;
//        }
//      }
//    }
//    if (isDriving) {
//      try {
//        if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).length() > 155) {
//          int begining = 0;
//          while (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining, begining + 154) != null) {
//            GameCode.getTextInterface().println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining, begining + 154));
//            begining += 154;
//          }
//          GameCode.getTextInterface().println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining - 154));
//          GameCode.getTextInterface().println(" ");
//        } else {
//          GameCode.getTextInterface().println((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0));
//          GameCode.getTextInterface().println(" ");
//        }
//        String[] optionsArray = new String[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))];
//        int arrayIndex = 0;
//        int cyclethingy = 2;
//        int[] optionPlaces = new int[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))];
//        while (arrayIndex != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))) {
//          cyclethingy++;
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(cyclethingy)).equals("option")) {
//            optionsArray[arrayIndex] = ((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(cyclethingy + 1));
//            optionPlaces[arrayIndex] = (cyclethingy + 1);
//            arrayIndex++;
//          }
//        }
//        GameCode.getTextInterface().query(optionsArray);
//        isDriving = false;
//        legitnessArray = optionsArray;
//        trueOptions = optionPlaces;
//      } catch (IOException e) {
//        decicion = 100000000;
//      }
//    }
//    int legitIndex = 0;
//    try {
//      while (legitIndex != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))) {
//        if ((GameCode.getTextInterface().selected.equals(Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(trueOptions[legitIndex]))) && (getKappyed)) {
//          theMagicNumber = trueOptions[legitIndex];
//          weDidIt = true;
//        }
//        legitIndex++;
//      }
//      
//      if (weDidIt) {
//        eventRandom = (RNG.nextInt(99) + 1);
//        int legitNumber = 0;
//        int evenLegiterNumber = theMagicNumber + 1;
//        int[] legitNumbers = new int[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(theMagicNumber + 1))];
//        while (legitNumber != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(theMagicNumber + 1))) {
//          evenLegiterNumber++;
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(evenLegiterNumber)).equals("branch")) {
//            legitNumbers[legitNumber] = (evenLegiterNumber + 2);
//            legitNumber++;
//          } }
//        int whatImLookingFor;
//        if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0]))) {
//          if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1]))){
//            if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[2]))) {
//              if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[2])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[3]))) {
//                whatImLookingFor = 4;
//              } else {
//                whatImLookingFor = 3;
//              }
//            } else {
//              whatImLookingFor = 2;
//            }
//          } else {
//            whatImLookingFor = 1;
//          }
//        } else {
//          whatImLookingFor = 0;
//        }
//        if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).length() > 155) {
//          int begining = 0;
//          while (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining, begining + 154) != null) {
//            GameCode.getTextInterface().println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining, begining + 154));
//            begining += 154;
//          }
//          GameCode.getTextInterface().println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining - 154));
//          GameCode.getTextInterface().println(" ");
//        } else {
//          GameCode.getTextInterface().println((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1));
//          GameCode.getTextInterface().println(" ");
//        }
//        boolean consequencesStillGoingOn = true;
//        boolean urDead = false;
//        while (consequencesStillGoingOn) {
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("cash")) {
//            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
//              GameCode.getDataManager().money += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            } else {
//              GameCode.getDataManager().money -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("GameCode.getDataManager().gas")) {
//            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
//              GameCode.getDataManager().gas += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            } else {
//              GameCode.getDataManager().gas -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("GameCode.getDataManager().grain")) {
//            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
//              GameCode.getDataManager().grain += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            } else {
//              GameCode.getDataManager().grain -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
//              try {
//                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
//                  legitNumbers[whatImLookingFor] += 4;
//                } else {
//                  consequencesStillGoingOn = false;
//                }
//              } catch (IndexOutOfBoundsException e) {
//                consequencesStillGoingOn = false;
//              }
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("good karma")) {
//            Karma = 1;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("bad karma")) {
//            Karma = 2;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("death")) {
//            urDead = true;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("marsh-an tech")) {
//            GameCode.getDataManager().marsianTech = true;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("amulet coin")) {
//            GameCode.getDataManager().amuletCoin = true;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("energized")) {
//            GameCode.getDataManager().tiredness = -120;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("NO SLEEP")) {
//            noSleep = true;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("criminal")) {
//            GameCode.getDataManager().isCriminal = true;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("comunist")) {
//            GameCode.getDataManager().setCommunist(true);
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("poisoned")) {
//            GameCode.getDataManager().setPoisoned(true);
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("cure poison")) {
//            GameCode.getDataManager().setPoisoned(false);
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("clear record")) {
//            DataManger.setCommunist(false);
//            GameCode.getDataManager().isCriminal = false;
//            try {
//              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
//                legitNumbers[whatImLookingFor] += 2;
//              } else {
//                consequencesStillGoingOn = false;
//              }
//            } catch (IndexOutOfBoundsException e) {
//              consequencesStillGoingOn = false;
//            }
//          }
//        }
//        if (urDead) {
//          GameCode.getTextInterface().println(" ");
//          GameCode.getTextInterface().println(" ");
//          GameCode.getTextInterface().query(new String[] { "DANG IT" });
//        } else {
//          GameCode.getTextInterface().println(" ");
//          GameCode.getTextInterface().println(" ");
//          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
//        }
//        weDidIt = false;
//        getKappyed = false;
//      	}
//    } catch (IOException e) {
//      decicion = 100000000;
//    }
//    if (GameCode.getTextInterface().selected.equals("GET BACK ON THE ROAD")) {
//      isDriving = true;
//      urGay = false;
//      getKappyed = true;
//    }
//    if (GameCode.getTextInterface().selected.equals("DANG IT")) {
//      initialize();
//    }
//  }

}