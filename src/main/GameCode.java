package main;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamUserStats;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info;
import resources.CoolCheck;
import resources.Sprite;
import resources.SpriteContainer;
public class GameCode extends GameAPI {
  private GameWindow gameWindow;
  static TextInterface textInterface;
  private static int numberOfBranches;
  private static int milesDriven;
  private static int milesLeft;
  static boolean isDriving;
  static Random RNG;
  private static int decicion;
  private static double gas;
  private static Boolean hasPoison;
  private static int poisonMiles;
  static int calamityCount;
  private static String code;
  private static int timer;
  private static boolean endlessMode;
  static int money;
  static int grain;
  private static int eventRandom;
  private static boolean GG;
  static boolean amuletCoin;
  private static boolean isCriminal;
  private static boolean takeingDetour;
  private static int detourMiles;
  private static boolean isCommunist;
  private static boolean noSleep;
  private boolean carChase;
  private static int carChaseMiles;
  private static boolean escapedChase;
  private static boolean failedEscape;
  private static int Karma;
  private static boolean pothole;
  private static boolean homelessFed;
  private static boolean workingRadio;
  private static int banditHealth;
  private static int playerHealth;
  private static boolean gasCoating;
  private static boolean isCoordinated;
  private static int raltzHealth;
  private static int buffCount;
  private static boolean usedTrumpCard;
  private static int Martianhealth;
  private static boolean martianTech;
  private static boolean felepesHappyness;
  private static int amountBet;
  private static int Strikes;
  private static int Balls;
  private static boolean canReturn;
  private static int hotel;
  private static boolean hasTimeShare;
  private static boolean gameBeat;
  private static boolean newspaperEgg;
  private static boolean chickenEgg;
  private static int creditsTimer;
  private static boolean hardModeEnabled;
  private static int ruleCheck;
  private static boolean superEgg;
  private static boolean mobiusFight;
  private static boolean isVisable;
  private static int amountOfAttacks;
  private static boolean hasKey;
  private static int hope;
  private static int iBasis;
  private static boolean isCharged;
  private static boolean justStarted;
  private static boolean skipedEnter;
  private static boolean mobiusChase;
  private static int distanceFromMobius;
  private static boolean hasPikbois;
  private static int hywayHealth;
  private boolean hiwayFight;
  private static int numberOfPlayerBuffs;
  private static int maximumHealth;
  private static boolean[] attacksUsed = new boolean[3];
  private static boolean[] alliesThatWork = { true, true, true, true, true, true, true, false };
  private static boolean workingCar;
  private static boolean hasCable;
  private static int pikboiSprouts;
  private static int pikboiSquad;
  private static boolean wierdInjection;
  private static boolean inBunker;
  private static boolean lowAccuracy;
  private static boolean hasTeeth;
  private static boolean isConfused;
  private static boolean isBurrned;
  private static boolean[] defeatedAllies = new boolean[8];
  private static boolean healthSpray;
  private static boolean allTiedUp;
  private static boolean isPlayingBaseball;
  private static boolean finalPhase;
  private static boolean goodJob;
  private static int amountOfTimesPushed;
  private static int amountOfRemainingPercentage;
  FileWriter mm;
  PrintWriter em;
  private static int numberOfChoices;
  private static boolean noError;
  private static int fileNumber;
  private static boolean customEventsEnabled;
  private static int maxDecision;
  private static boolean urGay;
  private static int loadedCustomEvent;
  public String[] legitnessArray;
  public int[] trueOptions;
  private static int theMagicNumber;
  private boolean weDidIt;
  String AbsolutePath = new File(".").getAbsolutePath();
  private static boolean getKappyed;
  private static boolean regularEvents;
  private static boolean gashotelMarkers;
  private static boolean stopped;
  private static boolean rainbowEgg;
  public static int waitUntil;
  public static File soundFile;
  public static File soundFile2;
  public static AudioInputStream ais;
  public static AudioFormat format;
  DataLine.Info info;
  public static Clip clip;
  public static CoolCheck stuff;
  public static AudioInputStream ais2;
  public static AudioFormat format2;
  DataLine.Info info2;
  public static Clip clip2;
  public static float volume;
  private static boolean mathEgg;
  private static String code2;
  private static thingy thing;
  int timesbeat;
  private static boolean PewDiePieChair;
  private static boolean firstRun = true;
  private int KidHealth = 700;
  private int houseTurns;
  private static int radioUsed;
  static int detourLength;
  private static Sprite raltzDrawing;
  private static Sprite marshDrawing;
  private static Sprite banditDrawing;
  private static Sprite candyDrawing;
  private static Sprite explosionDrawing;
  private static Sprite automobielsDrawing;
  private static Sprite voidDrawing;
  private static Sprite mobiusDrawing;
  private static Sprite baseballDrawing;
  private static int milesSienceLastStop;
  private static boolean canStop;
  private static int legislaterHealth;
  private static boolean secrateBoss;
  private static boolean diplomaticImunity;
  private static int amountToWait;
  private static boolean guessWereDoinThis;
  private static boolean canLegislate;
  private static int blakeHealth;
  private static int johnHealth;
  private static boolean soundTest;
  private static int loganHealth;
  private static boolean loganAnger;
  private static boolean blakeAnger;
  private static boolean johnAnger;
  private static int cookieDrops;
  private static boolean confusion;
  private static boolean turtles;
  private static boolean inTest;
  private static boolean distraction;
  private boolean allergys;
  private static int radioIndex;
  private static String [] radioMessages;
  private static boolean wasConfused;
  public static void initialize(){
	if (firstRun) {
    try {
      stuff = new CoolCheck();
      mathEgg = false;
      thing = new thingy();
    }catch (NullPointerException e) {
    }
      try {
        SteamAPI.init();
        thing.RequestStats();
      }
      catch (SteamException localSteamException) {
    	  
      }
      volume = -10.0F;
      code2 = "";
      raltzDrawing = new Sprite ("./Illistrations/Raltz.png");
      marshDrawing = new Sprite ("./Illistrations/UFO.png");
      banditDrawing = new Sprite ("Illistrations/bandit.png");
      candyDrawing = new Sprite ("./Illistrations/candy bar.png");
      explosionDrawing = new Sprite ("./Illistrations/explosion.png");
      automobielsDrawing = new Sprite ("./Illistrations/automobiels.png");
      voidDrawing = new Sprite ("./Illistrations/void.png");
      mobiusDrawing = new Sprite ("./Illistrations/mobius.png");
      baseballDrawing = new Sprite ("./Illistrations/baseball.png");
      detourLength = 0;
      firstRun = false;
      stuff.playSoundEffect(6.0F, "soundEffects/Click.wav");
      rainbowEgg = false;
      radioUsed = 0;
      endlessMode = false;
      regularEvents = true;
      theMagicNumber = 0;
      loadedCustomEvent = 0;
      urGay = false;
      legislaterHealth = 1;
      customEventsEnabled = false;
      fileNumber = 0;
      noError = true;
      amountOfRemainingPercentage = 100;
      numberOfChoices = 420;
      numberOfBranches = 420;
      amountOfTimesPushed = 0;
      superEgg = false;
      chickenEgg = false;
      newspaperEgg = false;
      gameBeat = false;
      hasTimeShare = false;
      pothole = false;
      hardModeEnabled = false;
      maxDecision = 358;
  }
    
    if (stuff.isPlaying()) {
     clip.stop();
    }
    stuff.play("tital", volume);
    hotel = 0;
    stopped = false;
    gashotelMarkers = false;
    getKappyed = true;
    goodJob = false;
    inTest = false;
    finalPhase = false;
    isPlayingBaseball = false;
    confusion = false;
    distraction = false;
    diplomaticImunity = false;
    radioIndex = 0;
    radioMessages = new String [] {"COOKIE DROPS ARE THE BEST PIZZA ESTABLISMENT", "CASEY'S IS THE HARDMORKING COUNTRY BOY PIZZA", "AN ARMLESS MAN WAS CHARGED OF STABBING", "MOODY IS NOT A HARDWORKIN COUNTRY MAN","JOHN LIKES VALANTINOS", "BLAKE LIKES PIZZA HUT"};
    allTiedUp = false;
    healthSpray = true;
    isBurrned = false;
    isConfused = false;
    hasTeeth = true;
    lowAccuracy = false;
    inBunker = false;
    wierdInjection = false;
    amountToWait = 0;
    pikboiSprouts = 0;
    pikboiSquad = 20;
    loganAnger = false;
    johnAnger = false;
    blakeAnger = false;
    hasCable = false;
    cookieDrops = 0;
    workingCar = true;
    maximumHealth = 700;
    numberOfPlayerBuffs = 0;
    hywayHealth = 100000;
    hasPikbois = false;
    distanceFromMobius = 1;
    mobiusChase = false;
    skipedEnter = false;
    isCharged = false;
    hope = 3;
    hasKey = false;
    amountOfAttacks = 0;
    isVisable = false;
    guessWereDoinThis = false;
    ruleCheck = 0;
    canReturn = false;
    Strikes = 0;
    Balls = 0;
    amountBet = 0;
    martianTech = false;
    Martianhealth = 2000;
    usedTrumpCard = false;
    isCoordinated = true;
    gasCoating = false;
    turtles = false;
    homelessFed = false;
    Karma = 0;
    isCommunist = false;
    milesLeft = 1000;
    detourMiles = 0;
    isDriving = false;
    decicion = 4000000;
    gas = 30.0D;
    GG = true;
    RNG = new Random();
    hasPoison = false;
    poisonMiles = 0;
    calamityCount = 0;
    code = "";
    timer += 1;
    money = 1000;
    grain = 100;
    milesDriven = 0;
    eventRandom = 69;
    amuletCoin = false;
    isCriminal = false;
    takeingDetour = false;
    noSleep = false;
    carChaseMiles = 0;
    escapedChase = false;
    failedEscape = false;
    soundTest = false;
    canLegislate = true;
    secrateBoss = false;
    workingRadio = true;
    wasConfused = false;
    banditHealth = 1500;
    playerHealth = 700;
    raltzHealth = 160;
    buffCount = 0;
    felepesHappyness = true;
    creditsTimer = 0;
    mobiusFight = false;
    isVisable = false;
    iBasis = 4000000;
    blakeHealth = 400;
    johnHealth = 400;
    loganHealth = 400;
    justStarted = true;
    PewDiePieChair = false;
    alliesThatWork [0] = true;
    alliesThatWork [1] = true;
    alliesThatWork [2] = true;
    alliesThatWork [3] = true;
    alliesThatWork [4] = true;
    alliesThatWork [5] = true;
    alliesThatWork [6] = true;
    alliesThatWork [7] = false;
    defeatedAllies [0] = false;
    defeatedAllies [1] = false;
    defeatedAllies [2] = false;
    defeatedAllies [3] = false;
    defeatedAllies [4] = false;
    defeatedAllies [5] = false;
    defeatedAllies [6] = false;
    defeatedAllies [7] = false;
    attacksUsed [0] = false;
    attacksUsed [1] = false;
    attacksUsed [2] = false;
    gasCoating = false;
    milesSienceLastStop = 0;
    canStop = true;
    textInterface = new TextInterface(80, 41, sprites.selector);
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println("            AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM THE GAME!!!!!");
    textInterface.println("                       A SHORT GAME BY JEFFREY MARSH");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    textInterface.println(" ");
    textInterface.println("NOTE THIS GAME IS ONLY LIGHTLY TESTED AND BUGS MAY STILL EXIST IF YOU FIND ONE PLEASE BRING IT UP IN THE FORUMS");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    if (!superEgg) {
    textInterface.println(" ");
    } else {
    textInterface.println("IT MAY BE IN YOUR BEST INTREST TO CHECK THE RULES A FEW TIMES");	
    }
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println("VERSION 3.0 ");
    
}
  public void gameLoop() {
    textInterface.frameEvent();
    if (SteamAPI.isSteamRunning()) {
      SteamAPI.runCallbacks();
    }
    String milesToNewYork = Integer.toString(milesLeft);
    String c = Integer.toString(milesDriven);
    String grainLeft = Integer.toString(grain);
    String moneyLeft = Integer.toString(money);
    String gasLeft = Double.toString(gas);
    String Health = Integer.toString(playerHealth);
    String BanditLife = Integer.toString(banditHealth);
    String DumbHealth = Integer.toString(raltzHealth);
    String JeffreyHealth = Integer.toString(Martianhealth);
    String enemyHealth = Integer.toString(hywayHealth);
    String KidLife = Integer.toString(KidHealth);
    if ((chickenEgg) && (newspaperEgg) && (rainbowEgg) && (mathEgg)) {
      thingy.userStats.setAchievement("multilingual_1_5");
    }
    if (!stuff.isPlaying()) {
      clip.stop();
      if (waitUntil == 696) {
        stuff.play("tital", volume);
      }
      if (waitUntil == 1624) {
        stuff.play("god", volume);
      }
      if (waitUntil == 1317) {
        stuff.play("extrasensory", volume);
      }
      if (waitUntil == 1800) {
        stuff.play("marsh", 6.0F);
      }
      if (waitUntil == 1654) {
        stuff.play("roads", volume);
      }
      if (waitUntil == 1620) {
    	stuff.play("mobius", volume);
      }
      if (waitUntil == 1513) {
    	stuff.play("road rage", volume);
      }
      if (waitUntil == 1125) {
    	stuff.play("bandits", volume);
      }
      if (waitUntil == 1266) {
    	  stuff.play("jumping", volume);
      }
    }
    FunFacts.readFacts();
     calculus.startMinigame();
    if (textInterface.selected.equals("OPTIONS")) {
    	 try {
    	        FileReader fr = new FileReader("./SavesDir/ranch.txt");
    	        BufferedReader br = new BufferedReader(fr);
    	        if (br.readLine().equals("https://www.youtube.com/channel/UCOkJZ_cm3AwN08c5NLTIrLw")) {
    	          secrateBoss = true;
    	        }
    	        br.close();
    	      }     catch (IOException localIOException3) {
    	    	  
    	      }
    	 try {
 	        FileReader fr = new FileReader("./SavesDir/soundTest.txt");
 	        BufferedReader br = new BufferedReader(fr);
 	        if (br.readLine().equals("true")) {
 	          soundTest = true;
 	        }
 	        br.close();
 	      }     catch (IOException localIOException3) {
 	    	  
 	      }
      textInterface.selected = "unimportant";
      textInterface.println(" ");
      if (!secrateBoss) {
      textInterface.query(new String[] { "CODES", "FONT", "CUSTOM EVENTS", "FUN FACTS", "VOLUME CONTROL" });
      } else {
    	  if (soundTest) {
    		  textInterface.query(new String[] { "CODES", "FONT", "CUSTOM EVENTS", "FUN FACTS", "VOLUME CONTROL", "SECRATE BOSS", "SOUND TEST" });
    	  }else {
    	  textInterface.query(new String[] { "CODES", "FONT", "CUSTOM EVENTS", "FUN FACTS", "VOLUME CONTROL", "SECRATE BOSS" });
      }
    }
    }
      if (textInterface.selected.equals("SOUND TEST")) {
    	  textInterface.println("WHAT SONG DO YOU WANT TO HEAR");
    	  textInterface.selected = "unimportant";
    	  textInterface.query(new String [] {"TITLE THEME", "THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "MARSH-ANS THEME", "EXTRASENSORY", "JUMPING THROUGH HOOPS", "ROAD RAGE!", "VS MOBIUS", "CLEAR THE ROADS", "BACK TO NORMAL"});
    	  }
      if (textInterface.selected.equals("BACK TO NORMAL")) {
      textInterface.println(" ");
      inTest = false;
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("CLEAR THE ROADS")) {
    	  clip.stop();
    	  textInterface.selected = "unimport";
    	  
      stuff.play("roads", volume);
      textInterface.println(" ");
      inTest = true;
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("TITLE THEME")) {
    	  clip.stop();
    	  textInterface.selected = "unimport";
    	  
      stuff.play("tital", volume);
      textInterface.println(" ");
      inTest = true;
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("god", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("MARSH-ANS THEME")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("marsh", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("EXTRASENSORY")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("extrasensory", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("JUMPING THROUGH HOOPS")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("jumping", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("ROAD RAGE!")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("road rage", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      if (textInterface.selected.equals("VS MOBIUS")) {
    	  clip.stop();
    	  inTest = true;
    	  textInterface.selected = "unimport";
      stuff.play("mobius", volume);
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
      
    if (textInterface.selected.equals("SECRATE BOSS") || guessWereDoinThis) {
    	if (playerHealth == 0) {
    		textInterface.println("YOU GOT OUTPLAYED HOW SAD");
    		playerHealth = 700;
    		textInterface.selected = "unimportant";
    		textInterface.query(new String [] {"DANG IT"});
    	}
    	if (johnHealth == 0 && loganHealth == 0 && blakeHealth == 0) {
    		textInterface.println("YOU DEFEATED THE THREE KINDA,  HERE TAKE SOME AUDIO TAPES (YOU UNLOCKED SOUND TEST)");
    		johnHealth = 400;
    		loganHealth = 400;
    		blakeHealth = 400;
    		   try {
    	        	File fakeFile = new File ("./SavesDir");
    	            File realFile = new File (fakeFile, "soundTest.txt");
    	            FileWriter fw = new FileWriter (realFile);
    	            PrintWriter pw = new PrintWriter (fw);
    	            pw.println("true");
    	            pw.close();
    	          }
    	          catch (IOException localIOException7) {
    	        }
    		textInterface.selected = "";
    		soundTest = true;
    		textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    	}
    	if (textInterface.selected.equals("SECRATE BOSS")) {
    		textInterface.println("YOU FIND YOURSELF ON AN OLD TIME RANCH \"HOWDY PARTNER AND WELCOME TO THE RANCH\"");
    		textInterface.println("YOU HEAR FROM A BARN YOU INVESTIGATE AND FIND THREE BOYS SITTING IN FRONT OF MICROPHONE");
    		textInterface.println("AH I GUESS WERE DOIN THIS YOU SAY UNDER YOUR BREATH");
    		textInterface.selected = "unimportint";
    		guessWereDoinThis = true;
    		textInterface.println(" ");
    		textInterface.println("THE RANCHERS DON'T TAKE KINDLY TO CITY SLICKERS LIKE YOU");
    		textInterface.println(" ");
    		textInterface.println("HEALTH " + Health);
    		textInterface.println("BLAKE HEALTH " + Integer.toString(blakeHealth));
    		textInterface.println("LOGAN HEALTH " + Integer.toString(loganHealth));
    		textInterface.println("JOHN HEALTH " + Integer.toString(johnHealth));
    		textInterface.query(new String [] {"TALK", "ITEMS", "SOMETHING ELSE"});
    	}
    	if (textInterface.selected.equals("TALK")) {
    		textInterface.println("WHO DO YOU WANT TO TALK TO");
    		textInterface.selected = "unimportant";
    		textInterface.query(new String [] {"BLAKE", "JOHN", "LOGAN", "NEVERMIND ILL DO SOMETHIN ELSE"});
    	}
    	if (textInterface.selected.equals("BLAKE")) {
    		 eventRandom = (RNG.nextInt(9) + 1);
    	        if (eventRandom <= 3) {
    	          textInterface.println("YOU BRING UP THE QUALITY OF THE PIZZA FOUND AT VALANTINOS THE TRIO GET INTO AN ARGUMENT THE OTHER TWO END UP GIVEING BLAKE A BEATING");
    	          eventRandom = RNG.nextInt(120) + 50;
     	          blakeHealth = blakeHealth - eventRandom;
     	          textInterface.println("BLAKE TOOK " + Integer.toString(eventRandom) + " DAMAGE HE IS ANGRY");
    	          blakeAnger = true;
    	          textInterface.query(new String[] { "EPIC" });
    	          textInterface.selected = "unimportant";
    	        }
    	        if ((eventRandom >= 4) && (eventRandom <= 7)) {
    	          textInterface.println("YOU TALK ABOUT COOKIE DROPS BLAKE GIVES YOU A FREE SAMPLE");
    	          cookieDrops = cookieDrops + 1;
    	          textInterface.println(" ");
    	          textInterface.query(new String[] { "EPIC" });
    	          textInterface.selected = "unimportant";
    	        }
    	        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
    	          textInterface.println("YOU ASK A QUESTION ABOUT BEES EVERYONES A BIT CONFUSED");
    	          confusion = true;
    	          textInterface.query(new String[] { "EPIC" });
    	          textInterface.selected = "unimportant";
    	        }
    	      }
    	if (textInterface.selected.equals("JOHN")) {
    		 eventRandom = (RNG.nextInt(9) + 1);
 	        if (eventRandom <= 3) {
 	          textInterface.println("YOU ASK IF JOHN WAS DRINKING WHILE AT STOP SIGNS");
 	          textInterface.println("HE SAYS NO OBVIOSLY HIDING HIS ARMY OR TURTLES");
 	          turtles = true;
 	          textInterface.query(new String[] { "EPIC" });
 	          textInterface.selected = "unimportant";
 	        }
 	        if ((eventRandom >= 4) && (eventRandom <= 7)) {
 	          textInterface.println("YOU TELL JOHN THAT PIZZA HUT IS VERY TASTY");
 	          textInterface.println(" ");
 	          textInterface.println("THE THREE GET INTO A HUGE ARGUMENT AND THE OTHER TWO END UP GIVING JOHN A BEATING");
 	          eventRandom = RNG.nextInt(120) + 50;
 	          johnHealth = johnHealth - eventRandom;
 	          textInterface.println("JOHN TOOK " + Integer.toString(eventRandom) + "  DAMAGE HE IS ANGRY");
 	          johnAnger = true;
 	          textInterface.query(new String[] { "EPIC" });
 	          textInterface.selected = "unimportant";
 	        }
 	        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
 	          textInterface.println("YOU TALK ABOUT COOKIE DROPS JOHN GIVES YOU A FREE SAMPLE");
 	          cookieDrops = cookieDrops + 1;
 	          textInterface.query(new String[] { "EPIC" });
 	          textInterface.selected = "unimportant";
 	        }	
    	}
    	if (textInterface.selected.equals("LOGAN")) {
   		 eventRandom = (RNG.nextInt(9) + 1);
	        if (eventRandom <= 3) {
	          textInterface.println("YOU ASK LOGAN IF HE WANTS A SALAD FROM MCDONALDS HE GETS ANGRY");
	          loganAnger = true;
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }
	        if ((eventRandom >= 4) && (eventRandom <= 7)) {
	          textInterface.println("YOU ASK LOGAN TO TEST IF YOUR DRUGS ARE REAL");
	          textInterface.println("HE FACEPALMS");
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }
	        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
	          textInterface.println("YOU ASK LOGAN TO MILK A GOAT THE OTHER TWO CUT YOU OFF BUT THEY CAN'T STOP THINKING ABOUT IT");
	          distraction = true;
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }	
   	}
    if (textInterface.selected.equals("NEVERMIND ILL DO SOMETHIN ELSE")) {
    	textInterface.selected = "OUCH";
    }
    if (textInterface.selected.equals("ITEMS")) {
    	textInterface.println("WHICH ITEM DO YOU WANT TO USE");
    	textInterface.selected = "unimportant";
    	textInterface.println(" ");
    	textInterface.query(new String [] {"COOKIE DROPS", "RADIO", "NEVERMIND ILL DO SOMETHIN ELSE"});
    }
    if (textInterface.selected.equals("COOKIE DROPS")) {
    	textInterface.selected = "unimportant";
    	if (cookieDrops != 0) {
    		textInterface.println("YOU EAT ONE OF YOUR COOKIE DROPS YOU RECOVERED ALL YOUR HEALTH");
    		playerHealth = 700;
    		cookieDrops = cookieDrops - 1;
    		textInterface.query(new String[] { "EPIC" });
    	} else {
    		textInterface.println("YOU HAVE NO COOKIE DROPS WHAT A SAD EXISTINCE YOU LIVE");
    		textInterface.query(new String[] { "EPIC" });
    	}
    }
    if (textInterface.selected.equals("RADIO")) {
    	textInterface.println("YOU TURN ON YOUR RADIO AND HEAR A PODCAST STARRING THE THREE RANCHERS YOU LEARN THAT");
    	textInterface.println(" ");
    	textInterface.println(radioMessages [radioIndex]);
    	textInterface.selected = "unimportant";
    	textInterface.println(" ");
    	radioIndex = radioIndex + 1;
    	if (radioIndex == 6) {
    		radioIndex = 0;
    	}
    	textInterface.query(new String [] {"EPIC"});
    }
    if (textInterface.selected.equals("SOMETHING ELSE")) {
    	 eventRandom = (RNG.nextInt(7) + 1);
	        if (eventRandom <= 2) {
	          textInterface.println("YOU COMPLAIN ABOUT YOUR ALLERGYS THEY KNOW YOUR A CITY SLICKER NOW");
	          allergys = true;
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }
	        if ((eventRandom == 3) || (eventRandom == 4)) {
	          textInterface.println("YOU TYPE REALLY LOUDLY ON PURPOSE THE TRIO GETS VERY DISTRACTED");
	          distraction = true;
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }
	        if ((eventRandom == 5) || (eventRandom == 6)) {
	          textInterface.println("YOU TAKE A CRAP ON THE FLOOR THE TRIO THROW UP OUT OF DISCUST");
	          eventRandom = RNG.nextInt(20) + 50;
	          loganHealth = loganHealth - eventRandom;
	          blakeHealth = blakeHealth - eventRandom;
 	          johnHealth = johnHealth - eventRandom;
 	          textInterface.println("THEY EACH TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          textInterface.query(new String[] { "EPIC" });
	          textInterface.selected = "unimportant";
	        }
	        if ((eventRandom == 7) || (eventRandom == 8)) {
		          textInterface.println("YOU ACCIDENTLY LOOK AT THE THREE OF THEM ALL OF YOU GET BANED EVERYBODYS TURRNS GET SKIPPD SO I GUESS ITS YOUR TURN AGAIN");
		          textInterface.query(new String[] { "OUCH" });
		          textInterface.selected = "unimportant";
		        }
    }
    if (johnHealth <0) {
    	johnHealth = 0;
    }
    if (loganHealth <0) {
    	loganHealth = 0;
    }
    if (blakeHealth <0) {
    	blakeHealth = 0;
    }
    if (textInterface.selected.equals("EPIC")) {
    	if (blakeHealth > 0) {
    	if (confusion) {
    		eventRandom = RNG.nextInt(2);
    		if (eventRandom == 0) {
    			textInterface.selected = "unimportant";
    			textInterface.println("THEY WERE SO CONFUSED THEY GOT INTO A SCUFFLE");
    			textInterface.println(" ");
    			 eventRandom = RNG.nextInt(20) + 50;
   	          loganHealth = loganHealth - eventRandom;
   	          blakeHealth = blakeHealth - eventRandom;
    	          johnHealth = johnHealth - eventRandom;
    	          wasConfused = true;
    	          textInterface.println("THEY EACH TOOK " + Integer.toString(eventRandom) + " DAMAGE");
   	          textInterface.query(new String[] { "OUCH" });
    		} else {
    			textInterface.println("THEY DECIDED TO NOT BE CONFUSED ANYMORE");
    			confusion = false;
    		}
    	}
    	if (wasConfused) {
    		wasConfused = false;
    	} else {
                eventRandom = (RNG.nextInt(4) + 1);
                String question = "THIS MESSAGE SHOULD NOT APPEAR PLEASE REPORT THIS BUG TO JEFFREY MARSH AT JEFFREY MARSH INDUSTRYS (CHOSE BLUE)";
                String [] answers;
                answers = new String [3];
                if (eventRandom == 1) {
                  question = "WITCH PIZZA PLACE IS THE BEST";
                  answers [1] = "DOMINOS";
                  answers [2] = "PIZZA HUT";
                  answers [0] = "LITTLE CEASERS";
                }
                if (eventRandom == 2) {
                  question = "WHITCH OF THESE ARE THE WORST";
                  answers [0] = "PACK A DIP";
                  answers [1] = "THIS GAME";
                  answers [2] = "PUBLIC DEFECATION";
                   }
                if (eventRandom == 3) {
                  question = "WHAT CODE MADE YOU UNLOCK THIS FIGHT";
                  answers [0] = "RANCH";
                  answers [1] = "CAST";
                  answers [2] = "SECRATE";
                }
                if (eventRandom == 4) {
                  question = "WHICH OF THESE IS ACCEPTABLE";
                  answers [0] = "LOOKING AT PEOPLE";
                  answers [1] = "PLAYING TIC TAC TOE";
                  answers [2] = "NOTHING";
                }
                if (eventRandom == 5) {
                  question = "WITCH OF THESE ARE THE TASTEST";
                  answers [0] = "MICROWAVE POPCORN";
                  answers [1] = "TOASTER WAFFLES";
                  answers [2] = "COOKIE DROPS";
                }
                textInterface.println("BLAKE ASKS YOU " + question);
                textInterface.query(answers);
                textInterface.selected = "not important";
            }
    	} else {
    	textInterface.println("BLAKE HAS ALREADY BEEN DEFEATED");
    	textInterface.selected.equals("unimportant");
    	textInterface.query(new String [] {"DANG"});
    	}
    	}
    if (textInterface.selected.equals("PIZZA HUT") || textInterface.selected.equals("PACK A DIP") || textInterface.selected.equals("RANCH") || textInterface.selected.equals("NOTHING") || textInterface.selected.equals("COOKIE DROPS")) {
    	eventRandom = RNG.nextInt(2);
    	if (johnHealth <= 0) {
    		eventRandom = 0;
    	}
    	if (loganHealth <= 0) {
    		eventRandom = 1;
    	}
    	if (eventRandom == 1) {
    		eventRandom = RNG.nextInt(75) + 20;
    		textInterface.println("BLAKE LIKED YOUR ANSWER HE WAS MORE ANNOYED BY JOHN'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
   	          johnHealth = johnHealth - eventRandom;
   	       textInterface.selected = "not important";
   	          textInterface.println("JOHN TOOK " + Integer.toString(eventRandom) + " DAMAGE");
   	          textInterface.query(new String [] {"DANG"});
    	} else {
    		textInterface.println("BLAKE LIKED YOUR ANSWER HE WAS MORE ANNOYED BY LOGAN'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
    		eventRandom = RNG.nextInt(75) + 20;
 	          loganHealth = loganHealth - eventRandom;
 	       textInterface.selected = "not important";
 	          textInterface.println("LOGAN TOOK " + Integer.toString(eventRandom) + " DAMAGE");
 	          textInterface.query(new String [] {"DANG"});
    	}
      }
    if (textInterface.selected.equals("THIS GAME")){
    	textInterface.println("OUCH YOU HUT MY FEELINGS SO UH YOU LOSE I GUESS");
    	playerHealth = 0;
    	textInterface.println("THAT WILL TEACH YOU TO HAVE OPINIONS ABOUT ME THAT ARE SOMETIMES LESS THAN POSITIVE");
    }
      if (textInterface.selected.equals("TOASTER WAFFLES") || textInterface.selected.equals("MICROWAVE POPCORN") || textInterface.selected.equals("PLAYING TIC TAC TOE") || textInterface.selected.equals("LOOKING AT PEOPLE") || textInterface.selected.equals("SECRATE") ||textInterface.selected.equals("DOMINOS") || textInterface.selected.equals("LITTLE CEASERS") || textInterface.selected.equals("PUBLIC DEFECATION") || textInterface.selected.equals("CAST")) {
        if (distraction) {
        textInterface.println("YOU WERE WRONG BUT BLAKE WAS TOO DISTRACTED TO HEAR YOU");
        distraction = false;
        textInterface.selected = "not important";
        textInterface.query(new String [] {"DANG"});
        } else {
    	textInterface.println("BLAKE WAS NOT A FAN OF YOUR ANSWER HE ATTACKS");
        textInterface.println(" ");
        if (blakeAnger) {
        textInterface.println("BLAKE WAS ANGRY HE HIT MUCH HARDER");
        blakeAnger = false;
        eventRandom = RNG.nextInt(200) + 150;
        } else {
        	eventRandom = RNG.nextInt(75) + 20;	
        }
        textInterface.selected = "not important";
	          playerHealth = playerHealth - eventRandom;
	          textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          textInterface.query(new String [] {"DANG"});
      }
      }
      if (textInterface.selected.equals("DANG")) {
    	  if (loganHealth > 0) {
    	  eventRandom = (RNG.nextInt(4) + 1);
          String question = "THIS MESSAGE SHOULD NOT APPEAR PLEASE REPORT THIS BUG TO JEFFREY MARSH AT JEFFREY MARSH INDUSTRYS (CHOSE BLUE)";
          String [] answers;
          answers = new String [3];
          if (eventRandom == 1) {
            question = "WITCH OF THESE ARE ACCEPTABLE";
            answers [1] = "GOAT CHESE";
            answers [2] = "DABBING";
            answers [0] = "KILLING BABYS";
          }
          if (eventRandom == 2) {
            question = "WHAT SHOULD YOU DO ON FRIDAYS";
            answers [0] = "BUY TICKETS FOR MOVIE IN ADVANCE";
            answers [1] = "MOVIE NIGHT";
            answers [2] = "EXPENSIVE MOVIE";
             }
          if (eventRandom == 3) {
            question = "WHITCH OF THESE STORYS ARE TRUE";
            answers [0] = "PLACEHOLDER THIRD STORY";
            answers [1] = "FIGHT BROKEN OUT OVER BOWL OF FRUIT PUNCH";
            answers [2] = "ARMLESS MAN CHARGED OF STABBING";
          }
          if (eventRandom == 4) {
            question = "WHICH PIZZA IS FOR THE HARDWORKING MAN";
            answers [0] = "CASEYS";
            answers [1] = "PAPA JOHNS";
            answers [2] = "PAPA MURPHYS";
          }
          if (eventRandom == 5) {
            question = "WHAT CAN YOU NOT DO IN CERTAIN SITUATIONS";
            answers [0] = "TAKE TEST";
            answers [1] = "BE DISCREATE";
            answers [2] = "EAT COOKIE DROPS";
          }
          textInterface.println("LOGAN ASKS YOU " + question);
          textInterface.query(answers);
          textInterface.selected = "not important";
	} else {
	textInterface.println("LOGAN HAS ALREADY BEEN DEFEATED");
	textInterface.query(new String [] {"AHH FRICK"});
	}
      }
if (textInterface.selected.equals("GOAT CHESE") || textInterface.selected.equals("MOVIE NIGHT") || textInterface.selected.equals("ARMLESS MAN CHARGED OF STABBING") || textInterface.selected.equals("CASEYS") || textInterface.selected.equals("EAT COOKIE DROPS")) {
	eventRandom = RNG.nextInt(2);
	if (johnHealth <= 0) {
		eventRandom = 1;
	}
	if (blakeHealth <= 0) {
		eventRandom = 0;
	}
	if (eventRandom == 1) {
		textInterface.println("LOGAN LIKED YOUR ANSWER HE WAS MORE ANNOYED BY JOHN'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
		eventRandom = RNG.nextInt(75) + 20;
	          johnHealth = johnHealth - eventRandom;
	       textInterface.selected = "not important";
	          textInterface.println("JOHN TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          textInterface.query(new String [] {"AHH FRICK"});
	} else {
		textInterface.println("LOGAN LIKED YOUR ANSWER HE WAS MORE ANNOYED BY BLAKE'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
		eventRandom = RNG.nextInt(75) + 20;
         blakeHealth = blakeHealth - eventRandom;
      textInterface.selected = "not important";
         textInterface.println("BLAKE TOOK " + Integer.toString(eventRandom) + " DAMAGE");
         textInterface.query(new String [] {"AHH FRICK"});
	}
}
if (textInterface.selected.equals("PLACEHOLDER THIRD STORY")) {
	textInterface.println("UMM EXCUSE ME ... WHAT NO NO NO NOT EVEN CLOSE WHAT ... THATS TOO WRONG FOR ME TO EVEN PUNISH");
	textInterface.query(new String [] {"AHH FRICK"});
}
if (textInterface.selected.equals("DABBING") || textInterface.selected.equals("KILLING BABYS") || textInterface.selected.equals("BUY TICKETS FOR MOVIE IN ADVANCE") || textInterface.selected.equals("EXPENSIVE MOVIE") || textInterface.selected.equals("FIGHT BROKEN OUT OVER BOWL OF FRUIT PUNCH") ||textInterface.selected.equals("PAPA JOHNS") || textInterface.selected.equals("PAPA MURPHYS") || textInterface.selected.equals("TAKE TEST") || textInterface.selected.equals("BE DISCREATE")) {
  if (distraction) {
  textInterface.println("YOU WERE WRONG BUT LOGAN WAS TOO DISTRACTED TO HEAR YOU");
  distraction = false;
  textInterface.selected = "not important";
  textInterface.query(new String [] {"AHH FRICK"});
  } else {
	textInterface.println("LOGAN WAS NOT A FAN OF YOUR ANSWER HE ATTACKS");
	 if (loganAnger) {
	        textInterface.println("LOGAN WAS ANGRY HE HIT MUCH HARDER");
	        loganAnger = false;
	        eventRandom = RNG.nextInt(200) + 150;
	        }
  textInterface.println(" ");
  textInterface.selected = "not important";
        playerHealth = playerHealth - eventRandom;
        textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        textInterface.query(new String [] {"AHH FRICK"});
}
      }
if (textInterface.selected.equals("AHH FRICK")) {
  	  if (johnHealth > 0) {
  	  eventRandom = (RNG.nextInt(4) + 1);
        String question = "THIS MESSAGE SHOULD NOT APPEAR PLEASE REPORT THIS BUG TO JEFFREY MARSH AT JEFFREY MARSH INDUSTRYS (CHOSE BLUE)";
        String [] answers;
        answers = new String [3];
        if (eventRandom == 1) {
          question = "WHICH PIZZA IS THE BEST";
          answers [1] = "VALANTINOS FOOD";
          answers [2] = "PIZZA HUT FOOD";
          answers [0] = "JEFFS";
        }
        if (eventRandom == 2) {
          question = "WHITCH PIZZA IS GARBAGE";
          answers [0] = "PIZZA HUT PIZZA";
          answers [1] = "JEFFS PIZZA";
          answers [2] = "VALANTINOS PIZZA";
           }
        if (eventRandom == 3) {
          question = "WHITCH PIZZA IS FINE";
          answers [0] = "JEFFS PIZZA SHOP";
          answers [1] = "LITTLE CEASERS";
          answers [2] = "PIZZA HUT PIZZAS";
        }
        if (eventRandom == 4) {
          question = "WHO IS A HARDWORKIN MAN";
          answers [0] = "BLAKE";
          answers [1] = "MOODY";
          answers [2] = "TRISTON";
        }
        if (eventRandom == 5) {
          question = "WHITCH OF THESE ARTICLES IS REAL";
          answers [0] = "PUBLIC DEFECATION ON THE RISE";
          answers [1] = "LOTTARY ODDS ARE BETTER THAN PREVIOSLY THOUGHT";
          answers [2] = "HATCHAMLES BANNED FROM SCHOOLS ACCROSS THE NATION";
        }
        textInterface.println("JOHN ASKS YOU " + question);
        textInterface.query(answers);
        textInterface.selected = "not important";
	} else {
	textInterface.println("JOHN HAS ALREADY BEEN DEFEATED");
	textInterface.selected = "unimportant";
	textInterface.query(new String [] {"OUCH"});
	}
}
if (textInterface.selected.equals("VALANTINOS") || textInterface.selected.equals("PIZZA HUT PIZZA") || textInterface.selected.equals("JEFFS PIZZA SHOP") || textInterface.selected.equals("TRISTON") || textInterface.selected.equals("PUBLIC DEFECATION ON THE RISE")) {
	eventRandom = RNG.nextInt(2);
	if (blakeHealth <= 0) {
		eventRandom = 1;
	}
	if (loganHealth <= 0) {
		eventRandom = 0;
	}
	if (eventRandom == 1) {
		textInterface.println("JOHN LIKED YOUR ANSWER HE WAS MORE ANNOYED BY LOGAN'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
		eventRandom = RNG.nextInt(75) + 20;
	          loganHealth = loganHealth - eventRandom;
	       textInterface.selected = "not important";
	          textInterface.println("LOGAN TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          textInterface.query(new String [] {"OUCH"});
	} else {
		textInterface.println("JOHN LIKED YOUR ANSWER HE WAS MORE ANNOYED BY BLAKE'S ANSWER SO HE DECIDED TO ATTACK HIM INSTEAD");
		eventRandom = RNG.nextInt(75) + 20;
       blakeHealth = blakeHealth - eventRandom;
    textInterface.selected = "not important";
       textInterface.println("BLAKE TOOK " + Integer.toString(eventRandom) + " DAMAGE");
       textInterface.query(new String [] {"OUCH"});
	}
}
if (textInterface.selected.equals("PIZZA HUT") || textInterface.selected.equals("JEFFS") || textInterface.selected.equals("JEFFS PIZZA") || textInterface.selected.equals("VALANTINOS PIZZA") || textInterface.selected.equals("LITTLE CEASERS") ||textInterface.selected.equals("PIZZA HUT PIZZAS") || textInterface.selected.equals("BLAKE") || textInterface.selected.equals("MOODY") || textInterface.selected.equals("LOTTARY ODDS ARE BETTER THAN PREVIOSLY THOUGHT") || textInterface.selected.equals("HATCHAMLES BANNED FROM SCHOOLS ACCROSS THE NATION")) {
if (distraction) {
textInterface.println("YOU WERE WRONG BUT JOHN WAS TOO DISTRACTED TO HEAR YOU");
distraction = false;
textInterface.selected = "not important";
textInterface.query(new String [] {"OUCH"});
} else {
	textInterface.println("JOHN WAS NOT A FAN OF YOUR ANSWER HE ATTACKS");
	 if (johnAnger && !turtles) {
	        textInterface.println("JOHN WAS ANGRY HE HIT MUCH HARDER");
	        johnAnger = false;
	        eventRandom = RNG.nextInt(200) + 150;
	        }
	 if (turtles) {
		 textInterface.println("HE USES HIS ARMY OF TURTLES FOR A MUCH STRONGER ATTACK");
		 turtles = false;
		  eventRandom = RNG.nextInt(250) + 150;
	 }
textInterface.println(" ");
textInterface.selected = "not important";
      playerHealth = playerHealth - eventRandom;
      textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
      textInterface.query(new String [] {"OUCH"});
}
    }
if (textInterface.selected.equals("OUCH")) {
	if (allergys) {
		eventRandom = RNG.nextInt(100) + 75;
		textInterface.println("YOUR ALLERGYS EFFECT YOU GIVEING YOU " + Integer.toString(eventRandom) + " DAMAGE");
		allergys = false;
		playerHealth = playerHealth - eventRandom;
	}
	   if (eventRandom == 1) {
	          textInterface.println("THE RANCHERS THROW A CHAIR");
	        }
	        if (eventRandom == 2) {
	          textInterface.println("THE RANCHERS READ SOME ARTICLALS");
	        }
	        if (eventRandom == 3) {
	          textInterface.println("THE RANCHERS START A CONVERSATION");
	        }
	        if (eventRandom == 4) {
	          textInterface.println("THE RANCHERS ARE A BIT BUSY");
	        }
	        if (eventRandom == 5) {
	          textInterface.println("THE RANCHERS ARE LAGHING HISTARICLY");
	        }
	        if (eventRandom == 6) {
	          textInterface.println("THE RANCHERS ARE PLAYING OOF SOUND EFFECTS");
	        }
	        if (eventRandom == 7) {
	          textInterface.println("THE RANCHERS ARE PRETTY COOL DUDES");
	        }
	        textInterface.println("HEALTH " + Health);
    		textInterface.println("BLAKE HEALTH " + Integer.toString(blakeHealth));
    		textInterface.println("LOGAN HEALTH " + Integer.toString(loganHealth));
    		textInterface.println("JOHN HEALTH " + Integer.toString(johnHealth));
    		textInterface.println("WHAT DO YOU DO");
	        textInterface.println(" ");
	        textInterface.println("WHAT DO YOU DO");
    		textInterface.query(new String [] {"TALK", "ITEMS", "SOMETHING ELSE"});
	        textInterface.selected = "notimportant";
	      }
  }    
    if (textInterface.selected.equals("VOLUME CONTROL")) {
      textInterface.selected = "unimportant";
      textInterface.query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
    }
    if (textInterface.selected.equals("RAISE VOLUME")) {
      textInterface.selected = "unimportant";
      textInterface.println(" ");
      GameCode.clip2.stop();
      GameCode.stuff.playSoundEffect(6.0F, "soundEffects/ding.wav");
      textInterface.println("VOLUME RAISED");
      clip.stop();
      volume += 1.0F;
      if (volume == 6.0F) {
        stuff.play("tital", volume);
        textInterface.println(" ");
        textInterface.println("VOLUME MAXXED");
        textInterface.query(new String[] { "LOWER VOLUME", "DONT CHANGE VOLUME" });
      } else {
        stuff.play("tital", volume);
        textInterface.query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
      }
    }
    if (textInterface.selected.equals("LOWER VOLUME")) {
      textInterface.println(" ");
      GameCode.clip2.stop();
      GameCode.stuff.playSoundEffect(6.0F, "soundEffects/ding.wav");
      textInterface.selected = "unimportant";
      textInterface.println("VOLUME LOWERED");
      volume -= 2.0F;
      clip.stop();
      stuff.play("tital", volume);
      textInterface.query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
    }
    if (textInterface.selected.equals("DONT CHANGE VOLUME")) {
      textInterface.selected = "unimportant";
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    
    if (textInterface.selected.equals("CUSTOM EVENTS")) {
      textInterface.selected = "unimportant";
      textInterface.println(" ");
      textInterface.query(new String[] { "NEW CUSTOM EVENTS", "ENABLE/DISABLE CUSTOM EVENTS", "ABOUT CUSTOM EVENTS" });
    }
    if (textInterface.selected.equals("ABOUT CUSTOM EVENTS")) {
      textInterface.selected = "unimportant";
      textInterface.println("CUSTOM EVENTS ARE COOL BECASUE THEY LET YOU HAVE INPUT INTO WHAT HAPPENS IN THE GAME IF YOU MAKE A CUSTOM EVENT IT HAS A POSSIBILTY OF");
      textInterface.println("APPEARING IN THE GAME IM A LAZY DEVELOPER SO WHEN YOUR TYPEING IN YOUR INPUT THERE IS NO BACKSPACE HOWEVER IF YOU REALLY DO NEED TO EDIT");
      textInterface.println("ONE OF YOUR RESPONCES YOU CAN GO INTO THE GAME FILES AND FIND THAT EVENT AND CHANGE IT MANUALY ALSO USING THAT METHOD YOU CAN SHARE YOUR");
      textInterface.println("CUSTOM EVENTS WITH YOUR FREINDS (BY COPYING YOUR CUSTOM EVENTS TO YOUR FREINDS FOLDER BEING CARFUL TO PRESURVE THE SEQUENCIAL ORDER OF THE EVENTS");
      textInterface.println("YOU CAN ALSO TURN ON CUSTOM EVENT ONLY MODE TO MAKE YOUR OWN SORT OF TEXT ADVENTURE GAME IF YOU WANT TO DELETE A CUSTOM EVENT DON'T DELETE THE FILE");
      textInterface.println("IF YOU DO THAT ALL CUSTOM EVENTS WITH A HIGHER NUMBER THAN THAT ONE WONT WORK INSTEAD GO INTO THE FILE OF THE EVENT YOU WANT TO DELETE AND DELETE ALL");
      textInterface.println("THE TEXT THAT IS THERE AND WRIGHT A 0 ON THE SECOND LINE ALRIGHT HAVE FUN WITH CUSTOM EVENTS!!!!!!");
      textInterface.selected = "unimportant";
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("ENABLE/DISABLE CUSTOM EVENTS")) {
      textInterface.selected = "unimportant";
      textInterface.println(" ");
      textInterface.query(new String[] { "TURN CUSTOM EVENTS ON/OFF", "TURN ON/OFF CUSTOM EVENT ONLY MODE" });
    }
    if (textInterface.selected.equals("TURN CUSTOM EVENTS ON/OFF")) {
      if (customEventsEnabled) {
        textInterface.selected = "uniportant";
        customEventsEnabled = false;
        textInterface.println(" ");
        textInterface.println("CUSTOM EVENTS WERE TURNED OFF");
        textInterface.println(" ");
        textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      } else {
        textInterface.selected = "unimportant";
        customEventsEnabled = true;
        textInterface.println(" ");
        textInterface.println("CUSTOM EVENTS WERE TURNED ON");
        textInterface.println(" ");
        textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
    }
    if (textInterface.selected.equals("TURN ON/OFF CUSTOM EVENT ONLY MODE")) {
      if (regularEvents) {
        textInterface.selected = "unimportant";
        regularEvents = false;
        textInterface.println(" ");
        textInterface.println("YOU NOW WILL ONLY RUN INTO CUSTOM EVENTS (YOU WILL STILL HAVE TO STOP AT GAS STATIONS AND HOTELS)");
        textInterface.println(" ");
        textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      } else {
        textInterface.selected = "unimportant";
        regularEvents = true;
        textInterface.println(" ");
        textInterface.println("REGULAR EVENTS WERE TURRNED BACK ON");
        textInterface.println(" ");
        textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
      }
    }
    if (textInterface.selected.equals("NEW CUSTOM EVENTS")) {
      boolean dontType = false;
      if (justStarted) {
        while (noError) {
          fileNumber += 1;
          try {
            FileReader fr = new FileReader("./custom Events/Custom Event " + Integer.toString(fileNumber) + ".txt");
            fr.close();
          } catch (IOException e) {
            noError = false;
          }
        }
        try {
          mm = new FileWriter("./custom Events/Custom Event " + Integer.toString(fileNumber) + ".txt");
          em = new PrintWriter(mm);
        }
        catch (IOException localIOException2) {}
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println("PLEASE TYPE IN THE MESSAGE YOU WANT THE GAME TO DISPLAY (PRESS SHIFT TO START OVER)");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        em.println(code2 + code);
        code = "";
        code2 = "";
        justStarted = true;
        textInterface.selected = "next thing";
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code2 += code;
        code = "";
      }
      
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code2 += code;
        code = "";
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        String typedCharictar = Character.toString(a);
        while (keysPressed()[charictarNumber] != 0) {
          i = keysPressed()[charictarNumber];
          a = (char)i;
          typedCharictar = typedCharictar + a;
          charictarNumber++;
        }
        if (dontType) {
          skipedEnter = true;
        }
        if (!dontType) {
          code += typedCharictar;
        }
      }
    }
    if (textInterface.selected.equals("next thing")) {
      boolean dontType = false;
      if (justStarted) {
        textInterface.println(" ");
        textInterface.println("HOW OFFEN DOES THIS EVENT OCCUR (THE NUMBER YOU TYPE IS THE CHANCE OUT OF 10000 THAT YOU WILL GET THIS EVENT EVERY MILE)");
        textInterface.println("(TO GIVE YOU SOME REFRENCE THE HIGHEST PROBABILITY EVENT IN THE GAME IS A TOLL BOOTH AT 30 AND THE LOWEST IS POTHOLE AT 2)");
        textInterface.println(" ");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        textInterface.println(" ");
        em.println(code2 + code);
        code = "";
        code2 = "";
        skipedEnter = false;
        justStarted = true;
        textInterface.println(" ");
        textInterface.selected = "choices";
      }
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code = "";
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code2 += code;
        code = "";
      }
      
      if (i == 10) {
        dontType = true;
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
          String typedCharictar = Character.toString(a);
          while (keysPressed()[charictarNumber] != 0) {
            i = keysPressed()[charictarNumber];
            a = (char)i;
            typedCharictar = typedCharictar + a;
            charictarNumber++;
          }
          if (dontType) {
            skipedEnter = true;
          }
          if (!dontType) {
            code += typedCharictar;
          }
        }
      }
    }
    if (textInterface.selected.equals("choices")) {
      textInterface.selected = "unimportant";
      textInterface.println("HOW MANY CHOICES ARE IN THIS EVENT");
      textInterface.query(new String[] { "1 CHOICE", "2 CHOICES", "3 CHOICES", "4 CHOICES", "5 CHOICES" });
    }
    if (textInterface.selected.equals("1 CHOICE")) {
      em.println("1");
      numberOfChoices = 1;
      textInterface.selected = "what a neat thing";
    }
    if (textInterface.selected.equals("2 CHOICES")) {
      em.println("2");
      numberOfChoices = 2;
      textInterface.selected = "what a neat thing";
    }
    if (textInterface.selected.equals("3 CHOICES")) {
      em.println("3");
      numberOfChoices = 3;
      textInterface.selected = "what a neat thing";
    }
    if (textInterface.selected.equals("4 CHOICES")) {
      em.println("4");
      numberOfChoices = 4;
      textInterface.selected = "what a neat thing";
    }
    if (textInterface.selected.equals("5 CHOICES")) {
      em.println("5");
      numberOfChoices = 5;
      textInterface.selected = "what a neat thing";
    }
    if (textInterface.selected.equals("what a neat thing")) {
      boolean dontType = false;
      if (justStarted) {
        em.println("option");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println("PLEASE TYPE IN THE TEXT OF THE OPTION YOU ARE CONFIGURING");
        textInterface.println(" ");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        em.println(code2 + code);
        code = "";
        code2 = "";
        justStarted = true;
        textInterface.selected = "possible brances";
      }
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code2 += code;
        code = "";
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code = "";
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        String typedCharictar = Character.toString(a);
        while (keysPressed()[charictarNumber] != 0) {
          i = keysPressed()[charictarNumber];
          a = (char)i;
          typedCharictar = typedCharictar + a;
          charictarNumber++;
        }
        if (dontType) {
          skipedEnter = true;
        }
        if (!dontType) {
          code += typedCharictar;
        }
      }
    }
    
    if (textInterface.selected.equals("possible brances")) {
      textInterface.selected = "unimportant";
      textInterface.println("HOW MANY BRANCHES ARE THERE FOR THIS CHOICE");
      textInterface.query(new String[] { "1 BRANCH", "2 BRANCHES", "3 BRANCHES", "4 BRANCHES", "5 BRANCHES" });
    }
    if (textInterface.selected.equals("1 BRANCH")) {
      em.println("1");
      numberOfBranches = 1;
      textInterface.selected = "ehehe sweet";
    }
    if (textInterface.selected.equals("2 BRANCHES")) {
      em.println("2");
      numberOfBranches = 2;
      textInterface.selected = "ehehe sweet";
    }
    if (textInterface.selected.equals("3 BRANCHES")) {
      em.println("3");
      numberOfBranches = 3;
      textInterface.selected = "ehehe sweet";
    }
    if (textInterface.selected.equals("4 BRANCHES")) {
      em.println("4");
      numberOfBranches = 4;
      textInterface.selected = "ehehe sweet";
    }
    if (textInterface.selected.equals("5 BRANCHES")) {
      em.println("5");
      numberOfBranches = 5;
      textInterface.selected = "ehehe sweet";
    }
    if (textInterface.selected.equals("ehehe sweet")) {
      boolean dontType = false;
      if (justStarted) {
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println("PLEASE TYPE IN THE TEXT THAT DISPLAYS WHEN THIS BRANCH POPS UP");
        textInterface.println(" ");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        em.println("branch");
        em.println(code2 + code);
        code = "";
        code2 = "";
        justStarted = true;
        if (numberOfBranches > 1) {
          textInterface.selected = "probability";
        } else {
          em.println(Integer.toString(amountOfRemainingPercentage));
          textInterface.selected = "consequence";
          amountOfRemainingPercentage = 100;
        }
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code = "";
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code2 += code;
        code = "";
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        String typedCharictar = Character.toString(a);
        while (keysPressed()[charictarNumber] != 0) {
          i = keysPressed()[charictarNumber];
          a = (char)i;
          typedCharictar = typedCharictar + a;
          charictarNumber++;
        }
        if (dontType) {
          skipedEnter = true;
        }
        if (!dontType) {
          code += typedCharictar;
        }
      }
    }
    
    if (textInterface.selected.equals("probability")) {
      boolean dontType = false;
      if (justStarted) {
        textInterface.println(" ");
        textInterface.println("HOW OFTEN (IN A PERCENTAGE) IS THIS BRANCH THE ONE THAT POPS UP");
        textInterface.println(" ");
        textInterface.println(" ");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        textInterface.println(" ");
        if (Integer.parseInt(code) > amountOfRemainingPercentage) {
          textInterface.println("THE ADDITION OF THE PERCENT CHANCES IS GREATER THAN 100 PLEASE TRY AGAIN");
          justStarted = true;
          skipedEnter = false;
          code = "";
        } else {
          em.println(code);
          amountOfRemainingPercentage -= Integer.parseInt(code);
          code = "";
          skipedEnter = false;
          justStarted = true;
          textInterface.selected = "consequence";
        }
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code = "";
      }
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code = "";
      }
      if (i == 10) {
        dontType = true;
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
          String typedCharictar = Character.toString(a);
          while (keysPressed()[charictarNumber] != 0) {
            i = keysPressed()[charictarNumber];
            a = (char)i;
            typedCharictar = typedCharictar + a;
            charictarNumber++;
          }
          if (dontType) {
            skipedEnter = true;
          }
          if (!dontType) {
            textInterface.print(typedCharictar);
            code += typedCharictar;
          }
        }
      }
    }
    if (textInterface.selected.equals("consequence")) {
      textInterface.selected = "unimportant";
      textInterface.println("WHICH RESOURCE DOES THIS OUTCOME EFFECT (YOU CAN MAKE IT EFFECT MORE RESORCES AFTERWARD)");
      textInterface.query(new String[] { "PLAYER CASH", "PLAYER GRAIN AMOUNT", "PLAYER GAS AMOUNT", "OTHER EFFECTS" });
    }
    if (textInterface.selected.equals("PLAYER CASH")) {
      em.println("cash");
      textInterface.selected = "positive or negitive";
    }
    if (textInterface.selected.equals("PLAYER GRAIN AMOUNT")) {
      em.println("grain");
      textInterface.println("NOTE NO NON-CUTOM EVENTS GIVE POSITIVE AMOUNTS OF GRAIN");
      textInterface.selected = "positive or negitive";
    }
    if (textInterface.selected.equals("PLAYER GAS AMOUNT")) {
      em.println("gas");
      textInterface.selected = "positive or negitive";
    }
    if (textInterface.selected.equals("OTHER EFFECTS")) {
      textInterface.println("WHAT EFFECT");
      textInterface.selected = "unimportant";
      textInterface.query(new String[] { "GOOD KARMA", "BAD KARMA", "DEATH", "MARSH-AN TECH", "AMULET COIN", "ENERGIZED", "NO SLEEP", "CRIMINAL", "COMUNIST", "POISONED", "CURE POISON", "CLEAR CRIMINAL RECORD", "GO BACK TO THE OTHER OPTIONS" });
    }
    if (textInterface.selected.equals("GOOD KARMA")) {
      em.println("good karma");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("BAD KARMA")) {
      em.println("bad karma");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("DEATH")) {
      em.println("death");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("MARSH-AN TECH")) {
      em.println("marsh-an tech");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("AMULET COIN")) {
      em.println("amulet coin");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("ENERGIZED")) {
      em.println("energized");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("NO SLEEP")) {
      em.println("NO SLEEP");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("CRIMINAL")) {
      em.println("criminal");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("COMUNIST")) {
      em.println("comunist");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("POISONED")) {
      em.println("poisoned");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("CURE POISON")) {
      em.println("cure poison");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("CLEAR CRIMINAL RECORD")) {
      em.println("clear record");
      textInterface.selected = "more consequences!";
    }
    if (textInterface.selected.equals("GO BACK TO THE OTHER OPTIONS")) {
      textInterface.selected = "consequence";
    }
    if (textInterface.selected.equals("positive or negitive")) {
      textInterface.selected = "unimportant";
      textInterface.println("DOES IT MAKE A POSITIVE OR NEGITIVE EFFECT");
      textInterface.query(new String[] { "POSITIVE EFFECT", "NEGITIVE EFFECT" });
    }
    if (textInterface.selected.equals("POSITIVE EFFECT")) {
      em.println("positive");
      textInterface.selected = "choose amount";
    }
    if (textInterface.selected.equals("NEGITIVE EFFECT")) {
      em.println("negitive");
      textInterface.selected = "choose amount";
    }
    if (textInterface.selected.equals("choose amount")) {
      boolean dontType = false;
      if (justStarted) {
        textInterface.println(" ");
        textInterface.println("PLEASE ENTER THE AMOUNT OF RESOURCE");
        textInterface.println(" ");
        textInterface.println(" ");
        justStarted = false;
        textInterface.println(" ");
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        textInterface.println(" ");
        em.println(code2 + code);
        code = "";
        code2 = "";
        skipedEnter = false;
        justStarted = true;
        textInterface.selected = "more consequences!";
      }
      if ((i == 10) || (keyPressed(16)) || (keyPressed(8))) {
        dontType = true;
      }
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if (code.length() > 79) {
        code2 += code;
        code = "";
      }
      if (keyPressed(16)) {
        textInterface.println("");
        code = "";
      }
      if (i == 10) {
        dontType = true;
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
          String typedCharictar = Character.toString(a);
          while (keysPressed()[charictarNumber] != 0) {
            i = keysPressed()[charictarNumber];
            a = (char)i;
            typedCharictar = typedCharictar + a;
            charictarNumber++;
          }
          if (dontType) {
            skipedEnter = true;
          }
          if (!dontType) {
            code += typedCharictar;
          }
        }
      }
    }
    if (textInterface.selected.equals("more consequences!")) {
      textInterface.println("ARE THERE ANY MORE CONSEQUENCES FOR THIS BRANCH");
      textInterface.selected = "unimportant";
      textInterface.query(new String[] { "MORE CONSEQUENCES", "NO MORE CONSEQUENCES" });
    }
    if (textInterface.selected.equals("MORE CONSEQUENCES")) {
      textInterface.selected = "consequence";
      em.println("AND");
    }
    if (textInterface.selected.equals("NO MORE CONSEQUENCES")) {
      numberOfBranches -= 1;
      if (numberOfBranches == 0) {
        numberOfChoices -= 1;
        if (numberOfChoices == 0) {
          textInterface.println("CONGRADULATIONS YOU EVENT IS FULLY CONFIGURED IT SHOULD BE WORKING CORRECTLY NOW");
          textInterface.selected = "unimportant";
          em.close();
          textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
        } else {
          textInterface.println("THIS CHOICE IS NOW FULLY CONFIGURED WE WILL NOW MOVE ONTO YOUR NEXT CHOICE");
          textInterface.selected = "what a neat thing";
        }
      } else {
        textInterface.println("THIS BRANCH IS NOW FULLY CONFIGURED WE WILL NOW MOVE ONTO THE NEXT BRANCH");
        textInterface.selected = "ehehe sweet";
      }
    }
    if (textInterface.selected.equals("FONT")) {
      textInterface.selected = "unimportant";
      textInterface.println("CHOSE A FONT");
      textInterface.println(" ");
      try {
        FileReader fr = new FileReader("./SavesDir/Chicken.txt");
        BufferedReader br = new BufferedReader(fr);
        if (br.readLine().equals("true")) {
          chickenEgg = true;
        }
        br.close();
      }
      catch (IOException localIOException3) {}
      try {
        FileReader fr = new FileReader("./SavesDir/math.txt");
        BufferedReader br = new BufferedReader(fr);
        if (br.readLine().equals("true")) {
          mathEgg = true;
        }
        br.close();
      }
      catch (IOException localIOException4) {}
      try {
        FileReader fr = new FileReader("./SavesDir/Newspaper.txt");
        BufferedReader br = new BufferedReader(fr);
        if (br.readLine().equals("true")) {
          newspaperEgg = true;
        }
        br.close();
      }
      catch (IOException localIOException5) {}
      try {
        FileReader fr = new FileReader("./SavesDir/rainbow.txt");
        BufferedReader br = new BufferedReader(fr);
        if (br.readLine().equals("true")) {
          rainbowEgg = true;
        }
        br.close();
      }
      catch (IOException localIOException6) {}
      if ((!chickenEgg) && (!newspaperEgg) && (!rainbowEgg) && (!mathEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW" });
      }
      if ((chickenEgg) && (!newspaperEgg) && (!rainbowEgg) && (!mathEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH" });
      }
      if ((mathEgg) && (!newspaperEgg) && (!rainbowEgg) && (!chickenEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "GREEN" });
      }
      if ((!chickenEgg) && (!rainbowEgg) && (!mathEgg) && (newspaperEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS" });
      }
      if ((!chickenEgg) && (!newspaperEgg) && (!mathEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "RAINBOW" });
      }
      if ((chickenEgg) && (newspaperEgg) && (!rainbowEgg) && (!mathEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS", "CHICKEN SCRATCH" });
      }
      if ((chickenEgg) && (!newspaperEgg) && (!mathEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH", "RAINBOW" });
      }
      if ((!chickenEgg) && (!mathEgg) && (newspaperEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS", "RAINBOW" });
      }
      if ((chickenEgg) && (newspaperEgg) && (rainbowEgg) && (!mathEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH", "WINGDINGS", "RAINBOW" });
      }
      if ((chickenEgg) && (mathEgg) && (!newspaperEgg) && (!rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH", "GREEN" });
      }
      if ((!chickenEgg) && (!rainbowEgg) && (mathEgg) && (newspaperEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS", "GREEN" });
      }
      if ((!chickenEgg) && (!newspaperEgg) && (mathEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "RAINBOW", "GREEN" });
      }
      if ((chickenEgg) && (newspaperEgg) && (mathEgg) && (!rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS", "CHICKEN SCRATCH", "GREEN" });
      }
      if ((chickenEgg) && (!newspaperEgg) && (mathEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH", "RAINBOW", "GREEN" });
      }
      if ((!chickenEgg) && (mathEgg) && (newspaperEgg) && (rainbowEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "WINGDINGS", "RAINBOW", "GREEN" });
      }
      if ((chickenEgg) && (newspaperEgg) && (rainbowEgg) && (mathEgg)) {
        textInterface.println(" ");
        textInterface.query(new String[] { "WHITE", "RED", "BLUE", "YELLOW", "CHICKEN SCRATCH", "WINGDINGS", "RAINBOW", "GREEN" });
      }
    }
    if (textInterface.selected.equals("WHITE")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.font;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("RED")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.redFont;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("BLUE")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.blueFont;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("YELLOW")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.yellowfont;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("WINGDINGS")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.wingdings;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("CHICKEN SCRATCH")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.chickenScratch;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("RAINBOW")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.rainbowfont;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("GREEN")) {
      textInterface.selected = "unimportant";
      textInterface.font = sprites.greenFont;
      textInterface.println(" ");
      textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
    }
    if (textInterface.selected.equals("CODES")) {
      boolean dontType = false;
      if (justStarted) {
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println("THANK YOU FOR ENTERING THE CODES MENU PLEASE PUT IN YOUR CODE PRESS ENTER TO CONFIRM USE CODE \"BACK\" TO LEAVE");
        textInterface.println(" ");
        justStarted = false;
      }
      int charictarNumber = 1;
      int i = keysPressed()[0];
      if ((i == 10) && (skipedEnter) && (code != "")) {
        textInterface.println(" ");
        if (code.equals("ENDLESS")) {
        	textInterface.println("YOUR NEXT GAME WILL NEVER END");
        	endlessMode = true;
        	code = "";
        }
        if ((code.equals("NINJA HAS LIGMA") || code.equals("LIGMA"))) {
        	textInterface.println("WHATS LIGMA, I SAID WITH AN ETHUSED FACE ... I WAS SO NAIVE THEN WHERE HAS THE INNOCENCE OF YOUTH GONE?");
        	textInterface.println(" ");
        	textInterface.println(" ");
        	 code = "";
        	
        }
        if ((code.equals("UR MOM GAY")) || (code.equals("YOUR MOM GAY")) || (code.equals("YOUR MOM GAE")) || (code.equals("UR MOM GAE"))) {
          textInterface.println("NO U (YOU HAVE UNLOCKED THE RAINBOW FONT)");
          rainbowEgg = true;
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
        if (code.equals ("SUBSCRIBE TO PEWDIEPIE") || code.equals("PEWDIEPIE")) {
        	 try {
                 FileReader fr = new FileReader("./SavesDir/PewDiePie.txt");
                 fr.close();
                 textInterface.println("YOU MADE ANOTHER ACCOUNT AND SUBSCRIBED TO PEWDIEPIE YOU NOW ARE THE BEST MAN (OR WOMAN) ON THE PLANET");
        	 } catch (IOException e) {
        	textInterface.println("YOU SUBSCRIBED TO PEWDIEPIE NOW YOU CAN FINALLY EXPERIENCE THE TRUE SOURCE FOR ORIGINAL CONTENT");
        	textInterface.println(".");
        	textInterface.println(".");
        	textInterface.println("YOU COULDEN'T FIND ANY ORIGINAL CONTENT BUT AT LEAST YOU ARE HELPING TO DESTROY INDIA");
        	 code = "";
        	 thingy.userStats.setAchievement("9_Year_Old");
        	 try {
        		 File fakeFile = new File ("./SavesDir");
                 File realFile = new File (fakeFile, "PewDiePie.txt");
                 FileWriter fw = new FileWriter (realFile);
                 PrintWriter pw = new PrintWriter (fw);
                 pw.println("go watch some original content");
                 pw.close();
               }
               catch (IOException localIOException7) {
               }
        	 }
        	 textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
             textInterface.selected = "uniportant";
             skipedEnter = false;
             justStarted = true;
             }
        if (code.equals ("UNSUBSCRIBE FROM PEWDIEPIE") || code.equals("UNSUBSCRIBE TO PEWDIEPIE")) {
        	textInterface.println("YOU UNSUBSCRIBED FROM PEWDIEPIE");
        	textInterface.println("HOW COULD YOU DONT YOU KNOW YOUR HELPING THE ENEMY?");
        	 code = "";
        	 try {
        		 Files.delete(Paths.get("PewDiePie.txt",new String[0]));
               }
               catch (IOException localIOException7) {
            textInterface.println("YOU TRIED TO UNSUBSCRIBE FROM PEWDIEPIE BUT YOU WEREN'T SUBSCRIBED TO PEWDIEPIE HOW UNORIGINAL");
               }
        	 textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
             textInterface.selected = "uniportant";
             skipedEnter = false;
             justStarted = true;
             }
        if (code.equals("GG EZ") || code.equals("GGEZ")) {
        	textInterface.println("IM TWELVE I BOUGHT STOLE MY MOMS CREDIT CARD FOR THIS BAD GAME ... THATS YOU THATS WAHT YOU SOUND LIKE");
        	 code = "";
             textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
             textInterface.selected = "uniportant";
             skipedEnter = false;
             justStarted = true;
        }
        if (code.equals("PAPER")) {
          newspaperEgg = true;
          textInterface.println("THANK YOU FOR ACTIVATING THE GET NEWSPAPER EGG CODE");
          code = "";
          textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
          textInterface.selected = "uniportant";
          skipedEnter = false;
          justStarted = true;
        }
        if (code.equals("CHICKEN")) {
          chickenEgg = true;
          textInterface.println("THANK YOU FOR ACTIVATING THE GET CHICKEN EGG CODE");
          code = "";
          textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
          textInterface.selected = "uniportant";
          skipedEnter = false;
          justStarted = true;
        }
        
        if (code.equals("NICE")) {
          superEgg = true;
          textInterface.println("THANK YOU FOR ACTIVATING THE UNLOCK FINAL BOSS CODE");
          code = "";
          textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
          textInterface.selected = "uniportant";
          skipedEnter = false;
          justStarted = true;
        }
        if (code.equals("HARD")) {
          code = "unimportant";
          textInterface.println("SO YOU WANT TO TRY IT IN HARD MODE DO YOU WELL ITS PRETTY HAD YOU HAVE TO GO 1.2X THE MILES AND NEGITVE EVENTS ARE MORE COMMAN SO GOOD LUCK");
          textInterface.query(new String[] { "START GAME" });
          milesLeft = 1200;
          hardModeEnabled = true;
          code = "";
          
        }
        if (code.equals("RANCH")) {
        	textInterface.selected = "unimportant";
        	code = "";
        	textInterface.println("VERY NICE TASTE I SEE YOU SHOULD CHECK THE OPTIONS MENU IT MAY BE IN YOUR BEST INTREST");
        	 try {
        		 File fakeFile = new File ("./SavesDir");
                 File realFile = new File (fakeFile, "Ranch.txt");
                 FileWriter fw = new FileWriter (realFile);
                 PrintWriter pw = new PrintWriter (fw);
                 pw.println("https://www.youtube.com/channel/UCOkJZ_cm3AwN08c5NLTIrLw");
                 pw.close();
               }
               catch (IOException localIOException7) {
               }
        	 secrateBoss = true;
        	textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
        }
        if (code.equals("BACK")) {
          textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
          textInterface.selected = "uniportant";
          skipedEnter = false;
          code = "";
          justStarted = true;
        } else {
          code = "";
        }
      }
      if ((i == 10) || (keyPressed(8))) {
        dontType = true;
      }
      textInterface.renderAtAPlace(0, 464, new String[] { code }, sprites.yellowfont);
      if ((keyPressed(8)) && (code.length() > 1)) {
        code = code.substring(0, code.length() - 1);
      }
      if (keyReleased(iBasis)) {
        iBasis = 0;
      }
      if ((iBasis != i) && (i != 0)) {
        iBasis = i;
        char a = (char)i;
        String typedCharictar = Character.toString(a);
        while (keysPressed()[charictarNumber] != 0) {
          i = keysPressed()[charictarNumber];
          a = (char)i;
          typedCharictar = typedCharictar + a;
          charictarNumber++;
        }
        if (dontType) {
          skipedEnter = true;
        }
        if (!dontType) {
          code += typedCharictar;
        }
      }
    }
    timer += 1;
    if (isDriving) {
      milesLeft -= 1;
      if (endlessMode) {
    	  milesDriven = milesDriven + 1;
      }
      hotel += 1;
      if (!canStop) {
    	  milesSienceLastStop = milesSienceLastStop + 1;
    	  if (milesSienceLastStop == RNG.nextInt(50) + 50 ) {
    		  canStop = true;
    		  milesSienceLastStop = 0;
    		  textInterface.println("YOU FEEL LIKE STOPPING MAY YEILD INTRESTING RESULTS ONCE AGAIN");    	  }
      }
      if (!carChase) {
        decicion = RNG.nextInt(9999) + 1;
        textInterface.println("YOU DROVE A MILE WITH NO PROBLEMS");
      } else {
        textInterface.println("YOU DROVE A MILE BUT THE COPS ARE HOT ON YOUR TAIL");
        carChaseMiles += 1;
        if (decicion != 4000000) {
          eventRandom = (RNG.nextInt(30) + 20);
          decicion = 4000000;
        }
        if (eventRandom == carChaseMiles) {
          carChase = false;
          escapedChase = true;
          decicion = 56;
        }
      }
      if (!martianTech) {
        gas -= 0.1D;
      } else {
        gas -= 0.05D;
      }
      if (hasPoison.booleanValue()) {
        poisonMiles += 1;
      }
      if (takeingDetour) {
        if (detourMiles == 0) {
          detourLength = RNG.nextInt(51) - 1;
        }
        gas -= 0.4D;
        detourMiles += 1;
        if (detourMiles == detourLength) {
          takeingDetour = false;
          }
      }
    }
    if (((milesLeft <= 0) || (gameBeat)) && !endlessMode) {
      if (milesLeft <= 0) {
        textInterface.selected = "unimportant";
        gameBeat = true;
        textInterface.println("CONGRADULATIONS YOU MADE IT TO NEW YORK");
        textInterface.println(" ");
        if (regularEvents) {
        thingy.userStats.getStatI("timesbeat", timesbeat);
        thingy.userStats.setStatI("timesbeat", timesbeat + 1);
        if (grain >= 100) {
          thingy.userStats.setAchievement("Max Profits_1_4");
        }
        }
        isDriving = false;
        if (!inTest) {
        clip.stop();
        stuff.play("tital", volume);
        }
        textInterface.query(new String[] { "COOL" });
        milesLeft = 1000;
      }
      if (textInterface.selected.equals("COOL")) {
        textInterface.selected = "unimportant";
        if (pothole) {
          textInterface.println("YOU PICK UP A NEWSPAPER AND READ THE HEADLINE IT SAYS HUNDEREDS DIE DO TO UNFIXED POTHOLE YOUR ASTONISHED NOT BECASUE YOU INENVERTANTLY CAUSED THE CRASH");
          textInterface.println("BUT BECAUSE THE NEWSPAPER STARTS MORPHING INTO A EGG YOU PICK UP THE EGG ITS A EASTER EGG CONGRADULATIONS YOU FOUND ONE OF THE TWO EASTER EGGS");
          textInterface.println("YOU UNLOCKED WINGDINGS AS A FONT OPTION");
          try {
        	  File fakeFile = new File ("./SavesDir");
              File realFile = new File (fakeFile, "Newspaper.txt");
              FileWriter fw = new FileWriter (realFile);
              PrintWriter pw = new PrintWriter (fw);
              pw.println("true");
              pw.close();
          } catch (IOException e) {
            textInterface.println("THE SAVE FAILED PROBABLY CAUSE YOU MESSED WITH THE FILES OR SOMETHING TYPE IN PAPER INTO THE CODES MENU TO GET THE EGG BACK");
          }
        }
        if (hasTimeShare) {
          textInterface.println("YOU FINISH SELLING YOUR GRAIN AND USE THE PROFITS TO TAKE A BOAT TO YOUR NEW TIMESHARE YOUR HAVEING A NICE TIME THERE UNTIL YOU ENCOUNTER A CHICKEN");
          textInterface.println("THE CHICKEN DOESEN'T BOTHER YOU HOWEVER ALL IT DOES IS LAY ONE EGG THEN LEAVES YOU APPROCH THE EGG AND PICK IT UP ITS AN EASTER EGG CONGRADULATIONS");
          textInterface.println("YOU FOUND 1 OF THE 2 EASTER EGGS YOU UNLOCKED CHICKEN SCRATCH AS A FONT OPTION");
          try {
        	  File fakeFile = new File ("./SavesDir");
              File realFile = new File (fakeFile, "Chicken.txt");
              FileWriter fw = new FileWriter (realFile);
              PrintWriter pw = new PrintWriter (fw);
              pw.println("true");
              pw.close();
          } catch (IOException e) {
            textInterface.println("THE SAVE FAILED PROBABLY CAUSE YOU MESSED WITH THE FILES OR SOMETHING TYPE CHICKEN INTO THE CODES MENU TO GET THE EGG BACK");
          }
        }
        if (hardModeEnabled) {
          if (!regularEvents) {
            textInterface.println("CONGRADULATIONS YOU BEAT SOME RANDOM ABOMINATION THAT YOU MADE MY GAME INTO IN HARD MODE IM HAPPY FOR YOU I REALLY AM BUT IF");
            textInterface.println("YOU WANT TO UNLOCK THE FINAL BOSS TRY BEATING THE GAME I MADE IN HARD MODE");
          } else {
            textInterface.println("CONGRADULATIONS YOU BEAT THE GAME IN HARD MODE YOU TRUELY ARE A SUPER PLAYER SOMEONE LIKE YOU WOULDEN'T NEED TO CHECK THE RULES BUT WHY DON'T YOU CHECK THEM");
            textInterface.println("A FEW TIMES JUST FOR OLD TIMES SAKE");
            try {
            	File fakeFile = new File ("./SavesDir");
                File realFile = new File (fakeFile, "Hardmode.txt");
                FileWriter fw = new FileWriter (realFile);
                PrintWriter pw = new PrintWriter (fw);
                pw.println("true");
                pw.close();
            } catch (IOException e) {
              textInterface.println("THE SAVE FAILED PROBABLY CAUSE YOU MESSED WITH THE FILES OR SOMETHING TYPE NICE INTO THE CODES MENU TO RE UNLOCK THE BOSS ");
            }
          }
        }
        if ((!pothole) && (!hasTimeShare)) {
          textInterface.println("AND THATS ABOUT IT");
        }
        textInterface.println(" ");
        textInterface.query(new String[] { "ROLL CREDITS" });
      }
      if (textInterface.selected.equals("ROLL CREDITS")) {
        creditsTimer += 1;
      }
      if (creditsTimer == 30) {
        textInterface.println("WRITEN BY JEFFREY MARSH");
      }
      if (creditsTimer == 60) {
    	 textInterface.println("ILLISTRATED BY DAVID HINDERAKER");
      }
      if (creditsTimer == 90) {
        textInterface.println("PROGRAMED BY JEFFREY MARSH");
      }
      if (creditsTimer == 120) {
        textInterface.println("CONCEPT ART BY JEFFREY MARSH");
      }
      if (creditsTimer == 150) {
        textInterface.println("IDEAS AND IDEA DEVELOPMENT BY JEFFREY MARSH, KENYON FERGEN, AND RYAN MEEHAN");
      }
      if (creditsTimer == 180) {
        textInterface.println("ENGINE WAS ADAPTED FROM CODE ORIGINALLY WRITEN BY NATHAN SCHMIDT");
      }
      if (creditsTimer == 210) {
        textInterface.println("DEBUG HELP");
      }
      if (creditsTimer == 240) {
        textInterface.println("AMERCAN HISTORY PERIOD 8");
      }
      if (creditsTimer == 270) {
        textInterface.println("JEFFREY MARSH");
      }
      if (creditsTimer == 300) {
        textInterface.println("GENIEBEN");
      }
      if (creditsTimer == 330) {
        textInterface.println("ALL MUSIC BY JEFFREY MARSH");
      }
      if (creditsTimer == 360) {
        textInterface.println("SPECIAL THANKS TO BEN BURNS AND HIS HOW TO USE FAMITRACKER SERIES FOR HELPING ME FIGURE OUT HOW TO MAKE THE MUSIC");
      }
      if (creditsTimer == 390) {
        textInterface.println("THANKS EVERYBODY THAT LIKED THE GAME");
      }
      if (creditsTimer == 420) {
        textInterface.println("THANK YOU FOR PLAYING");
      }
      if (creditsTimer == 450) {
        textInterface.println("AND MOST IMPORTANTLY");
      }
      if (creditsTimer == 480) {
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISEHOWER HIGHWAY SYSTEM");
      }
      if (creditsTimer == 510) {
        textInterface.println("THE END");
      }
      if (creditsTimer == 540) {
        textInterface.println("IF YOU THOUGHT THIS GAME WAS STUPID CHECK OUT MY YOUTUBE CHANNEL JEFFREYS NOT SO GOOD CHANNEL BECAUSE YOU CLEARLY DON'T KNOW THE MEANING OF STUPID");
        textInterface.println("JUST KIDDING YOU COULD NEVER FIND IT IF YOU TRIED");
      }
      if (creditsTimer == 570 && regularEvents) {
    	  if (!hardModeEnabled) {
        textInterface.println("AND HARD MODE IS NOW UNLOCKED IF YOU WANT TO TRY THAT TYPE IN HARD AT THE CODES MENU TO START A HARD MODE QUEST (IF YOU BEAT IT THERE MAY");
        textInterface.println("BE A EXTRA REWARD IN IT FOR YOU)");
    	  } else {
    	textInterface.println("ENDLESS MODE IS NOW UNLOCKED WHERE NEW YORK DOESEN'T EXIST AND YOU CAN DRIVE JUST TO DRIVE FOR A HIGH SCORE (TYPE ENDLESSH FOR ENDLESS HARD MODE");
    	textInterface.println("(AND ENDLESSN FOR ENDLESS NORMAL MODE)");
    	  }
      }
      if (creditsTimer == 600) {
        textInterface.query(new String[] { "THE END (FOR REAL)" });
      }
      if (textInterface.selected.equals("THE END (FOR REAL)")) {
        this.initialize();
      }
    }
    if ((carChase) && (!isDriving)) {
      failedEscape = true;
      carChase = false;
      decicion = 56;
    }
    

    if (textInterface.selected.equals("HIT THE ROAD!")) {
      isDriving = true;
      textInterface.selected = "unimportant";
    }
    if (gashotelMarkers) {
      if (gas >= 20.0D) {
        textInterface.renderAtAPlace(556, 56, new String[] { "GAS " + gasLeft }, sprites.blueFont);
      }
      if ((gas < 20.0D) && (gas > 10.0D)) {
        textInterface.renderAtAPlace(556, 56, new String[] { "GAS " + gasLeft }, sprites.yellowfont);
      }
      if (gas < 10.0D) {
        textInterface.renderAtAPlace(556, 56, new String[] { "GAS " + gasLeft }, sprites.redFont);
      }
      if (money >= 1000) {
        textInterface.renderAtAPlace(556, 64, new String[] { "MONEY " + moneyLeft }, sprites.blueFont);
      }
      if ((money < 1000) && (money > 200)) {
        textInterface.renderAtAPlace(556, 64, new String[] { "MONEY " + moneyLeft }, sprites.yellowfont);
      }
      if (money <= 200) {
        textInterface.renderAtAPlace(556, 64, new String[] { "MONEY " + moneyLeft }, sprites.redFont);
      }
      if (grain >= 80) {
        textInterface.renderAtAPlace(556, 72, new String[] { "GRAIN " + grainLeft }, sprites.blueFont);
      }
      if ((grain < 80) && (grain > 20)) {
        textInterface.renderAtAPlace(556, 72, new String[] { "GRAIN " + grainLeft }, sprites.yellowfont);
      }
      if (grain <= 20) {
        textInterface.renderAtAPlace(556, 72, new String[] { "GRAIN " + grainLeft }, sprites.redFont);
      }
      if (hotel < 0) {
        textInterface.renderAtAPlace(556, 80, new String[] { "ENERGIZED" }, sprites.blueFont);
      }
      if ((hotel < 80) && (hotel >= 0)) {
        textInterface.renderAtAPlace(556, 80, new String[] { "AWAKE" }, sprites.yellowfont);
      }
      if ((hotel >= 80) && (hotel <= 120)) {
        textInterface.renderAtAPlace(556, 80, new String[] { "LOW ENERGY" }, sprites.yellowfont);
      }
      if (hotel > 120) {
        textInterface.renderAtAPlace(556, 80, new String[] { "TIRED" }, sprites.redFont);
        noSleep = true;
      }
      if (!endlessMode) {
      textInterface.renderAtAPlace(520, 88, new String[] { "MILES LEFT " + milesToNewYork }, sprites.font);
      } else {
      textInterface.renderAtAPlace(502, 88, new String[] { "MILES DRIVEN " + milesDriven }, sprites.font);  
      }
    }
    
    if (textInterface.selected.equals("START GAME")) {                      
      textInterface.selected = "unimportant";
      textInterface.println("THE YEAR IS 1955 YOU ARE A FARMER LIVING IN IOWA YOU HEAR THAT GRAIN CAN SELL FOR A LOT OF MONEY IN NEW YORK SO YOU INTEND TO MAKE THE TRIP THERE TO SELL");
      textInterface.println("LUCKILY YOU HAVE THE POWER OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM SO IT SHOULD BE A PRETTY SMOOTH TRIP REGARDLESS YOU TAKE $1000 DOLLARS FOR SUPPLYS,");
      textInterface.println("TOLL BOOTHS, AND OTHER 'MISHAPS' YOU MAY RUN INTO ONCE YOUR REDAY YOU SET OFF WITH A FULL TANK OF GAS AND THE DETERMINATION TO MAKE IT TO NEW YORK");
      textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
      textInterface.query(new String[] { "HIT THE ROAD!" });
      if (!inTest) {
      clip.stop();
      stuff.play("god", volume);
      }
      gashotelMarkers = true;
      while (noError) {
        fileNumber += 1;
        try {
          FileReader fr = new FileReader("custom Events/Custom Event " + Integer.toString(fileNumber) + ".txt");
          fr.close();
        } catch (IOException e) {
          noError = false;
          fileNumber -= 1;
        }
      }
      int amountOfStuffLeftToGo = 0;
      while (amountOfStuffLeftToGo != fileNumber) {
    	  amountOfStuffLeftToGo++;
        try {
          maxDecision += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(amountOfStuffLeftToGo) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1));
        }
        catch (IOException localIOException8) {}
      }
    }
    

    if (textInterface.selected.equals("RULES")) {
      ruleCheck += 1;
      if (ruleCheck == 4) {
        textInterface.selected = "unimportant";
        ruleCheck = 0;
        try {
          FileReader fr = new FileReader("./SavesDir/Hardmode.txt");
          BufferedReader br = new BufferedReader(fr);
          if (br.readLine().equals("true")) {
            superEgg = true;
          }
          br.close();
        } catch (IOException e) {
        	textInterface.println("YOU CHECK THE RULES AND AS YOU DO YOU SEE ONE THAT ISENT VERY OBVIOS IT SAY COME BACK HERE AFTER BEATING HARD MODE FOR SOMETHING COOL");
            textInterface.println(" ");
            textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
        }
        if (!superEgg) {
          
        } else {
        if (hiwayFight) {
          textInterface.println("DO YOU WANT TO SKIP THE FIRST PART OF THE FIGHT");
          textInterface.query(new String[] { "TAKE ME TO THE SECOND PHASE", "NO ILL START OVER" });
        } else {
          textInterface.println("YOU HAVE BEATEN HARDMODE WHICH MEANS THERE IS ONLY ONE THING LEFT TO DO PREPARE FOR THE FINAL BOSS FIGHT");
          textInterface.query(new String[] { "LETS DO THIS!", "NO THANK YOU" });
        }
        }
      } else {
        textInterface.println("GETTING TO NEW YORK IS A WIN IF YOU DO NOT MAKE IT FOR ANY REASON THAT IS AN AUTOMATIC LOSS");
        textInterface.println("RUNNING OUT OF GRAIN IS ALSO AN AUTOMATIC LOSS");
        textInterface.println("EVERY MILE YOU TRVEL HAS A CHANCE OR RUNNING INTO A EVENT WHICH CAN BE BENIFITAL OR DETRAMENTAL TO YOUR TRIP");
        textInterface.println("THERE ARE METERS ON THE TOP RIGHT OF YOUR SCREEN THAT TELL YOU ABOUT YOUR GAS MONEY GRAIN AND SLEEP PRESS G");
        textInterface.println("WHILE DRIVING TO STOP AT A GAS STATION OR HOTEL TO GET GAS AND SLEEP");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
        textInterface.selected = "unimportant";
      }
    }
    if (textInterface.selected.equals("NO THANK YOU")) {
      textInterface.selected = "RULES";
    }
    if (textInterface.selected.equals("TAKE ME TO THE SECOND PHASE")) {
    	textInterface.selected = "not imporant";
    	if (!inTest) {
    	clip.stop();
        stuff.play("roads", volume);
    	}
    	 textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STANDS FIRM");
         textInterface.println("HEALTH  " + Health + "  AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM HEALTH " + enemyHealth);
         textInterface.println(" ");
         textInterface.query(new String[] { "FIGHT", "ALLIES", "SPECIAL ATTACK" });
    }
    if (textInterface.selected.equals("NO ILL START OVER")) {
    	hiwayFight = false;
    	finalPhase = false;
    	textInterface.selected = "LETS DO THIS!";
    }
    
    if (textInterface.selected.equals("LETS DO THIS!")) {
      mobiusFight = true;
      if (!inTest) {
      clip.stop();
      stuff.play("mobius", volume);
      }
      milesLeft = 200;
      textInterface.selected = "unimportant";
    }
    if (mobiusFight) {
      if (playerHealth <= 0) {
        textInterface.println("YOU WERE DEFEATED BY MOBIUS AND WERE SUBSEQUENTLY TORN APPART AND THROWN INTO THE ABISS");
        textInterface.println(" ");
        textInterface.println("GAME OVER");
        playerHealth = 700;
        textInterface.query(new String[] { "DARN IT" });
      }
      if (textInterface.selected.equals("unimportant")) {
        textInterface.println("YOU HAVE RETURNED TO IOWA AND ARE ENJOYING SPENDING YOUR GRAIN MONEY WHEN SUDDENLY OUT WITH NOW WARNING YOU FIND YOURSELF TRNSPORTED TO SPACE");
        textInterface.println("IN FRONT OF YOU LIES A BEING (PRESMUBLEY WHAT BROUGHT YOU HERE) HE IS LARGE AND BLACK ALMOST LIKE LIVING SMOKE WITH EVIL LOOKING PURPLE EYES");
        textInterface.println("HE SPEAKS AND YOU LISTEN GREETINGS HUMAN HE SAYS I AM THE GOD OF TRANSPORTATION AND I JUST PLAIN DON'T LIKE YOU I FIND IT FUN TO TOY WITH THOSE");
        textInterface.println("BUT RECENTLY I HAVE BEEN HAVEING SOME TROUBLES ITS ALL BECAUSE OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM I USED TO BE ABLE TO DO ANYTHING");
        textInterface.println("AND CAUSE MAJOR CATACISMS TO TRAVLERS OF ANCHENT TRAILS, BUT NOW ITS ALMOST IMPOSIBLE TO STOP THE MOST DETERMINED OF TRAVLERS WHICH IS HOW YOU");
        textInterface.println("GOT HERE YOU SURVIVED ALL MY TRAPS THROUGH SOME INSAIN MIX OF DETERMINATION AND PURE LUCK SO IM GONNA FINISH WHAT I STARTED RIGHT HERE RIGH NOW");
        textInterface.println("YOUR GOING DOWN FOOL AND ONCE I FINISH YOU OFF IM GOING TO DESTORY AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM WITH A CURSE THAT PREVENTS ANY HUMANS");
        textInterface.println("FROM REBUILDING SO WITHOUT ANY FURTHER ADO");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(mobiusDrawing, true);
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/heee hee hee.wav");
        textInterface.selected = "not important";
        textInterface.query(new String[] { "HERE WE GO" });
      }
      if (textInterface.selected.equals("HERE WE GO")) {
        textInterface.println("MOBIUS HAS COME A LONG WAY TO DESTROY YOU");
        textInterface.println("HEALTH  " + Health + "  MOBIUS HEALTH INFINITE");
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.selected = "not important";
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
      }
      if (textInterface.selected.equals("ATTACK")) {
        if (!isVisable) {
          textInterface.println("YOU TRY AND ATTACK BUT YOU CANT FIND HIM THE SHADOWS AND HE MOVES TOO QUICKLY");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        } else {
          if (amountOfAttacks == 0) {
            textInterface.println("YOU ATTACK BUT TO NO AVAIL HE SEEMS INVINCABLE IN THIS FORM ABSORBING YOUR BLOWS SEEMS TO TIRE HIM OUT A BIT THOUGH");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
          }
          if (amountOfAttacks == 1) {
            textInterface.println("HE LAUGHS AT WHAT HE CALLS YOUR PATHETIC EXCUSE FOR AN ATTACK BUT ITS CLEAR HE IS STARTING TO GET TIRED KEEP ATTACKING !!!!");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
          }
          if (amountOfAttacks == 2) {
            textInterface.println("HE TELLS YOU TO STOP ATTACKING BECAUSE ITS FUTILE BUT ITS PROBABLY JUST BECASUE HE DOESENT WANT TO ADMIT YOU STAND A CHANCE");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
          }
          if (amountOfAttacks == 3) {
            textInterface.println("BINGO YOU HIT HIM WITH A PUNCH TO THE FACE IT DOESENT HURT HIM BUT THE KEY TO HIS CAR FALLS OUT OF HIS POCKET YOU SNATCH THE KEY WITH THE CAR YOU COULD ESCAPE");
            textInterface.println(" ");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
            textInterface.query(new String[] { "EPIC" });
            hasKey = true;
          }
          if (amountOfAttacks >= 4) {
            textInterface.println("YOU WERE ABLE TO RE-STEAL THE KEY HOW LUCKY!");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
            hasKey = true;
          }
          amountOfAttacks += 1;
        }
        textInterface.selected = "not important";
      }
      
      if (textInterface.selected.equals("ITEMS")) {
        textInterface.println("WHICH ITEM DO YOU WANT TO USE");
        textInterface.selected = "not important";
        textInterface.println(" ");
        textInterface.query(new String[] { "HOPE", "RADIO", "STATBOOK", "BACK" });
      }
      if (textInterface.selected.equals("HOPE")) {
        textInterface.selected = "not important";
        if (hope != 0) {
          if (hope == 1) {
            textInterface.println("YOU TRY TO THINK ABOUT READING THE NEWSPAPER BUT YOU COULDENT FOCUS");
            textInterface.println("ALL HEALTH RESTORED BUT THERE IS NO HOPE LEFT");
            playerHealth = 700;
            hope -= 1;
            textInterface.query(new String[] { "EPIC" });
          }
          if (hope == 2) {
            textInterface.println("YOU THINK ABOUT RELAXING IN YOUR COOL TIMESHARE");
            textInterface.println("ALL HEALTH RESTORED BUT YOU CAN FEEL YOUR HOPE SLIPPING AWAY");
            playerHealth = 700;
            hope -= 1;
            textInterface.query(new String[] { "EPIC" });
          }
          if (hope >= 3) {
            textInterface.println("YOU THINK ABOUT ALL THE PROBLEMS YOU HAVE HAD ON THE HIGHWAY AND HOW YOU OVERCAME THEM AND KNOW THIS WILL BE NO DIFFRENT");
            textInterface.println("ALL HEATH RESTORED BUT YOUR STARTING TO LOSE HOPE");
            playerHealth = 700;
            hope -= 1;
            textInterface.query(new String[] { "EPIC" });
          }
        } else {
          textInterface.println("BUT IT WAS HOPELESS! NO HEALTH RESTORED");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("RADIO")) {
        textInterface.selected = "not important";
        if (!isVisable) {
          textInterface.println("YOU TURN ON THE RADIO OBVIOSLY YOU CANT GET SIGNAL IN THE MIDDLE OF SPACE BUT THE STATIC REALLY ANNOYES MOBIUS FORCEING HIM OUT OF THE SHADOWS");
          textInterface.println(" ");
          isVisable = true;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("YOU TURN THE RADIO ONTO SOME STATIC BUT MOBIUS DOESENT CARE");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("STATBOOK")) {
        textInterface.selected = "not important";
        textInterface.println("MOBIUS-THE GOD OF AUTOMOBIES AND THE EISNEHOWER HIGHWAY SYSTEM, HE IS 100 PERCENT INVUNERABLE IN THIS FORM.  THE ONLY THING YOU CAN DO RIGHT NOW IS RUN");
        textInterface.println("HIS CORE ON EARTH IS VUNERABLE. BUT YOU HAVE A LONG WAY TO GO IF YOU WANT TO GET THERE AND MOBIUS IS THE SECOND FASTEST THING YOU WILL FIND AROUND HERE");
        textInterface.println("RIGHT BEHIND HIS CAR IF YOU WANT TO ESCAPE YOU ARE GOING TO HAVE TO STEAL THE CAR TIRE HIM OUT ENOGH, AND HE MIGHT DROP THE KEY SO KEEP ATTACKING");
        textInterface.println("IF YOU CAN SEE HIM IF NOT TURN ON THE RADIO AND HE WILL BE DRAWN OUT OF THE SHADOWS");
        textInterface.println("");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("BACK")) {
        textInterface.selected = "OUCH";
      }
      if (textInterface.selected.equals("RUN")) {
        if (hasKey) {
          textInterface.println("YOU USE THE KEY YOU STOLE FROM MOBIUS TO GET IN THE CAR AND START SPEEDING BACK TOWARDS EARTH AT INSAIN SPEEDS");
          textInterface.println("");
          textInterface.query(new String[] { "RUN RUN RUN" });
        } else {
          textInterface.println("YOU TRY YOUR BEST TO ESCAPE BUT MOBIUS MOVES MUCH TO FAST AND EARTH IS FAR FAR AWAY IF YOU WANT TO GET THERE YOU WILL NEED SOMETHING FASTER THAN MOBIUS");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("EPIC")) {
        if (isCharged) {
          textInterface.println("MOBIUS UNLEASHES AN INSAINLY POWERFUL ATTACK");
          textInterface.println(" ");
          eventRandom = (RNG.nextInt(200) + 400);
          String damage = Integer.toString(eventRandom);
          textInterface.println("YOU TOOK " + damage + " DAMAGE");
          playerHealth -= eventRandom;
          textInterface.selected = "not important";
          textInterface.println(" ");
          isCharged = false;
          textInterface.query(new String[] { "OUCH" });
        } else {
          eventRandom = (RNG.nextInt(9) + 1);
          if (isVisable) {
            if ((eventRandom == 6) || (eventRandom <= 3)) {
              textInterface.println("MOBIUS ATTEMPTS TO SPAWN A LAZER FROM A VOID BUT YOU SEE IT COMEING AND QUICKLY DODGE IT");
              textInterface.println(" ");
              textInterface.selected = "not important";
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
            }
            if ((eventRandom == 4) || (eventRandom == 5)) {
              textInterface.println("MOBIUS CHARGES UP A POWERFUL ATTACK");
              isCharged = true;
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "not important";
            }
            if ((eventRandom == 7) || (eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
              textInterface.println("MOBIUS RETURNS TO THE SHADOWS AND SUDDENLY PUNCHES COME FROM NOWHERE");
              eventRandom = (RNG.nextInt(90) + 134);
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              textInterface.println(" ");
              isVisable = false;
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "not important";
            }
          } else {
            if (eventRandom <= 3) {
              textInterface.println("OUT OF NOHWHERE A VOID APEARS AND WITH IT A GIANORMUS BEAM YOU TRY TO DODGE BUT IT MOVES TO FAST");
              eventRandom = (RNG.nextInt(100) + 200);
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "not important";
            }
            if ((eventRandom >= 4) && (eventRandom <= 7)) {
              eventRandom = (RNG.nextInt(228) + 100);
              String damage = Integer.toString(eventRandom);
              textInterface.print("MOBIUS CHARGES AT YOU WITH A SPEAR ");
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "not important";
            }
            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
              textInterface.print("MOBIUS STARTS CHARGING A VERY STRONG ATTACK");
              isCharged = true;
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "not important";
            }
          }
        }
      }
      if (textInterface.selected.equals("OUCH")) {
        if (isVisable) {
          if (amountOfAttacks == 0) {
            textInterface.println("MOBIUS LOOKS THREATNING");
          }
          if (amountOfAttacks == 1) {
            textInterface.println("MOBIUS COUNTINUES TO BLOCK ALL OF YOUR ATTACKS");
          }
          if (amountOfAttacks == 2) {
            textInterface.println("MOBIUS IS BEGINNING TO LOOK REALLY TIRED");
          }
          if (amountOfAttacks == 3) {
            textInterface.println("MOBIUS IS EXAUSTED");
          }
          if (amountOfAttacks >= 4) {
            textInterface.println("MOBIUS CAN BARLEY MOVE ANYMORE");
          }
        } else {
          eventRandom = (RNG.nextInt(9) + 1);
          if (eventRandom <= 3) {
            textInterface.println("YOUR STANDING TERRIFIED IN THE DARKNESS");
          }
          if ((eventRandom <= 7) && (eventRandom >= 4)) {
            textInterface.println("MOBIUS COULD BE ANYWHERE");
          }
          if (eventRandom >= 8) {
            textInterface.println("YOU START RANDOMLY SWINGING YOUR WEAPON AROUND IN HOPES OF RANDOMLY HITING HIM");
          }
        }
        textInterface.println("HEALTH  " + Health + "  MOBIUS HEALTH INFINTE");
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
      if (textInterface.selected.equals("RUN RUN RUN")) {
        mobiusChase = true;
        isVisable = false;
        distanceFromMobius = 1;
        textInterface.selected = "not important";
      }
      if (milesLeft > 200) {
        milesLeft = 200;
      }
      if (mobiusChase) {
    	  textInterface.renderAtAPlace(520, 88, new String[] { "LIGHT YEARS LEFT " + milesToNewYork }, sprites.font);
        if ((milesLeft == 190) || (milesLeft == 180) || (milesLeft == 170) || (milesLeft == 160) || (milesLeft == 150) || (milesLeft == 140) || (milesLeft == 130) || (milesLeft == 120) || (milesLeft == 110) || (milesLeft == 100) || (milesLeft == 90) || (milesLeft == 80) || (milesLeft == 70) || (milesLeft == 60) || (milesLeft == 50) || (milesLeft == 40) || (milesLeft == 30) || (milesLeft == 20) || (milesLeft == 10)) {
          textInterface.println("YOU DROVE 1 LIGHT YEAR TOWARDS EARTH MOBIUS IS FALLING BEHIND");
          decicion = (RNG.nextInt(99) + 1);
          milesLeft -= 1;
          distanceFromMobius += 1;
        } else {
          textInterface.println("YOU DROVE 1 LIGHT YEAR TOWARDS EARTH BUT MOBIUS IS HOT ON YOUR TAIL");
          decicion = (RNG.nextInt(99) + 1);
          
          milesLeft -= 1;
        }
      }
      if (decicion == 4) {
        if (mobiusChase) {
          eventRandom = (RNG.nextInt(4) + 1);
          String question = "THIS MESSAGE SHOULD NOT APPEAR PLEASE REPORT THIS BUG TO JEFFREY MARSH AT JEFFREY MARSH INDUSTRYS (CHOSE BLUE)";
          if (eventRandom == 1) {
            question = "HOW MUCH DID THE GRAIN BUYER BUY YOUR GRAIN FOR? YELLOW FOR 10 GREEN FOR 15 AND BLUE FOR 20";
          }
          if (eventRandom == 2) {
            question = "HOW GRAIN DID THE NUKE DESTROY (IF YOU WENT THROUGH)? YELLOW FOR 20 GREEN FOR 35 AND BLUE FOR 50";
          }
          if (eventRandom == 3) {
            question = "WHAT CODE ALLOWS YOU TO ENTER HARD MODE? YELLOW FOR NICE GREEN FOR SUPER OR BLUE FOR HARD";
          }
          if (eventRandom == 4) {
            question = "HOW MUCH DO HOTELS COST? YELLOW FOR 80 GREEN FOR 120 OR BLUE FOR 200";
          }
          if (eventRandom == 5) {
            question = "WHICH EVENT YEILDS $900? YELLOW FOR HOMELESS GREEN FOR EXPERMENTS OR BLUE FOR GHOST WRIGHTING";
          }
          textInterface.println("AS YOUR ARE SPEEDING THROUGH SPACE YOU SEE THREE WORMHOLES ONE GREEN ONE BLUE AND ONE YELLOW A SIGN APPEARS");
          textInterface.println("THE SIGN READS " + question);
          textInterface.println("DONT QUESTION HOW YOU CAN READ THE SIGN MOVING SO FAST IT TOTALLY MAKES SENSE OR SOMETHING");
          textInterface.println(" ");
          textInterface.query(new String[] { "BLUE WORMHOLE", "YELLOW WORMHOLE", "GREEN WORMHOLE" });
          mobiusChase = false;
          textInterface.selected = "not important";
        }
        if (((textInterface.selected.equals("BLUE WORMHOLE")) && ((eventRandom == 3) || (eventRandom == 5))) || ((textInterface.selected.equals("YELLOW WORMHOLE")) && (eventRandom == 4)) || ((textInterface.selected.equals("GREEN WORMHOLE")) && ((eventRandom == 1) || (eventRandom == 2)))) {
          if ((textInterface.selected.equals("BLUE WORMHOLE")) && ((eventRandom == 3) || (eventRandom == 5))) {
            textInterface.println("YOU WENT THROUGH THE BLUE WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
            textInterface.println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
            textInterface.println(" ");
            textInterface.selected = "not important";
            textInterface.query(new String[] { "RUN RUN RUN" });
          }
          if ((textInterface.selected.equals("YELLOW WORMHOLE")) && (eventRandom == 4)) {
            textInterface.println("YOU WENT THROUGH THE YELLOW WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
            textInterface.println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
            textInterface.println(" ");
            textInterface.selected = "not important";
            textInterface.query(new String[] { "RUN RUN RUN" });
          }
          if ((textInterface.selected.equals("GREEN WORMHOLE")) && ((eventRandom == 1) || (eventRandom == 2))) {
            textInterface.println("YOU WENT THROUGH THE GREEN WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
            textInterface.println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
            textInterface.println(" ");
            textInterface.selected = "not important";
            textInterface.query(new String[] { "RUN RUN RUN" });
          }
        }
        if (((!textInterface.selected.equals("BLUE WORMHOLE")) || ((eventRandom != 3) && (eventRandom != 5))) && ((!textInterface.selected.equals("YELLOW WORMHOLE")) || (eventRandom != 4)) && ((!textInterface.selected.equals("GREEN WORMHOLE")) || ((eventRandom != 1) && (eventRandom != 2))) && ((textInterface.selected.equals("GREEN WORMHOLE")) || (textInterface.selected.equals("BLUE WORMHOLE")) || (textInterface.selected.equals("YELLOW WORMHOLE")))) {
          textInterface.println("YOU GO THOUGH THE WORMHOLE AND FIND THAT YOU GOT THE QUESTION WRONG AND YOUR BACK WHERE YOU WERE A WHILE AGO");
          textInterface.println(" ");
          textInterface.println("YOUR 12 LIGHT YEARS BACK MOBIUS DRAWS CLOSER");
          textInterface.println(" ");
          milesLeft += 12;
          distanceFromMobius -= 3;
          textInterface.selected = "not important";
          textInterface.query(new String[] { "RUN RUN RUN" });
        }
      }
      if ((decicion == 5) && 
        (mobiusChase)) {
        textInterface.println("YOU THINK ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM HOPE SLIGHTLY RESTORED");
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        hope += 1;
        textInterface.query(new String[] { "RUN RUN RUN" });
        mobiusChase = false;
      }
      
      if (decicion == 6) {
        if (mobiusChase) {
          textInterface.println("AS YOUR DRIVING THROUGH SPACE A VOID APPEARS YOU COULD TRY AND OUTRUN IT BUT YOU WONT MAKE IT UNLESS YOUR REALLY FAR AWAY FROM MOBIUS");
          textInterface.println(" ");
          textInterface.query(new String[] { "I CAN MAKE IT", "CHECK OUT WHERE THE VOID GOES" });
          mobiusChase = false;
          textInterface.selected = "not important";
        }
        if (textInterface.selected.equals("I CAN MAKE IT")) {
          textInterface.selected.equals("not important");
          textInterface.println("YOU BELIVE WITH ALL YOUR SOUL THAT YOU CAN MAKE IT AND");
          if (distanceFromMobius > 6) {
            textInterface.print("YOU COULD YOU END UP ESCAPING WITHOUT BEING CAUGHT BUT MOBIUS IS MUCH CLOSER NOW");
            distanceFromMobius -= 6;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "RUN RUN RUN" });
          } else {
            textInterface.println("YOU COULDEN'T");
            distanceFromMobius = 0;
          }
        }
        if (textInterface.selected.equals("CHECK OUT WHERE THE VOID GOES")) {
          eventRandom = (RNG.nextInt(9) + 1);
          textInterface.selected = "not important";
          if ((eventRandom == 1) || (eventRandom == 2)) {
            textInterface.println("YOU WIND UP 12 LIGHT YEARS AHEAD OF WHERE YOU WERE HOW LUCKY");
            milesLeft -= 12;
            distanceFromMobius += 1;
            textInterface.println(" ");
            textInterface.query(new String[] { "RUN RUN RUN" });
          }
          if (eventRandom == 3) {
            textInterface.println("IT TURNS OUT IT DIDEN'T GO ANYWHERE HOW LAME!");
            textInterface.println(" ");
            textInterface.query(new String[] { "RUN RUN RUN" });
          }
          if ((eventRandom == 4) || (eventRandom == 5) || (eventRandom == 6)) {
            textInterface.println("YOU WIND UP ON SOME STRANGE UNKNOWN PLANET ON THE PLANET YOU FIND STRANGE BUTTERFLY LIKE CREATURES SOMETHING ABOUT THEM UNSETLES YOU");
            textInterface.println(" BUT YOU RECUIT THEM ANYWAY THEN GET BACK ON YOUR WAY THIS COST YOU A BIT OF TIME AND MOBIUS HAS DRAWN A BIT CLOSER BUT YOU GOT CREEPY BUTTERFLYS");
            textInterface.println(" ");
            textInterface.println("GET BUTTERFLYS LOSE SOME DISTANCE ON MOBIUS");
            textInterface.println(" ");
            textInterface.query(new String[] { "RUN RUN RUN" });
            distanceFromMobius -= 3;
            hasPikbois = true;
          }
          if (eventRandom >= 7) {
            milesLeft += distanceFromMobius * 5;
            distanceFromMobius = 0;
          }
        }
      }
      if (distanceFromMobius <= 0) {
        decicion = 4000000;
        distanceFromMobius = 1;
        textInterface.println("MOBIUS CAUGHT UP YOU HE TAKES THE KEY BACK AND RESUMES THE FIGHT (HE IS STILL TIRED SO JUST ATTACK FOR VICTORY)");
        textInterface.println(" ");
        textInterface.query(new String[] { "OUCH" });
      }
      if (milesLeft <= 0) {
        mobiusChase = false;
        textInterface.selected = "not important";
        milesLeft = 200;
        textInterface.println("YOU MAKE IT TO EARTH AND THE CAR TURNS TO A COMMENT AS IT STARTS FALLING THROUGH THE ATMOSPHERE EVENTUALLY TURNING INTO A FIREBALL");
        textInterface.println("YOU EJECT FROM THE CAR AND START PARASHOOTING DOWN FROM EARTH THE CAR CRASHES INTO THE EARTH WITH YOUR ITEMS AND CREATES AN ENORMUS CRATER");
        textInterface.println("YOU TAKE A QUICK BREATHER AS YOU SLOWLY FALL TO EARTH AND YOUR HOPE BRINGS YOU STRENGTH ONCE YOU REACH THE SURFACE MOBIUS APPEARS OUT OF NOWHERE");
        textInterface.println("AND SHOUTS ENOUGH!");
        textInterface.println("REMAINING HOPE INCREASED MAXIMUM HEALTH");
        maximumHealth = (700 + 100 * hope);
        playerHealth = maximumHealth;
        textInterface.println(" ");
        textInterface.query(new String[] { "OH NO!" });
      }
      if (textInterface.selected.equals("OH NO!")) {
        textInterface.selected = "not important";
        textInterface.println("YOU FEEL THE GROUND SHAKE MORE THAT IT EVER HAS BEFORE BUT ONLY FOR A MOMENT BEFROE YOU SEE THOUSANDS OF TONS OF CONCRETE FLY INTO THE SKY");
        textInterface.println("FROM EVERY DIRECTION WHERE A BLACK HOLE HAS FORMED THIS GOES ON FOR ABOUT 3O SECONDS UNTIL YOU CAN'T EVEN TELL HOW MUCH CONCRTE IS GOING IN");
        textInterface.println("AT ONCE AFTER A COUPLE MINUTES TRAPPED IN THE STORM IT FINALLY STOPS THE BLACK HOLE FIZZLES OUT AND WHERE IT STOOD NOW STANDS A ENORMUS BEAST");
        textInterface.println("ITS AS TALL AS 400 SKYSCRAPERS EACH OF ITS TEATH ARE MADE OUT OF 16 BY 16 NETWORK OF CARS ITS FOOT IS SO LONG THAT IF YOU WERE DRIVING FULL");
        textInterface.println("SPEED IN A CAR YOU STILL WOULDEN'T ESCAPE BEFORE IT SQUISHED YOU LIKE A BUG");
        textInterface.println(" ");
        textInterface.query(new String[] { "RUN!", "RUN FASTER", "PANIC" });
      }
      if ((textInterface.selected.equals("RUN!")) || (textInterface.selected.equals("RUN FASTER")) || (textInterface.selected.equals("PANIC"))) {
        textInterface.selected = "not important";
        textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM LIFTS ITS ENORMUS FOOT AND YOU ARE POWERLESS TO STOP IT FROM CRUSHING YOU AS YOU SEE IS SHADOW ENGULF YOU");
        textInterface.println(" ");
        textInterface.query(new String[] { "ACCEPT YOUR FATE" });
      }
      if (textInterface.selected.equals("ACCEPT YOUR FATE")) {
        textInterface.selected = "not important";
        if (!inTest) {
        clip.stop();
        stuff.play("roads", volume);
        }
        textInterface.println("YOU ACCEPTED YOUR FATE AND WAITED FOR THE ENORMUS FOOT TO CRUSH YOU ... BUT THAT MOMENT NEVER CAME THE FOOT WAS SUSPENDED ABOVE HIM YOU FIND A CAR");
        textInterface.println("YOU TAKE IT AND FLOOR IT AS SOON AS YOU ARE OUT OF RANGE FROM THE FOOT IT CRASHES TO THE GROUND YOU TURN AND SEE THAT IT WAS USELESS RALTZ THAT HELD");
        textInterface.println("IT UP YOU LOOK IN THE SKY AND SEE A UFO SHOOT AN ELECTRIC BEAM AT THE TITAN IT WAS PILOTED BY FELEPE YOU TURN BACK TOWARDS THE TITAN AND FIND THAT EVERYONE");
        textInterface.println("YOU FOUND ON YOUR JOURNY IS HERE NOW THE BANDIS ARE SALVAGING WHAT THEY CAN FROM HIS BODY AND TAKEING HIM OUT BIT BY BIT THE COPS ARE THROWING TONS");
        textInterface.println("OF MILITARY GRENDATES AT HIM THE BASEBALL PLAYERS ARE THROWING BALLS AT HIM THE MECHANIC IS FIXING EVERYBODYS GEAR THE DOCTOR IS TREATING THE WOUNDED");
        textInterface.println("THE HOMELESS ARE DOING EVERYTHING THEY CAN THE GHOST WRITER IS TAKEING NOTES");
        if (hasPikbois) {
          textInterface.print("THE CREEPY BUTTERFLYS ARE SWARMING HIS HEAD (EVEN THOUGH THE HOARD IS MINISULE COMPARED TO IT) ");
        }
        textInterface.println("ITS HEARTWARMING TO SEE EVERYONE YOU MET ON YOUR QUEST HELPING YOU FINISH IT OFF FRIENDS ENEMYS AQUANTANCES THERE ALL HERE TO FIGHT FOR WHAT THEY");
        textInterface.println("BELIVE IN AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND WITH EVERYONE FIGHTING TOGETHER THERE IS NO WAY YOU CAN LOSE YOU TURN TO YOUR FOE");
        textInterface.println(" ");
        textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STANDS FIRM");
        textInterface.println("HEALTH  " + Health + "  AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM HEALTH " + enemyHealth);
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(automobielsDrawing, true);
        textInterface.query(new String[] { "FIGHT", "ALLIES", "SPECIAL ATTACK" });
        mobiusFight = false;
        hiwayFight = true;
        decicion = 4000000;
      }
    }
    if (hiwayFight) {
      if (playerHealth <= 0) {
        textInterface.println("EVEN AFTER ALL YOUR EFFORS THE TITAN WAS JUST TO MASSIVE TO DEFEAT YOU ARE CRUSED LIKE A BUG");
        textInterface.println(" ");
        textInterface.println("GAME OVER");
        playerHealth = 700;
        textInterface.query(new String[] { "DARN IT" });
      }
      if (hywayHealth <= 0) {
    	hywayHealth = 1;
        textInterface.println("FINALY AFTER A LONG TIME OF SMALL CHIPS THE BEAST CAN'T TAKE ANY MORE AND FALLS TO THE GROUND IN DEFEAT ITS MOUTH IS OPEN");
        textInterface.println("YOU AND GROUP DECIDE TO VENTRUE IN BUT AFTER YOU WALK IN A THE MOUTH CLOSED LOCKING YOU ALONE IN THIS DARK PLACE");
        textInterface.println("(NOTE THIS NEXT PORTION WONT PROGRESS IF YOU HAVE CONTROL PRESSED DOWN WHEN YOUR NOT SUPPOSED TO)");
        textInterface.query(new String[] { "PROGRESS (HAVE YOUR FINGER HOVERING OVER THE CONTROL BUTTON)" });
      }
      if (textInterface.selected.equals("PROGRESS (HAVE YOUR FINGER HOVERING OVER THE CONTROL BUTTON)")) {
        hiwayFight = false;
        finalPhase = true;
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("SPECIAL ATTACK")) {
        textInterface.selected = "not important";
        if ((hasCable) || (wierdInjection)) {
          if (hasCable) {
            if (workingCar) {
              mobiusChase = true;
            } else {
              textInterface.println("YOU NEED A CAR");
              textInterface.println(" ");
              textInterface.query(new String[] { "BACK" });
            }
          }
          else if (defeatedAllies[5] == false) {
            isPlayingBaseball = true;
            canReturn = true;
          } else {
            textInterface.println("THE TEAM IS DOWN SO YOU CAN'T ATTACK");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        }
        else {
          textInterface.println("YOU DON'T HAVE A SPECIAL ATTACK READY SO YOU CAN'T USE AN ATTACK");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
      }
      if (isPlayingBaseball) {
        if (canReturn) {
          textInterface.println("HE STEPS UP TO THE PLATE AND IS ABOUT TO THROW THE BALL AT YOU HE THROWS");
          eventRandom = (RNG.nextInt(9) + 1);
          canReturn = false;
          textInterface.selected = "unimportant";
          if (eventRandom <= 4) {
            textInterface.print("A FASTBALL WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.query(new String[] { "SWING", "DONT SWING" });
          }
          if ((eventRandom >= 5) && (eventRandom <= 8)) {
            textInterface.print("A CURVEBALL WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.query(new String[] { "GO FOR IT", "NO NO NO" });
          }
          if ((eventRandom == 9) || (eventRandom == 10)) {
            textInterface.print("SOMETHING YOU HAVE NEVER SEEN BEFORE AS HE ENGULFS THE BALL IN A TORNADO BUT ITS STILL GOING STAITE DOWN THE CENTER WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.query(new String[] { "YOLO", "HOW ABOUT YONO" });
          }
        }
        eventRandom = (RNG.nextInt(9) + 1);
        if (textInterface.selected.equals("SWING")) {
          textInterface.selected = "not important";
          if (eventRandom <= 7) {
            eventRandom = (RNG.nextInt(1500) + 2000);
            hywayHealth -= eventRandom;
            textInterface.println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT THOUGH THE CHEST OF AUTOMOBIELS AND THE EISNEHOWER HYWAY SYSTEM AND DEALS " + Integer.toString(eventRandom) + " DAMAGE");
            canReturn = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
          } else {
            textInterface.println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
            Strikes += 1;
            textInterface.println(" ");
            canReturn = true;
          }
        }
        if (textInterface.selected.equals("DONT SWING")) {
          textInterface.selected = "not important";
          if (eventRandom <= 7) {
            textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
            Strikes += 1;
            textInterface.println(" ");
            canReturn = true;
          } else {
            textInterface.println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
            Balls += 1;
            textInterface.println(" ");
            canReturn = true;
          }
        }
        if (textInterface.selected.equals("GO FOR IT")) {
          textInterface.selected = "not important";
          if (eventRandom <= 5) {
            eventRandom = (RNG.nextInt(1500) + 2000);
            hywayHealth -= eventRandom;
            textInterface.println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT THOUGH THE CHEST OF AUTOMOBIELS AND THE EISNEHOWER HYWAY SYSTEM AND DEALS " + Integer.toString(eventRandom) + " DAMAGE");
            canReturn = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
          } else {
            textInterface.println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
            Strikes += 1;
            textInterface.println(" ");
            canReturn = true;
          }
        }
        if (textInterface.selected.equals("NO NO NO")) {
          textInterface.selected = "not important";
          if (eventRandom <= 5) {
            textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
            Strikes += 1;
            textInterface.println(" ");
            canReturn = true;
          } else {
            textInterface.println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
            Balls += 1;
            textInterface.println(" ");
            canReturn = true;
          }
        }
        if (textInterface.selected.equals("HOW ABOUT YONO")) {
          textInterface.selected = "not important";
          textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
          Strikes += 1;
          textInterface.println(" ");
          canReturn = true;
        }
        if (textInterface.selected.equals("YOLO")) {
          textInterface.selected = "not important";
          if ((eventRandom == 1) || (eventRandom == 2)) {
            eventRandom = (RNG.nextInt(3500) + 5000);
            hywayHealth -= eventRandom;
            canReturn = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
            textInterface.println("YOU HIT IN INSAIN HOMERUN PUSHING THE TWISTER BACK AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IT DOES " + Integer.toString(eventRandom) + " DAMAGE");
          }
          else {
            textInterface.println("YOU SWING BUT TO NO AVAIL THE BALL WAS MOVING TO FAST AND YOU COULDEN'T HIT IT LIKE THAT");
            Strikes += 1;
            canReturn = true;
          }
        }
        if (Strikes == 3) {
          textInterface.println("THREE STRIKES MEANS YOUR OUT AND THE BASEBALL PLAYER IS HAPPY (PROBABLY BECASUE HE FINALLY GOT TO STRIKE YOU OUT) SO THE ATTACK IS OVER");
          textInterface.println(" ");
          textInterface.println(" ");
          isPlayingBaseball = false;
          textInterface.query(new String[] { "EPIC" });
          wierdInjection = false;
        }
        if (Balls == 4) {
          textInterface.println("THEY CANT WALK YOU BECASUE ITS NOT A REAL GAME SO INSTEAD THEY JUST RESET YOUR STRIKES ");
          Strikes = 0;
          Balls = 0;
        }
      }
      if (mobiusChase) {
    	textInterface.renderAtAPlace(520, 88, new String[] { "MILES LEFT " + milesToNewYork }, sprites.font);
        textInterface.println("YOU DROVE A MILE AROUND AUTOMOBEILS AND THE EISNHOWER HIGHWAY SYSTEM YOU ARE STARTING TO WRAP AROUND HIS COLUOSAL LEGS");
        milesLeft -= 1;
        decicion = (RNG.nextInt(99) + 10001);
      }
      if (decicion == 10001) {
        textInterface.println("AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM LIFTS UP ON THE TOW CABLE AND YOUR CAR FLYS INTO THE AIR WHEN IT FALLS");
        textInterface.println("BACK DOWN YOUR CAR IS DESTROYED (NOTE IF YOU FIX YOUR CAR YOU WILL BE ABLE TO RESUME THIS ATTACK)");
        mobiusChase = false;
        workingCar = false;
        decicion = 4000000;
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (decicion == 10002) {
        if (mobiusChase) {
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM PICKS YOU UP AND UNTANGLES HIS BODY UP YOU NOW MUST DRIVE 20 MORE MILES");
          milesLeft += 20;
          mobiusChase = false;
          textInterface.println(" ");
          textInterface.query(new String[] { "OKAY" });
        }
        if (textInterface.selected.equals("OKAY")) {
          mobiusChase = true;
          textInterface.selected.equals("not important");
        }
      }
      if (decicion == 10003) {
        if (mobiusChase) {
          eventRandom = (RNG.nextInt(100) + 25);
          textInterface.println("YOUR CAR HIT A MINOR STUMP AND YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
          playerHealth -= eventRandom;
          mobiusChase = false;
          textInterface.println(" ");
          textInterface.query(new String[] { "OKAY" });
        }
        if (textInterface.selected.equals("OKAY")) {
          mobiusChase = true;
          textInterface.selected.equals("not important");
        }
      }
      if (milesLeft <= 0) {
        textInterface.println("YOU GOT ALL THE WAY AROUND THE CREATURE AND NOW HE IS STUCK IN PLACE AND HE PROBABLY WILL BE FOR THE NEXT 5 TURNS");
        hasCable = false;
        allTiedUp = true;
        mobiusChase = false;
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
        milesLeft = 100;
      }
      if (textInterface.selected.equals("FIGHT")) {
        eventRandom = (RNG.nextInt(8) + 1);
        textInterface.selected = "not important";
        if ((eventRandom == 1) && (workingCar)) {
          textInterface.println("YOU RUN FROM AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IN THE CAR AND WHEN HE ");
          textInterface.println("CHASES YOU HE HITS A HUGE POTHOLE AND HAS TO BREAK OF PEICES OF HIMSELF TO ESCAPE");
          eventRandom = (RNG.nextInt(300) + 250);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 2) || ((eventRandom == 1) && (!workingCar))) {
          textInterface.println("YOU THROW YOUR HAT AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND ...");
          eventRandom = (RNG.nextInt(2) + 1);
          if (eventRandom == 1) {
            textInterface.print(" IT WAS A HARD HAT IT DID A LOT OF DAMAGE");
            eventRandom = (RNG.nextInt(320) + 150);
            eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
            hywayHealth -= eventRandom;
            textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
          }
          if (eventRandom == 2) {
            textInterface.print(" AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM GETS CRAPTURED HE WONT BE ABLE TO ATTACK YOUR ALLIES THIS TURN ");
            textInterface.println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
            inBunker = true;
          }
          if (eventRandom == 3) {
            textInterface.print(" IT WAS JUST A BASEBALL CAP IT BOUNCES OFF HIM LIKE A FLY");
            eventRandom = (RNG.nextInt(25) + 50);
            eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
            hywayHealth -= eventRandom;
            textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
          }
        }
        if ((eventRandom == 3) && (workingCar)) {
          textInterface.println("AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM ATTEMPTS TO STOMP YOU BUT YOU ");
          textInterface.println("DODGET IT THEN YOU DRIVE ONTO ITS ENORMUS FOOT IT TRYS TO SHAKE YOU OFF BUT YOU STAY FIRM AND ");
          textInterface.println("EVENTUALLY REACH ITS COLLUSAL LEGS YOU DITCH YOUR CAR AND JUMP OFF HIS FOOT ");
          textInterface.println("YOU RIGGED THE CAR TO EXPOLODE IT DOES IMMENSE DAMAGE TO HIS LEGS HIS FOOT ALMOST GETS DETACHED");
          textInterface.println("BUT YOUR CAR GETS DESTROYED");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
          if (gasCoating) {
            textInterface.println("THE EXPLOSION CAUGHT THE GAS ON FIRE");
            isBurrned = true;
          }
          textInterface.println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
          eventRandom = (RNG.nextInt(750) + 500);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          workingCar = false;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 3) && (!workingCar)) {
          textInterface.println("YOU START THROWING A BUNCH OF PIECES OF YOUR DESTORYED CAR AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          eventRandom = (RNG.nextInt(500) + 50);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if (eventRandom == 4) {
          textInterface.println("YOU USE RANDOM ELECTRICITY MAGIC THAT YOU DIDEN'T KNOW YOU HAD UNTIL NOW ... ");
          textInterface.println("NOTHING HAPPENS I GUESS MAGIC ISEN'T CANNON IN THIS REALITY THEN RANDOMLY OUT OF NOWHERE");
          textInterface.println("A THUNDERSTORM STARTS AND SIENCE ITS THE BIGGEST OBJECT IT GETS STRUCK BY LIGHTNING WHAT LUCK!");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/lightning.wav");
          if (gasCoating) {
            textInterface.println("THE ELECTRISITY CAUGHT THE GAS ON FIRE");
            isBurrned = true;
          }
          eventRandom = (RNG.nextInt(500) + 50);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 5) || ((eventRandom == 7) && (!workingCar))) {
          textInterface.println("YOU SCREAM AS LOUD AS YOU CAN AND FEEL POWER GROW IN YOUR SOUL ...");
          textInterface.println(" NO? NO WAIT NEVERMIND THIS IS THE REAL WORLD WHERE JUST RANDOMLY SCEAMING DOESEN'T MAKE YOU MORE POWERFUL");
        }
        if (eventRandom == 6) {
          textInterface.println("YOU GRAB A MINIGUN AND START SHOOTING THE ABSOLUTE CRAP OUT OF AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println("THANK GOD FOR HEAVY WEAPONS AND THE EISENHOWER HIGHWAY SYSTEM");
          eventRandom = (RNG.nextInt(400) + 150);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 7) && (workingCar)) {
          textInterface.println("YOU SHOOT A 17TH CENTRY CANON THAT WAS MOUNTED TO YOUR CAR FOR SOME REASON");
          textInterface.println("THANK GOD FOR HISTORY AND THE EISENHOWER HIGHWAY SYSTEM");
          eventRandom = (RNG.nextInt(150) + 550);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 8) && (workingCar)) {
          textInterface.println("YOU ATTACH A LARGE BUZZ SAW TO YOUR CAR AND SLASH THE TITAN GOING OVER 90 MPH");
          textInterface.println("THANK GOD FOR ILLOGICAL VECHICALS AND THE EISENHOWER HIGHWAY SYSTEM");
          eventRandom = (RNG.nextInt(250) + 250);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 9) || ((eventRandom == 8) && (!workingCar))) {
          textInterface.println("YOU POUR A CUP OF WATER ON AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM ... FOR SOME REASON ITS KINDA EFFECTIVE BECAUSE EROSION BUT EHH");
          textInterface.println("THANK GOD FOR EROSION AND THE EISENHOWER HIGHWAY SYSTEM?");
          eventRandom = (RNG.nextInt(5) + 10);
          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * numberOfPlayerBuffs));
          hywayHealth -= eventRandom;
          textInterface.println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if (eventRandom == 10) {
          textInterface.println("YOU COULDEN'T ATTACK THIS TURN BECAUSE YOU HAVE TO UPDATE YOUR PHONE (YOU SHOULDEN'T HAVE GOTTEN A WINDOWS PHONE)");
        }
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("ALLIES")) {
        textInterface.println("WHICH COMPAINION DO YOU CALL UPON");
        textInterface.selected = "not important";
        textInterface.println(" ");
        if (!hasPikbois) {
          textInterface.query(new String[] { "USELESS RALTZ", "MARSH-ANS", "BANDITS", "MECHANIC", "COPS", "BASEBALL PLAYERS", "DOCTOR", "GHOAST WRITER", "SOMEBODY ELSE", "BACK" });
        } else {
          textInterface.query(new String[] { "USELESS RALTZ", "MARSH-ANS", "BANDITS", "MECHANIC", "COPS", "CREEPY BUTTERFLYS", "BASEBALL PLAYERS", "DOCTOR", "GHOAST WRITER", "SOMEBODY ELSE", "BACK" });
        }
      }
      if (textInterface.selected.equals("USELESS RALTZ")) {
        textInterface.selected = "not important";
        if (defeatedAllies[0] == false) {
          if (numberOfPlayerBuffs == 6) {
            textInterface.println("BUT RALTZ IS OUT OF X SPECIAL");
            textInterface.query(new String[] { "BACK" });
          }
          textInterface.println("USELESS RALTZ COMES OUT AND GIVES YOU A X SPECIAL YOUR ATTACK INCREASED");
          textInterface.println(" ");
          numberOfPlayerBuffs += 1;
          alliesThatWork[0] = false;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("USELESS RALTZ LIES DEAFEATED SHE WILL BE UNABLE TO HELP AT THIS TIME");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
      }
      
      if (textInterface.selected.equals("MARSH-ANS")) {
        textInterface.selected = "not important";
        if (defeatedAllies[1] == false) {
          if (maximumHealth >= 2000) {
            textInterface.println("FELEPE CAN'T RAISE YOUR MAX HEALTH BECASUE YOUR MAX HEALTH IS MAXED OUT");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          } else {
            maximumHealth += 300;
            textInterface.println("THE MARSH-ANS BLAST YOU WITH A RAY BEAM WHICH MAKES YOU FEEL ENGRGIZED MAX HP INCREASED TO " + Integer.toString(maximumHealth));
            textInterface.println(" ");
            alliesThatWork[1] = false;
            textInterface.query(new String[] { "EPIC" });
          }
        } else {
          textInterface.println("THE MARSH-AN SAUCER IS DESTROYED IT CAN'T HELP YOU");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
      }
      if (textInterface.selected.equals("BANDITS")) {
        if (attacksUsed[0] == false) {
          if (defeatedAllies[2] == false) {
            textInterface.selected = "not important";
            textInterface.println("YOU GIVE SOME OF YOUR GAS TO THE BANDITS AND TOGETHER YOU COAT THE BOSS WITH GAS");
            gasCoating = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
            alliesThatWork[2] = false;
            attacksUsed[0] = true;
          } else {
            textInterface.println("THE BANDITS HAVE A LOT OF WOUNDED AND CAN'T BOTHER WITH HELPING YOU ATTACK RIGHT NOW");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        } else {
          textInterface.selected = "not important";
          textInterface.println("BUT YOU DON'T HAVE ANY MORE GAS TO SPARE");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
      }
      if (textInterface.selected.equals("BACK")) {
        textInterface.selected = "OUCH";
      }
      if (textInterface.selected.equals("MECHANIC")) {
        if (!workingCar) {
          if (defeatedAllies[3] == false) {
            textInterface.println("THE MECHANIC COMES UP AND FIXES YOUR CAR (FOR FREE THIS TIME)");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
            textInterface.println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
            textInterface.println("");
            workingCar = true;
            alliesThatWork[3] = false;
            textInterface.query(new String[] { "EPIC" });
          } else {
            textInterface.println("THE MECHANIC HAS TO DEAL WITH HIS OWN CAR BEFORE HE CAN HELP YOU WITH YOURS");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        } else {
          textInterface.println("BUT THERE WAS NO PROBLEM WITH YOUR CAR");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("COPS")) {
        if (attacksUsed[1] == false) {
          if (workingCar) {
            if (defeatedAllies[4] == false) {
              if (!wierdInjection) {
                textInterface.println("THE COPS TIE A ENORMUS CABLE TO THE END OF YOUR CAR WITH THE INTERTION OF YOU DRIVING AROUND AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
                textInterface.println(" ");
                textInterface.println("SPECIAL ATTACK CHARGED");
                textInterface.println(" ");
                alliesThatWork[4] = false;
                attacksUsed[1] = true;
                hasCable = true;
                milesLeft = 100;
                amountOfAttacks = 0;
                textInterface.query(new String[] { "EPIC" });
              } else {
                textInterface.println("YOU ALREADY HAVE A SPECIAL ATTACK CHARGED WOULD YOU LIKE TO CHARGE THIS ONE INSTEAD");
                textInterface.println(" ");
                textInterface.query(new String[] { "SOUNDS LEGIT TO ME", "EH NO THANKS" });
              }
            } else {
              textInterface.println("THE COPS CAN'T HELP YOU WITHOUT THIER EQUIPMENT");
              textInterface.println(" ");
              textInterface.query(new String[] { "BACK" });
            }
          } else {
            textInterface.println("YOU NEED A WORKING CAR TO USE THIS ATTACK");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        } else {
          textInterface.println("NOT EVEN THE COPS HAVE ANOTHER TOW CABLE BIG ENOUGH TO WRAP UP AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
        
        textInterface.selected = "not important";
      }
      
      if (textInterface.selected.equals("CREEPY BUTTERFLYS")) {
        if (pikboiSprouts > 0) {
          textInterface.println("YOU CALL THE NEWLY BORN BUTTERFLYS THEY JOIN YOUR SQUAD");
          pikboiSquad += pikboiSprouts;
          pikboiSprouts = 0;
          textInterface.println("CURRENT BUTTERFLY COUNT = " + Integer.toString(pikboiSquad));
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT THERE WERE NO BUTTERFLYS LEFT TO JOIN YOU");
          textInterface.query(new String[] { "BACK" });
        }
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("BASEBALL PLAYERS")) {
        if (attacksUsed[2] == false) {
          if (defeatedAllies[5] == false) {
            if (!hasCable) {
              textInterface.println("THE BASEBALL PLAYERS GET READY TO PITCH");
              textInterface.println(" ");
              alliesThatWork[5] = false;
              textInterface.println("SPECIAL ATTACK CHARGED");
              textInterface.println(" ");
              attacksUsed[2] = true;
              wierdInjection = true;
              textInterface.query(new String[] { "EPIC" });
            } else {
              textInterface.println("YOU ALREADY HAVE A SPECIAL ATTACK CHARGED WOULD YOU LIKE TO CHARGE THIS ONE INSTEAD");
              textInterface.println(" ");
              textInterface.query(new String[] { "SOUNDS LEGIT TO ME", "EH NO THANKS" });
            }
          } else {
            textInterface.println("THE BASEBALL TEAM STRUCK OUT THEY CAN'T HELP YOU RIGHT NOW");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        } else {
          textInterface.println("THE PITCHER SEEMS TO STILL HOLD A GRUDGE ABOUT HOW HE LOST THE BET");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
        textInterface.selected = "not important";
      }
      if (textInterface.selected.equals("DOCTOR")) {
        textInterface.selected = "not important";
        if (defeatedAllies[6] == false) {
          if (playerHealth < maximumHealth) {
            textInterface.println("THE DOCTOR HEALS ALL YOUR WOUNDS");
            alliesThatWork[6] = false;
            textInterface.println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
            textInterface.println(" ");
            playerHealth = maximumHealth;
            textInterface.query(new String[] { "EPIC" });
          } else {
            textInterface.println("YOU DON'T NEED ANY CARE");
            textInterface.println(" ");
            textInterface.query(new String[] { "BACK" });
          }
        }
        else if (healthSpray) {
          textInterface.println("THE DOCTOR IS INCOPASITATED AND CAN'T GET TO YOU LUCKILY YOU DO HAVE A HEALTH SPRAY IF YOU NEED TO USE IT (NOTE YOU CAN ONLY HEAL WITHOUT THE DOCTOR ONCE)");
          textInterface.println("DO YOU WANT TO USE IT");
          textInterface.println(" ");
          textInterface.query(new String[] { "HELL YEAH", "ILL WAIT ON THAT" });
        } else {
          textInterface.println("THE DOCTOR CAN'T GET TO YOU AND YOU ALREADY USED YOUR HEALTH SPRAY SO YOUR JUST GONNA HAVE TO DEAL");
          textInterface.println(" ");
          textInterface.query(new String[] { "BACK" });
        }
      }
      
      if (textInterface.selected.equals("SOUNDS LEGIT TO ME")) {
        textInterface.selected = "not important";
        if (!wierdInjection) {
          textInterface.println("THE COPS TIE A ENORMUS CABLE TO THE END OF YOUR CAR WITH THE INTERTION OF YOU DRIVING AROUND AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.println("SPECIAL ATTACK CHARGED");
          textInterface.println(" ");
          alliesThatWork[4] = false;
          attacksUsed[1] = true;
          hasCable = true;
          milesLeft = 100;
          mobiusChase = true;
          amountOfAttacks = 0;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("THE BASEBALL PLAYERS GET READY TO PITCH");
          textInterface.println(" ");
          alliesThatWork[5] = false;
          textInterface.println("SPECIAL ATTACK CHARGED");
          textInterface.println(" ");
          attacksUsed[2] = true;
          wierdInjection = true;
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("EH NO THANKS")) {
        textInterface.selected = "BACK";
      }
      if (textInterface.selected.equals("HELL YEAH")) {
        textInterface.selected = "not important";
        textInterface.println("YOU USED YOUR HEALTH SPRAY AND RETURNED TO MAXIMUM HEALTH");
        playerHealth = maximumHealth;
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("ILL WAIT ON THAT")) {
        textInterface.println("YOU DECIDED TO SAVE YOUR FIRST AID SPRAY FOR A BETTER TIME PROBABLY A SMART CHOICE");
        textInterface.println(" ");
        textInterface.selected = "unimportant";
        textInterface.query(new String[] { "BACK" });
      }
      if (textInterface.selected.equals("GHOAST WRITER")) {
        alliesThatWork[7] = false;
        textInterface.println("THE GHOAST WRITER COMES UP TO YOU AND SAYS AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM A BEAST BIGGER THAN ANY SEEN BEFORE IT WAS CREATED BY MOBIUS");
        textInterface.println("FROM AUTOMOBIELS AND A LOT OF PEICES OF THE EISENHOWER HIGHWAY SYSTEM ITS A LITTLE IRONIC THAT HE IS CONTROLLING THE THING YOU ARE TRYING TO SAVE");
        textInterface.println("HE HAS A CRAPTON OF HEALTH BUT IF YOU COOPERATE WITH YOUR ALLIES YOU CAN USE SPECIAL ATTACKS THAT DO MASSIVE DAMAGE AS WELL AS RAISE YOUR ATTACK AND MAX HP");
        textInterface.println("THIS IS MOSTLY A BATTLE TO SURVIVE SURE HES GOT A CRAPTON OF HEALTH BUT IF YOU KEEP ATTACKING AND DON'T LET YOURSELF RUN OUT OF HP HE SHOULDEN'T BE TOO TOUGH");
        textInterface.println("BY THE WAY IF YOU HAVENT FIGURED IT OUT YET IM THE EQUIVENLENT OF THE STATBOOK FOR THIS FIGHT GOOD LUCK");
        textInterface.println("AND THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.selected = "not important";
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("SOMEBODY ELSE")) {
        eventRandom = (RNG.nextInt(8) + 1);
        textInterface.println("YOU CAN UPON SOMEONE RANDOM AND ...");
        if (eventRandom == 1) {
          textInterface.println("THE GRAIN BUYER LETS YOUR PARTY INTO HIS SECRET GRAIN BUNKER YOUR ALLIES WONT TAKE DAMAGE THIS TURN");
          inBunker = true;
          textInterface.println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
        }
        if (eventRandom == 2) {
          eventRandom = (RNG.nextInt(499) + 500);
          textInterface.println("THE FRUITE SALESMAN THROWS CUT ORANGES AT HIM THE CITRIC ACID STARTS CORRODING HIS BODY FOR " + Integer.toString(eventRandom) + " DAMAGE");
          textInterface.println(" ");
          hywayHealth -= eventRandom;
        }
        if (eventRandom == 3) {
          textInterface.println("THE DEER THAT YOU DIDEN'T RUN INTO ON THE ROAD COMES BACK AND AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STOPS FOR HIM LOWERING HIS ACCURACY");
          lowAccuracy = true;
        }
        if (eventRandom == 4) {
          textInterface.println("THE CANDY BAR MERCHANT SELLS HIM A CANDY BAR (SOME VERY POWERFUL PEOPLE MIGHT TAKE NOTICE OF THIS)");
          isCommunist = true;
        }
        if (eventRandom == 5) {
          textInterface.println("THE TIMESHARE HITCHIKER CONSIDERS USING THE CORPSE OF THE COLUSIS TO MAKE A NEW ISLAND TO SELL TIMESHARES ON ... AND THATS IT NOTHING HAPPENS HE JUST DOES THAT");
        }
        if (eventRandom == 6) {
          textInterface.println("THE HITCHIKER WHOSE CAR BROKE DOWN ACTIVATED THE SELF DESTRUCT SWITCH ON HIS CAR (ONE OF THE ONES ABSORBED BY AUTOMOBIELS AND THE EISEHOWER HIGHWAY SYSTEM)");
          textInterface.println("MOBIUS TEATH BROKE HE WONT BE ABLE TO USE TEATH ATTACKS FOR A WHILE");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
          hasTeeth = false;
        }
        if (eventRandom == 7) {
          if (numberOfPlayerBuffs <= 7) {
            textInterface.println("THE SCIENTIST GIVES YOU A STRENGTH ENCHANCER YOU GOT TWO BUFFS");
            numberOfPlayerBuffs += 2;
          } else {
            textInterface.println("THE SCIENTIST TRYS TO INJECT YOU WITH STUFF BUT YOU HAVE TOO MANY BUFFS ALREADY");
          }
        }
        if (eventRandom == 8) {
          textInterface.println("THE HOMELESS GIVE YOU ANOTHER TOW CABLE (YOU CAN NOW REUSE THE COPS SPECIAL ATTACK IF YOU USED IT ALREADY)");
          attacksUsed[1] = false;
        }
        if (eventRandom == 9) {
          textInterface.println("THE RADIO SALESMAN COMES IN AND PLAYS SOME FUNKY MUSIC AUTOMOBIES AND THE EISENHOWER HIGHWAY SYSTEM IS CONFUSED IT MAY ATTACK ITSELF THIS TURN");
          isConfused = true;
        }
        textInterface.selected = "not important";
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("EPIC")) {
        if ((alliesThatWork[0] != false) && (defeatedAllies[0] == false)) {
          eventRandom = (RNG.nextInt(9) + 1);
          if ((eventRandom < 5) || (buffCount == 6)) {
            eventRandom = (RNG.nextInt(9) + 1);
            if ((eventRandom <= 3) || (eventRandom == 8) || (eventRandom == 9)) {
              textInterface.println("THE USELESS RALTZ USED EXTRASENSORY");
              textInterface.println(" ");
              eventRandom = (RNG.nextInt(260) + 150);
              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * buffCount));
              String damage = Integer.toString(eventRandom);
              textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
              hywayHealth -= eventRandom;
              textInterface.selected = "not important";
              textInterface.query(new String[] { "SWEET!" });
            }
            if (((eventRandom >= 4) && (eventRandom <= 7)) || ((eventRandom == 10) && (usedTrumpCard))) {
              textInterface.println("THE USELESS RALTZ USED GUNK SHOT");
              eventRandom = (RNG.nextInt(350) + 60);
              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * buffCount));
              String damage = Integer.toString(eventRandom);
              textInterface.println("AUTOMOBIELS AND THE EISNHOWER HIGHWAY SYSTEM TOOK  " + damage + " DAMAGE");
              hywayHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "SWEET!" });
              textInterface.selected = "not important";
            }
            if ((eventRandom == 10) && (!usedTrumpCard)) {
              textInterface.println("USELESS RALTZ USED TRUMP CARD");
              eventRandom = (RNG.nextInt(1200) + 700);
              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * buffCount));
              String damage = Integer.toString(eventRandom);
              usedTrumpCard = true;
              textInterface.println("AUTOMOBIELS AND THE EISNHOWER HIGHWAY SYSTEM TOOK  " + damage + " DAMAGE");
              hywayHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "SWEET!" });
              textInterface.selected = "not important";
            }
          } else {
            textInterface.println("THE USELESS RALTZ USED A X SPECIAL SHE GAINED A BUFF");
            buffCount += 1;
            textInterface.println(" ");
            textInterface.query(new String[] { "SWEET!" });
            textInterface.selected = "not important";
          }
        }
        else if (alliesThatWork[0] == false) {
          textInterface.println("USELESS RALTZ WAS TOO BUSY HELPING YOU TO ATTACK THIS TURN");
          textInterface.println(" ");
          alliesThatWork[0] = true;
          textInterface.query(new String[] { "SWEET!" });
          textInterface.selected = "not important";
        } else {
          textInterface.println("USELESS RALTZ TRYS TO ATTACK BUT CAN'T FIND THE STRENGTH");
          textInterface.println(" ");
          textInterface.query(new String[] { "SWEET!" });
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("SWEET!")) {
        if ((alliesThatWork[1] != false) && (defeatedAllies[1] == false)) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (eventRandom <= 4) {
            textInterface.println("THE UFO SHOOTS AND ENORMUS LAZER AT THE TITAN ITS VERY EFFECTIVE");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(555) + 370);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/lazer.wav");
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "YEAH!" });
          }
          if (eventRandom == 7) {
            textInterface.println("FELEPE BUILDS SOME SHELTERS (YOUR ALLIES CAN'T BE DEFEATED THIS TURN)");
            inBunker = true;
            textInterface.println(" ");
            textInterface.query(new String[] { "YEAH!" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 5) || (eventRandom == 6) || (eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("A WHOLE GROUP OF MARSH-ANS TAKE EXPERMANTAL CHEMECALS AND START MORPHING INTO MONSTERS AND ATTACK AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(420) + 269);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "YEAH!" });
          }
        }
        else if (alliesThatWork[1] == false) {
          textInterface.println("THE MARSH-ANS ARE TOO BUSY POWERING UP YOU TO ATTACK");
          textInterface.println(" ");
          alliesThatWork[1] = true;
          textInterface.query(new String[] { "YEAH!" });
          textInterface.selected = "not important";
        } else {
          textInterface.println("THE MARSH-ANS CAN'T ATTACK WITH THIER SHIP DESTROYED");
          textInterface.println(" ");
          textInterface.query(new String[] { "YEAH!" });
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("YEAH!")) {
        if ((alliesThatWork[2] != false) && (defeatedAllies[2] == false)) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
            textInterface.println("THE BANDITS FORM A FIREING SQUAD AND SHOOT ALL THIER SHOTGUNS TOWARDS THE GIANT AT ONCE");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
            if ((gasCoating) && (eventRandom == 6)) {
              textInterface.println("IT SET THE GAS ON FIRE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS BURNED");
              isBurrned = true;
            }
            eventRandom = (RNG.nextInt(750) + 100);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.println(" ");
            textInterface.query(new String[] { "RAD!" });
            textInterface.selected = "not important";
          }
          if (eventRandom == 10) {
            textInterface.println("THE BANDITS CLIMB TO THE TOP OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND START RIPPING HIS COLLOSAL CAR TEATH OFF HIS BODY ONE BY ONE");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(1350) + 100);
            hasTeeth = false;
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "RAD!" });
          }
          if ((eventRandom == 8) || (eventRandom <= 3)) {
            textInterface.println("THE BANDITS ALL GRAB PICKAXES AND START SMASHING AWAY AT AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(220) + 560);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "RAD!" });
          }
        }
        else if (alliesThatWork[2] == false) {
          textInterface.println("THE BANDITS WERE TOO BUSY SPREADING GAS TO ATTACK");
          textInterface.println(" ");
          alliesThatWork[2] = true;
          textInterface.query(new String[] { "RAD!" });
          textInterface.selected = "not important";
        } else {
          textInterface.println("THE BANDIT GANG HAS TOO MANY WONUNDED TO WORRY ABOUT TO BE ABLE TO ATTACK RIGHT NOW");
          textInterface.println(" ");
          textInterface.query(new String[] { "RAD!" });
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("RAD!")) {
        textInterface.selected = "not important";
        if (alliesThatWork[7] != false) {
          textInterface.println("THE SENTRY GUN UNLOADS ON THE CONCRATE BEAST");
          textInterface.println(" ");
          eventRandom = (RNG.nextInt(360) + 360);
          String damage = Integer.toString(eventRandom);
          textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
          hywayHealth -= eventRandom;
        }
        if ((alliesThatWork[3] != false) && (defeatedAllies[3] == false)) {
          if ((defeatedAllies[1] != false) || (defeatedAllies[4] != false) || (defeatedAllies[6] != false)) {
            eventRandom = RNG.nextInt(2);
            if (defeatedAllies[1] != false) {
              if (eventRandom == 1) {
                textInterface.println("THE MECHANIC FIXED THE MARSH-AN SAUCER ITS UP AND RUNNING AGAIN");
                defeatedAllies[1] = false;
                GameCode.clip2.stop();
                GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
                textInterface.println(" ");
                textInterface.query(new String[] { "SICK!" });
              } else {
                textInterface.println("THE MECHANIC ATTEMPTS TO FIX THE MARSH-AN SAUCER BUT ITS NOT GOING WELL");
                textInterface.println(" ");
                textInterface.query(new String[] { "SICK!" });
              }
            }
            else if (defeatedAllies[6] != false) {
              if (eventRandom == 1) {
                textInterface.println("THE MECHANIC FIXES THE DOCTORS ABULANCE NOW THE DOCTOR CAN GET BACK TO RESCUING PACIENTS");
                defeatedAllies[6] = false;
                textInterface.println(" ");
                GameCode.clip2.stop();
                GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
                textInterface.query(new String[] { "SICK!" });
              } else {
                textInterface.println("THE MECHANIC IS ATTEMPTING TO FIX THE AMBULANCE BUT HE IS HAVING TROUBLE");
                textInterface.println(" ");
                textInterface.query(new String[] { "SICK!" });
              }
            }
            else if (eventRandom == 1) {
              textInterface.println("THE MECHANIC FIXES ALL OF THE COPS CARS THE FLEET RETURNS TO ATTACKING AUTOMOBIES AND THE EISENHOWER HIGHWAY SYSTEM");
              defeatedAllies[4] = false;
              textInterface.println(" ");
              GameCode.clip2.stop();
              GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
              textInterface.query(new String[] { "SICK!" });
            } else {
              textInterface.println("THE MECHANIC IS ATTEMPTING TO FIX THE POLICE FORCES CARS BUT ITS TOO MUCH TO DO");
              textInterface.println(" ");
              textInterface.query(new String[] { "SICK!" });
            }
            

          }
          else if (alliesThatWork[7] == false) {
            textInterface.println("THE MECHANIC USED HIS DOWN TIME TOO BUILD A SENTRY GUN THAT STARTS UNLOADING ON THE BEAST");
            alliesThatWork[7] = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
            textInterface.println(" ");
            textInterface.query(new String[] { "SICK!" });
          } else {
            textInterface.println("THE MECHANIC HAS NOTHING TO DO SO HE JUST STARTS SMASHING AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM WITH A WRENCH");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(20) + 60);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "SICK!" });
          }
          
        }
        else if (alliesThatWork[3] == false) {
          alliesThatWork[3] = true;
          textInterface.println("THE MECHANIC WAS TOO BUSY FIXING YOUR CAR TO WORRY ABOUT ANYBODY ELSE");
          textInterface.println(" ");
          textInterface.query(new String[] { "SICK!" });
          textInterface.selected = "not important";
        } else {
          eventRandom = RNG.nextInt(2);
          if (eventRandom == 1) {
            textInterface.println("THE MECHANIC FIXED HIS OWN CAR AND IS READY TO GET BACK TO HELPING WITH EVERYBODY ELSES");
            textInterface.println(" ");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
            defeatedAllies[3] = false;
            textInterface.query(new String[] { "SICK!" });
            textInterface.selected = "not important";
          } else {
            textInterface.println("THE MECHANIC CAN'T GET TO EVERYBODY BECAUSE HIS CAR IS BROKEN HE IS WORKING ON FIXING IT BUT ITS NOT GOING GREAT");
            textInterface.println(" ");
            textInterface.query(new String[] { "SICK!" });
            textInterface.selected = "not important";
          }
        }
      }
      
      if (textInterface.selected.equals("SICK!")) {
        if ((alliesThatWork[4] != false) && (defeatedAllies[4] == false)) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
            textInterface.println("THE COPS START CHUCHKING A BUCNH OF MILLITARY GRENDATES AT AUTOMOBILES AND THE EISENHOWER HYWAY SYSTEM");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
            if ((gasCoating) && (eventRandom == 6)) {
              textInterface.println("IT SET THE GAS ON FIRE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS BURNED");
              isBurrned = true;
            }
            eventRandom = (RNG.nextInt(250) + 500);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.println(" ");
            if (hasPikbois) {
              textInterface.query(new String[] { "GOOD!" });
            } else {
              textInterface.query(new String[] { "NICE!" });
            }
            textInterface.selected = "not important";
          }
          if (eventRandom == 10) {
            textInterface.println("THE COPS ALL RAM THEM WITH THEIR CARS IT DOES INSAIN DAMAGE BUT THEY ARE OUT OF COMMISION FOR A WHILE");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(1000) + 2550);
            defeatedAllies[4] = true;
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            if (hasPikbois) {
              textInterface.query(new String[] { "GOOD!" });
            } else {
              textInterface.query(new String[] { "NICE!" });
            }
          }
          if ((eventRandom == 8) || (eventRandom <= 3)) {
            textInterface.println("THE COPS UNLOAD A CRAP TON OF CLIPS ON THE CONCREATE MONSTOR");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(120) + 260);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            if (hasPikbois) {
              textInterface.query(new String[] { "GOOD!" });
            } else {
              textInterface.query(new String[] { "NICE!" });
            }
          }
        }
        else if (alliesThatWork[4] == false) {
          textInterface.println("THE COPS ARE TOO BUSY SETTING UP YOUR TOW CABLE TO ATTACK");
          textInterface.println(" ");
          alliesThatWork[4] = true;
          if (hasPikbois) {
            textInterface.query(new String[] { "GOOD!" });
          } else {
            textInterface.query(new String[] { "NICE!" });
          }
          textInterface.selected = "not important";
        } else {
          textInterface.println("THE COPS CAN'T HELP WITHOUT A FLEET OF CARS THIER JUST CHILLIN AND EATHING SOME EARTH SHAPED PASTRYS (DOUNUTS)");
          textInterface.println(" ");
          if (hasPikbois) {
            textInterface.query(new String[] { "GOOD!" });
          } else {
            textInterface.query(new String[] { "NICE!" });
          }
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("GOOD!")) {
        if (pikboiSquad > 0) {
          textInterface.println("A BUTTERFLY SQUAD OF " + Integer.toString(pikboiSquad) + " SWARM THE TITAN");
          eventRandom = 0;
          int damage = 0;
          int x = pikboiSquad;
          while (x > 0) {
            x--;
            eventRandom = (RNG.nextInt(29) + 1);
            damage += eventRandom;
          }
          textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(damage) + " DAMAGE");
          if (pikboiSquad + pikboiSprouts >= 100) {
            textInterface.println("THERE ARE TOO MANY ACTIVE BUTTERFLYS TO BE ABLE TO MAKE MORE");
          } else {
            eventRandom = RNG.nextInt((int)Math.ceil(pikboiSquad / 2) - 1 + 1);
            pikboiSprouts += eventRandom;
            textInterface.println("THE CREEPY BUTTERFLYS BREED AND " + Integer.toString(eventRandom) + " NEW BUTTERFLYS ARE BORN");
          }
          textInterface.println("CURRENT AMOUNT OF BUTTERFLYS " + Integer.toString(pikboiSquad) + " CURRENT AMOUNT OF NEWLYBORN BUTTERFLYS " + Integer.toString(pikboiSprouts));
          hywayHealth -= damage;
          textInterface.selected = "not important";
          textInterface.println(" ");
          textInterface.query(new String[] { "NICE!" });
        }
        else if (pikboiSprouts == 0) {
          textInterface.println("THERE WERE NO CREEPY BUTTERFLYS LEFT IT SEEMS THE ENTIRE SPEICIS WAS WIPED OUT");
          textInterface.println("WELL AT LEAST THE WORLD WILL BE A LITTLE LESS CREEPY");
          hasPikbois = false;
          textInterface.println(" ");
          textInterface.println("THANK GOD FOR SAFTY AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.query(new String[] { "NICE!" });
        } else {
          textInterface.println("BUT THERE WERE NO ACTIVE BUTTERFLYS LEFT TO ATTACK");
          textInterface.println(" ");
          textInterface.query(new String[] { "NICE!" });
        }
      }
      
      if (textInterface.selected.equals("NICE!")) {
        if ((alliesThatWork[5] != false) && (defeatedAllies[5] == false)) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
            textInterface.println("THE BASEBALL PLAYERS THROW HUGE ROCKS AT THE TITAN AT HIGH SPEEDS USING THIER GOOD ARMS ITS PRETTY EFFECTIVE");
            eventRandom = (RNG.nextInt(100) + 250);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.println(" ");
            textInterface.query(new String[] { "NEAT" });
            textInterface.selected = "not important";
          }
          if (eventRandom == 8) {
            textInterface.println("THE BASEBALL PLAYERS START RUNNING AROUND THE TITAN HE IS TOO FOCUSED ON THEM TO ATTACK YOUR ALLIES THIS TURN");
            inBunker = true;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "NEAT" });
          }
          if ((eventRandom <= 3) || (eventRandom == 10)) {
            textInterface.println("THE BASEBALL PLAYERS START SMASHING THE CONCREATE MONSTERS LEGS WITH BATS ITS VERY EFFECTIVE");
            textInterface.println(" ");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
            eventRandom = (RNG.nextInt(80) + 360);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "NEAT" });
          }
        }
        else if (alliesThatWork[5] == false) {
          alliesThatWork[5] = true;
          textInterface.println("THE BASEBALL PLAYERS ARE TO EXCITED FROM ANTICIPATING THE PITCH TO ATTACK");
          textInterface.println(" ");
          textInterface.query(new String[] { "NEAT" });
          textInterface.selected = "not important";
        } else {
          textInterface.println("THE BASEBALL PLAYERS ARE DEFEATED AND CAN'T ATTACK");
          textInterface.println(" ");
          textInterface.query(new String[] { "NEAT" });
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("NEAT")) {
        textInterface.selected = "not important";
        if ((alliesThatWork[6] != false) && (defeatedAllies[6] == false)) {
          if ((defeatedAllies[0] != false) || (defeatedAllies[2] != false) || (defeatedAllies[5] != false)) {
            eventRandom = RNG.nextInt(2);
            if (defeatedAllies[0] != false) {
              if (eventRandom == 1) {
                textInterface.println("THE DOCTOR USED A MAX REVIVE USELESS RALTZ IS BACK IN THE GAME");
                defeatedAllies[0] = false;
                textInterface.println(" ");
                textInterface.query(new String[] { "WICKED!" });
              } else {
                textInterface.println("THE DOCTOR USES A REVIVE BUT THE MOVE FAILED");
                textInterface.println(" ");
                textInterface.query(new String[] { "WICKED!" });
              }
            }
            else if (defeatedAllies[2] != false) {
              if (eventRandom == 1) {
                textInterface.println("THE DOCTOR FIXES UP THE BANDIT TRIBE THEY ARE BACK IN THE FIGHT");
                defeatedAllies[2] = false;
                textInterface.println(" ");
                textInterface.query(new String[] { "WICKED!" });
              } else {
                textInterface.println("THE DOCTOR IS TRYING TO HEAL THE BANDITS BUT THERE IS JUST TOO MANY WOUNDED TO DEAL WITH");
                textInterface.println(" ");
                textInterface.query(new String[] { "WICKED!" });
              }
            }
            else if (eventRandom == 1) {
              textInterface.println("THE DOCTOR PATCHES UP THE BASEBALL TEAM AND THEY GET BACK TO PUMELING THE CONCREATE");
              defeatedAllies[5] = false;
              textInterface.println(" ");
              textInterface.query(new String[] { "WICKED!" });
            } else {
              textInterface.println("THE DOCTOR TRYS TO FIX THE BASEBALL TEAM BUT THEY ARE USING METAPHORES THE DOCTOR DOESEN'T GET");
              textInterface.println(" ");
              textInterface.query(new String[] { "WICKED!" });
            }
            

          }
          else if (!healthSpray) {
            textInterface.println("THE DOCTOR USED HIS DOWN TIME TO GIVE YOU ANOTHER MEDICAL SPRAY");
            healthSpray = true;
            textInterface.println(" ");
            textInterface.query(new String[] { "WICKED!" });
          } else {
            textInterface.println("THE DOCTOR HAS NOTHING TO DO SO HE MAKES A CORROSIVE MIXTURE AND THROWS IT AT AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYTEM");
            textInterface.println(" ");
            eventRandom = (RNG.nextInt(240) + 160);
            String damage = Integer.toString(eventRandom);
            textInterface.println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
            hywayHealth -= eventRandom;
            textInterface.selected = "not important";
            textInterface.println(" ");
            textInterface.query(new String[] { "WICKED!" });
          }
          
        }
        else if (alliesThatWork[6] == false) {
          textInterface.println("THE DOCTOR WAS TOO BUSY TAKEING CARE OF YOU TO WORRY ABOUT ANYBODY ELSE");
          textInterface.println(" ");
          alliesThatWork[6] = true;
          textInterface.query(new String[] { "WICKED!" });
          textInterface.selected = "not important";
        } else {
          textInterface.println("THE DOCTOR'S CAR IS BROKEN AND HE CAN'T GET TO THE PACIENTS WITHOUT IT HE NEEDS THE MECHANIC TO FIX IT");
          textInterface.println(" ");
          textInterface.query(new String[] { "WICKED!" });
          textInterface.selected = "not important";
        }
      }
      
      if (textInterface.selected.equals("WICKED!")) {
        eventRandom = (RNG.nextInt(8) + 1);
        textInterface.selected = "not important";
        if (allTiedUp) {
          amountOfAttacks += 1;
          if (amountOfAttacks != 5) {
            textInterface.println("THE GIGANTIC BEAST IS IMOBILIZED BY SOME CHAINS AND IS UNABLE TO ATTACK THIS TURN");
            eventRandom = 420;
          } else {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM PUSHES WITH ALL ITS MIGHT AND SNAPS THE TOW CABLE RIGHT IN HALF HE IS FREE TO ATTACK AGAIN");
            allTiedUp = false;
            amountOfAttacks = 0;
          }
        }
        if ((isConfused) && (eventRandom != 420)) {
          if (eventRandom >= 6) {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TRYS TO ATTACK BUT IS TOO CONFUSED TO DO SO HE ENDS UP PUNCHING HIMSELF");
            eventRandom = (RNG.nextInt(350) + 200);
            hywayHealth -= eventRandom;
            isConfused = false;
            eventRandom = 420;
          } else {
            textInterface.println("AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM IS CONFUSED BUT SMASHING SOME FOOLS DOESEN'T REQUIRE A LOT OF IQ");
            eventRandom = (RNG.nextInt(8) + 1);
            isConfused = false;
          }
        }
        if ((lowAccuracy) && (eventRandom != 420)) {
          if (eventRandom == 1) {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TRYS TO ATTACK BUT HE CAN'T BECASUE HIS ACCURACY IS LOWERED");
            eventRandom = 420;
          } else {
            eventRandom = (RNG.nextInt(8) + 1);
          }
        }
        if (eventRandom == 1) {
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HYWAY SYSTEM TRYS TO SQUISH YOU");
          if (defeatedAllies[0] == false) {
            textInterface.print("BUT USELESS RALTZ BLOCKS IT AND YOU ESCAPE");
            textInterface.println(" ");
          } else {
            eventRandom = (RNG.nextInt(550) + 850);
            textInterface.print("AND DOES YOU TAKE " + Integer.toString(eventRandom) + " DAMAGE");
            playerHealth -= eventRandom;
            textInterface.println(" ");
          }
        }
        if ((eventRandom == 2) || (eventRandom == 7) || (eventRandom == 9)) {
          if (hasTeeth) {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STARTS SHOOTING A CRAPTON OF CARS OUT OF ITS TEETH THEY ALL GO FLYING INTO");
            if (pikboiSquad > 0) {
              eventRandom = (RNG.nextInt(7) + 1);
              grain = (RNG.nextInt(7) + 1);
            } else {
              eventRandom = (RNG.nextInt(6) + 1);
              grain = (RNG.nextInt(6) + 1);
            }
            if (((eventRandom < 4) && (defeatedAllies[(eventRandom - 1)] != false)) || ((grain < 4) && (defeatedAllies[(grain - 1)] != false) && 
              (alliesThatWork[7] != false))) {
              textInterface.print(" THE SENTERY GUN IT GETS DESTROYED");
              alliesThatWork[7] = false;
            }
            
            if ((inBunker) || ((eventRandom > 4) && (defeatedAllies[(eventRandom - 1)] != false)) || ((grain > 4) && (defeatedAllies[(grain - 1)] != false))) {
              eventRandom = (RNG.nextInt(275) + 150);
              textInterface.print(" YOU IT HIT YOU FOR " + Integer.toString(eventRandom) + " DAMAGE ");
              playerHealth -= eventRandom;
            }
            if (!inBunker) {
              if (((eventRandom == 1) || (grain == 1)) && (defeatedAllies[0] == false)) {
                textInterface.print(" USELESS RALTZ IT TAKES HER OUT ");
                defeatedAllies[0] = true;
              }
              if (((eventRandom == 2) || (grain == 2)) && (defeatedAllies[1] == false)) {
                textInterface.print(" THE MARSH-AN SAUSER IT FALLS OUT OF THE SKY ");
                defeatedAllies[1] = true;
              }
              if (((eventRandom == 3) || (grain == 3)) && (defeatedAllies[2] == false)) {
                textInterface.print(" THE BANDITS THEY GET WOUNDED ");
                defeatedAllies[2] = true;
              }
              if (((eventRandom == 4) || (grain == 4)) && (defeatedAllies[3] == false)) {
                textInterface.print(" THE MECHANIC HIS CAR GETS DESTROYED ");
                defeatedAllies[3] = true;
              }
              if (((eventRandom == 5) || (grain == 5)) && (defeatedAllies[4] == false)) {
                textInterface.print(" THE COPS THIER SQUDEREN BREAKS DOWN ");
                defeatedAllies[4] = true;
              }
              if (((eventRandom == 8) || (grain == 8)) && (pikboiSquad != 0)) {
                textInterface.print(" A GROUP OF BUTTERFLYS 30 OF THEM DIED ");
                pikboiSquad -= 30;
                if (pikboiSquad < 0) {
                  pikboiSquad = 0;
                }
              }
              if (((eventRandom == 6) || (grain == 6)) && (defeatedAllies[5] == false)) {
                textInterface.print(" THE BASEBALL PLAYERS THE TEAM IS DOWN ");
                defeatedAllies[5] = true;
              }
              if (((eventRandom == 7) || (grain == 7)) && (defeatedAllies[6] == false)) {
                textInterface.print(" THE DOCTOR HIS CAR BREAKS DOWN HE CAN'T HEAL PAICENTS WITHOUT GETTING TO THEM ");
                defeatedAllies[6] = true;
              }
            }
          } else {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM REPAIRS HIS TEETH");
            hasTeeth = true;
          }
          eventRandom = 420;
        }
        if (eventRandom == 3) {
          if ((defeatedAllies[1] == false) && (!inBunker)) {
            textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM BATTED THE MARSH-AN SAUCER OUT OF THE AIR WITH A BAT MADE OF CARS IT CRASHED INTO YOU");
            eventRandom = (RNG.nextInt(200) + 220);
            defeatedAllies[1] = true;
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
            playerHealth -= eventRandom;
            textInterface.println("SAUCER DESTROYED YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
          } else {
            textInterface.println("OUT OF A WORMHOLE A HUGE BAT APPEARS MADE ENTIRLY OUR OF CARS YOU GET BASHED WITH IT YOUR CAR IS DESTROYED IF YOU HAVE ONE");
            textInterface.println("THANK GOD FOR AUTOMOBIELS AND GIANT BATS MADE OUT OF THEM");
            eventRandom = (RNG.nextInt(347) + 145);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
            playerHealth -= eventRandom;
            workingCar = false;
            textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
          }
        }
        if (eventRandom == 4) {
          textInterface.println("AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM GRABED DIRT FROM ALL AROUND THE AREA IT CURED ITS BURN (IF IT HAD ONE) THE DIRT COVERING YOU MADE YOU LOSE POWER");
          if (hasPikbois) {
            textInterface.println("IT ALSO DESTROYED ALL NEWBORN BUTTERFLYS");
            pikboiSprouts = 0;
          }
          isBurrned = false;
          numberOfPlayerBuffs -= 1;
          if (numberOfPlayerBuffs < 0) {
            numberOfPlayerBuffs = 0;
          }
        }
        if ((eventRandom == 5) && (hasTeeth)) {
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM USED A CHOMPING ATTACK");
          eventRandom = (RNG.nextInt(430) + 850);
          playerHealth -= eventRandom;
          textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if ((eventRandom == 6) || ((eventRandom == 5) && (!hasTeeth))) {
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STARTS SHOOTING EYE LAZERS IT HITS");
          if (hasPikbois) {
            eventRandom = (RNG.nextInt(7) + 1);
          } else {
            eventRandom = (RNG.nextInt(6) + 1);
          }
          if (!inBunker) {
            if ((eventRandom == 1) && (defeatedAllies[0] == false)) {
              textInterface.print(" USELESS RALTZ IT TAKES HER OUT ");
              defeatedAllies[0] = true;
            }
            if ((eventRandom == 2) && (defeatedAllies[1] == false)) {
              textInterface.print(" THE MARSH-AN SAUSER IT FALLS OUT OF THE SKY ");
              defeatedAllies[1] = true;
            }
            if ((eventRandom == 3) && (defeatedAllies[2] == false)) {
              textInterface.print(" THE BANDITS THEY GET WOUNDED ");
              defeatedAllies[2] = true;
            }
            if ((eventRandom == 4) && (defeatedAllies[3] == false)) {
              textInterface.print(" THE MECHANIC HIS CAR GETS DESTROYED ");
              defeatedAllies[3] = true;
            }
            if ((eventRandom == 5) && (defeatedAllies[4] == false)) {
              textInterface.print(" THE COPS THIER SQUDEREN BREAKS DOWN ");
              defeatedAllies[4] = true;
            }
            if ((eventRandom == 8) && (pikboiSquad != 0)) {
              textInterface.print(" A GROUP OF BUTTERFLYS 30 OF THEM DIED ");
              pikboiSquad -= 30;
              if (pikboiSquad < 0) {
                pikboiSquad = 0;
              }
            }
            if ((eventRandom == 6) && (defeatedAllies[5] == false)) {
              textInterface.print(" THE BASEBALL PLAYERS THE TEAM IS DOWN ");
              defeatedAllies[5] = true;
            }
            if ((eventRandom == 7) && (defeatedAllies[6] == false)) {
              textInterface.print(" THE DOCTOR HIS CAR BREAKS DOWN HE CAN'T HEAL PAICENTS WITHOUT GETTING TO THEM ");
              defeatedAllies[6] = true;
            }
          }
          if ((eventRandom < 4) && (defeatedAllies[(eventRandom - 1)] != false) && 
            (alliesThatWork[7] != false)) {
            textInterface.print(" THE SENTERY GUN IT GETS DESTROYED ");
            alliesThatWork[7] = false;
          }
          
          if ((inBunker) || ((eventRandom > 4) && (defeatedAllies[(eventRandom - 1)] != false))) {
            eventRandom = (RNG.nextInt(275) + 150);
            textInterface.print("YOU IT HIT YOU FOR " + Integer.toString(eventRandom) + " DAMAGE");
            playerHealth -= eventRandom;
          }
          eventRandom = 420;
        }
        if (eventRandom == 8) {
          eventRandom = (RNG.nextInt(4) + 1);
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM USED A SPIN ATTACK YOU WERE HIT " + Integer.toString(eventRandom) + " TIMES");
          eventRandom = ((RNG.nextInt(180) + 145) * eventRandom);
          playerHealth -= eventRandom;
          textInterface.println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
        }
        if (isBurrned) {
          eventRandom = (RNG.nextInt(120) + 100);
          hywayHealth -= eventRandom;
          textInterface.println(" ");
          textInterface.println("THE FIRE STARTED TO CHIP AWAY AT THE CONCREATE IT DID " + Integer.toString(eventRandom) + " DAMAGE");
        }
        textInterface.println(" ");
        textInterface.query(new String[] { "OUCH" });
      }
      if (textInterface.selected.equals("OUCH")) {
    	  if (isCommunist) {
    	        eventRandom = (RNG.nextInt(20) + 1);
    	        if (eventRandom == 3) {
    	          textInterface.println("THE SOVIETS ARE ANGRY THAT THE BEAST BOUGHT A CANDY BAR LIKE A CAPTALIST SO THEY HIT IT WITH A NUCLEAR BOMB");
    	          textInterface.println(" ");
    	          eventRandom = (RNG.nextInt(1000) + 5000);
    	          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
    	          hywayHealth -= eventRandom;
    	          isCommunist = false;
    	          textInterface.query(new String[] { "EPIC" });
    	        }
    	      }
        eventRandom = (RNG.nextInt(6) + 1);
        inBunker = false;
        if (eventRandom == 1) {
          textInterface.println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS STANDING TALL");
        }
        if (eventRandom == 2) {
          textInterface.println("YOU WONDER IF SOMETHING LIKE A GINORMUS BEAST QUALIFYS FOR A PLACE IN A COMPYRIGHTED AUGMENTRED REALITY GAME");
        }
        if (eventRandom == 3) {
          textInterface.println("EVERYBODY IS COOPERATING TO SLOW DOWN MOBIUS");
        }
        if (eventRandom == 4) {
          textInterface.println("DARK CLOUDS HAVE FORMED IN THE DISTANCE PROVIDEING A PERFECT ATMOSPHERE FOR A FINAL BATTLE");
        }
        if (eventRandom == 5) {
          textInterface.println("THE MOUNTAINS IN THE DISTANCE LOOK PUNY COMPARED TO AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        }
        if (eventRandom == 6) {
          textInterface.println("YOU WONDER WHAT WILL BECOME OF THE ROADWAY IF YOU WIN THIS BATTLE");
        }
        if (eventRandom == 7) {
          textInterface.println("YOU WONDER IF MOBIUS IS CONTROLLING AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM OR IF THEY ARE ONE ENTITY");
        }
        textInterface.println("HEALTH  " + Health + "  HEALTH OF THE HIGHWAY SYSTEM " + Integer.toString(hywayHealth));
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "FIGHT", "ALLIES", "SPECIAL ATTACK" });
        textInterface.selected = "notimportant";
      }
    }
    if ((finalPhase) && ((!keyCheck(17)) || (eventRandom >= 101)) && (textInterface.selected.equals("not important"))) {
      creditsTimer += 1;
    }
    if (finalPhase) {
      if (creditsTimer == 30) {
        amountOfAttacks = 0;
      }
      if (creditsTimer == 60) {
        textInterface.println("...");
      }
      if (creditsTimer == 90) {
        textInterface.println("...");
      }
      if (creditsTimer == 120) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          textInterface.println("NOTHING");
          goodJob = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          textInterface.println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          textInterface.println("QUICK MASH CONTROL");
        }
      }
      if ((creditsTimer < 150) && (creditsTimer > 120) && (eventRandom > 101) && (eventRandom < 201) && (keyPressed(17))) {
        textInterface.println("A ROCK FELL BUT YOU HEARD IT AND WERE ABLE TO DODGE IT");
        goodJob = true;
      }
      if ((creditsTimer == 151) && (!goodJob) && (eventRandom > 101) && (eventRandom < 201)) {
        textInterface.println("A ROCK APPEARED OUT OF NOWHERE AND YOU WHERE SQUISHED TO DEATH");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 152) && (goodJob) && (eventRandom < 201)) {
        goodJob = false;
      }
      if ((creditsTimer < 180) && (creditsTimer > 120) && (eventRandom > 200) && (keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!goodJob)) {
        goodJob = true;
        textInterface.println("A ROCK APPEARED AND CHASED YOU THROUGH THE CORRIDOR BUT YOU ESCAPED");
      }
      if ((creditsTimer == 181) && (!goodJob) && (eventRandom > 200)) {
        textInterface.println("A ROCK APPEARED OUT OF NOWHERE YOU TRIED TO RUN BUT COULDEN'T GO FAST ENOUGH AND GOT SQUISHED");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 182) && (goodJob) && (eventRandom > 200)) {
        goodJob = false;
        amountOfTimesPushed = 0;
      }
      if (creditsTimer == 210) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          textInterface.println("NOTHING");
          goodJob = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          textInterface.println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          textInterface.println("QUICK MASH CONTROL");
        }
      }
      if ((creditsTimer < 240) && (creditsTimer > 210) && (eventRandom > 101) && (eventRandom < 201) && (keyPressed(17))) {
        textInterface.println("A VOID APPEARED AND SHOT A LAZER BUT YOU DID A DODGE ROLL");
        goodJob = true;
      }
      if ((creditsTimer == 241) && (!goodJob) && (eventRandom > 101) && (eventRandom < 201)) {
        textInterface.println("A LAZER APPEARED FROM NOWHERE AND YOU WHERE DESTROYED IN LESS THAN A SECOND");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 242) && (goodJob) && (eventRandom < 201)) {
        goodJob = false;
      }
      if ((creditsTimer < 270) && (creditsTimer > 210) && (eventRandom > 200) && (keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!goodJob)) {
        goodJob = true;
        textInterface.println("A LAZER STARTS FALLOWING YOU BUT YOU RUN PAST THE VOID THAT IS SHOTING IT SO IT CAN'T HIT YOU");
      }
      if ((creditsTimer == 271) && (!goodJob) && (eventRandom > 200)) {
        textInterface.println("A LAZER SHOWS UP AND YOU TRY TO RUN BUT IT VAPORIZES YOU BEFORE YOU CAN GET AWAY");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP"});
      }
      if ((creditsTimer == 272) && (goodJob) && (eventRandom > 200)) {
        goodJob = false;
        amountOfTimesPushed = 0;
      }
      
      if (creditsTimer == 300) {
        textInterface.println("...");
      }
      if (creditsTimer == 330) {
        textInterface.println("...");
      }
      if (creditsTimer == 360) {
        textInterface.println("...");
      }
      if (creditsTimer == 390) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          textInterface.println("NOTHING");
          goodJob = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          textInterface.println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          textInterface.println("QUICK MASH CONTROL");
        }
      }
      if ((creditsTimer < 420) && (creditsTimer > 390) && (eventRandom > 101) && (eventRandom < 201) && (keyPressed(17))) {
        textInterface.println("A BUNCH OF SHADOW PUNCHES APPEAR LUCKLY YOU WERE ABLE TO BLOCK THEM ALL WITHOUT BEING DAMAGED");
        goodJob = true;
      }
      if ((creditsTimer == 421) && (!goodJob) && (eventRandom > 101) && (eventRandom < 201)) {
        textInterface.println("YOU WERE BEAT UP BY A BUNCH OF SHADOW PUNCHES THEN COLAPSED AND DIED OF EXASTION SOME TIME LATER");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 422) && (goodJob) && (eventRandom < 201)) {
        goodJob = false;
      }
      if ((creditsTimer < 450) && (creditsTimer > 390) && (eventRandom > 200) && (keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!goodJob)) {
        goodJob = true;
        textInterface.println("A BUNCH OF SHADOW PUNCHES APPEAR BUT YOU MEET EACH ONE WITH A PUNCH THAT WAS TWICE AS POWERFUL");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
      }
      if ((creditsTimer == 451) && (!goodJob) && (eventRandom > 200)) {
        textInterface.println("A BUNCH OF SHADOW PUNCHES APPEAR AND YOU TRY TO PUNCH BACK BUT THEY WERE MORE POWERFUL");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 452) && (goodJob) && (eventRandom > 200)) {
        goodJob = false;
        amountOfTimesPushed = 0;
      }
      if (creditsTimer == 480) {
        textInterface.println("...");
      }
      if (creditsTimer == 510) {
        eventRandom = (RNG.nextInt(199) + 101);
        if ((eventRandom > 100) && (eventRandom < 201)) {
          textInterface.println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          textInterface.println("QUICK MASH CONTROL");
        }
      }
      if ((creditsTimer < 540) && (creditsTimer > 510) && (eventRandom > 101) && (eventRandom < 201) && (keyPressed(17))) {
        textInterface.println("YOU REACH THE MOBIUS CORE AND ITS LAST DITCH EFFORT IS TO SHOOT OUT A DEADLY NEEDLE BUT YOU DODGE TO THE RIGHT IT IS DEFENCELESS");
        textInterface.println(" ");
        textInterface.query(new String[] { "DESTROY IT" });
        goodJob = true;
      }
      if ((creditsTimer == 541) && (!goodJob) && (eventRandom > 101) && (eventRandom < 201)) {
        textInterface.println("YOU REACHED THE MOBIUS CORE BUT IT SHOT OUT A DEADLY SPIKE AS A LAST DITCH EFFORT AND YOU WERE IMPALED");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 542) && (goodJob) && (eventRandom < 201)) {
        goodJob = false;
      }
      if ((creditsTimer < 570) && (creditsTimer > 510) && (eventRandom > 200) && (keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!goodJob)) {
        goodJob = true;
        textInterface.println("YOU REACHED THE MOBIUS CORE BUT AS A LAST DITCH EFFORT IT TURNS INTO A SPIKE BALL AND BOUNCES AROUND BUT YOU PREDICTED ITS TREDECTRARY AND DODGED");
        textInterface.println("IT IS DEFENCELESS NOW");
        textInterface.println(" ");
        textInterface.query(new String[] { "DESTROY IT" });
      }
      if ((creditsTimer == 571) && (!goodJob) && (eventRandom > 200)) {
        textInterface.println("YOU MADE IT ALL THE WAY TO THE MOBIUS CORE BUT AS A LAST DITCH EFFORT IT TURNS INTO A SPIKE BALL AND ROLLS OVER YOU");
        finalPhase = false;
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if ((creditsTimer == 572) && (goodJob) && (eventRandom > 200)) {
        goodJob = false;
        amountOfTimesPushed = 0;
      }
      if (textInterface.selected.equals("DESTROY IT")) {
        textInterface.selected = "not important";
        textInterface.println("FOR NEW YORK");
        textInterface.println("YOU PUNCH THE CORE IT IS SHAKEING");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
        textInterface.println(" ");
        textInterface.query(new String[] { "AGAIN" });
      }
      if (textInterface.selected.equals("AGAIN")) {
        textInterface.selected = "not important";
        textInterface.println("FOR THOSE WHO FOUGHT WITH ME");
        textInterface.println("YOU PUNCH THE CORE IT IS BLUDGENED");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
        textInterface.println(" ");
        textInterface.query(new String[] { "PUNCH" });
      }
      if (textInterface.selected.equals("PUNCH")) {
        textInterface.selected = "not important";
        textInterface.println("FOR MYSELF");
        textInterface.println("YOU PUNCH THE CORE IT CAN'T TAKE MUCH MORE");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
        textInterface.println(" ");
        textInterface.query(new String[] { "FINSH IT OFF" });
      }
      if (textInterface.selected.equals("FINSH IT OFF")) {
        textInterface.selected = "not important";
        textInterface.println("AND FINALLY ... FOR AUTOMOBIELS AND THE EISENHOWER HYWAY SYSTEM");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
        textInterface.println("YOU PUNCH AND THE CORE STARTS TO FIZZLE AWAY FOR A SECOND BUT THEN IT BEGINS IMPLODING (AFTER YOU CLICK GET OUTTA HERE BEGIN MASHING CONTROL)");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET OUTTA HERE" });
      }
      if (textInterface.selected.equals("GET OUTTA HERE")) {
        creditsTimer = 400000;
        textInterface.selected = "not important";
        goodJob = false;
        eventRandom = 420;
        Balls = 0;
      }
      if ((creditsTimer < 400580) && (creditsTimer > 400001) && (keyPressed(17))) {
        Balls += 1;
      }
      if ((Balls >= 67) && (!goodJob)) {
        goodJob = true;
        textInterface.println("YOU ESCAPED THE DARK CORRIDOR AND RETURNED TO FIND THE BARRIER DISABLED SO YOU RAN OUT OF THE CAVE AND AUTMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IMPLODED");
        textInterface.println("THE ROADWAY WAS DESTROYED BY ITSELF, BUT MOBIUS WAS NEVER ABLE TO CAST HIS EVIL CURSE AND WITHIN A BIT OF TIME IT WAS REBUILT BUT THAT LEAVES THE BIG QUESTION");
        textInterface.println(" ");
        thingy.userStats.setAchievement("gaurdian of automobiels and the eisenhower hiway system_1_6");
        stuff.play("tital", volume);
        textInterface.query(new String[] { "WHERE ARE THEY NOW" });
      }
      if ((creditsTimer == 400581) && (!goodJob)) {
        textInterface.println("THE VOID COMEING FROM THE EMPLODING TRICKSTER SUCKS YOU IN AND YOU IMPLODE ALONG WITH HIM");
        textInterface.query(new String[] { "DON'T GIVE UP" });
      }
      if (textInterface.selected.equals("WHERE ARE THEY NOW")) {
        textInterface.selected = "not important";
        textInterface.println("USELESS RALTZ RETURNED TO HER TRAINERS SIDE AND THEY BEAT ALL THE DELUX TRAINERS YEAH ... NOT SURE HOW THAT HAPPENED");
        textInterface.println(" ");
        textInterface.query(new String[] { "NEAT" });
      }
      if (textInterface.selected.equals("NEAT")) {
        textInterface.selected = "not important";
        textInterface.println("FELEPE MOVED TO EARTH AND BECAME AN INTERIOR DESIGNER JUST AS HE ALLWAYS WANTED TOO ");
        textInterface.println(" ");
        textInterface.query(new String[] { "COOL" });
      }
      if (textInterface.selected.equals("COOL")) {
        textInterface.selected = "not important";
        textInterface.println("THE BANDITS CHANGED THIER WAYS AND STARTED A ROCK BAND CALLED THE BANDITS IT WAS MILDLY SUCCESFUL");
        textInterface.println(" ");
        textInterface.query(new String[] { "WICKED" });
      }
      if (textInterface.selected.equals("WICKED")) {
        textInterface.selected = "not important";
        textInterface.println("THE MECHANIC BECAME A PROFESIONAL RACECAR DRIVER THE AUDIENCE CONSIDERS HIM A NUTJOB BECAUSE HE KEEPS GOING ON ABOUT A 400 STORY TITAN HE DEFEATED");
        textInterface.println(" ");
        textInterface.query(new String[] { "TOTES REDIC" });
      }
      if (textInterface.selected.equals("TOTES REDIC")) {
        textInterface.selected = "not important";
        textInterface.println("THE BASEBALL PLAYER CHANGED HIS NAME TO SKIP AND STARTED A BASEBALL TEAM NOT ONLY DID HE HELP DEFEATE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM BUT");
        textInterface.println("HE ALSO STOPPED A GROUP OF ALLIANS FROM INVADING THE PLANET BY DEFEATING THEM IN A BASEBALL GAME");
        textInterface.println(" ");
        textInterface.query(new String[] { "THAT DOESEN'T EVEN MAKE SENCE" });
      }
      if (textInterface.selected.equals("THAT DOESEN'T EVEN MAKE SENCE")) {
        textInterface.selected = "not important";
        if (hasPikbois) {
          textInterface.println("THE CREEPY BUTTERFLYS COUNTINUED TO BREED AND ENDED UP OVERRUNNING PLANET EARTH BUT YOU KNOW ... WHATEVER");
        }
        textInterface.println(" ");
        textInterface.println("AND AS FOR YOU ... YOU DECIDED TO GIVE UP FARMING TO BECOME A TRUCK DRIVER AND GET IN ON MORE OF THAT EISENHOWER HIGHWAY SYSTEM ACTION");
        textInterface.println("AND THAT SHOULD BE EVERYTHING ... BUT ITS NOT I ACCUALLY WANT TO SAY ONE MORE THING");
        textInterface.println(" ");
        textInterface.query(new String[] { "AND WHATS THAT" });
      }
      if (textInterface.selected.equals("AND WHATS THAT")) {
        textInterface.selected = "not important";
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/thankayousomuch.wav");
        textInterface.println("THANK YOU SO MUCH FOR PLAYING,");
        textInterface.println("AND                          I");
        textInterface.println("MEAN                      THAT");
        textInterface.println("IT                      REALLY");
        textInterface.println("DOES                      MEAN");
        textInterface.println("A                          LOT");
        textInterface.println("TO ME THAT SOMEBODY LIKED THIS GAME SO MUCH TO GET THIS FAR");
        textInterface.println("                                LIKE      GOD       AND");
        textInterface.println("                                  SERIOSLY    IS        THE");
        textInterface.println("                                   THANK       THANKING  EISNHOWER");
        textInterface.println("                                    YOU         YOU       HIGHWAY");
        textInterface.println("                                     AND         FOR       SYSTEM");
        textInterface.println("                                      SOMEWHERE   AUTOMOBIELS");
        textInterface.println(" ");
        textInterface.println("PS YOU SHOULD CHECK OUT THE FUN FACTS THERE MAY OR MAY NOT BE NEW STUFF THERE NOW");
        textInterface.println(" ");
        try {
        	File fakeFile = new File ("./SavesDir");
            File realFile = new File (fakeFile, "Fun Facts.txt");
            FileWriter fw = new FileWriter (realFile);
            PrintWriter pw = new PrintWriter (fw);
            pw.println("true");
            pw.close();
        }
        catch (IOException localIOException9) {}
        textInterface.query(new String[] { "THE END!!!!!!!!!!!!!!!!!!" });
      }
    }
    if (textInterface.selected.equals("THE END!!!!!!!!!!!!!!!!!!!")) {
      initialize();
    }
    if (textInterface.selected.equals("DON'T GIVE UP")) {
      finalPhase = true;
      creditsTimer = 0;
      textInterface.selected = "not important";
    }
    if ((grain <= 0) && (GG)) {
      textInterface.println("HAVEING NO GRAIN LEFT TO SELL YOU DECIDE THAT YOUR QUEST IS NOW POINTLESS AND TURN BACK TOWARDS IOWA WITH NO PROFITS FROM THIS TRIP");
      textInterface.print(" ");
      textInterface.print("GAME OVER");
      textInterface.println(" ");
      textInterface.query(new String[] { "DANG IT" });
      GG = false;
    }
    if ((gas <= 0.0D) && (GG)) {
      isDriving = false;
      textInterface.println("WITH NO GAS LEFT YOUR CAR COMES TO ONE FINAL STOP BEFORE YOU ABANDON BOTH IT AND YOUR TRIP FOREVER");
      textInterface.print(" ");
      textInterface.print("GAME OVER");
      textInterface.println(" ");
      textInterface.query(new String[] { "DANG IT" });
      GG = false;
    }
    if (((grain <= 0) || (gas <= 0.0D)) && (textInterface.selected.equals("DANG IT"))) {
      initialize();
    }
    if ((hasPoison.booleanValue()) && (decicion > 4000) && (poisonMiles >= 50)) {
      if (isDriving) {
        if (poisonMiles == 50) {
          textInterface.println("YOUR POISONING STARTS TO ACT UP AND YOU WILL PROBABLY DIE IF YOU DON'T EAT 5 PERCENT OF YOUR GRAIN SO YOU EAT 5 PERCENT OF YOUR GRAIN");
          isDriving = false;
          textInterface.println("LOSE 5 PERCENT GRAIN");
          grain -= 5;
        } else {
          poisonMiles -= 50;
        }
      }
      if (keyPressed(10)) {
        isDriving = true;
      }
    }
    if (((keyCheck(71)) && (isDriving)) || (stopped)) {
      if (isDriving) {
        stopped = true;
        textInterface.println("WHERE DO YOU WANT TO STOP");
        textInterface.println(" ");
        isDriving = false;
        textInterface.query(new String[] { "GAS STATION", "HOTEL" });
      }
      if (textInterface.selected.equals("GAS STATION"))
      {
        if (carChase) {
          textInterface.println("THE COPS CAUGHT YOU WHY DID YOU THINK YOU COULD STOP AT A GAS STATION IN THE MIDDLE OF A POLICE CHASE WHATEVER YOU WENT TO JAIL");
          textInterface.query(new String[] { "DANG IT" });
        } else {
          if (gas >= 30.0D) {
            textInterface.println("YOU STOPED FOR SOME GAS BUT YOU DIDENT NEED ANY!");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if (gas < 30.0D) {
            double amountBought = 30.0D - gas;
            int amountPaid = (int)Math.round(amountBought * 2.66D);
            if (amountPaid < money) {
              textInterface.println("YOU DECIDED TO STOP AT A GAS STATION YOU BOUGHT " + Double.toString(amountBought) + " GALLONS OF GAS AND PAID " + Double.toString(amountPaid) + "DOLLARS");
              gas = 30.0D;
              money -= amountPaid;
              if (regularEvents && canStop) {
                textInterface.println(" ");
                canStop = false;
                textInterface.query(new String[] { "ALSO" });
              } else {
                textInterface.println("NOTHING PARTICULARLY INTRESTING HAPPENED");
                textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              }
            } else {
              amountBought = Math.round(money / 2.66D);
              if (amountBought == 0.0D) {
                textInterface.println("YOU STOPPED AT A GAS STAION BUT YOU COULDEN'T AFFORD ANY GAS SO YOU JUST LEFT");
                textInterface.println(" ");
                textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              } else {
                textInterface.println("YOU STOPPED AT A GAS STATION YOU COULDEN'T AFFORD A FULL TANK BUT YOU BOUGHT ALL YOU COULD WITH THE CASH YOU HAVE");
                money = 0;
                gas += amountBought;
                if (regularEvents) {
                  textInterface.println(" ");
                  textInterface.query(new String[] { "ALSO" });
                } else {
                  textInterface.println("NOTHING PARTICULARLY INTRESTING HAPPENED");
                  textInterface.query(new String[] { "GET BACK ON THE ROAD" });
                }
              }
            }
          }
        }
        
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("HOTEL")) {
        if (carChase) {
          textInterface.println("THE COPS CAUGHT YOU WHY DID YOU THINK YOU COULD STOP AT A HOTEL IN THE MIDDLE OF A POLICE CHASE YOU WENT TO JAIL");
          textInterface.query(new String[] { "DANG IT" });
        }
        else if (80 < money) {
          textInterface.println("YOU DECIDED TO STOP AT A HOTEL YOU RESTED AND PAID 80 DOLLARS");
          hotel = 0;
          noSleep = false;
          money -= 80;
          if (regularEvents && canStop) {
            textInterface.println(" ");
            canStop = false;
            textInterface.query(new String[] { "ALSO" });
          } else {
            textInterface.println("NOTHING PARTICULARLY INTRESTING HAPPENED");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
        } else {
          textInterface.println("YOU STOPPED AT A HOTEL BUT YOU COULDEN'T AFFORD TO STAY SO YOU JUST LEFT");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
        
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("ALSO")) {
        if (!regularEvents) {
          textInterface.println("NOTHING OF PARTICULAR INTREST HAPPENED");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          eventRandom = (RNG.nextInt(9) + 1);
          textInterface.selected = "unimportant";
          if ((eventRandom == 1) && (stopped)) {
            textInterface.println("A MAN GIVES YOU A FREE WATER BOTTLE YOU THANK HIM AND DRINK IT BUT IT TURNS OUT IT WAS POISONS AND NOW YOUR POISONED");
            hasPoison = Boolean.valueOf(true);
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if ((eventRandom == 2 || (eventRandom == 10 && workingRadio)) && (stopped)) {
            textInterface.println("YOU RUN INTO A MAN WILLING TO BUY GRAIN HE IS WILLING TO PAY 15 PER 1 PERCENT OF GRAIN NOT AS MUCH AS IN NEW YORK BUT IT COULD HELP FOR THE WAY THERE");
            textInterface.println("HOW MUCH DO YOU WANT TO SELL");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.query(new String[] { "NONE", "5 PERCENT", "10 PERCENT", "30 PERCENT" });
          }
          if (((eventRandom == 3) || ((eventRandom == 9) && (calamityCount < 3))) && (stopped)) {
            textInterface.println("YOU ENCOUNTER A TRAVALING DOCTOR HE DOES AN EXAMINATION ON YOU");
            if (hasPoison.booleanValue()) {
              textInterface.print("HE NOTICES THAT YOU HAVE BEEN POISONED AND GIVES YOU THE ANTIDOTE IMMEDIATELY ");
              textInterface.println("POISON HAS BEEN CURED");
              textInterface.println(" ");
              textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              hasPoison = Boolean.valueOf(false);
            } else {
              textInterface.println("BUT HE DOESEN'T FIND ANYTHING PARTICUALARLY WRONG");
              textInterface.println(" ");
              textInterface.query(new String[] { "GET BACK ON THE ROAD" });
            }
          }
          if (((eventRandom == 4) || ((eventRandom == 8) && (!homelessFed))) && (stopped)) {
            textInterface.println("A MAN GIVES YOU A FREE CUP OF COFFEE YOU DRINK IT AND FEEL ENERGIZED");
            hotel = -120;
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if ((eventRandom == 5) && (stopped)) {
            textInterface.println("YOU NOTICE A NICE LOOKING CANDY BAR IN THE WINDOWSILL YOU WANT TO EAT IT VERY BADLY SO YOU GO IN TO ASK ABOUT IT");
            textInterface.println("THE SHOPKEPPER SAYS ITS DELUX AND THAT IT IS 100 DOLLARS WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.renderImage(candyDrawing, true);
            textInterface.println(" ");
            textInterface.query(new String[] { "PAY 100 DOLLARS", "ASK FOR DISCOUNT" });
          }
          if ((eventRandom == 6) && (stopped)) {
            textInterface.println("A MAN COMES BY AND ASKS YOU A QUESTION SHOULD THIS GAME HAVE BEEN MADE ON SCRATCH");
            textInterface.println(" ");
            textInterface.query(new String[] { "YES", "NO" });
          }
          if ((eventRandom == 7) && (stopped)) {
            textInterface.println("YOU SEE A FRUIT STAND");
            
            textInterface.println("WILL YOU PURCHASE ANYTHING?");
            textInterface.println(" ");
            textInterface.query(new String[] { "WHAT YOU THINK IM GONNA EAT FRUIT", "FRUIT SALED YUMMY YUMMY" });
          }
          if ((eventRandom == 8) && (homelessFed) && (stopped)) {
            textInterface.println("A MAN WALKS UP TO YOU HE EXPLAINS THAT HE WAS ONE OF THE HOMELESS YOU HELPED EARLIER");
            textInterface.println("HE TELLS YOU HE HAS BECOME A VERY SUCCESFULL BUISSNESS MAN AND GIVES YOU SOME CASH");
            money += 580;
            textInterface.println("GET 580 MONEY");
            homelessFed = false;
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if ((eventRandom == 9) && (calamityCount >= 3) && (stopped)) {
            textInterface.println("YOU SEE A TWO MEN FIGHTING YOU GO UP AND ASK WHAT ITS ABOUT APPARENTLY ONE OF THEM IS ANGRY THAT THE OTHER ISENT DOING A GREAT JOB");
            textInterface.println("GHOST WRITING THE OTHER MAN IS COMPLAING THAT HIS LIFE DOESEN'T HAVE ANYTHING INTRISTING TO WRITE ABOUT HE EVENTUALLLY ASKS YOU");
            textInterface.println("TO BACK HIM UP BY GIVEING HIM SOMETHING INTRISTING EVENTUALLY YOU START TELLING THEM ABOUT ALL THE STUFF ON THE TRIP TO NEW YORK");
            textInterface.println("THEY ARE SO FACINATED THEY WANT TO PUT YOUR ADVENTURE IN HIS BOOK (OBVIOSLY IT WOULD BE HIS ADVENTURE IN THE BOOK) HE OFFERS YOU 900 DOLLARS AND YOU TAKE IT");
            textInterface.println(" ");
            textInterface.println("GAIN 900 DOLLARS");
            calamityCount = 0;
            money += 900;
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if (eventRandom == 10 && !workingRadio && stopped) {
        	 textInterface.println("YOU STRIKE UP A FRENDLY CONVERSATION WITH A MECHANIC YOU MEET IN THE BUILDING HE OFFERS TO FIX YOUR RADIO");
        	 textInterface.println(" ");
             GameCode.clip2.stop();
             GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
        	 textInterface.println("THANK GOD FOR FREINDLY MECHANICS AND THE EISENHOWER HIGHWAY SYSTEM");
        	 textInterface.println(" ");
        	 textInterface.println("GAIN RADIO");
        	 textInterface.println(" ");
        	 workingRadio = true;
             textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
        }
      }
      if (textInterface.selected.equals("NONE")) {
        textInterface.println("THE MAN LEAVES OBVIOSLY DISAPOINTED");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("5 PERCENT")) {
        textInterface.println("THE MAN GIVES YOU 75 DOLLARS AND YOU GIVE HIM 5 GRAIN");
        textInterface.println(" ");
        textInterface.println("GAIN 75 DOLLARS LOSE 5 PERCENT GRAIN ");
        textInterface.println(" ");
        grain -= 5;
        money += 75;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("10 PERCENT")) {
        textInterface.println("THE MAN GIVES YOU 150 DOLLARS AND YOU GIVE HIM 10 GRAIN");
        textInterface.println(" ");
        textInterface.println("GAIN 150 DOLLARS LOSE 10 PERCENT GRAIN ");
        textInterface.println(" ");
        grain -= 10;
        money += 150;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("30 PERCENT")) {
        textInterface.println("THE MAN GIVES YOU 450 DOLLARS AND YOU GIVE HIM 30 GRAIN");
        textInterface.println(" ");
        textInterface.println("GAIN 450 DOLLARS LOSE 30 PERCENT GRAIN ");
        textInterface.println(" ");
        grain -= 30;
        money += 450;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("PAY 100 DOLLARS")) {
        if (money >= 100) {
          textInterface.println("YOU PAY THE ENORMUS SUM OF MONEY FOR A CANDY BAR IT WASEN'T EVEN THAT GOOD");
          money -= 100;
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU CANT AFFORD IT IF ONLY YOU HAD A DISCOUNT");
          textInterface.println(" ");
          textInterface.query(new String[] { "ASK FOR DISCOUNT" });
          textInterface.selected = "unimportant";
        }
      }
      if (textInterface.selected.equals("ASK FOR DISCOUNT")) {
        eventRandom = RNG.nextInt(1);
        if (eventRandom == 0) {
          textInterface.println("YOU ASK THE MAN FOR A DISCOUNT MAYBE SHARE THE WEALTH A LITTLE BIT HE FREAKS OUT ");
          textInterface.println("AND SHOUTS COMMIE THEN THROWS YOU OUT OF HIS STORE HE HIDES A COMMUNIST NOTE IN YOUR CAR");
          isCommunist = true;
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU ASK THE MAN FOR A DISCOUNT AND HE IS REASONED WITH HE GIVES YOU THE BAR FOR FREE");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        }
      }
      if (textInterface.selected.equals("YES")) {
        textInterface.println("YOUR WRONG AND I WILL BRING FAMINE AND DESISE UPON YOUR HOUSES");
        textInterface.println("GAIN POISON AND LOSE 15 PERCENT GRAIN");
        hasPoison = Boolean.valueOf(true);
        grain -= 15;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("NO")) {
        textInterface.println("THE MAN NODS AND WALKS SLOWLY INTO THE MIST");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("WHAT YOU THINK IM GONNA EAT FRUIT")) {
        textInterface.println("YOU DECIDE NOT TO BUY CRAPPY FRUIT WHY WOULD YOU ITS LAME");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("FRUIT SALED YUMMY YUMMY")) {
        textInterface.selected = "unimportant";
        if (money >= 40) {
          eventRandom = RNG.nextInt(2);
          textInterface.println("YOU DECIDED TO SPEND 40 DOLLARS ON FRUIT AND");
          if (eventRandom == 1) {
            textInterface.print("IT WAS PRETTY GOOD GET SOME GOOD KARMA FAM");
            money -= 40;
            Karma = 1;
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          } else {
            textInterface.print("IT WAS ROTTEN AND USELESS");
            textInterface.println(" ");
            textInterface.println(" ");
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
        } else {
          textInterface.println("BUT YOU DIDEN'T HAVE ENOUGH MONEY");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        isDriving = true;
        stopped = false;
        textInterface.selected = "unimportant";
      }
      if (textInterface.equals("DARN IT")) {
        this.initialize();
      }
    }
    if ((regularEvents) && (!martianTech) && (((decicion >= 348) && (decicion <= 351) && (hardModeEnabled)) || (((decicion == 352) && (decicion == 353)) && (Karma == 2)) || ((decicion == 354) || ((decicion == 2) && (milesLeft <= 500)) || ((decicion == 355) && (milesLeft <= 300)) || ((decicion == 356) && (milesLeft <= 100)) || ((decicion == 357) && (milesLeft <= 800)) || ((decicion == 358) && (milesLeft <= 200))))) {
        if (playerHealth <= 0) {
          textInterface.println("THE LEGISLATER LEAVES A MINOR TICKET ON YOUR VEHICAL YOUR SO OFFENDED YOU GIVE UP ON YOUR QUEST AND GO HOME");
          textInterface.selected = "unimportant";
          textInterface.println("THANK GOD FOR UNENDEING BUERACURACY AND THE EISNEHOWER HIGHWAY SYSTEM");
          textInterface.query(new String[] { "DARN IT" });
          textInterface.selected = "unimportant";
          playerHealth = 700;
        }
        if (legislaterHealth <= 0) {
          textInterface.println("YOU LIGHTLY TAP THE LEGISLATER ON THE SHOLDER HE RUNS AWAY CRYING YOU STEAL HIS DIPLOMATIC LICENCE PLATE");
          textInterface.println("NOW ITS IMPOSBLE FOR THE COPS TO PULL YOU OVER AND YOU DON'T NEED TO PAY TOLLS ANYMORE");
          textInterface.println(" ");
          textInterface.println("GET DIPLOMATIC IMMUNITY");
          playerHealth = 700;
          legislaterHealth = 1;
          if (!inTest) {
          clip.stop();
          stuff.play("god", volume);
          }
          gasCoating = false;
          diplomaticImunity = true;
          textInterface.selected = "unimportant";
          textInterface.println("THANK GOD FOR WEAK LOSERS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
        if (isDriving) {
          textInterface.println("YOU GET PULLED OVER BUT ARE SUPPRISED THAT A POLICEMAN DOES NOT EXIT THE VEHICAL INSTEAD A MAN IN A EXPENSIVE SUIT HE EXPLAINS THAT HE WORKS FOR THE US");
          textInterface.println("GOVERNMENT AND YOUR LARGE AMOUNT OF GRAIN IS NOT UP TO CODE HE OFFERS TO LET YOU GO FOR 20 PECENT OF YOUR GRAIN");
          textInterface.println(" ");
          if (!inTest) {
          clip.stop();
          stuff.play("jumping", volume);
          }
          textInterface.query(new String[] { "WRECK EM", "GIVE UP GRAIN" });
          isDriving = false;
          calamityCount += 1;
        }
        if (textInterface.selected.equals("GIVE UP GRAIN")) {
            if (grain >= 31) {
              textInterface.println("YOU RELCUTENTLY OPEN UP THE BACK OF YOUR CAR AND HE DESIDES TO BE A SCUMBAG AND TAKES 30 PERCENT INSTEAD OF 20 ");
              textInterface.println(" ");
              textInterface.println("LOSE 30 PERCENT GRAIN");
              grain -= 30;
              if (!inTest) {
              clip.stop();
              stuff.play("god", volume);
              }
              textInterface.println(" ");
              textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              textInterface.selected = "unimportant";
            } else {
              textInterface.println("YOU OPEN UP THE BACK OF YOUR CAR AND HE STARTS COMPLAINING THAT YOU DON'T HAVE THAT MUCH GRAIN AT ALL YOU GET SO ANNOYED YOU ATTACK");
              textInterface.selected = "unimportant";
              textInterface.println(" ");
              textInterface.query(new String[] { "WRECK EM" });
            }
          }
        if (textInterface.selected.equals("WRECK EM")) {
          textInterface.println("THE UNCOMPERMISING LEGISLATER LAUGHS AT YOU");
          textInterface.println("HEALTH  " + Health + " CONGRESSMAN HEALTH 1");
          textInterface.println("WHAT DO YOU DO");
          textInterface.println(" ");
          textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
          textInterface.selected = "unimportant";
        }
        if (textInterface.selected.equals("ATTACK")) {
        	if (amountToWait <= 0) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (eventRandom == 1) {
            legislaterHealth = 0;
          }
          if (eventRandom == 2) {
            textInterface.println("YOU THROW A DEADLY PUNCH THE VECOR THAT COULD BE USED TO EVALUATE THE FORCE OF THE PUNCH IS OWNED BY THE GOVERMENT AND YOUR FINED");
            textInterface.println("FOR USE OF GOVERNMENT PROPERTY WITHOUT A LICENCE");
            if (money > 100) {
            money = money - 100;
            } else {
            textInterface.println("BUT YOU DIDEN'T HAVE THE MONEY SO YOU GET SENTINCED TO THE BEATING STICK YOU TOOK 100 DAMAGE");
            playerHealth = playerHealth - 100;
            }
            textInterface.query(new String[] { "EPIC" });
            textInterface.selected = "unimportant";
          }
          if (eventRandom == 3) {
            textInterface.println("YOU ATTEMPT TO BANISH THE UNCOMPRIMISING LEGISLATOR TO THE SHADOW REALM, BUT HE PLAYS A TRAP CARD AND ATTACKS YOUR LIFE POINTS DIRECTLY");
            int health = RNG.nextInt(200 + 100);
            playerHealth = playerHealth - health;
            textInterface.println("YOU TOOK " + Integer.toString(health) + " DAMAGE");
            textInterface.query(new String[] { "EPIC" });
            textInterface.selected = "unimportant";
          }
          if (eventRandom == 4) {
              textInterface.println("YOU ATTEMPT TO RUN OVER THE LEGISLATER WITH YOUR CAR BUT YOUR CAR WASEN'T LICENCED FOR MANSLAUGTER SO YOU HAVE TO WAIT IN LINE TO GET THAT DONE");
              textInterface.println("YOU CAN NOT ATTACK FOR THE NEXT TWO TURNS");
              amountToWait = 3;
              textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
            }
          if (eventRandom == 5) {
              textInterface.println("YOU SHOOT SOME RANDOM GUY IN THE BACKGROUND THE LEGISLATER PRETENDS NOT TO NOTICE ");
              textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
            }
          if (eventRandom == 6) {
        	  textInterface.println("YOU MAKE CLEAR TO THE LEGISLATER THAT HIS INCLUTION IN THIS GAME IS PURELY SARCASTIC AND IMPLYS NOTHING ABOUT THE POLITICAL CONDITION OF THE UNITED STATES");
        	  textInterface.println("HE AGREES");
        	  textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
          }
          if (eventRandom == 7) {
        	  textInterface.println("YOU STEAL A 100 DOLLAR BILL FROM THE LEGISLATORS POCKET HE NOTICES YOU TAKE IT TURNS AROUND AND GIVES YOU ANOTHER BILL FROM HIS ENORMOS STACK");
        	  textInterface.println("GAIN 200 DOLLARS");
        	  money = money + 200;
        	  textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
          }
          if (eventRandom == 8) {
        	  textInterface.println("YOU DECK IM IN THE TEATH BUT HIS EXTENCIVE DENTAL INSURANCE REPLACES THOSE TEATH IN NO TIME");
        	  textInterface.query(new String[] { "EPIC" }); 
              textInterface.selected = "unimportant";
          }
          if (eventRandom == 9) {
        	  textInterface.println("YOU THROW SOME DIRT AT THE LEGISLATORS SUIT HE WILL HAVE TO SPEND THIS TURN BUYING ANOTHER ONE");
        	  textInterface.println("LEGISLATER LOSES TURN");
        	  canLegislate = false;
        	  textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
          }
          if (eventRandom == 10) {
        	  textInterface.println("YOU SAY HI THE LEGISLATOR STARTS RANTING ABOUT HOW HE WOULD HAVE PERFERED HELLO");
        	  textInterface.query(new String[] { "EPIC" }); 
              textInterface.selected = "unimportant";
          }
        	} else {
        		textInterface.println("BUT YOU ARE WAITING IN LINE AND CAN'T ATTACK");
        		textInterface.selected = "unimportant";
        		 textInterface.query(new String [] {"WRECK EM"});
        	}
        }
        
        if (textInterface.selected.equals("ITEMS")) {
          textInterface.println("WHICH ITEM DO YOU WANT TO USE");
          textInterface.selected = "unimportant";
          textInterface.println(" ");
          textInterface.println(" ");
          textInterface.query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
        }
        if (textInterface.selected.equals("5 PERCENT GRAIN")) {
          textInterface.selected = "unimportant";
          if (!hardModeEnabled) {
          if (grain >= 5) {
            textInterface.println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
            playerHealth = 700;
            grain -= 5;
            textInterface.query(new String[] { "EPIC" });
          } else {
            textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
            textInterface.query(new String[] { "DARN IT" });
          }
          } else {
        	  if (grain >= 3) {
                  textInterface.println("YOU ATTEMPTED TO EAT 5 PERCENT GRAIN BUT THE GOVERNMENT PUT A RESTRICTION ON HOW MUCH YOU COULD EAT AT ONCE");
                  textInterface.println("SO YOU COULD ONLY EAT 3 PERCENT YOU RECOVERED 350 HEALTH");
                  playerHealth = playerHealth + 350;
                  grain -= 5;
                  textInterface.query(new String[] { "EPIC" });
                } else {
                  textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
                  textInterface.query(new String[] { "DARN IT" });
                }
          }
        }
        if (textInterface.selected.equals("3 GAS")) {
          textInterface.selected = "unimportant";
          if (gas >= 2.0D) {
          	textInterface.println("YOU PULL OUT SOME GAS TO ATTACK WITH BUT AS SOON AS YOU DO THE LEGISLATER SCREAMS OIL! STEALS THE GAS AND DROPS A 50 DOLLAR BILL"); 
          	textInterface.println("GAIN 50 DOLLARS");
          	gas = gas - 3;
          	money = money + 50;
            textInterface.query(new String[] { "EPIC" });
          } else {
            textInterface.println("BUT THERE WAS NO GAS LEFT!");
            textInterface.query(new String[] { "DARN IT" });
          }
        }
        if (textInterface.selected.equals("RADIO")) {
          textInterface.selected = "unimportant";
          if (workingRadio) {
            if (amountToWait >0) {
            	if (hardModeEnabled) {
              textInterface.println("YOU TURNED THE RADIO ON IT WAS SO ANNOYING SOME PEOPLE LEFT THE LINE ");
              amountToWait = amountToWait - 1;
            	} else {
              textInterface.println("YOU TURNED THE RADIO ON APPARENTLY MANSLAUGHTER HAS BEEN ILLIGALISED ACCORDING TO A TALK SHOW SUCKS BUT AT LEAST YOU CAN LEAVE THE LINE");
            	amountToWait = 0;
            	}
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
            } else {
            textInterface.println("YOU TURRNED ON THE RADIO TO A POLITICAL TALK SHOW YOU STAB YOURSELF OUT OF BORDOM");
            int damage = RNG.nextInt(20 + 10);
            playerHealth = playerHealth - damage;
            
            textInterface.println("YOU TOOK " +Integer.toString(damage)+ " DAMAGE");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
            }
          } else {
            textInterface.println("BUT YOU DON'T HAVE A RADIO ANYMORE");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
          }
        }
        if (textInterface.selected.equals("STATBOOK")) {
          textInterface.selected = "unimportant";
          textInterface.println("THE UNCOMPERMISING LEGISLATER HAS TROUBLE WORKING WITH PEOPLE WHO DISAGREE WITH HIM BUT HE HAS A LOOPHOLE FOR EVERY SITUATION");
          textInterface.println("BUT HE CAN'T TAKE A BEATING ALL YOU GOTTA DO IS KEEP ATTACKING HE CAN COUNTER MOST THINGS BUT NOT EVERYTHING");
          textInterface.println("");
          textInterface.query(new String[] { "EPIC" });
        }
        if (textInterface.selected.equals("BACK")) {
          textInterface.selected = "WRECK EM";
        }
        if (textInterface.selected.equals("RUN")) {
                textInterface.println("YOU RUN HE CATCHS YOU IMMIDETLY FINES YOU 700 DOLLARS AND LETS YOU GO ON YOUR WAY");
                textInterface.println(" ");
                if (!inTest) {
                clip.stop();
                stuff.play("god", volume);
                }
                if (money > 700) {
                textInterface.println("LOSE 700 DOLLARS");
                textInterface.query(new String[] { "GET BACK ON THE ROAD" });
                textInterface.selected = "unimportant";
                } else {
                	textInterface.println("BUT YOU CAN'T PAY IT SO YOU HAVE TO WORK AS A SECRATARY");
                	textInterface.println("ONCE YOU WORK OFF YOUR DEBT YOU WILL TRULLY THANK GOD FOR AUTOMOBILES AND THE EISNEHOWER HIGHWAY SYTEM");
                    textInterface.query(new String[] { "DARN IT" });
                    textInterface.selected = "unimportant";	
                }
            
        }
        if (textInterface.selected.equals("EPIC")) {
      	  String chair = " ";
      	  if (amountToWait > 0) {
      	  amountToWait = amountToWait - 1;
      	  if (amountToWait <= 0) {
      		  textInterface.println("YOU GET TO THE FRONT OF THE LINE BUT YOU GET KICKED OUT FOR NOT HAVING TWO PEICES OF MAIL");
      	  }
      	  }
      	  if (canLegislate) {
      	  if (PewDiePieChair) {
      		  eventRandom = RNG.nextInt(3);
           	if (eventRandom == 1) {
           		chair = "BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE";
           	} else {
           		chair = " ";
           	}
      	  }
          eventRandom = (RNG.nextInt(9) + 1);
            if (eventRandom <= 3) {
              textInterface.println("THE LEGISLATER PULLS OUT A NEWFANGALED LASER DEVICE AND SHINES IT IN YOUR EYES");
              textInterface.println(" ");
              GameCode.clip2.stop();
              GameCode.stuff.playSoundEffect(6.0F, "soundEffects/lazer.wav");
              textInterface.println(chair);
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
              if (hardModeEnabled) {
            	  eventRandom = (RNG.nextInt(150) + 100);
              } else {
              eventRandom = (RNG.nextInt(100) + 70);
              }
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOU TOOK " + damage + "  DAMAGE");
              playerHealth -= eventRandom;
              }
              textInterface.selected = "unimportant";
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
            }
            if ((eventRandom >= 4) && (eventRandom <= 7)) {
              textInterface.println("THE LEGISLATER IMPOSESES NEW TAXES (THIS IMPLYES HE WORKS IN THE HOUSE OF REPRESENTIVES)");
              textInterface.println(chair);
              GameCode.clip2.stop();
              GameCode.stuff.playSoundEffect(6.0F, "soundEffects/ding.wav");
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING TAXES INEFFECTIVE SOMEHOW")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
            	if (!hardModeEnabled) {
            	if (money > 100) {
            		textInterface.println("LOSE 100 DOLLARS");
            		money = money - 100;
            	} else {
            	textInterface.println("YOU DIDEN'T HAVE ANY CASH SO HE JUST DECIDED TO TAX YOUR SOUL INSTEAD");
              textInterface.println("YOU TOOK 100 DAMAGE");
              playerHealth -= 100;
            	}
              } else {
            	  if (money > 200) {
              		textInterface.println("LOSE 200 DOLLARS");
              		money = money - 200;
              	} else {
              	textInterface.println("YOU DIDEN'T HAVE ANY CASH SO HE JUST DECIDED TO TAX YOUR SOUL INSTEAD");
                textInterface.println("YOU TOOK 400 DAMAGE");
                playerHealth -= 400;
              	}  
              }
              }
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "unimportant";
            }
            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
              textInterface.println("THE LEGISLATER PUNCHES YOU FULL FORCE");
              textInterface.println("YOU TOOK 1 DAMAGE");
              playerHealth -= 1;
              textInterface.println("");
              textInterface.println("THEN HE PAYS SOME GUY TO DO IT");
              textInterface.println(chair);
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
            	  if (!hardModeEnabled) {
              eventRandom = (RNG.nextInt(80) + 100);
            	  } else {
            	eventRandom = (RNG.nextInt(100) + 150);
            	  }
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              }
              textInterface.println(" ");
              textInterface.query(new String[] { "OUCH" });
              textInterface.selected = "unimportant";
            }
      	  } else {
      		  textInterface.println("THE LEGISLATER IS BUSY BUYING A NEW SUIT");
      		textInterface.println(" ");
      		canLegislate = true;
      		textInterface.selected = "unimportant";
            textInterface.query(new String[] { "OUCH" });
      	  }
        }
     
        if (textInterface.selected.equals("OUCH")) {
          eventRandom = (RNG.nextInt(9) + 1);
            if (eventRandom <= 3) {
              textInterface.println("THE LEGISLATER IS ON THE PHONE");
            }
            if ((eventRandom <= 7) && (eventRandom >= 4)) {
              textInterface.println("THE LEGISLATER HAS STOPED PAYING ATTENTION TO YOU");
            }
            if (eventRandom >= 8) {
              textInterface.println("THE US LEGISLATERS ACTUALLY WORK REALLY HARD AND I HAVE ONLY POSITIVE THINGS TO SAY ABOUT THEM I JUST THOUGHT THIS WOULD");
              textInterface.println("A FUNNY IDEA FOR A BOSS SO YOU KNOW DON'T TAKE THIS BOSS THE WRONG WAY");
              }
          if (hasPoison.booleanValue()) {
            eventRandom = (RNG.nextInt(75) + 25);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
            playerHealth = playerHealth - eventRandom;
          }
          textInterface.println("HEALTH  " + Integer.toString(playerHealth) + "  LEGISLATER HEALTH  1");
          textInterface.println("WHAT DO YOU DO");
          textInterface.println(" ");
          textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
          textInterface.selected = "unimportant";
        }
        if (textInterface.selected.equals("DARN IT")) {
          initialize();
        }
        if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
          textInterface.selected = "unimportant";
          isDriving = true;
        }
      }
    if ((regularEvents) && (!martianTech) && (((decicion >= 313) && (decicion <= 315) && (hardModeEnabled)) || (((decicion == 232) && (decicion == 233)) && (Karma == 2)) || ((decicion == 1) || ((decicion == 2) && (milesLeft <= 500)) || ((decicion == 3) && (milesLeft <= 300)) || ((decicion == 111) && (milesLeft <= 100)) || ((decicion == 112) && (milesLeft <= 800)) || ((decicion == 113) && (milesLeft <= 200))))) {
      if (playerHealth <= 0) {
        textInterface.println("YOU WERE DEAFEATED BY THE MARSH-ANS AND TAKEN BACK TO THEIR HOME AND WERE USED AS A TEST SUBJECT IN ALIAN THOMPSONS EXPERMENT");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        textInterface.query(new String[] { "DARN IT" });
        textInterface.selected = "unimportant";
        playerHealth = 700;
      }
      if (Martianhealth <= 0) {
    	  if (!inTest) {
        clip.stop();
        stuff.play("god", volume);
    	  }
        textInterface.println("YOU DEAFEATED THE MARSH-ANS AND DISCOVERED SOME STRNGE TECH ON THIER SHIP IT IS ");
        textInterface.println("INCREADBLY EFFICENT YOU INSTALL IT TO YOUR GAS TANK AND FIND THAT YOU ONLY NEED ");
        textInterface.println("TO USE HALF AS MUCH GAS AS YOU USED TO NOW");
        textInterface.println("GET MARSH-AN TECH ");
        playerHealth = 700;
        Martianhealth = 2000;
        gasCoating = false;
        martianTech = true;
        textInterface.selected = "unimportant";
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (isDriving) {
    	  if (!inTest) {
        clip.stop();
        stuff.play("marsh", 6.0F);
    	  }
        textInterface.println("AS YOU ARE DRVING ALONG YOU SUDDENLY REALISE YOU ARE BEING PULLED UPWARD YOU LOOK UP AND SEE THAT A UFO IS USING A TRACTOR BEAM ON YOU");
        textInterface.println("ONCE YOU ARE RAISED INTO THE USO YOU ARE INFORMED THAT THE MARSH-ANS ARE LED BY FELEPE COUSIN OF THE GUY WHO DID HOUSEWORK FOR THE NEPHEW OF THE KING OF MARS");
        textInterface.println("BASICLY FELEPE WANTS TO GET INTO HOUSEWORK TOO BUT CANT BECAUSE HE DOESEN'T HAVE THE ADMERIATION OF HIS COUSIN GUALUPE SO HE NEEDS TO KIDNAP A HUMAN TO BE USED");
        textInterface.println("IN ALIAN THOMPSONS ANATAMY EXPERMINT TO GET THE ADMERATION OF A TRUE HOUSEWORKER SO PREPARE FOR A FIGHT");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(marshDrawing, true);
        textInterface.query(new String[] { "FIGHT" });
        isDriving = false;
        calamityCount += 1;
      }
      if (textInterface.selected.equals("FIGHT")) {
        textInterface.println("FELEPE AND THE MARSH-ANS ARE GONNA CUT YOU UP");
        textInterface.println("HEALTH  " + Health + "  MARSH-ANS HEALTH  " + JeffreyHealth);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("ATTACK")) {
        eventRandom = (RNG.nextInt(9) + 1);
        if (eventRandom <= 3) {
          textInterface.println("YOU SHOW FELEPE THE TRUE MEANING OF HOUSEWORKING ... USING GRAPHS AND STUFF IT WAS A PRETTY BORRNG LECUTRE AND AN EVEN LESS EFFECTIVE ATTACK");
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
        if ((eventRandom >= 4) && (eventRandom <= 7)) {
          textInterface.println("YOU MIX A BUNCH OF RANDOM CHEMICALS FROM THE UFO LAB AND THROW IT AT THE MARSH-ANS");
          eventRandom = (RNG.nextInt(100) + 490);
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/beaker smash.wav");
          String damage = Integer.toString(eventRandom);
          textInterface.println("THE MARSH-ANS TOOK " + damage + " DAMAGE");
          Martianhealth -= eventRandom;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
          textInterface.println("YOU PUSH THE HUGE SELF DESTRUCT BUTTON ON THE SHIP DOES NOT DESTROY THE SHIP BUT IT DOES EXPLODE ALL THIER ARMOR SO WIN ILL TAKE IT");
          eventRandom = (RNG.nextInt(310) + 90);
          String damage = Integer.toString(eventRandom);
          textInterface.println("THE MARSH-ANS TOOK " + damage + " DAMAGE");
          Martianhealth -= eventRandom;
          textInterface.println(" ");
          if (gasCoating) {
            textInterface.println("FELEPES HOUSE BURNED DOWN HE IS HEARTBROKEN");
            isCoordinated = false;
            felepesHappyness = false;
          }
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
      }
      
      if (textInterface.selected.equals("ITEMS")) {
        textInterface.println("WHICH ITEM DO YOU WANT TO USE");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        
        textInterface.println(" ");
        textInterface.query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
      }
      if (textInterface.selected.equals("5 PERCENT GRAIN")) {
        textInterface.selected = "unimportant";
        if (grain >= 5) {
          textInterface.println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
          playerHealth = 700;
          grain -= 5;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("3 GAS")) {
        textInterface.selected = "unimportant";
        if (gas >= 2.0D) {
        	 GameCode.clip2.stop();
             GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
          textInterface.println("YOU COATED FELPES PASSION PROJECT (HOUSE) WITH GAS IF AN EXPLOSION WENT OFF THAT WOULD BE BAD FOR HIM");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          gas -= 3.0D;
          gasCoating = true;
        } else {
          textInterface.println("BUT THERE WAS NO GAS LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("RADIO")) {
        textInterface.selected = "unimportant";
        if (workingRadio) {
          if (!isCoordinated) {
            textInterface.println("YOU TURNED THE RADIO ON ... BUT FELEPE DOESEN'T CARE");
            textInterface.println(" ");
            textInterface.query(new String[] { "EPIC" });
          }
          textInterface.println("YOU TURNED THE RADIO ONTO A HOUSE TALK SHOW FELEPE WONT BE ABLE TO CONCENTRATE FOR THIS TURN");
          isCoordinated = false;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT YOU DON'T HAVE A RADIO ANYMORE");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("STATBOOK")) {
        textInterface.selected = "unimportant";
        textInterface.println("FELEPE IS NOT THE ONLY NOTE-WORTHY MARSH-AN, OF COURSE THERE IS GUALUPE COUSIN OF FELEPE THAT DID THE HOUSEWORK FOR THE NEPHEW OF THE KING, HE WAS ALSO");
        textInterface.println("A FAIRLY POPULAR FIGHTER MOST HISTORYANS BELIVE THAT HE WAS THE MAIN REASON FOR THE SUCCESS OF THE BATTLE OF THE MEDIUM RED CANYON AND OF COURSE THE KINGS");
        textInterface.println("NEHPEW HIMSELF THAT LED NOT SO FEARLESSLY INTO BATTLE AT THE LARGE RED CANYON.  WHY DO PEOPLE ALWAYS THINK KINGS WOULD CHARGE FEARLESSLY INTO BATTLE THEY ");
        textInterface.println("HAVE JUST AS MUCH MILLATARY TRAINING AS EVERYBODY ELSE, AND ARGUABLY LESS BECAUSE THEY HAVE HAD A COUSHY DO NOTHING LIFE SO FAR ANYWAY BEAT FELEPE BY");
        textInterface.println("BURRNING DOWN HIS HOUSE WITH GAS AND EXPLOSIONS");
        textInterface.println("");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("BACK")) {
        textInterface.selected = "FIGHT";
      }
      if (textInterface.selected.equals("RUN")) {
        textInterface.println("YOUR ON A UFO WHERE ARE YOU GONNA GO?");
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("EPIC")) {
    	  String chair = " ";
    	  if (PewDiePieChair) {
    		  eventRandom = RNG.nextInt(3);
         	if (eventRandom == 1) {
         		chair = "BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE";
         	} else {
         		chair = " ";
         	}
    	  }
        eventRandom = (RNG.nextInt(9) + 1);
        if (isCoordinated) {
          if (eventRandom <= 3) {
            textInterface.println("THE MARSH-ANS SHOOT OUT A COOL LAZER BEAM THING");
            textInterface.println(" ");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/lazer.wav");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(255) + 70);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + "  DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.selected = "unimportant";
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
          }
          if ((eventRandom >= 4) && (eventRandom <= 7)) {
            textInterface.println("THE MARSHIANS BUILD A HOUSE AROUND YOU AND EXPLODE IT WITH YOU IN THERE");
            textInterface.println(chair);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(450) + 20);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            if (gasCoating) {
                textInterface.println("FELEPES HOUSE BURNED DOWN HE IS HEARTBROKEN");
                isCoordinated = false;
                felepesHappyness = false;
              }
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("THE MARSH-ANS SCAN YOUR BRAIN USING A HIGH TECH HELMET AND USE THE DATA TO PREDICT YOUR EVERY MOVE IT WORKS VERY WELL AND THEY GET SOME GOOD HITS IN");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(120) + 230);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
        } else {
          if (eventRandom <= 3) {
            textInterface.println("A MARSH-AN SHOOTS A TROPICAL FLAVORED TAFFY AT YOU ... WAIT NO THATS SLIME DEFFINITLY SLME");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(100) + 120);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom >= 4) && (eventRandom <= 7)) {
        	  textInterface.println(chair);
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
            eventRandom = (RNG.nextInt(228) + 100);
            String damage = Integer.toString(eventRandom);
            textInterface.print("A MARSHAN DRINKS A WIERD LIQUID THEN TRANSFORMS INTO A GIANT AND SLASHES YOU WITH HIS CLAW ");
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
              }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("FELEPE IS TAKEING A COFFEE BREAK");
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          isCoordinated = true;
        }
      }
      if ((isCoordinated) && (!felepesHappyness)) {
        isCoordinated = false;
      }
      if (textInterface.selected.equals("OUCH")) {
        eventRandom = (RNG.nextInt(9) + 1);
        if (isCoordinated) {
          if (eventRandom <= 3) {
            textInterface.println("THE MARSH-ANS ARE CONTIMPLATING THIER NAME ");
          }
          if ((eventRandom <= 7) && (eventRandom >= 4)) {
            textInterface.println("THE MARSH-ANS ARE DISSCUSING ALIAN THOMPSONS LECTURE");
          }
          if (eventRandom >= 8) {
            textInterface.println("THE MARSH-ANS ARE BUILDING A HOUSE");
          }
        } else {
          if (eventRandom <= 3) {
            textInterface.println("FELEPE IS WORKING ON A GRAVE FOR HIS HOUSE ");
          }
          if ((eventRandom <= 7) && (eventRandom >= 4)) {
            textInterface.println("FELEPE CANT STOP CRYING ");
          }
          if (eventRandom >= 8) {
            textInterface.println("FELPE IS TRYING TO CALL HIS COUSIN");
          }
        }
        if (hasPoison.booleanValue()) {
          eventRandom = (RNG.nextInt(75) + 25);
          String damage = Integer.toString(eventRandom);
          textInterface.println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
          playerHealth = playerHealth - eventRandom;
        }
        if (hardModeEnabled) {
        	eventRandom = RNG.nextInt(houseTurns + 3);
        	if (houseTurns > 0) {
        	houseTurns = houseTurns - 1;
        	}
        	if (eventRandom == 0) {
        		textInterface.println("FELEPES HOUSE WAS REBUILT HE IS READY TO FOCUS ON BATTLE AGAIN");
        		isCoordinated = true;
        		felepesHappyness = true;
        	}
        }
        textInterface.println("HEALTH  " + Health + "  MARSH-ANS HEALTH  " + JeffreyHealth);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 309) && (decicion <= 312) && (hardModeEnabled)) || (((decicion == 234) && (decicion == 235)) && (Karma == 2)) || ((decicion == 4) || ((decicion == 5) && (milesLeft <= 400)) || ((decicion == 6) && (milesLeft <= 200)) || ((decicion == 114) && (milesLeft <= 100)) || ((decicion == 115) && (milesLeft <= 800)) || ((decicion == 116) && (milesLeft <= 200))))) {
      if (playerHealth <= 0) {
        textInterface.println("YOU WERE DEAFEATED AND PAIED OUT ONE CAR TO THE WINNER YOU WHITED OUT");
        textInterface.println(" ");
        textInterface.query(new String[] { "DARN IT" });
        playerHealth = 700;
      }
      if (raltzHealth <= 0) {
        textInterface.println("YOU DEAFEATED THE RALTZ AFTERWARDS YOU CHECK HER OUT AND FIND AN AMULET COIN USING IT YOU CAN GET MORE MONEY FROM ODD JOBS AND SUCH");
        amuletCoin = true;
        if (!inTest) {
        clip.stop();
        stuff.play("god", volume);
        }
        playerHealth = 700;
        raltzHealth = 160;
        gasCoating = false;
        buffCount = 0;
        textInterface.selected = "unimportant";
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (isDriving) {
    	  if (!inTest) {
        clip.stop();
        stuff.play("extrasensory", volume);
    	  }
        textInterface.println("AS YOU ARE DRVING ALONG YOU ARE ASTONISHED TO SEE A SMALL CREATURE PICK UP YOUR ENTIRE CAR");
        textInterface.println("A VOICE IN YOUR HEAD TELLS YOU TO GIVE IT 20 PERCENT OF YOUR GRAIN AND IT WILL GO AWAY");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(raltzDrawing, true);
        if (hardModeEnabled) {
        	buffCount = 1;
        }
        textInterface.query(new String[] { "FIGHT", "LISTEN TO THE VOICE IN YOUR HEAD" });
        isDriving = false;
        calamityCount += 1;
      }
      if (textInterface.selected.equals("LISTEN TO THE VOICE IN YOUR HEAD")) {
    	  if (!inTest) {
        clip.stop();
        stuff.play("god", volume);
    	  }
        if (grain >= 21) {
          textInterface.println("YOU GIVE UP 20 PERCENT OF YOUR GRAIN AND SHE RETURNS YOUR CAR");
          textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.println("LOSE 20 PERCENT GRAIN");
          grain -= 20;
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU DONT HAVE ENOGH GRAIN TO APPEASE THE VOICE IN YOUR HEAD SO YOU MUST TAKE YOUR ANGER ISSUES OUT ON THIS CREATURE");
          textInterface.selected = "unimportant";
          textInterface.println(" ");
          textInterface.query(new String[] { "FIGHT" });
        }
      }
      
      if (textInterface.selected.equals("FIGHT")) {
        textInterface.println("THE USELESS RALTZ STOLE YOUR CAR");
        textInterface.println("HEALTH  " + Health + "  RALTZ HEALTH  " + DumbHealth);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("ATTACK")) {
        if (!gasCoating) {
          eventRandom = (RNG.nextInt(9) + 1);
          if (eventRandom <= 3) {
            textInterface.println("YOU USE QUICK ATTACK ... YOU MISSEED BUT QUICKLY");
            textInterface.query(new String[] { "EPIC" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom >= 4) && (eventRandom <= 7)) {
            textInterface.println("YOU USED MEGA PUNCH (ITS ACCUALLY JUST A REGULAR PUNCH BUT WHATEVER)");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
            eventRandom = (RNG.nextInt(20) + 30);
            String damage = Integer.toString(eventRandom);
            textInterface.println("THE RALTZ TOOK " + damage + " DAMAGE");
            raltzHealth -= eventRandom;
            textInterface.query(new String[] { "EPIC" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("YOU USED AROMATHERAPY (BUT YOU SMELL SO BAD IT DOES DAMAGE)");
            eventRandom = (RNG.nextInt(30) + 10);
            String damage = Integer.toString(eventRandom);
            textInterface.println("THE RALTZ TOOK " + damage + " DAMAGE");
            raltzHealth -= eventRandom;
            textInterface.query(new String[] { "EPIC" });
            textInterface.selected = "unimportant";
          }
        }
        else {
          textInterface.println("YOU USED EXPLOSION (YOU CHUCKED A MATCH AT HIM BECAUSE HE IS COVERED IN GAS)");
          eventRandom = (RNG.nextInt(120) + 35);
          gasCoating = false;
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
          String damage = Integer.toString(eventRandom);
          textInterface.println("THE RALTZ TOOK " + damage + " DAMAGE");
          raltzHealth -= eventRandom;
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
      }
      if (textInterface.selected.equals("ITEMS")) {
        textInterface.println("WHICH ITEM DO YOU WANT TO USE");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        
        textInterface.println(" ");
        textInterface.query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
      }
      if (textInterface.selected.equals("5 PERCENT GRAIN")) {
        textInterface.selected = "unimportant";
        if (grain >= 5) {
          textInterface.println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
          playerHealth = 700;
          grain -= 5;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("3 GAS")) {
        textInterface.selected = "unimportant";
        if (gas >= 2.0D) {
        	 GameCode.clip2.stop();
             GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
          textInterface.println("YOU COATED THE RALTZ IN GAS NEXT TIME YOU ATTACK ITS GONNA BE A MUCH MORE POWERFUL ATTACK");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          gas -= 3.0D;
          gasCoating = true;
        } else {
          textInterface.println("BUT THERE WAS NO GAS LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("RADIO")) {
        textInterface.selected = "unimportant";
        if (workingRadio) {
          textInterface.println("YOU TURNED THE RADIO ON AND PLAYED A STRANGE SCREECH THE RALTZ LOST ONE OF ITS BUFFS");
          buffCount -= 1;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT YOU DON'T HAVE A RADIO ANYMORE");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("STATBOOK")) {
        textInterface.selected = "unimportant";
        textInterface.println("USSELESS RALTZ: A ONCE USELESS RALTZ THAT WAS TEMPORED INTO THIS FIGHTING MACHINE BY ONE MASSICISTIC MAN AS A WAY TO INFLICT PAIN UPON HIMSELF");
        textInterface.println("IT DOESEN'T HAVE A LOT OF HEALTH BUT IT HEALS A LOT AND IT BUFFS ITS ATTACK A LOT IF IT GETS THREE BUFFS IT CAN CONSISTANTLY DEAL HALF YOUR HEALTH");
        textInterface.println("AND ITS PRETTY MUCH GG IF THAT HAPPENS SO TAKE IT OUT BEFORE IT DOES THAT (IN HINDSIGHT THE STATBOOK PROBABLY WASEN'T THE BEST USE OF YOUR TURN)");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("BACK")) {
        textInterface.selected = "FIGHT";
      }
      if (textInterface.selected.equals("RUN")) {
        textInterface.println("THERE IS NO RUNNING FROM A RALTZ BATTLE");
        textInterface.selected = "unimportant";
        textInterface.query(new String[] { "BACK" });
      }
      if (textInterface.selected.equals("EPIC")) {
    	  int threshold;
    	  if (hardModeEnabled) {
    		  threshold = 100;
    	  } else {
    		  threshold = 60;
    	  }
    	  String chair = " ";
    	  if (PewDiePieChair) {
    		  eventRandom = RNG.nextInt(3);
         	if (eventRandom == 1) {
         		chair = "BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE";
         	} else {
         		chair = " ";
         	}
    	  }
        eventRandom = (RNG.nextInt(9) + 1);
        if ((raltzHealth <= threshold) || (buffCount >= 3 && raltzHealth > 70) || ((buffCount >= 2) && (eventRandom == 10)) || ((buffCount >= 1) && (eventRandom == 8)) || ((buffCount >= 0) && (eventRandom == 6)) || ((buffCount < 0) && (eventRandom <= 1))) {
          if ((eventRandom <= 3) || (eventRandom == 8) || (eventRandom == 9)) {
            textInterface.println("THE USELESS RALTZ USED EXTRASENSORY");
            textInterface.println(" ");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(60) + 50);
            if (buffCount >= 0) {
              eventRandom *= buffCount;
            } else {
              eventRandom /= buffCount * -1;
            }
            if (buffCount == 0) {
              eventRandom = (RNG.nextInt(60) + 50);
            }
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.selected = "unimportant";
            textInterface.query(new String[] { "OUCH" });
          }
          if (((eventRandom >= 4) && (eventRandom <= 7)) || ((eventRandom == 10) && (usedTrumpCard))) {
            textInterface.println("THE USELESS RALTZ USED GUNK SHOT");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            if (eventRandom == 5) {
              hasPoison = Boolean.valueOf(true);
              textInterface.println("YOU WERE POISONED");
            }
            eventRandom = (RNG.nextInt(40) + 60);
            if (buffCount >= 0) {
              eventRandom *= buffCount;
            } else {
              eventRandom /= buffCount;
            }
            if (buffCount == 0) {
              eventRandom = (RNG.nextInt(40) + 60);
            }
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 10) && (!usedTrumpCard)) {
            textInterface.println("USELESS RALTZ USED TRUMP CARD");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            if (buffCount >= 0) {
              eventRandom *= buffCount;
            } else {
              eventRandom /= buffCount;
            }
            if (buffCount == 0) {
              eventRandom = (RNG.nextInt(150) + 80);
            }
            usedTrumpCard = true;
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
        }
        else if (raltzHealth > 80) {
          textInterface.println("THE USELESS RALTZ USED A X SPECIAL SHE GAINED A BUFF");
          buffCount += 1;
          textInterface.println(" ");
          textInterface.query(new String[] { "OUCH" });
          textInterface.selected = "unimportant";
        }
        else if (raltzHealth >= 30) {
          textInterface.println("THE USELESS RALTZ DRANK A MOO MOO MILK AND RECOVERED 100 HEALTH");
          raltzHealth += 100;
          if (raltzHealth > 160) {
            raltzHealth = 160;
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
        } else {
          textInterface.println("THE USELESS RALTZ USED A FULL RESTORE AND RESTORED ALL HER HEALTH");
          raltzHealth = 160;
          textInterface.println(" ");
          textInterface.query(new String[] { "OUCH" });
          textInterface.selected = "unimportant";
        }
      }
      

      if (textInterface.selected.equals("OUCH")) {
        eventRandom = (RNG.nextInt(9) + 1);
        if (eventRandom <= 3) {
          textInterface.println("THE USELESS RALTZ IS DRINKING A LEMONADE");
        }
        if ((eventRandom <= 7) && (eventRandom >= 4)) {
          textInterface.println("THE USELESS RALTZ TELLS YOU ITS ACCUALLY CALLED IDIUTRALTZ");
        }
        if (eventRandom >= 8) {
          textInterface.println("THE USELESS RALTZ IS COMEING UP WITH MLG PRO STRATS");
        }
        if (hasPoison.booleanValue()) {
          eventRandom = (RNG.nextInt(75) + 25);
          String damage = Integer.toString(eventRandom);
          textInterface.println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
        }
        textInterface.println("HEALTH  " + Health + "  RALTZ HEALTH  " + DumbHealth);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    
    if ((regularEvents) && (((decicion >= 305) && (decicion <= 308) && (hardModeEnabled)) || (((decicion == 237) && (decicion == 236)) && (Karma == 2)) || ((decicion == 7) || ((decicion == 8) && (milesLeft <= 400)) || ((decicion == 9) && (milesLeft <= 200)) || ((decicion == 117) && (milesLeft <= 100)) || ((decicion == 118) && (milesLeft <= 800)) || ((decicion == 119) && (milesLeft <= 200))))) {
      if (isDriving) {
        eventRandom = (RNG.nextInt(9) + 1);
        textInterface.println(" ");
        textInterface.println("AS YOU ARE DRVING YOU SEE THE MOST PECULEAR SIGHT IN THE DISTANCE A MUSHROOM CLOUD THE CLOSER YOU GET THE MORE YOU REALISE IT IS NOT ILLUSION");
        textInterface.println("PILES OF RUBBLE ARE ARE SCATTERED EVERYWHERE AND IT SEEMS INCREADBLY DANGOURS TO KEEP GOING ALTERNATIVLY YOU COULD TAKE A DETOR AWAY FROM THE");
        textInterface.println("WASTELAND BUT IT WOULD REQUIRE MUCH MUCH MORE GAS");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(explosionDrawing, true);
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "KEEP GOING", "TAKE A DETOUR" });
        isDriving = false;
        calamityCount += 1;
      }
      if (textInterface.selected.equals("KEEP GOING")) {
        textInterface.selected = "unimportant";
        if (eventRandom <= 7) {
          textInterface.println("YOU GO THROUGH THE RADIATED AREA AND AFTER A WHILE YOU START TO NOT FEEL SO GOOD (YOU GOT RADIATION POISONING) ALSO");
          textInterface.println("35 PERCENT OF YOUR GRAIN HAS BEEN RADIATED AND IS NOW UNUASABLE");
          textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          hasPoison = Boolean.valueOf(true);
          grain -= 35;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
        if (eventRandom >= 8) {
          textInterface.println("YOU GO THROUGH THE RADIATED AREA BUT ARE FEELING NOT VERY AFFECTED BY IT HOW LUCKY NOT SO LUCKY HOWEVER 35 PERCENT OF YOUR GRAIN HAS BECOME UNASABLE");
          textInterface.println(" ");
          textInterface.println("AT LEAST WE CAN THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          grain -= 35;
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
      }
      if (textInterface.selected.equals("TAKE A DETOUR")) {
        textInterface.println("YOU DECIDE TO PLAY IT SAFE AND STAY AS FAR AWAY FROM THAT DEADLY NUEROTOXIN AS POSSIBLE UNFORCHANITLY THIS TOOK MORE GAS 4 TENTHS MORE GAS PER MILE FOR A WHILE");
        textInterface.selected = "unimportant";
        takeingDetour = true;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 238) && (decicion <= 241) && (Karma == 2)) || ((decicion >= 10) && (decicion <= 25)) || ((decicion >= 120) && (decicion <= 135)))) {
      if (isDriving) {
    	if (!diplomaticImunity) {
        textInterface.println(" ");
        textInterface.println("YOU PASS BY A TOLL BOOTH THIS IS PRETTY STANDARD AND IT ONLY COSTS 50 BUCKS TO PASS BY");
        textInterface.println(" ");
        textInterface.println(" ");
        if (money >= 50) {
          money -= 50;
          textInterface.println("PAY 50 DOLLARS");
        } else {
          textInterface.println("BUT YOU CAN'T EVEN AFFORD THAT SMALL TOLL SO YOUR JUST DECIDE TO PASS BY ANYWAY WHOS GONNA CARE (POLICE WILL NOW GET VIOLET DURRING ENCOUNTERS)");
          isCriminal = true;
        }
    	} else {
    		textInterface.println(" ");
            textInterface.println("YOU PASS BY A TOLL BOOTH BUT WHO CARES YOU HAVE DIPLOMATIC IMMUNITY YOU JUST PASS THROUGH");
            textInterface.println(" ");
            textInterface.println(" ");
    	}
        isDriving = false;
        textInterface.println(" ");
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 303) && (decicion <= 304) && (hardModeEnabled)) || ((decicion >= 244) && (decicion <= 245) && (Karma == 2)) || ((decicion >= 136) && (decicion <= 140)))) {
 
    }
    if ((regularEvents) && ( ((noSleep) && (((decicion >= 141) && (decicion <= 144)) || (decicion == 33) || (decicion == 34) || (decicion == 35) || (decicion == 36) || (decicion == 37) || (decicion == 38) || (decicion == 39) || (decicion == 40) || (decicion == 41) || (decicion == 42) || ((decicion > 315) && (decicion < 342)))))) {
      if (isDriving) {
        textInterface.println(" ");
        textInterface.println("AS YOU ARE DRIVING ALONG YOU START TO FALL ASLEEP WHICH WAS A BAD MOVE BECAUSE YOU AWAKE IN A FIARY INFERNO WHICH USED TO BE YOUR CAR FOR ONLY A MOMENT BEFORE");
        textInterface.println("YOUR GONE");
        textInterface.println(" ");
        textInterface.println("GAME OVER");
        textInterface.println(" ");
        isDriving = false;
        textInterface.query(new String[] { "DARN IT" });
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
    }
    if ((regularEvents) && (((decicion >= 221) && (decicion <= 224) && (Karma == 1)) || ((decicion >= 43) && ((decicion <= 47) || ((decicion <= 50) && (milesLeft > 600)))) || ((decicion >= 152) && ((decicion <= 156) || ((decicion <= 159) && (milesLeft > 600)))))) {
     OddJob.useEvent();
    }
    if ((regularEvents) && (((decicion >= 294) && (decicion <= 297) && (hardModeEnabled)) || ((decicion >= 244) && (decicion <= 247) && (Karma == 2)) || ((decicion >= 56) && ((decicion <= 59) || ((decicion <= 61) && (milesLeft <= 400)) || ((decicion <= 63) && (milesLeft <= 200)))) || ((decicion >= 166) && ((decicion <= 168) || (decicion == 170) || ((decicion <= 172) && (milesLeft <= 400)) || ((decicion <= 174) && (milesLeft <= 200)))))) {
      if ((failedEscape) || (escapedChase)) {
        isDriving = false;
      }
      if (!diplomaticImunity) {
      if (isDriving) {
        textInterface.println("YOU ARE GOING A BIT FAST AND YOU GET PULLED OVER BY A COP FOR A SPEEDING TICKET THE COP INSPECTS YOUR CAR");
        calamityCount += 1;
        if ((isCommunist) || (isCriminal)) {
          if (isCommunist) {
            textInterface.print("HE NOTICES THAT COMMUNIST NOTE IN YOUR CAR AND DECIDES TO TAKE YOU IN OBVIOSLY");
            textInterface.println(" GIVING YOURSELF UP TO THE POLICE IS NOT GOING TO HELP YOU WITH YOUR QUEST SO YOU RUN");
            textInterface.query(new String[] { "SEE YOU LOSERS" });
          } else {
            textInterface.print("HE NOTICES THAT YOU HAVE A CRIMINAL RECORD (YOU DIDEN'T PAY FOR TOLL BOOTHS OR PREVIOUS SPEEDING TICKETS) AND DECIDES TO TAKE YOU IN OBVIOSLY");
            textInterface.println(" GIVING YOURSELF UP TO THE POLICE IS NOT GOING TO HELP YOU WITH YOUR QUEST SO YOU RUN");
            textInterface.query(new String[] { "SEE YOU LOSERS" });
          }
        } else {
          textInterface.print("BUT DOESEN'T FIND ANYTHING PARTICULARLY INCRIMINATING HE ASKS FOR 120 DOLLARS");
          textInterface.println(" FOR SPEEDING TICKET YOU COULD RUN INSTEAD OF PAYING IT BUT IT WOULD BE A VERY BAD IDEA ");
          textInterface.println(" ");
          
          textInterface.println("");
          textInterface.query(new String[] { "PAY HIM LIKE A GOOD CHRISTIAN BOY", "SEE YOU LOSERS" });
        }
      }
      if (textInterface.selected.equals("PAY HIM LIKE A GOOD CHRISTIAN BOY")) {
        if (money >= 250) {
          textInterface.println("HE TAKES THE MONEY THANKS YOU FOR YOUR TIME THEN LEAVES");
          textInterface.println(" ");
          textInterface.println("PAY 250 DOLLARS");
          money -= 250;
          textInterface.println(" ");
          textInterface.println("THANK GOD FOR BUERAUCRACY AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.selected = "unimportant";
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.println("YOU TRY TO PAY HIM BUT YOU DON'T HAVE THE CASH HE GROWS IMPATIANT AND TRYS TO TAKE YOU BACK TO THE POLICE STATION YOU HAVE NO CHOICE LEFT BUT TO RUN");
          textInterface.query(new String[] { "SEE YOU LOSERS" });
          textInterface.selected = "unimportant";
        }
      }
      if (textInterface.selected.equals("SEE YOU LOSERS")) {
        carChase = true;
        textInterface.selected = "unimportant";
      }
      isDriving = false;
      if (carChase && !gameBeat) {
        isDriving = true;
      }
      if (escapedChase) {
        escapedChase = false;
        textInterface.println("YOU FEEL A RUSH AS YOU SEE MORE AND MORE OF THE COPS FALL BEHIND YOU AND EVENTUALLY YOU LOSE ALL OF THEM HOW LUCKY ARE YOU");
        textInterface.println("");
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println("");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        carChase = false;
      }
      if (failedEscape) {
        textInterface.println("YOUR CAR COMES TO A STOP UNABLE TO COUNTINUE THIS POINTLESS BATTLE AGAINST THE POLICE AS YOU GET OUT YOU SEE IT BREAK INTO A BUNCH OF USSLESS SCRAP METAL");
        textInterface.println("YOU EXIT WITH YOUR HANDS UP AS THE COPS HANDCUFF YOU AND PUT YOU INTO THE POLICE CAR YOU SPEND THE NEXT 3 YEARS IN PRISON BY THE TIME YOU ARE LET OUT");
        textInterface.println("ALL THE GRAIN IS RUINED AND YOU HAVE LONG GIVEN UP ON NEW YORK");
        failedEscape = false;
        textInterface.query(new String[] { "DARN IT" });
        carChase = false;
      }
      } else {
    	  textInterface.println("BUT HE SEES YOUR DIPLOMATIC PLATES AND LETS YOU GO HE ALSO GIVES YOU A FREE CUP OF COFFEE");
    	  decicion = 1000000;
    	  textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 290) && (decicion <= 293) && (hardModeEnabled)) || ((decicion >= 248) && (decicion <= 251) && (Karma == 2)) || ((decicion >= 64) && (decicion <= 68)) || ((decicion >= 175) && (decicion <= 179)))) {
      Mechanic.useEvent();
    }
    if ((regularEvents) && ((decicion == 69) || (decicion == 169))) {
      if (isDriving) {
        textInterface.println("YOU GET OUT OF YOUR CAR FOR A BIT FOR SOME FRESH AIR WHEN YOU FIND A POTHOLE ITS ");
        textInterface.println("PRETTY BIG YOU COULD FIX IT IF YOU WANT BUT THERE WOULDEN'T REALLY BE A POINT TO IT");
        textInterface.println(" ");
        textInterface.query(new String[] { "YEAH SAVE THE ENVIROMENT", "AINT NOBODY GOT TIME FOR THAT" });
        isDriving = false;
      }
      if (textInterface.selected.equals("YEAH SAVE THE ENVIROMENT")) {
        textInterface.println("YOU TAKE THE TIME OUT OF YOUR DAY TO FIX THE ENORMUS POTHOLE YOU FEEL GOOD ABOUT YOURSELF");
        textInterface.println("GET GOOD KARMA");
        textInterface.println("YOU THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND THUS YOU MUST GIVE BACK TO AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
        Karma = 1;
      }
      if (textInterface.selected.equals("AINT NOBODY GOT TIME FOR THAT")) {
        textInterface.println("YOU LEAVE KNOWING THAT THE POTHOLE IS STILL THERE LAUGHING AS IT AMUSES YOU EVER SO");
        textInterface.println(" ");
        textInterface.println("GET BAD KARMA (BUT IF YOU GET TO NEW YORK WITHOUT TURRNING OFF THE GAME THERE MAY BE AN EXTRA REWARD IN IT FOR YOU)");
        textInterface.println("PRAY TO GOD FOR SAFTY OF THOSE WHO PASS THE POTHOLE ON THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
        pothole = true;
        Karma = 2;
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 70) && (decicion <= 75)) || ((decicion >= 180) && (decicion <= 185)))) {
      if (isDriving) {
        eventRandom = (RNG.nextInt(8) + 1);
        textInterface.println("AS YOU ARE DRIVEING ALONG THE ROAD YOU SEE A FIGURE WAVEING THIER ARM ITS A HICHIKER PICKING THEM UP COULD BE RISKY BUT IT COULD BE FUN");
        textInterface.println(" ");
        textInterface.println(" ");
        
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "PICK THEM UP", "DRIVE DRIVE DRIVE !!!!" });
        isDriving = false;
      }
      if (textInterface.selected.equals("PICK THEM UP")) {
        if (eventRandom >= 8) {
          textInterface.println("YOU TALK FOR A WHILE WITH THE MAN UNTIL HE DISAPEARS RANDOMLY YOU FIND A NOTE IT READS HA HA I HAVE SABATOGED THE EVIL CAPTALIST FOOD SUPPLY");
          textInterface.println(" ");
          textInterface.println("LOSE 40 PERCENT GRAIN");
          grain -= 40;
          textInterface.println("IN SOVIET RUSSIA GOD THANKS YOU FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.println(" ");
          isCommunist = true;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        }
        if (eventRandom <= 5) {
          textInterface.println("YOU MEET UP WITH THE HITCHIKER AND HE TELLS YOU THAT HE NEEDS YOU TO TAKE HIM TO A PAYPHONE BECAUSE HIS CAR WAS DESTROYIED IN AN ACCIDENT HE ALSO TELLS YOU THAT ");
          textInterface.println("HIS CAR HAD A BIT OF GAS LEFT ON IT AND HE SIPHONED IT OUT HE DOESNENT NEED IT ANYMORE SO HE GIVES IT TO YOU");
          textInterface.selected = "unimportant";
          gas += 25.0D;
          textInterface.println(" ");
          textInterface.println("GAIN 25 GAS UNITS");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
        if ((eventRandom == 6) || (eventRandom == 7)) {
          textInterface.println("AS SOON AS THE HITCHIKER GETS IN YOUR CAR HE STARTS TALKING ABOUT A ISLAND THAT COULD BE YOURS FOR ONLY A SMALL AMOUNT OF MONEY A MONTH");
          textInterface.println("HE DESCRIBES IT FOR A LONG TIME IT SEEMS TO BE ALL HE WANTS TO TALK ABOUT YOU TRY TO CHANGE THE TOPIC BUT HE WONT ALLOW YOU TOO");
          textInterface.println("EVENTUALLY HE TELLS YOU HE IS TESTING OUT A NEW MARKETING TECHNICE AND WONT GET OUT OF YOUR CAR UNTIL YOU BUY ONE YOU EVENTUALLY");
          textInterface.println("YOU YEILD AND BUY A TIMESHARE (SOMETHING GOOD MIGHT HAPPEN IF YOU BEAT THE GAME WITHOUT TURRNING IT OFF FROM NOW ON)");
          textInterface.println(" ");
          hasTimeShare = true;
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/buy BUY BUY!.wav");
          textInterface.selected = "unimportant";
          textInterface.println("THANK GOD FOR ISLANDS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          if (money >= 800) {
            textInterface.println("PAY 800 DOLLARS");
            money -= 800;
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          } else {
            textInterface.println("YOU CAN'T AFFORD IT BUT THE GUY IS NICE AND DECIDEDS TO GIVE IT TO YOU FOR JUST ALL THE MONEY YOU HAVE");
            money = 0;
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
        }
      }
      
      if (textInterface.selected.equals("DRIVE DRIVE DRIVE !!!!")) {
        textInterface.selected = "unimportant";
        textInterface.println("YOU DECIDE NOT TO PICK UP SOME RANDOM STRANGER YOU DON'T KNOW PROBABLY A SMART CHOCE");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 285) && (decicion <= 289) && (hardModeEnabled)) || (((decicion == 253) && (decicion == 254)) && (Karma == 2)) || ((decicion == 76) || ((decicion == 77) && (milesLeft <= 400)) || ((decicion == 78) && (milesLeft <= 200)) || ((decicion == 186) && (milesLeft <= 100)) || ((decicion == 187) && (milesLeft <= 800)) || ((decicion == 188) && (milesLeft <= 200))))) {
      if (isDriving) {
        textInterface.println("AS YOU ARE DRVING BY YOU ARE TERRIFIED TO NOTICE THAT BEHND YOU A ENORMUS VOID IN TIME AND SPACE HAS APPEARD AND IS SUCKING EVERYTHING INTO IT AND YOUR CAR");
        textInterface.println("IS SURE TO BE NEXT THIS SITUATION SEEMS HOPELESS BUT ITS NOT WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        isDriving = false;
        textInterface.renderImage(voidDrawing, true);
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(2.0F, "soundEffects/black hole.wav");
        eventRandom = (RNG.nextInt(11) - 1);
        
        textInterface.println(" ");
        calamityCount += 1;
        textInterface.query(new String[] { "FLOOR IT", "ACCEPT YOUR FATE" });
      }
      if (textInterface.selected.equals("ACCEPT YOUR FATE")) {
        textInterface.println("YOU GIVE UP AND LET YOUR CAR GO TO A HALT AND WHEN IT DOES IT GETS PICKED UP AND STARTS FLYING INTO THE VOID AND");
        if (eventRandom >= 8) {
          textInterface.print("YOUR NOT DEAD YOU WAKE UP BUT EVERYTHING FEELS WIERD SOMEHOW YOU CHECK YOUR GRAIN AND ARE ASTONISHED TO FIND THAT YOU DON'T HAVE THE AMONT YOU HAD BUT THE");
          textInterface.println(" AMOUNT YOU HAD LOST SO FAR NOT ONLY THAT BUT THE MAP SAYS THAT NEW YORK IS THE AMOUNT OF MILES YOU HAVE TRAVELED SO FAR NOT THE AMOUNT IT WAS");
          textInterface.println("AND YOUR GAS TANK HAS EXACTLY 12 UNITS OF GAS IN IT");
          grain = (100 - grain);
          if (grain == 0) {
            grain = 1;
          }
          if (!hardModeEnabled) {
            milesLeft = (1000 - milesLeft);
          } else {
            milesLeft = (1200 - milesLeft);
          }
          if (milesLeft == 0) {
            milesLeft = 1;
          }
          gas = 12.0D;
          textInterface.println(" ");
          textInterface.println("METSYSYAWIHREWOHNESIEDNASLEIBOMOTUAROFDOGKNAHT");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        }
        if (eventRandom <= 7) {
          textInterface.print("YOU SCREAM MORE THAN EVER AS YOU EXPERENCE THE EXCRUCIATING PAIN OF BEING SUCKED INTO THE HOPELESS VOID AND THE EVERYTHING ENDED AND REALITY BECA................");
          textInterface.println(" ");
          textInterface.query(new String[] { "..." });
          textInterface.selected = "unimportant";
        }
      }
      if (textInterface.selected.equals("FLOOR IT")) {
    	  GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/rev.wav");  
        textInterface.println("YOU FLOOR IT AND YOU FIND YOUR NOT MOVEING THE FORCE FROM THE CAR IS MATCHING THE ONE FROM THE VOID YOU KEEP THIS UP FOR HOURS UNTIL");
        textInterface.selected = "unimportant";
        if (gas >= 20.0D) {
          textInterface.print("THE VOID FIZZLES OUT INTO UNEXISTANCE AND YOU ARE FINALLY SAFE OBVIOSLY YOU USED ALOT OF GAS KEEPING THE CAR SUSPENDED LIKE THAT BUT AT LEAST YOUR ALIVE");
          textInterface.println(" ");
          textInterface.println("LOSE 20 GAS UNITS");
          textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          gas -= 20.0D;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.print("YOU SEE YOUR GAS NEEDLE SLIDE MORE AND MORE TO THE LEFT, AND WHEN IT HITS THE E YOU KNOW THERE IS NOTHING LEFT YOU CAN DO");
          textInterface.println(" ");
          textInterface.println("LOSE ALL GAS");
          textInterface.query(new String[] { "ACCEPT YOUR FATE" });
        }
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
      if (textInterface.selected.equals("...")) {
        initialize();
      }
    }
    if ((regularEvents) && (((decicion >= 225) && (decicion <= 228) && (Karma == 1)) || ((decicion >= 80) && ((decicion <= 81) || ((decicion <= 84) && (milesLeft < 500)))) || ((decicion >= 190) && ((decicion <= 191) || ((decicion <= 194) && (milesLeft < 500)))))) {
      if (isDriving) {
        eventRandom = (RNG.nextInt(9) + 1);
        textInterface.println("AS YOU ARE DRIVEING A LARGE SIGN THE SIGN MENTIONS AN EXPERMENT THAT NEEDS TEST SUBJECTS IT SAYS IT PAYS HANDSOMLY IT COULD BE A RISK BUT SEEMS LIKE A GOOD DEAL");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "SIGN ME UP", "YEAH NO" });
        isDriving = false;
      }
      if (textInterface.selected.equals("SIGN ME UP")) {
        textInterface.println("YOU GO INTO A STRAGE LAB THE DOCTOR INJECTS YOU WITH SOME STUFF ( AND HAD YOU START SMOKEING) AFTERWARDS");
        if (eventRandom >= 8) {
          textInterface.println("YOU FEEL FINE SEEMS LIKE THE DRUGS DID NOTHING AFTER ALL BAD NEWS FOR THEM BUT GOOD NEWS FOR YOU THEY PAY YOU WITH 350 DOLLARS ");
          textInterface.println("GAIN 350 DOLLARS");
          money += 350;
          textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        }
        if (eventRandom <= 7) {
          textInterface.print("YOU FEEL VERY SICK BUT THE DOCTOR STILL PAYS WITH 350 DOLLARS");
          textInterface.selected = "unimportant";
          money += 350;
          hasPoison = true;
          textInterface.println(" ");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/hee hee hee.wav");
          textInterface.println("GAIN 350 DOLLARS");
          textInterface.println("GAIN POISON");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
      }
      if (textInterface.selected.equals("YEAH NO")) {
        textInterface.println("YOU DECIDE NOT TO RISK YOUR HEALTH AND WELLNESS FOR SOME EXTRA CASH HOW BORRING");
        textInterface.println(" ");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 280) && (decicion <= 284) && (hardModeEnabled)) || ((decicion >= 255) && (decicion <= 260) && (Karma == 2)) || ((decicion >= 85) && (decicion <= 90)) || ((decicion >= 195) && (decicion <= 200)))) {
      if (isDriving) {
        textInterface.println(" ");
        calamityCount += 1;
        textInterface.println("YOU REALISE YOU HAVE BEEN LOSING MUCH MORE GAS THAN USUAL AFTER A FEW MILES YOU GET OUT TO CHECK AND FIND YOUR GAS CAP IS LOOSE YOU MUST OF WASTED A LOT OF GAS");
        textInterface.println(" ");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
        textInterface.println(" ");
        textInterface.println("LOSE 5 GAS");
        gas -= 5.0D;
        isDriving = false;
        textInterface.println(" ");
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    
    if ((regularEvents) && (((decicion >= 229) && (decicion <= 232) && (Karma == 1)) || ((decicion >= 91) && (decicion <= 96)) || ((decicion >= 201) && (decicion <= 206)))) {
      if (isDriving) {
        textInterface.println("AS YOU ARE DRIVING BY YOU SEE SOME PEOPLE PLAYING BASEBALL YOU ARE VERY INRESTED AND DECICDE YOU SHOULD ASK THEM IF YOU CAN JOIN");
        textInterface.println("YOU ASK THEM IF YOU CAN JOIN AND THEY LAUGH AT YOU STATEING THAT THEY COULD STRIKE YOU OUT WITHOUT YOU EVEN GETTING A HIT");
        textInterface.println("HE WANTS TO MAKE THIS INTRISTING BY PUTTING SOME MONEY ON THE LINE");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(baseballDrawing, true);
        textInterface.println(" ");
        textInterface.query(new String[] { "SORRY DUDE IM BROKE", "50 DOLLARS", "100 DOLLARS", "500 DOLLARS", "1000 DOLLARS" });
        isDriving = false;
      }
      if (textInterface.selected.equals("SORRY DUDE IM BROKE")) {
        textInterface.println("HE ASSUMES THAT SIENCE YOU WERENT WILLING TO PUT MONEY ON IT YOU CANT DO IT AND YOU GO BACK TO YOUR CAR IN SHAME");
        textInterface.println(" ");
        textInterface.selected = "unimportant";
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (textInterface.selected.equals("50 DOLLARS")) {
        amountBet = 50;
      }
      if (textInterface.selected.equals("100 DOLLARS")) {
        amountBet = 100;
      }
      if (textInterface.selected.equals("500 DOLLARS")) {
        amountBet = 500;
      }
      if (textInterface.selected.equals("1000 DOLLARS")) {
        amountBet = 1000;
      }
      if ((canReturn) || (textInterface.selected.equals("50 DOLLARS")) || (textInterface.selected.equals("100 DOLLARS")) || (textInterface.selected.equals("500 DOLLARS")) || (textInterface.selected.equals("1000 DOLLARS"))) {
        textInterface.println("HE STEPS UP TO THE PLATE AND IS ABOUT TO THROW THE BALL AT YOU HE THROWS");
        eventRandom = (RNG.nextInt(9) + 1);
        canReturn = false;
        textInterface.selected = "unimportant";
        if (eventRandom <= 4) {
          textInterface.print("A FASTBALL WHAT DO YOU DO");
          textInterface.println(" ");
          textInterface.query(new String[] { "SWING", "DONT SWING" });
        }
        if ((eventRandom >= 5) && (eventRandom <= 8)) {
          textInterface.print("A CURVEBALL WHAT DO YOU DO");
          textInterface.println(" ");
          textInterface.query(new String[] { "GO FOR IT", "NO NO NO" });
        }
        if ((eventRandom == 9) || (eventRandom == 10)) {
          textInterface.print("SOMETHING YOU HAVE NEVER SEEN BEFORE AS HE ENGULFS THE BALL IN A TORNADO BUT ITS STILL GOING STAITE DOWN THE CENTER WHAT DO YOU DO");
          textInterface.println(" ");
          textInterface.query(new String[] { "YOLO", "HOW ABOUT YONO" });
        }
      }
      eventRandom = (RNG.nextInt(9) + 1);
      if (textInterface.selected.equals("SWING")) {
        textInterface.selected = "unimportant";
        if (eventRandom <= 5) {
          textInterface.println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT OUT OF THE PARK YOU LEAVE A HERO WITH DOUBLE THE AMOUNT YOU BET");
          textInterface.println(" ");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
          textInterface.println("GAIN MONEY");
          money += amountBet;
          textInterface.println(" ");
          Strikes = 0;
          Balls = 0;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
          Strikes += 1;
          textInterface.println(" ");
          canReturn = true;
        }
      }
      if (textInterface.selected.equals("DONT SWING")) {
        textInterface.selected = "unimportant";
        if (eventRandom <= 5) {
          textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
          Strikes += 1;
          textInterface.println(" ");
          canReturn = true;
        } else {
          textInterface.println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
          Balls += 1;
          textInterface.println(" ");
          canReturn = true;
        }
      }
      if (textInterface.selected.equals("GO FOR IT")) {
        textInterface.selected = "unimportant";
        if (eventRandom <= 3) {
          textInterface.println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT OUT OF THE PARK YOU LEAVE A HERO WITH DOUBLE THE AMOUNT YOU BET");
          textInterface.println(" ");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
          textInterface.println("GAIN MONEY");
          money += amountBet;
          textInterface.println(" ");
          Strikes = 0;
          Balls = 0;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
          Strikes += 1;
          textInterface.println(" ");
          canReturn = true;
        }
      }
      if (textInterface.selected.equals("NO NO NO")) {
        textInterface.selected = "unimportant";
        if (eventRandom <= 3) {
          textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
          Strikes += 1;
          textInterface.println(" ");
          canReturn = true;
        } else {
          textInterface.println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
          Balls += 1;
          textInterface.println(" ");
          canReturn = true;
        }
      }
      if (textInterface.selected.equals("HOW ABOUT YONO")) {
        textInterface.selected = "unimportant";
        textInterface.println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
        Strikes += 1;
        textInterface.println(" ");
        canReturn = true;
      }
      if (textInterface.selected.equals("YOLO")) {
        textInterface.selected = "unimportant";
        if ((eventRandom == 1) || (eventRandom == 2)) {
        	 GameCode.clip2.stop();
             GameCode.stuff.playSoundEffect(6.0F, "soundEffects/baseball.wav");
          textInterface.println("YOU MAKE THE MOST AMAZING HOME RUN IN HISTORY HITTING A TWISTER BACK OUT OF THE ");
          textInterface.println("PARK YOU LEAVE WITH DOUBLE THE AMOUNT OF MONEY YOU BET AND A SHOCKED LOOK ON YOUR OPPONITS FACE");
          money += amountBet;
          textInterface.println(" ");
          Strikes = 0;
          Balls = 0;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.println("YOU SWING BUT TO NO AVAIL THE BALL WAS MOVING TO FAST AND YOU COULDEN'T HIT IT LIKE THAT");
          Strikes += 1;
          canReturn = true;
        }
      }
      if (Strikes == 3) {
        textInterface.println("YOU LOST THE BET AND WITH YOUR HEAD HANG LOW IN SHAME GAVE UP YOUR CASH AND RETURNED TO YOUR CAR");
        textInterface.println(" ");
        textInterface.println(" ");
        Strikes = 0;
        if (money >= amountBet) {
          money -= amountBet;
          canReturn = false;
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        } else {
          textInterface.println("OR YOU WOULD HAVE IF YOU COULD OF PAID OFF YOUR DEBT INSTEAD YOU HAD TO STAY THERE FOR A WHILE AND BE THIER BUTLER TO PAY YOUR DEBT AND YOU HAD TO NOT GO TO NEW YORK");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (Balls == 4) {
        textInterface.println("THEY CANT WALK YOU BECASUE ITS NOT A REAL GAME SO INSTEAD THEY JUST RESET YOUR STRIKES ");
        Strikes = 0;
        Balls = 0;
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
      if (textInterface.selected.equals("DARN IT")) {
        initialize();
      }
    }
    if ((regularEvents) && (!homelessFed) && (((decicion >= 97) && (decicion <= 100)) || ((decicion >= 207) && (decicion <= 210)))) {
      if (isDriving) {
        textInterface.println("YOU DRIVE BY A GROUP OF HOMELESS THAT SEEM TO BE IN TROUBLE YOUR CONCERNED ");
        textInterface.println("SO YOU GO CHECK ON THEM AND THEY TELL YOU THEY ARE VERY CLOSE TO DYING OF STARVATION");
        textInterface.println("YOU COULD GIVE THEM SOME OF YOUR GRAIN OR YOU COULD NOT NOT LIKE IT REALLY AFFECTS YOU");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "GIVE THEM FOOD", "WHY WOULD I DO THAT I CANT CLICKBAIT IT IN THE FIFTYS" });
        isDriving = false;
      }
      if (textInterface.selected.equals("GIVE THEM FOOD")) {
        textInterface.println("YOU GIVE THEM SOME FOOD AND FEEL REALLY GOOD ABOUT YOURSELF BUT THATS ABOUT IT");
        textInterface.println("GAIN GOOD KARMA");
        Karma = 1;
        grain -= 30;
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/THANK YOU!.wav");
        textInterface.println("THOSE HOMELESS MUST THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        textInterface.println("LOSE 30 PERCENT OF GRAIN");
        textInterface.println(" ");
        textInterface.query(new String[] { "YOUR A GOOD PERSON" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("WHY WOULD I DO THAT I CANT CLICKBAIT IT IN THE FIFTYS")) {
        textInterface.println("YOU LEAVE AND LAUGH AT THOSE LOSERS FOR NOT HAVEING THE LARGE PORTIAN OF FOOD YOU HAVE");
        Karma = 2;
        textInterface.println(" ");
        textInterface.query(new String[] {"GET BACK ON THE ROAD"});
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
      if (textInterface.selected.equals("YOUR A GOOD PERSON")) {
        textInterface.selected = "unimportant";
        isDriving = true;
        homelessFed = true;
      }
    }
    if ((regularEvents) && (workingRadio) && (((decicion >= 275) && (decicion <= 279) && (hardModeEnabled)) || ((decicion >= 261) && (decicion <= 265) && (Karma == 2)) || ((decicion >= 101) && (decicion <= 105)) || ((decicion >= 211) && (decicion <= 215)))) {
      if (isDriving) {
        textInterface.println("YOU ARE DRIVING AND JAMMING OUT TO YOUR RADIO WHEN SUDDENLY IT GOES OUT ITS ANNONYING BUT NOT A DEALBREAKER ");
        GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/short circut.wav");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.query(new String[] { "FIX IT (COSTS 250 DOLLARS)", "ENDURE WITH WILLPOWER" });
        calamityCount += 1;
        isDriving = false;
      }
      if (textInterface.selected.equals("FIX IT (COSTS 250 DOLLARS)")) {
        if (money >= 250) {
          textInterface.println("YOU TAKE IT TO A RAIDO REPAIR SHOP WITH A 50 DOLLAR BILL THE REPAIR MAN TAKES BOTH THEN GIVES YOU A NEW RADIO AND YOUR ON YOUR WAY");
          textInterface.println("THANK GOD FOR RADIOS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
          textInterface.println("PAY 250 DOLLARS");
          money -= 250;
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU TAKE YOUR RADIO TO A REPAIR SHOP WITH ALL YOUR MONEY YOU HAND IT TO THE MAN BUT ITS NOT ENOUGH HE TURNS TO YOU AND SAYS UR MOM GAY");
          textInterface.println("HE THEN TAKES THE STUFF AND RUNS (YOU THINK ABOUT YOUR MOM GAY IT MAY BE HELPFUL IF YOU REMEMBER THESE WORDS)");
          textInterface.println("LOSE ALL MONEY");
          textInterface.println("LOSE RADIO");
          money = 0;
          workingRadio = false;
          textInterface.selected = "unimportant";
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
      }
      
      if (textInterface.selected.equals("ENDURE WITH WILLPOWER")) {
        textInterface.println("YOU DECIDE ITS NOT WORTH IT FOR A RADIO");
        textInterface.println("LOSE RADIO");
        textInterface.println(" ");
        workingRadio = false;
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
        textInterface.selected = "unimportant";
        isDriving = true;
      }
    }
    if ((regularEvents) && (((decicion >= 271) && (decicion <= 274) && (hardModeEnabled)) || ((decicion >= 266) && (decicion <= 270) && (Karma == 2)) || ((decicion >= 106) && (decicion <= 110)) || ((decicion >= 216) && (decicion <= 220)))) {
      if (playerHealth <= 0) {
        textInterface.println("YOU WERE DEAFEATED THE BANDITS DECIDE TO TIE YOU TO A POLE STEAL YOUR CAR AND ALL YOUR MONEY AND YOU REMAINED TIED TO THAT POLE FOREVER");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        textInterface.query(new String[] { "DARN IT" });
        textInterface.selected = "unimportant";
        playerHealth = 700;
      }
      if (banditHealth <= 0) {
        textInterface.println("YOU DEAFEATED THE BANDITS AFTERWARDS YOU TURN THEM INTO THE POLICE AND RECIVE A REWARD OF 300 DOLLARS");
        textInterface.println("THE COPS ARE SO IMPRESSED THAT THEY CLEAR YOUR NAME OF ANY PRIVIOS CRIMES");
        textInterface.println(" ");
        textInterface.println("GAIN 300 DOLLARS CLEAR RECORD");
        isCriminal = false;
        money += 300;
        radioUsed = 0;
        playerHealth = 700;
        banditHealth = 1500;
        gasCoating = false;
        isCoordinated = true;
        textInterface.selected = "unimportant";
        textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        textInterface.println(" ");
        if (!inTest) {
        clip.stop();
        stuff.play("god", volume);
        }
        textInterface.query(new String[] { "GET BACK ON THE ROAD" });
      }
      if (isDriving) {
        calamityCount += 1;
        textInterface.println("AS YOU ARE DRVING ALONG YOU ARE BLOCKED BY A GROUP OF BANDITS EACH ONE IS CARRING A LARGE SHOTGUN THEY DEMAND YOU PAY THEM 450 DOLLARS TO PASS");
        textInterface.println("450 MIGHT SEEM LIKE A LOT BUT BANDITS LIKE THIS ARE USALLY EXEPTIONALLY CRUEL IF YOU FIGHT BACK");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.println(" ");
        textInterface.renderImage(banditDrawing, true);
        if (!inTest) {
        clip.stop();
        stuff.play("bandits", volume);
        }
        textInterface.println(" ");
        textInterface.query(new String[] { "FIGHT", "PAY 450 DOLLARS" });
        isDriving = false;
      }
      if (textInterface.selected.equals("PAY 450 DOLLARS")) {
        if (money >= 450) {
          textInterface.println("YOU PAY THE BANDITS OFF THEY KEEP TO THIER WORD AND LET YOU PASS");
          textInterface.println("THANK GOD FOR TRUSTWORTHY BANDITS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.println(" ");
          textInterface.println("PAY 450 DOLLARS");
          money -= 450;
          textInterface.println(" ");
          if (!inTest) {
          clip.stop();
          stuff.play("god", volume);
          }
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU DONT HAVE ENOGH MONEY TO PASS THE BANDITS BARRIER SO THEY DECIDE TO TAKE 10 PERCENT OF YOUR GRAIN TO MAKE UP FOR THE EXTRA MONEY");
          textInterface.println("LOSE ALL MONEY");
          textInterface.println("LOSE 10 PERCENT GRAIN");
          money = 0;
          grain -= 10;
          textInterface.selected = "unimportant";
          textInterface.println(" ");
          textInterface.println("THANK GOD FOR NEGOCIATIONS AND THE EISENHOWER HIGHWAY SYSTEM");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
      }
      
      if (textInterface.selected.equals("FIGHT")) {
        textInterface.println("THE BANDITS BLOCK THE WAY ");
        textInterface.println("HEALTH  " + Health + "  BANDIT HEALTH  " + BanditLife);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
      if (textInterface.selected.equals("ATTACK")) {
        eventRandom = (RNG.nextInt(9) + 1);
        if (eventRandom <= 3) {
          textInterface.println("YOU THROW A DEADLY PUNCH ... THEN THE BANDIT MOVES SLIGHTLY TO THE LEFT AND DODGES IT ATTACK FAILED");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
        if ((eventRandom >= 4) && (eventRandom <= 7)) {
          textInterface.println("YOU PICK UP A ROCK AND THROW IT AT THE BANDITS IT DOES SOME DAMAGE");
          eventRandom = (RNG.nextInt(120) + 120);
          String damage = Integer.toString(eventRandom);
          textInterface.println("THE BANDITS TOOK " + damage + " DAMAGE");
          banditHealth -= eventRandom;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
          textInterface.println("YOU RAM THEM WITH THE CAR IT WAS VERY EFFECTIVE");
          eventRandom = (RNG.nextInt(320) + 230);
          String damage = Integer.toString(eventRandom);
          textInterface.println("THE BANDITS TOOK " + damage + " DAMAGE");
          banditHealth -= eventRandom;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          textInterface.selected = "unimportant";
        }
      }
      
      if (textInterface.selected.equals("ITEMS")) {
        textInterface.println("WHICH ITEM DO YOU WANT TO USE");
        textInterface.selected = "unimportant";
        textInterface.println(" ");
        
        textInterface.println(" ");
        textInterface.query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
      }
      if (textInterface.selected.equals("5 PERCENT GRAIN")) {
        textInterface.selected = "unimportant";
        if (grain >= 5) {
          textInterface.println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
          playerHealth = 700;
          grain -= 5;
          textInterface.query(new String[] { "EPIC" });
        } else {
          textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("3 GAS")) {
        textInterface.selected = "unimportant";
        if (gas >= 2.0D) {
          GameCode.clip2.stop();
          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
          textInterface.println("YOU COATED THE BANDITS IN GAS IF THEY TRY AND USE THIER SHOTGUNS IT COULD HAVE SIDEFFECTS");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
          gas -= 3.0D;
          gasCoating = true;
        } else {
          textInterface.println("BUT THERE WAS NO GAS LEFT!");
          textInterface.query(new String[] { "DARN IT" });
        }
      }
      if (textInterface.selected.equals("RADIO")) {
        textInterface.selected = "unimportant";
        if (workingRadio) {
        	if (hardModeEnabled) {
        		if (radioUsed == 2) {
        			textInterface.println("THE BANDITS FINALLY GOT DISTRACTED BY THE NOISE THEY ARE NO LONGER ABLE TO CONCENTRATE");
        			isCoordinated = false;
        			textInterface.println(" ");
        			   textInterface.query(new String[] { "EPIC" });
        		} else {
        		textInterface.println("YOU TURRNED ON THE RADIO THE BANDITS ARE STILL FOCUSED YOU MAY HAVE TO USE THE RADIO AGAIN");
        		radioUsed = radioUsed + 1;
        		 textInterface.query(new String[] { "EPIC" });
        		}
        	} else {
          textInterface.println("YOU TURNED THE RADIO ONTO SOME VERY DISTRACTING MUSIC THE BANDITS ARE NO LONGER ABLE TO CONCENTRATE");
          isCoordinated = false;
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        	}
        } else {
          textInterface.println("BUT YOU DON'T HAVE A RADIO ANYMORE");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("STATBOOK")) {
        textInterface.selected = "unimportant";
        textInterface.println("BANDITS GREEDY PEOPLE WHO TAKE WHAT THEY WANT FROM PASSERBYS THEY HAVE VERY COORDINATED ATTACKS DISTRACT THEM TO MAKE THEM WEAKER");
        textInterface.println(" ");
        textInterface.query(new String[] { "EPIC" });
      }
      if (textInterface.selected.equals("BACK")) {
        textInterface.selected = "FIGHT";
      }
      if (textInterface.selected.equals("RUN")) {
        eventRandom = RNG.nextInt(1);
        if (eventRandom == 0) {
          textInterface.println("YOU RUN FROM THE BANDITS YOU ESCAPE BUT YOU RAN SO FAST YOU DIDEN'T NOTICE YOU HOLD WAS EMPTY AND YOU LOST A LOT OF YOUR GRAIN");
          textInterface.println(" ");
          textInterface.println("LOSE 20 PERCENT GRAIN");
          grain -= 20;
          if (!inTest) {
          clip.stop();
          stuff.play("god", volume);
          }
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          textInterface.selected = "unimportant";
        } else {
          textInterface.println("YOU TRY TO RUN BUT THE BANDITS WONT LET YOU");
          textInterface.println(" ");
          textInterface.query(new String[] { "EPIC" });
        }
      }
      if (textInterface.selected.equals("EPIC")) {
    	  String chair = " ";
    	  if (PewDiePieChair) {
    		  eventRandom = RNG.nextInt(3);
         	if (eventRandom == 1) {
         		chair = "BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE";
         	} else {
         		chair = " ";
         	}
    	  }
        eventRandom = (RNG.nextInt(9) + 1);
        if (isCoordinated) {
          if (eventRandom <= 3) {
            textInterface.println("A BANDIT STARTS ATTEMPTING TO PUNCH YOU YOU ARE ABLE TO BLOCK HIS PUNCHES UNTIL ANOTHER BANDIT COMES FROM BEHIND AND SMACKS YOU WITH A BOARD");
            textInterface.println(" ");
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damage = Integer.toString(0);
                textInterface.println("YOU TOOK" + damage + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(255) + 70);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.selected = "unimportant";
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
          }
          if ((eventRandom >= 4) && (eventRandom <= 7)) {
            textInterface.println("THE BANDITS FORM A FIREING SQUAD AND SHOOT ALL THIER SHOTGUNS AT YOU AT ONCE");
            eventRandom = (RNG.nextInt(350) + 100);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
            String damage = Integer.toString(eventRandom);
            if (gasCoating) {
              textInterface.print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
              textInterface.println("THE BANDITS TOOK " + damage + " DAMAGE");
              banditHealth -= eventRandom;
              gasCoating = false;
            } else {
              textInterface.print("IT WAS VERY EFFECTIVE");
              textInterface.println(chair);
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              }
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("THE BANDITS SURROUND AND TAKLE YOU");
            textInterface.println(chair);
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(120) + 230);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
        } else {
          if (eventRandom <= 3) {
            textInterface.println("A BANDIT STARTS ATTEMPTING TO PUNCH YOU YOU ARE ABLE TO BLOCK HIS PUNCHES PRETTY WELL HE ONLY GETS A FEW HITS IN");
            textInterface.println(chair);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/punch.wav");
            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
          	  String damag = Integer.toString(0);
                textInterface.println("YOU TOOK" + damag + " DAMAGE");
            } else {
            eventRandom = (RNG.nextInt(55) + 70);
            String damage = Integer.toString(eventRandom);
            textInterface.println("YOU TOOK " + damage + " DAMAGE");
            playerHealth -= eventRandom;
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom >= 4) && (eventRandom <= 7)) {
            textInterface.println("A BANDIT TRYS TO SHOOT YOU WITH HIS SHOTGUN");
            eventRandom = (RNG.nextInt(150) + 100);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
            String damage = Integer.toString(eventRandom);
            if (gasCoating) {
              textInterface.print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
              textInterface.println("THE BANDITS TOOK " + damage + " DAMAGE");
              banditHealth -= eventRandom;
              gasCoating = false;
            } else {
              textInterface.print("IT WAS VERY EFFECTIVE ");
              textInterface.println(chair);
              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damag = Integer.toString(0);
                  textInterface.println("YOU TOOK" + damag + " DAMAGE");
              } else {
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
            }
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
            textInterface.println("A BANDIT TRYS TO SHOOT YOU WITH HIS SHOTGUN");
            eventRandom = (RNG.nextInt(120) + 230);
            GameCode.clip2.stop();
            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
            String damage = Integer.toString(eventRandom);
            if (gasCoating) {
              textInterface.print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
              textInterface.println("THE BANDITS TOOK " + damage + " DAMAGE");
              banditHealth -= eventRandom;
              gasCoating = false;
            } else {
              textInterface.print("THE BANDIT MISSED");
            }
            textInterface.println(" ");
            textInterface.query(new String[] { "OUCH" });
            textInterface.selected = "unimportant";
          }
        }
      }
      if (textInterface.selected.equals("OUCH")) {
        eventRandom = (RNG.nextInt(9) + 1);
        if (eventRandom <= 3) {
          textInterface.println("THE BANIDITS ARE MEMEING AROUND ");
        }
        if ((eventRandom <= 7) && (eventRandom >= 4)) {
          textInterface.println("THE BANIDITS LOOK THREATING");
        }
        if (eventRandom >= 8) {
          textInterface.println("THE BANIDITS ARE READY TO TEAR YOU UP ");
        }
        if (hasPoison.booleanValue()) {
          eventRandom = (RNG.nextInt(75) + 25);
          String damage = Integer.toString(eventRandom);
          textInterface.println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
        }
        textInterface.println("HEALTH  " + Health + "  BANDIT HEALTH  " + BanditLife);
        textInterface.println("WHAT DO YOU DO");
        textInterface.println(" ");
        textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
        textInterface.selected = "unimportant";
      }
    }
    if (((hardModeEnabled && decicion == 344 && decicion == 345)|| (Karma == 2 && (decicion == 342 || decicion == 343)) || (decicion >= 346 && decicion < 348)) && regularEvents && !PewDiePieChair) {
    	if (playerHealth <= 0) {
            textInterface.println("GG EZ UTTERS THE KID AS HE QUICKSCOPES YOU OUT OF RELAVENCE A FEW DAYS LATER YOU FIND YOUR CREDIT CARD");
            textInterface.println("HAS BEEN OVERCHARGED DUE TO MULTIPLE CHARGES FOR FORKNIFE SKINS");
            textInterface.selected = "unimportant";
            textInterface.println(" ");
            textInterface.println("THANK GOD FOR FORKNIFE AND THE EISENHOWER HIGHWAY SYSTEM");
            textInterface.println(" ");
            textInterface.query(new String[] { "DARN IT" });
            textInterface.selected = "unimportant";
            playerHealth = 700;
          }
          if (KidHealth <= 0) {
            textInterface.println("");
            textInterface.println("CONGRADULATIONS YOU BEAT UP A CHILD IF THIS GAME WAS ACCURATE YOU WOULD GET A CRIMINAL RECORD FOR THIS ... BUT FROM A GAME DESIGN");
            textInterface.println("PERSPECTIVE IT IS A REALLY BAD IDEA TO PUNISH THE PLAYER FOR BEATING A BOSS SO YOU TAKE THE KIDS CHAIR ITS ABILITY TO BEND DOWN");
            textInterface.println("WILL HELP YOU IN BATTLE");
            PewDiePieChair = true;
            playerHealth = 700;
            KidHealth = 1500;
            textInterface.selected = "unimportant";
            textInterface.println("THANK GOD FOR AUTOMOBIELS AND BAD HISTORICAL ACCURACY IN VIDEO GAMES");
            textInterface.println(" ");
            if (!inTest) {
            clip.stop();
            stuff.play("god", volume);
            }
            textInterface.query(new String[] { "GET BACK ON THE ROAD" });
          }
          if (isDriving) {
            calamityCount += 1;
            isDriving = false;
    		textInterface.println("AS YOU ARE DRVING ALONG THE EISENHOWER HIGHWAY SYSTEM YOU SEE A KID ON THE SIDE OF THE ROAD YOU SLOW DOWN TO TALK WITH HIM");
    		textInterface.println("YOU START SAYING HI BUT BEFORE YOU CAN FINISH THE MAN SCREAMS OUT");
    		textInterface.println("SUBSCRIBE TO PEWDIEPIE (YOU REMEMBER THAT IT MAY BE USEFUL AT SOME POINT)");
    		textInterface.println("THE KID EXPLAINS THAT HE GOT THROWN OUT OF HIS HOUSE FOR SPENDNG $399 ON A CHAIR FROM HIS FAVORATE YOUTUBER HE BEGS YOU TO");
    		textInterface.println("GIVE HIM 399 DOLLARS SO HE CAN PAY FOR THE CHAIR (HE MAY BE VERY ANGRY IF YOU REFUSE)");
    		if (hardModeEnabled) {
    			KidHealth = 2000;
    		}
    		if (!inTest) {
    		clip.stop();
    		stuff.play("road rage", volume);
    		}
            textInterface.query(new String[] { "GIVE HIM 399", "SCREW THIS" });
          }
          if (textInterface.selected.equals("GIVE HIM 399")) {
            if (money >= 399) {
              textInterface.println("YOU PAY THE KID FOR HIS CHAIR HE IMMEDIATELY GETS ON HIS PHONE AND BUYS ANOTHER CHAIR WITH THE MONEY BUT HE LETS YOU PASS");
              textInterface.println("THANK GOD FOR AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
              textInterface.println(" ");
              textInterface.println("PAY 399 DOLLARS");
              money -= 399;
              textInterface.println(" ");
              if (!inTest) {
              clip.stop();
              stuff.play("god", volume);
              }
              textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              textInterface.selected = "unimportant";
            } else {
              textInterface.println("YOU DONT HAVE ENOGH MONEY TO GET HIM THE CHAIR WHICH MAKES HIM EVEN MORE MAD.  HE REFUSES TO LEAVE YOU ALONE UNTIL YOU PAY");
              textInterface.selected = "unimportant";
              textInterface.println(" ");
              textInterface.query(new String[] { "SCREW THIS" });
            }
          }
          
          if (textInterface.selected.equals("SCREW THIS")) {
            textInterface.println("THE RAGEING 9 YEAR OLD SHOUTS REEEEEEEEEE ..... AND THEN HE LIKE ATTACKS OR SOMETHING");
            textInterface.println("HEALTH  " + Health + "  9 YEAR OLD HEALTH  " + KidLife);
            textInterface.println("WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
            textInterface.selected = "unimportant";
          }
          if (textInterface.selected.equals("ATTACK")) {
        	eventRandom = RNG.nextInt(3);
        	String chair;
        	if (eventRandom == 1) {
        		chair = "BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE";
        	} else {
        		chair = " ";
        	}
            eventRandom = (RNG.nextInt(9) + 1);
            if (eventRandom <= 3) {
              textInterface.println("YOU EXPLAIN TO THE RAGEING 9 YEAR OLD THAT WHAT HE IS DOING IS WRONG .... HE DIDEN'T UNDERSTAND");
              textInterface.println("*SIGH* DEFINITLY A PEWDIEPIE SUBSCRIBER");
              textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
            }
            if ((eventRandom >= 4) && (eventRandom <= 7)) {
              textInterface.println("YOU SUBSCRIBE TO T-(CAN'T PUT THERE NAME HERE WITHOUT GETTING SUIED PROBABLY) THE 9 YEAR OLD IS DISGUSTED");
              textInterface.println(" ");
              textInterface.println(chair);
              if(chair.equals("BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damage = Integer.toString(0);
                  textInterface.println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
              } else {
              eventRandom = (RNG.nextInt(60) + 60);
              String damage = Integer.toString(eventRandom);
              textInterface.println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
              KidHealth -= eventRandom;
              }
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
            }
            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
              textInterface.println("YOU ATTEMPT TO PUNCH THE 9 YEAR OLD HE DODGES IT THEN FALLS OVER AND HURTS HIMSELF");
              textInterface.println(" ");
              textInterface.println(chair);
              if(chair.equals("BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
            	  String damage = Integer.toString(0);
                  textInterface.println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
              } else {
              eventRandom = (RNG.nextInt(180) + 20);
              String damage = Integer.toString(eventRandom);
              textInterface.println("THE KID TOOK " + damage + " DAMAGE");
              KidHealth -= eventRandom;
              }
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
              textInterface.selected = "unimportant";
            }
          }
          
          if (textInterface.selected.equals("ITEMS")) {
            textInterface.println("WHICH ITEM DO YOU WANT TO USE");
            textInterface.selected = "unimportant";
            textInterface.println(" ");
            
            textInterface.println(" ");
            textInterface.query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
          }
          if (textInterface.selected.equals("5 PERCENT GRAIN")) {
            textInterface.selected = "unimportant";
            if (grain >= 5) {
              textInterface.println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
              playerHealth = 700;
              grain -= 5;
              textInterface.query(new String[] { "EPIC" });
            } else {
              textInterface.println("BUT THERE WAS NO GRAIN LEFT!");
              textInterface.query(new String[] { "DARN IT" });
            }
          }
          if (textInterface.selected.equals("3 GAS")) {
            textInterface.selected = "unimportant";
            if (gas >= 2.0D) {
            	 GameCode.clip2.stop();
                 GameCode.stuff.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
              textInterface.println("YOU COATED THE 9 YEAR OLD IN GAS IF THERE WAS ANY FIRE AROUND HE WOULD TAKE MAJOR DAMAGE");
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
              gas -= 3.0D;
              gasCoating = true;
            } else {
              textInterface.println("BUT THERE WAS NO GAS LEFT!");
              textInterface.query(new String[] { "DARN IT" });
            }
          }
          if (textInterface.selected.equals("RADIO")) {
            textInterface.selected = "unimportant";
            if (workingRadio) {
            	if (gasCoating) {
              textInterface.println("YOU USE THE RADIO TO PLAY YOUR MIXTAPE THE KID TAKES MASSIVE DAMAGE BECAUSE HE IS COVERED IN GAS AND THE TAPE IS FIRE");
              eventRandom = (RNG.nextInt(300) + 300);
              String damage = Integer.toString(eventRandom);
              textInterface.println("THE KID TOOK " + damage + " DAMAGE");
              KidHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
            	}else {
              textInterface.println("YOU TURN ON THE RADIO YOU HEAR A SWEEDISH MAN SINGING SOME STUPID HEJ HEJ MUMBO JUMBO THE KID SEEMS TO LIKE IT");
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
            	}
            } else {
              textInterface.println("BUT YOU DON'T HAVE A RADIO ANYMORE");
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
            }
          }
          if (textInterface.selected.equals("STATBOOK")) {
            textInterface.selected = "unimportant";
            textInterface.println("RAGEING 9 YEAR OLD A KID WHO IS ON A MISSION FROM STOPPING INDIA FROM OVERTAKEING THE BIGGEST YOUTUBER BUT HE IS STILL A 9 YEAR OLD");
            textInterface.println("SO THAT MEANS LOTS OF DABBING FIDGET SPINNERS AND OTHER THINGS I CAN'T EVEN PUT IN THIS GAME BECAUSE WHEN I TRY TO THE COMPUTER CRINGES SO");
            textInterface.println("MUCH IT CRASHES AND NEVER RUNS AGAIN");
            textInterface.query(new String[] { "EPIC" });
          }
          if (textInterface.selected.equals("BACK")) {
            textInterface.selected = "SCREW THIS";
          }
          if (textInterface.selected.equals("RUN")) {
            eventRandom = RNG.nextInt(2);
            if (eventRandom == 0) {
              textInterface.println("YOU TRY TO RUN FROM THE KID YOU GET AWAY BUT A BIT OF BLOOD IS LEFT ON YOUR TRUCK SEEMS LIKE YOU GOTTA A CRIMINAL RECORD");
              textInterface.println(" ");
              textInterface.println("GET CRIMINAL RECORD");
              isCriminal = true;
              if (!inTest) {
              clip.stop();
              stuff.play("god", volume);
              }
              textInterface.query(new String[] { "GET BACK ON THE ROAD" });
              textInterface.selected = "unimportant";
            } else {
              textInterface.println("YOU TRY TO RUN BUT THE KID QUICKSCOPES YOU LIKE THE TRUE SCRUB YOU ARE");
              eventRandom = (RNG.nextInt(70) + 40);
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOU TOOK " + damage + " DAMAGE");
              playerHealth -= eventRandom;
              textInterface.println(" ");
              textInterface.query(new String[] { "EPIC" });
            }
          }
          if (textInterface.selected.equals("EPIC")) {
            eventRandom = (RNG.nextInt(9) + 1);
              if (eventRandom <= 3) {
                textInterface.println("THE RAGEING 9 YEAR OLD DOES A SICK DAB RIGHT ON YOUR FACE IT KNOCKS YOU OUT OF THE PARK");
                eventRandom = (RNG.nextInt(180) + 70);
                String damage = Integer.toString(eventRandom);
                textInterface.println("YOU TOOK " + damage + " DAMAGE");
                playerHealth -= eventRandom;
                textInterface.println(" ");
                textInterface.query(new String[] { "OUCH" });
                textInterface.selected = "unimportant";
              }
              if ((eventRandom >= 4) && (eventRandom <= 7)) {
                textInterface.println("THE RAGEING 9 YEAR OLD DRINKS A CAN OF MOUNTAIN LIGHTNING YOU DIE OF JEALOUSY ... WELL MAYBE NOT DIE BUT TAKE DAMAGE I GUESS");
                eventRandom = (RNG.nextInt(60) + 100);
                String damage = Integer.toString(eventRandom);
                textInterface.print("IT WAS VERY EFFECTIVE ");
                textInterface.println("YOU TOOK " + damage + " DAMAGE");
                playerHealth -= eventRandom;
                textInterface.println(" ");
                textInterface.query(new String[] { "OUCH" });
                textInterface.selected = "unimportant";
              }
              if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
                textInterface.println("THE RAGEING 9 YEAR OLD SCREAMES THATS RIGHT GET NOSCOPED GET NOSCOPED YOU ARE CONFUSED CAUSE THERE ARE NO GUNS AROUND MUCH LESS");
                textInterface.println("SCOPES HE THEN PUNCHES YOU");
                eventRandom = (RNG.nextInt(60) + 40);
                String damage = Integer.toString(eventRandom);
                textInterface.print("IT WAS VERY EFFECTIVE ");
                textInterface.println("YOU TOOK " + damage + " DAMAGE");
                playerHealth -= eventRandom;
                textInterface.println(" ");
                textInterface.query(new String[] { "OUCH" });
                textInterface.selected = "unimportant";
              }
            }
          if (textInterface.selected.equals("OUCH")) {
            eventRandom = (RNG.nextInt(9) + 1);
            if (eventRandom <= 3) {
              textInterface.println("THE RAGEING 9 YEAR OLD IS JAMMING OUT TO HIS THEME MUSIC (HE DOESEN'T LIKE IT BUT IT HAPPY HE FINALLY HAS IT)");
            }
            if ((eventRandom <= 7) && (eventRandom >= 4)) {
              textInterface.println("THE RAGEING 9 YEAR OLD JUST REMEMBER THIS TAKES PLACE IN THE FIFTYS");
            }
            if (eventRandom >= 8) {
              textInterface.println("THE RAGEING 9 YEAR OLD PUTS ON SOME VLOGGER MERCH");
            }
            if (hasPoison.booleanValue()) {
              eventRandom = (RNG.nextInt(75) + 25);
              String damage = Integer.toString(eventRandom);
              textInterface.println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
            }
            textInterface.println("HEALTH  " + Health + "  9 YEAR OLD HEALTH  " + KidLife);
            textInterface.println("WHAT DO YOU DO");
            textInterface.println(" ");
            textInterface.query(new String[] { "ATTACK", "ITEMS", "RUN" });
            textInterface.selected = "unimportant";
          }
    }
    if ((decicion > 358) && (decicion < maxDecision) && (customEventsEnabled)) {
      customEvent();
    }
    if (textInterface.selected.equals("DARN IT")) {
      initialize();
    }
    if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
      textInterface.selected = "unimportant";
      isDriving = true;
    }
   }
  
  public void customEvent() {
    int lowestnumber = 358;
    int numberInQuestion = 0;
    while (!urGay) {
      numberInQuestion++;
      try {
        if ((decicion > lowestnumber) && (decicion <= lowestnumber + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(numberInQuestion) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1)))) {
          urGay = true;
          loadedCustomEvent = numberInQuestion;
          
        } else {
          lowestnumber += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(numberInQuestion) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1));
        }
      } catch (IOException e) {
    	  System.out.println("debug");
        if (numberInQuestion == fileNumber) {
          decicion = 1000000000;
        }
      }
    }
    if (isDriving) {
      try {
        if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).length() > 155) {
          int begining = 0;
          while (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining, begining + 154) != null) {
            textInterface.println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining, begining + 154));
            begining += 154;
          }
          textInterface.println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0)).substring(begining - 154));
          textInterface.println(" ");
        } else {
          textInterface.println((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(0));
          textInterface.println(" ");
        }
        String[] optionsArray = new String[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))];
        int arrayIndex = 0;
        int cyclethingy = 2;
        int[] optionPlaces = new int[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))];
        while (arrayIndex != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))) {
          cyclethingy++;
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(cyclethingy)).equals("option")) {
            optionsArray[arrayIndex] = ((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(cyclethingy + 1));
            optionPlaces[arrayIndex] = (cyclethingy + 1);
            arrayIndex++;
          }
        }
        textInterface.query(optionsArray);
        isDriving = false;
        legitnessArray = optionsArray;
        trueOptions = optionPlaces;
      } catch (IOException e) {
        decicion = 100000000;
      }
    }
    int legitIndex = 0;
    try {
      while (legitIndex != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(2))) {
        if ((textInterface.selected.equals(Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(trueOptions[legitIndex]))) && (getKappyed)) {
          theMagicNumber = trueOptions[legitIndex];
          weDidIt = true;
        }
        legitIndex++;
      }
      
      if (weDidIt) {
        eventRandom = (RNG.nextInt(99) + 1);
        int legitNumber = 0;
        int evenLegiterNumber = theMagicNumber + 1;
        int[] legitNumbers = new int[Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(theMagicNumber + 1))];
        while (legitNumber != Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(theMagicNumber + 1))) {
          evenLegiterNumber++;
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(evenLegiterNumber)).equals("branch")) {
            legitNumbers[legitNumber] = (evenLegiterNumber + 2);
            legitNumber++;
          } }
        int whatImLookingFor;
        if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0]))) {
          if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1]))){
            if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[2]))) {
              if (eventRandom > Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[0])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[1])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[2])) + Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[3]))) {
                whatImLookingFor = 4;
              } else {
                whatImLookingFor = 3;
              }
            } else {
              whatImLookingFor = 2;
            }
          } else {
            whatImLookingFor = 1;
          }
        } else {
          whatImLookingFor = 0;
        }
        if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).length() > 155) {
          int begining = 0;
          while (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining, begining + 154) != null) {
            textInterface.println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining, begining + 154));
            begining += 154;
          }
          textInterface.println(((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1)).substring(begining - 154));
          textInterface.println(" ");
        } else {
          textInterface.println((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] - 1));
          textInterface.println(" ");
        }
        boolean consequencesStillGoingOn = true;
        boolean urDead = false;
        while (consequencesStillGoingOn) {
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("cash")) {
            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
              money += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            } else {
              money -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("gas")) {
            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
              gas += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            } else {
              gas -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("grain")) {
            if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("positive")) {
              grain += Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            } else {
              grain -= Integer.parseInt((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 3));
              try {
                if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 4)).equals("AND")) {
                  legitNumbers[whatImLookingFor] += 4;
                } else {
                  consequencesStillGoingOn = false;
                }
              } catch (IndexOutOfBoundsException e) {
                consequencesStillGoingOn = false;
              }
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("good karma")) {
            Karma = 1;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("bad karma")) {
            Karma = 2;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("death")) {
            urDead = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("marsh-an tech")) {
            martianTech = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("amulet coin")) {
            amuletCoin = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("energized")) {
            hotel = -120;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("NO SLEEP")) {
            noSleep = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("criminal")) {
            isCriminal = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("comunist")) {
            isCommunist = true;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("poisoned")) {
            hasPoison = Boolean.valueOf(true);
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("cure poison")) {
            hasPoison = Boolean.valueOf(false);
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
          if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 1)).equals("clear record")) {
            isCommunist = false;
            isCriminal = false;
            try {
              if (((String)Files.readAllLines(Paths.get(AbsolutePath.replace(".", "") + "custom Events/Custom Event " + Integer.toString(loadedCustomEvent) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(legitNumbers[whatImLookingFor] + 2)).equals("AND")) {
                legitNumbers[whatImLookingFor] += 2;
              } else {
                consequencesStillGoingOn = false;
              }
            } catch (IndexOutOfBoundsException e) {
              consequencesStillGoingOn = false;
            }
          }
        }
        if (urDead) {
          textInterface.println(" ");
          textInterface.println(" ");
          textInterface.query(new String[] { "DANG IT" });
        } else {
          textInterface.println(" ");
          textInterface.println(" ");
          textInterface.query(new String[] { "GET BACK ON THE ROAD" });
        }
        weDidIt = false;
        getKappyed = false;
      	}
    } catch (IOException e) {
      decicion = 100000000;
    }
    if (textInterface.selected.equals("GET BACK ON THE ROAD")) {
      isDriving = true;
      urGay = false;
      getKappyed = true;
    }
    if (textInterface.selected.equals("DANG IT")) {
      initialize();
    }
  }
  public static TextInterface getTextInterface() {
	  return textInterface;
  }
}