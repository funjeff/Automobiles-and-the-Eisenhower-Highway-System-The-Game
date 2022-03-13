package obsolite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import location.Location;
import location.TitleScreen;
import main.GameCode;
import resources.Util;

public class FunFacts extends Location {
	public FunFacts() {
		super(true);
	}
	private static int systemFactNumber = 1;
	  private static int gameFactNumber = 1;
	  private static int jeffreyFactNumber = 1;
	  @Override
	  public void eventStart () {
		  GameCode.getTextInterface().selected = "unimportant";
	      GameCode.getTextInterface().println("WHAT WOULD YOU LIKE TO KNOW ABOUT");
	      GameCode.getTextInterface().println(" ");
	      try {
	        FileReader fr = new FileReader("./SavesDir/Fun Facts.txt");
	        BufferedReader br = new BufferedReader(fr);
	        if (br.readLine().equals("true")) {
	          GameCode.getTextInterface().query(new String[] { "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "ABOUT THE GAME", "ABOUT JEFFREY MARSH", "ABOUT NOTHING" });
	        }
	        br.close();
	      } catch (IOException e) {
	        GameCode.getTextInterface().query(new String[] { "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "ABOUT THE GAME", "ABOUT NOTHING" });
	      }
	  }
	  @Override
	public void runEventCode () {
		 super.runEventCode();
		    if (GameCode.getTextInterface().selected.equals("ABOUT NOTHING")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
		    if (GameCode.getTextInterface().selected.equals("ABOUT JEFFREY MARSH")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      if (jeffreyFactNumber == 14) {
		        jeffreyFactNumber = 1;
		      }
		      if (jeffreyFactNumber == 9) {
		        GameCode.getTextInterface().println("IM JUST SO HAPPY THAT SOMEONE NOT ONLY DID EVERYTHING TO UNLOCK THIS DIOLOG, BUT ACCUALLY BOTHERED TO LISTED TO MY");
		        GameCode.getTextInterface().println("BORRING RAMBLINGS YOU KNOW WHAT JUST FOR THAT YOU GET A FREE SOUND TEST OPTION");
		        GameCode.getTextInterface().println("FEEL FREE TO CONTACT ME IF YOU HAVE ANY FEEBACK ON THE GAME");
		        Util.writeFile("soundTest.txt");
		        GameCode.getTextInterface().println("THATS ALL I GOT FOR THIS CATAGORY ... SORRY WOULD YOU LIKE TO START OVER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 8) {
		        GameCode.getTextInterface().println("I MADE AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM THE GAME!!");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 7) {
		        GameCode.getTextInterface().println("IM RE-WRITING SOME OF THESE FUN FACTS BECAUSE A COUPLE OF THEM HAVE BECOME FALSE SEINCE I WROTE THEM");
		        GameCode.getTextInterface().println(" AND A LOT OF THEM ARE MUCH MORE CRINGE THEN I THOUGHT THEY WERE SO IM GLAD I WENT BACK FOR EDITS");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 6) {
		        GameCode.getTextInterface().println("I JUST MADE UP ONE OF THE FACTS UNDER THE AUTOMOBIELS AND THE EISENHOWER HYWAY FACTS SEGMENT TO SEE IF ANYONE WOULD NOTICE");
		        GameCode.getTextInterface().println("EVEN THE ONES THAT AREN'T MADE UP ARE VERY LIGHTLY FACT CHECKED AND VERY WELL COULD HAVE BEEN FALSIFYED");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 5) {
		        GameCode.getTextInterface().println("I LOVE WEARING HATS BEANIES FEDORAS BASEBALL CAPS EVEN A SHRIVLED UP LITTLE KNOME HAT JUST ANY HAT YOU GIVE ME ILL WEAR IT");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 4) {
		        GameCode.getTextInterface().println("MY FREINDS AND I HAVE BEEN WORKING ON ANOTHER GAME AND ITS GONNA BE FREAKIN LEGIT SO IF YOU THOUGHT THIS ONE WAS");
		        GameCode.getTextInterface().println("ALRIGHT GET READY FOR A GOOD ONE WHEN WE GET GOING ON THAT ONE");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 3) {
		        GameCode.getTextInterface().println("I WATCH A LOT OF SIMPLEFILPS");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 2) {
		        GameCode.getTextInterface().println("I NEVER DID ANYTHING WITH MUSIC EVER UNTIL THIS GAME (UNLESS YOU COUNT 5TH GRADE BAND AND SINGING ALL STAR ON YOUTUBE)");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 1) {
		        GameCode.getTextInterface().println("IM SUPER COOL HECK YEAH");
		        GameCode.getTextInterface().println("NAH BUT, IN ALL SERIOSNESS");
		        GameCode.getTextInterface().println("IM AN AMETURE GAME DEVELOPER I WANT TO BE A BIG SHOT GAME DEVELOPER AT SOME POINT BUT THAT WILL PROBABLY NEVER HAPPEN I CAN'T");
		        GameCode.getTextInterface().println("FOCUS ON ANYTHING  LIKE I REMEMBER AT LEAST 24 DIFFRENT OCCASIONS WHERE I SAID TODAY IS GONNA BE THE DAY THAT I FINNALY FINISH");
		        GameCode.getTextInterface().println("AUTOMOBILES AND THE EISNEHOWER HIGHWAY SYSTEM THE GAME THEN I WENT ON TO DO LITTERALLY NOTHING FOR THE REST OF THE DAY");
		        jeffreyFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("WOW GO ON JEFFREY")) {
		      GameCode.getTextInterface().println(" ");
		      GameCode.getTextInterface().selected = "ABOUT JEFFREY MARSH";
		    }
		    if (GameCode.getTextInterface().selected.equals("UGG CRINGE SO SO CRINGE")) {
			      GameCode.setCurrentEvent(new TitleScreen());
		    }
		    
		    if (GameCode.getTextInterface().selected.equals("ABOUT THE GAME")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      if (gameFactNumber == 10) {
		        gameFactNumber = 1;
		      }
		      if (gameFactNumber == 9) {
		        GameCode.getTextInterface().println("THE POTHOLE EVENT ONLY APPEARS ON AN RNG ROLL OF 69 OR 169");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 8) {
		        GameCode.getTextInterface().println("THE FINAL BOSS FIGHT TOOK ABOUT THE SAME AMOUNT OF TIME TO MAKE AS EVERYTHING ELSE IN THE GAME COMBINED");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 7) {
		        GameCode.getTextInterface().println("BEFORE I ADDED THE CUSTOM EVENTS WHEN THE RNG ROLL WASEN'T IN USE IT DEFULTED TO 420 I HAD TO CHANGE IT TO AVOID ACCEDENTLY TRIGGERING CUSTOM EVENTS");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 6) {
		        GameCode.getTextInterface().println("THE GAME IS IN ALL CAPS BECASUE IM TOO LAZY TO MAKE SPRITES FOR THE LOWERCASE LETTERS FOR EVERYTHING");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 5) {
		        GameCode.getTextInterface().println("THIS GAME WAS ORIGINALLY CREATED AS A SCHOOL PROJECT ABOUT THE FIFTYS I THOUGHT IT WAS FUNNY THAT EVERYBODY WAS FIGHTING OVER THE HOT TOPICS LIKE");
		        GameCode.getTextInterface().println("WOMENS RIGHTS AND THE SPACE RACE BUT WHEN AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM WAS CALLED THE ROOM WAS SILENT FOR A GOOD 15 SECONDS AND I");
		        GameCode.getTextInterface().println("DID WHAT ANY SAIN PERSON WOULD DO AND SCREAMED DIBS AT THE TOP OF MY LUNGS I DIDEN'T REALLY WANT AUTOMOBILES AND THE EISENHOWER SYSTEM BUT IT WAS");
		        GameCode.getTextInterface().println("WORTH IT, AFTER LIKE 30 MINUTES OF BRAINSTORMING I CAME UP WITH THE IDEA FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM THE GAME !!! WHEN IT CAME");
		        GameCode.getTextInterface().println("TIME TO TURN IN THE PROJECTS I ONLY HAD A BARE BONES VERSION OF WHAT I HAVE NOW BUT IT WAS STILL THE HIGHEST RATED PROJECT IN THE CLASS SO I WONDERED");
		        GameCode.getTextInterface().println("HOW FAR I COULD TAKE THIS AND HERE I AM MANY YEARS LATER FINALLY FINISHING IT");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 4) {
		        GameCode.getTextInterface().println("WHEN I WAS WRITING THE CODE FOR THE CUSTOM EVENTS I GOT A LITTLE LAZY WITH THE VARIABLE NAMEING AND IT LED TO THE GREATEST LINE OF CODE EVER WRITEN");
		        GameCode.getTextInterface().println("LEGITNUMBERS [LEGITNUMBER] = EVENLEGITERNUMBER + 2");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 3) {
		        GameCode.getTextInterface().println("THE MARSH-ANS THEME WAS THE FIRST SONG I EVER MADE THE FIRST PLAN WAS TO MAKE IT FOR THE MARSH-ANS THEME BUT THEN I THOUGHT TO MAKE IT FOR ALL THE BOSSES");
		        GameCode.getTextInterface().println("HOWEVER WHEN I WAS TRYING TO MAKE MUSIC FOR THE TITLE SCREEN AND MAIN GAMEPLAY I KEPT ACCEDENTLY MAKEING BOSS SONGS SO I WENT BACK TO THE ORIGINAL FOR THE THEME");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 2) {
		        GameCode.getTextInterface().println("I DON'T KNOW IF YOU GUYS NOTICED BUT WHAT I TRIED TO DO WITH THIS GAME IS WAS SET IT UP SO THERE WAS REALISTIC EVENTS MIXED INTO THE FANTASY THAT WAY");
		        GameCode.getTextInterface().println("YOU START OF LIKE OH DARN I GOTTA PAY A TOLL OH .... I AM RUNNING FROM THE POLICE BECAUE IM A COMUNIST ..... WAIT ALLIENS!!!!!");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 1) {
		        GameCode.getTextInterface().println("THESE FUN FACTS ARE ACUALLY DISPLAYED IN REVERSE ORDER OF THE ORDER I WRIGHT THEM SO I HAVE TO STRECH MORE FOR THE ONES AT THE BEGGINING AND LESS AT THE END");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("I WOULD VERY MUCH ENJOY THAT")) {
		      GameCode.getTextInterface().println(" ");
		      GameCode.getTextInterface().selected = "ABOUT THE GAME";
		    }
		    if (GameCode.getTextInterface().selected.equals("........PLEASE NO")) {
			      GameCode.setCurrentEvent(new TitleScreen());
		    }
		    if (GameCode.getTextInterface().selected.equals("ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      if (systemFactNumber == 14) {
		        systemFactNumber = 1;
		      }
		      if (systemFactNumber == 13) {
		        GameCode.getTextInterface().println("THE EISENHOWER HIGHWAY SYSTEM WAS ORIGINALLY DESIGNED AS A DEFENCE SYSTEM TO EVACUATE PEOPLE FROM A NUCLEAR ATTACK");
		        GameCode.getTextInterface().println("THATS ALL I GOT FOR THIS CATAGORY ... SORRY WOULD YOU LIKE TO START OVER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 12) {
		        GameCode.getTextInterface().println("ORIGNALLY CORPERATIONS WERE RESPONSIBLE FOR BUILDING PUBLIC TRANSPORT (FOR A FEE OF COURSE) BUT THAT ALL CHANGED WITH EISENHOWER");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 11) {
		        GameCode.getTextInterface().println("THE NEW DEAL WAS A EXEPTION TO HAVEING CORPERATIONS BUILD ROADS SO IT COULD CREATE JOBS FOR PWA AND WPA WORKERS");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 10) {
		        GameCode.getTextInterface().println("THE FEDERAL HIGHWAY ACT ALLOCATEED 26 BILLION DOLLARS TO THE CONSTRUCTION OF 41,00 MILE NETWORK OF HIGHWAYS");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 9) {
		        GameCode.getTextInterface().println("MOST OF THE FUNDING FOR THE HIGHWAYS CAME FROM A NEW GAS TAX DURRING THIER CONSTRUCTION");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 8) {
		        GameCode.getTextInterface().println("EISENHOWER MET WITH 3 DIFFRENT LARGE CONSTRUCTION COMPANYS BEFORE DECIDING TO JUST BUILD IT HIMSELF");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 7) {
		        GameCode.getTextInterface().println("EVEN THOUGH THERE ARE 6 TIMES AS MANY PEOPLE DRIVING TODAY AS IN THE 50'S THE NUMBER OF CAR CRASH RELATED DEATHS HAS REMAINED ROUGHLY THE SAME");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 6) {
		        GameCode.getTextInterface().println("THE SEAT BELT AND PADDED DASHBOARD BECAME POPULAR IN CARS IN THE 50'S AND 60'S");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 5) {
		        GameCode.getTextInterface().println("THE CHARGE FOR YOUR FIRST CASE OF POLICE CHASE IN ILLNOIES IS 1 YEAR 2,500 AND 6 MONTHS OF LOSEING YOU LICENCE FOR NON AGGRIVATED");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 4) {
		        GameCode.getTextInterface().println("MECHANICS IN THE 1950'S ONLY GOT PAID 50 TO 75 CENTS AND HOUR");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 3) {
		        GameCode.getTextInterface().println("CERIAL KILLER BILLY COOK WAS NATORIUS FOR MURDERING PEOPLE THAT PICKED HIM UP WHEN HITCHHIKEING");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 2) {
		        GameCode.getTextInterface().println("THE INDUSTRY CLOSING PERCENTAGE FOR TIMESHARES IS 12.8 PERCENT");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 1) {
		        GameCode.getTextInterface().println("FUN FACT THE FIRST CLINICAL TRIAL TO TEST THE CORILATION BETWEEN SMOKEING AND LUNG CANCER TOOK PLACE IN 1950");
		        GameCode.getTextInterface().println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.getTextInterface().query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		    }
		    
		    if (GameCode.getTextInterface().selected.equals("I WOULD LIKE NOTHING BETTER")) {
		      GameCode.getTextInterface().println(" ");
		      GameCode.getTextInterface().selected = "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM";
		    }
		    if (GameCode.getTextInterface().selected.equals("I WOULD LITTERALLY RATHER DIE")) {
		      GameCode.setCurrentEvent(new TitleScreen());
		    }
	}
}
