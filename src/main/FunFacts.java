package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FunFacts {
	private static int systemFactNumber = 1;
	  private static int gameFactNumber = 1;
	  private static int jeffreyFactNumber = 1;
	public static void readFacts () {
		if (GameCode.textInterface.selected.equals("FUN FACTS")) {
		      GameCode.textInterface.selected = "unimportant";
		      GameCode.textInterface.println("WHAT WOULD YOU LIKE TO KNOW ABOUT");
		      GameCode.textInterface.println(" ");
		      try {
		        FileReader fr = new FileReader("./SavesDir/Fun Facts.txt");
		        BufferedReader br = new BufferedReader(fr);
		        if (br.readLine().equals("true")) {
		          GameCode.textInterface.query(new String[] { "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "ABOUT THE GAME", "ABOUT JEFFREY MARSH", "ABOUT NOTHING" });
		        }
		        br.close();
		      } catch (IOException e) {
		        GameCode.textInterface.query(new String[] { "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "ABOUT THE GAME", "ABOUT NOTHING" });
		      }
		    }
		    if (GameCode.textInterface.selected.equals("ABOUT NOTHING")) {
		      GameCode.textInterface.selected = "unimportant";
		      GameCode.textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
		    if (GameCode.textInterface.selected.equals("ABOUT JEFFREY MARSH")) {
		      GameCode.textInterface.selected = "unimportant";
		      if (jeffreyFactNumber == 14) {
		        jeffreyFactNumber = 1;
		      }
		      if (jeffreyFactNumber == 13) {
		        GameCode.textInterface.println("IM JUST SO HAPPY THAT SOMEONE NOT ONLY DID EVERYTHING TO UNLOCK THIS DIOLOG, BUT ACCUALLY BOTHERED TO LISTED TO MY");
		        GameCode.textInterface.println("BORRING RAMBLINGS I JUST WISH THERE WAS SOME REWARD I HAD LEFT TO GIVE YOU ... I MEAN I GUESS YOU CAN STILL MAKE CUSTOM");
		        GameCode.textInterface.println("EVENTS OH YOU KNOW WHAT DUDE I LIKE YOU IF YOU MAKE A CUSTOM EVENT SEND IT TO MY EMAIL THEWAFFLEGAMERS532@GMAIL.COM");
		        GameCode.textInterface.println("IF I GET ENOGUH CUSTOM EVENT SUBMISSIONS ILL DO A VIDEO ON MY CHANNEL WHERE I PLAY EVERYBODYS CUSTOM EVENTS SO HAVE FUN WITH THAT");
		        GameCode.textInterface.println("THATS ALL I GOT FOR THIS CATAGORY ... SORRY WOULD YOU LIKE TO START OVER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 12) {
		        GameCode.textInterface.println("I MADE AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM THE GAME!!");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 11) {
		        GameCode.textInterface.println("IM RE-WRITING SOME OF THESE FUN FACTS BECAUSE A COUPLE OF THEM HAVE BECOME FALSE SEINCE I WROTE THEM");
		        GameCode.textInterface.println(" AND A LOT OF THEM ARE MUCH MORE CRINGE THEN I THOUGHT THEY WERE SO IM GLAD I WENT BACK FOR EDITS");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 10) {
		        GameCode.textInterface.println("I HAVE BEEN WORKING ON THIS GAME SIENCE 2 PM AND ITS 8 AM (TO BE FAIR I DID TAKE A BREAK FROM 10-1 TO PLAY JACKBOX GAMES");
		        GameCode.textInterface.println("WITH MY FRIENDS)");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 9) {
		        GameCode.textInterface.println("THE EVENT I USED TO TEST THE CUSTOM EVENTS WAS A STRANGE MAN APROCHES YOU AND TELLS YOU YOUR MOM IS GAY AND YOU HAVE THE");
		        GameCode.textInterface.println("OPTIONS OF GOING HOME AND CRYING PUNCHING HIM AND SAYING NO U IF YOU PUNCH YOU COULD BEAT HIM UP AND TAKE HIS SUPPLYS OR");
		        GameCode.textInterface.println("HE COULD TURN OUT TO BE A KARATE MASTER AND BEAT YOU UP IF YOU GO HOME A YOUTUBER COULD RAIN 1 DOLLAR BILLS ON YOU OR YOUR");
		        GameCode.textInterface.println("MOM CAN TELL YOU THAT SHE IS GAY BUT IF YOU PICK NO U THAN ITS JUST A INSTANT KILL I STILL HAVE THE CUSTOME EVENT FILE IF");
		        GameCode.textInterface.println("ANYONE IS INTRESTED I CAN E-MAIL IT");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 8) {
		        GameCode.textInterface.println("I BEAT THE ENTIRETY OF PLACKMAN HEARTSHINYYELLOW WITH THE USSLESS RALTZ CHALLANGE ON MEANING I COULD ONLY USE USELESS RALTZ");
		        GameCode.textInterface.println("WITH NO HELD ITEMS OR TM'S AND I ALSO DID ALL OPTIONAL BATTALS AND WELL IT WAS CERTAINLY AN EXPERINCE");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 7) {
		        GameCode.textInterface.println("I JUST MADE UP ONE OF THE FACTS UNDER THE AUTOMOBIELS AND THE EISENHOWER HYWAY FACTS SEGMENT TO SEE IF ANYONE WOULD NOTICE");
		        GameCode.textInterface.println("EVEN THE ONES THAT AREN'T MADE UP ARE VERY LIGHTLY FACT CHECKED AND VERY WELL COULD HAVE BEEN FALSIFYED");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 6) {
		        GameCode.textInterface.println("I LOVE WEARING HATS BEANIES FEDORAS BASEBALL CAPS EVEN A SHRIVLED UP LITTLE KNOME HAT JUST ANY HAT YOU GIVE ME ILL WEAR IT");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 5) {
		        GameCode.textInterface.println("MY FREIND NATHAN AND I HAVE BEEN WORKING ON ANOTHER GAME AND ITS GONNA BE FREAKIN LEGIT SO IF YOU THOUGHT THIS ONE WAS");
		        GameCode.textInterface.println("ALRIGHT GET READY FOR A GOOD ONE WHEN WE GET GOING ON THAT ONE");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 4) {
		        GameCode.textInterface.println("I WATCH A LOT OF SIMPLEFILPS AND I CONSIDERED DONATING HIM THE VIDEO I TOOK OF THE MAIDEN VOIAGE OF MY RADIO");
		        GameCode.textInterface.println("IT PLAYED ROXANNE JUST OUT OF COMPLEATE RANDOM CHANCE");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 3) {
		        GameCode.textInterface.println("I LOVE MEMES HAH AHAHAHA DAB JDOFJALKJDKLJFB DABB ALEOGHAVO; ADSKL,J.FN DSOKXJLN GAYYYY");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 2) {
		        GameCode.textInterface.println("I NEVER DID ANYTHING WITH MUSIC EVER UNTIL THIS GAME (UNLESS YOU COUNT 5TH GRADE BAND AND SINGING ALL STAR ON YOUTUBE)");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		      if (jeffreyFactNumber == 1) {
		        GameCode.textInterface.println("IM SUPER COOL HECK YEAH");
		        GameCode.textInterface.println("NAH BUT, IN ALL SERIOSNESS");
		        GameCode.textInterface.println("IM AN AMETURE GAME DEVELOPER I WANT TO BE A BIG SHOT GAME DEVELOPER AT SOME POINT BUT THAT WILL PROBABLY NEVER HAPPEN I CAN'T");
		        GameCode.textInterface.println("FOCUS ON ANYTHING  LIKE I REMEMBER AT LEAST 24 DIFFRENT OCCASIONS WHERE I SAID TODAY IS GONNA BE THE DAY THAT I FINNALY FINISH");
		        GameCode.textInterface.println("AUTOMOBILES AND THE EISNEHOWER HIGHWAY SYSTEM THE GAME THEN I WENT ON TO DO LITTERALLY NOTHING FOR THE REST OF THE DAY");
		        jeffreyFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "WOW GO ON JEFFREY", "UGG CRINGE SO SO CRINGE" });
		      }
		    }
		    if (GameCode.textInterface.selected.equals("WOW GO ON JEFFREY")) {
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.selected = "ABOUT JEFFREY MARSH";
		    }
		    if (GameCode.textInterface.selected.equals("UGG CRINGE SO SO CRINGE")) {
		      GameCode.textInterface.selected = "unimportant";
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
		    
		    if (GameCode.textInterface.selected.equals("ABOUT THE GAME")) {
		      GameCode.textInterface.selected = "unimportant";
		      if (gameFactNumber == 14) {
		        gameFactNumber = 1;
		      }
		      if (gameFactNumber == 13) {
		        GameCode.textInterface.println("THE POTHOLE EVENT ONLY APPEARS ON AN RNG ROLL OF 69 OR 169");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 12) {
		        GameCode.textInterface.println("THE MAN WHO ASKS ABOUT SCRATCH IS BASED OF MY FREIND KENYON FERGEN WHO CONTINUESLY NAGED ME ABOUT HOW I SHOULD HAVE MADE");
		        GameCode.textInterface.println("THE GAME ON SCRATCH INSTEAD AND I KEPT TELLING HIM HE WAS WRONG");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 11) {
		        GameCode.textInterface.println("THE FINAL BOSS FIGHT TOOK ABOUT THE SAME AMOUNT OF TIME TO MAKE AS EVERYTHING ELSE IN THE GAME COMBINED");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 10) {
		        GameCode.textInterface.println("BEFORE I ADDED THE CUSTOM EVENTS WHEN THE RNG ROLL WASEN'T IN USE IT DEFULTED TO 420 I HAD TO CHANGE IT TO AVOID ACCEDENTLY TRIGGERING CUSTOM EVENTS");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 9) {
		        GameCode.textInterface.println("THE GAME IS IN ALL CAPS BECASUE IM TOO LAZY TO MAKE SPRITES FOR THE LOWERCASE LETTERS FOR EVERYTHING");
		        GameCode.textInterface.println(" ");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 8) {
		        GameCode.textInterface.println("THIS GAME WAS ORIGINALLY CREATED AS A SCHOOL PROJECT ABOUT THE FIFTYS I THOUGHT IT WAS FUNNY THAT EVERYBODY WAS FIGHTING OVER THE HOT TOPICS LIKE");
		        GameCode.textInterface.println("WOMENS RIGHTS AND THE SPACE RACE BUT WHEN AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM WAS CALLED THE ROOM WAS SILENT FOR A GOOD 15 SECONDS AND I");
		        GameCode.textInterface.println("DID WHAT ANY SAIN PERSON WOULD DO AND SCREAMED DIBS AT THE TOP OF MY LUNGS I DIDEN'T REALLY WANT AUTOMOBILES AND THE EISENHOWER SYSTEM BUT IT WAS");
		        GameCode.textInterface.println("WORTH IT AFTER LIKE 30 MINUTES OF BRAINSTORMING I CAME UP WITH THE IDEA FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM THE GAME !!! WHEN IT CAME");
		        GameCode.textInterface.println("TIME TO TURN IN THE PROJECTS I ONLY HAD A BARE BONES VERSION OF WHAT I HAVE NOW BUT IT WAS STILL THE HIGHEST RATED PROJECT IN THE CLASS SO I WONDERED");
		        GameCode.textInterface.println("HOW FAR I COULD TAKE THIS AND HERE I AM JULY 9 AT 6:32 AM STILL WORKING ON IT");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 7) {
		        GameCode.textInterface.println("WHEN I WAS WRITING THE CODE FOR THE CUSTOM EVENTS I GOT A LITTLE LAZY WITH THE VARIABLE NAMEING AND IT LED TO THE GREATEST LINE OF CODE EVER WRITEN");
		        GameCode.textInterface.println("LEGITNUMBERS [LEGITNUMBER] = EVENLEGITERNUMBER + 2");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 6) {
		        GameCode.textInterface.println("THE MARSH-ANS THEME WAS THE FIRST SONG I EVER MADE THE FIRST PLAN WAS TO MAKE IT FOR THE MARSH-ANS THEME BUT THEN I THOUGHT TO MAKE IT FOR ALL THE BOSSES");
		        GameCode.textInterface.println("HOWEVER WHEN I WAS TRYING TO MAKE MUSIC FOR THE TITLE SCREEN AND MAIN GAMEPLAY I KEPT ACCEDENTLY MAKEING BOSS SONGS SO I WENT BACK TO THE ORIGINAL FOR THE THEME");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 5) {
		        GameCode.textInterface.println("IF YOU PAID ATTENTION IN THE CREDITS YOU WOULD KNOW THAT I HAVE A YOUTUBE CHANNEL THE WAFFLE DEFENCE TEAM I DON'T MAKE VIDEOS FOR IT VERY OFFTEN BUT");
		        GameCode.textInterface.println("I STARTED ON A VIDEO THAT WAS SUPPOSED TO COME OUT ON APRIL FOOLS ONE THING LED TO ANOTHER AND I DIDEN'T GET IT DONE, BUT I GOT SOOOOOO CLOSE I PROMISED");
		        GameCode.textInterface.println("TO FINISH IT AT SOME POINT IN APRIL BUT AS FATE WOULD HAVE IT AROUND THAT TIME I STARTED WORKING ON THIS GAME AND I HAVENT TOUCHED IT SIENCE");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 4) {
		        GameCode.textInterface.println("I DON'T KNOW IF YOU GUYS NOTICED BUT WHAT I TRIED TO DO WITH THIS GAME IS WAS SET IT UP SO THERE WAS REALISTIC EVENTS MIXED INTO THE FANTASY THAT WAY");
		        GameCode.textInterface.println("YOU START OF LIKE OH DARN I GOTTA PAY A TOLL OH .... I AM RUNNING FROM THE POLICE BECAUE IM A COMUNIST ..... WAIT ALLIENS!!!!!");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 3) {
		        GameCode.textInterface.println("THESE FUN FACTS ARE ACUALLY DISPLAYED IN REVERSE ORDER OF THE ORDER I WRIGHT THEM SO I HAVE TO STRECH MORE FOR THE ONES AT THE BEGGINING AND LESS AT THE END");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 2) {
		        GameCode.textInterface.println("I DIDEN'T REALISE THAT RALTZ WAS THE INCORRECT SPELLING UNTIL I WAS ALMOST DONE WITH THE GAME SO AT THAT POINT I JUST WENT WITH IT TO AVOID COPYWRIGHT THINGYS");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		      if (gameFactNumber == 1) {
		        GameCode.textInterface.println("THE MAJORITY OF THE CODE FOR THE ENTIRE GAME IS ONLY A LITTLE OVER 6000 LINES LONG");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        gameFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD VERY MUCH ENJOY THAT", "........PLEASE NO" });
		      }
		    }
		    if (GameCode.textInterface.selected.equals("I WOULD VERY MUCH ENJOY THAT")) {
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.selected = "ABOUT THE GAME";
		    }
		    if (GameCode.textInterface.selected.equals("........PLEASE NO")) {
		      GameCode.textInterface.selected = "unimportant";
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
		    if (GameCode.textInterface.selected.equals("ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM")) {
		      GameCode.textInterface.selected = "unimportant";
		      if (systemFactNumber == 14) {
		        systemFactNumber = 1;
		      }
		      if (systemFactNumber == 13) {
		        GameCode.textInterface.println("THE EISENHOWER HIGHWAY SYSTEM WAS ORIGINALLY DESIGNED AS A DEFENCE SYSTEM TO EVACUATE PEOPLE FROM A NUCLEAR ATTACK");
		        GameCode.textInterface.println("THATS ALL I GOT FOR THIS CATAGORY ... SORRY WOULD YOU LIKE TO START OVER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 12) {
		        GameCode.textInterface.println("ORIGNALLY CORPERATIONS WERE RESPONSIBLE FOR BUILDING PUBLIC TRANSPORT (FOR A FEE OF COURSE) BUT THAT ALL CHANGED WITH EISENHOWER");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 11) {
		        GameCode.textInterface.println("THE NEW DEAL WAS A EXEPTION TO HAVEING CORPERATIONS BUILD ROADS SO IT COULD CREATE JOBS FOR PWA AND WPA WORKERS");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 10) {
		        GameCode.textInterface.println("THE FEDERAL HIGHWAY ACT ALLOCATEED 26 BILLION DOLLARS TO THE CONSTRUCTION OF 41,00 MILE NETWORK OF HIGHWAYS");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 9) {
		        GameCode.textInterface.println("MOST OF THE FUNDING FOR THE HIGHWAYS CAME FROM A NEW GAS TAX DURRING THIER CONSTRUCTION");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 8) {
		        GameCode.textInterface.println("EISENHOWER MET WITH 3 DIFFRENT LARGE CONSTRUCTION COMPANYS BEFORE DECIDING TO JUST BUILD IT HIMSELF");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 7) {
		        GameCode.textInterface.println("EVEN THOUGH THERE ARE 6 TIMES AS MANY PEOPLE DRIVING TODAY AS IN THE 50'S THE NUMBER OF CAR CRASH RELATED DEATHS HAS REMAINED ROUGHLY THE SAME");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 6) {
		        GameCode.textInterface.println("THE SEAT BELT AND PADDED DASHBOARD BECAME POPULAR IN CARS IN THE 50'S AND 60'S");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 5) {
		        GameCode.textInterface.println("THE CHARGE FOR YOUR FIRST CASE OF POLICE CHASE IN ILLNOIES IS 1 YEAR 2,500 AND 6 MONTHS OF LOSEING YOU LICENCE FOR NON AGGRIVATED");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 4) {
		        GameCode.textInterface.println("MECHANICS IN THE 1950'S ONLY GOT PAID 50 TO 75 CENTS AND HOUR");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 3) {
		        GameCode.textInterface.println("CERIAL KILLER BILLY COOK WAS NATORIUS FOR MURDERING PEOPLE THAT PICKED HIM UP WHEN HITCHHIKEING");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 2) {
		        GameCode.textInterface.println("THE INDUSTRY CLOSING PERCENTAGE FOR TIMESHARES IS 12.8 PERCENT");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		      if (systemFactNumber == 1) {
		        GameCode.textInterface.println("FUN FACT THE FIRST CLINICAL TRIAL TO TEST THE CORILATION BETWEEN SMOKEING AND LUNG CANCER TOOK PLACE IN 1950");
		        GameCode.textInterface.println("WOULD YOU LIKE TO READ ANOTHER?");
		        systemFactNumber += 1;
		        GameCode.textInterface.query(new String[] { "I WOULD LIKE NOTHING BETTER", "I WOULD LITTERALLY RATHER DIE" });
		      }
		    }
		    
		    if (GameCode.textInterface.selected.equals("I WOULD LIKE NOTHING BETTER")) {
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.selected = "ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM";
		    }
		    if (GameCode.textInterface.selected.equals("I WOULD LITTERALLY RATHER DIE")) {
		      GameCode.textInterface.selected = "unimportant";
		      GameCode.textInterface.println(" ");
		      GameCode.textInterface.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
	}
}
