package obsolite;

import java.util.Random;

import location.Location;
import location.TitleScreen;
import main.GameCode;


public class AutomobilesBattle extends Location {
	boolean isPlayingBaseball = false;
	int hywayHealth = 100000;
	boolean hasCable = true;
	boolean specialAttack = false;
	boolean car = true;
	boolean chase = false;
	
	int eventRandom = 0;
	Random RNG = new Random ();
	int strikes = 0;
	int balls = 0;
	boolean canReturn;
	int decision = 0;
	int milesLeft = 0;
	boolean tiedUp = false;
	
	int playerBuffs = 0;
	int raltzBuffs = 0;
	
	boolean inBunker = false;
	
	boolean hasTeeth = true;
	
	boolean lowAccuracy = false;
	
	boolean isComunist = false;
	
	boolean isConfused = false;
	
	int butterflySquad = 0;
	int butterflyBirths = 0;
	
	int imbilizedTurns = 0;
	
	boolean cableUsed = false;
	
	boolean baseballAttackUsed = false;
	
	boolean gasUsed = false;
	boolean gasCoating = false;
	boolean isBurrned = false;
	
	boolean raltzDead = false;
	boolean raltzAttack = true;
	boolean usedTrumpCard = false;
	
	boolean felpeDead = false;
	boolean felpeAttack = true;
	
	boolean banditsDead = false;
	boolean banditsAttack = true;
	
	boolean mechanicDead = false;
	boolean mechanicAttack = true;
	boolean sentryAttack = false;
	
	boolean copsDead = false;
	boolean copsAttack = true;
	
	boolean teamDead = false;
	boolean teamAttack = true;
	
	boolean docterDead = false;
	boolean docterAttack = true;
	boolean healthSpray = true;
	
	static boolean fightUnlocked = false;
	/** 
	 * uses the original constructer
	 */
	public AutomobilesBattle () {
		super(true);
	}
	@Override
	public void eventStart() {
		this.query(new String [] {"ACCEPT YOUR FATE"});
		fightUnlocked = true;
	}
	 
	public void runEventCode () {
	super.runEventCode();
	 if (GameCode.getTextInterface().selected.equals("ACCEPT YOUR FATE")) {
	        GameCode.getTextInterface().selected = "not important";
	        this.changeMusic("music/clear the roads (final).wav", GameCode.getDataManager().getVolume());
	        GameCode.getTextInterface().println("YOU ACCEPTED YOUR FATE AND WAITED FOR THE ENORMUS FOOT TO CRUSH YOU ... BUT THAT MOMENT NEVER CAME THE FOOT WAS SUSPENDED ABOVE HIM YOU FIND A CAR");
	        GameCode.getTextInterface().println("YOU TAKE IT AND FLOOR IT AS SOON AS YOU ARE OUT OF RANGE FROM THE FOOT IT CRASHES TO THE GROUND YOU TURN AND SEE THAT IT WAS USELESS RALTZ THAT HELD");
	        GameCode.getTextInterface().println("IT UP YOU LOOK IN THE SKY AND SEE A UFO SHOOT AN ELECTRIC BEAM AT THE TITAN IT WAS PILOTED BY FELEPE YOU TURN BACK TOWARDS THE TITAN AND FIND THAT EVERYONE");
	        GameCode.getTextInterface().println("YOU FOUND ON YOUR JOURNY IS HERE NOW THE BANDIS ARE SALVAGING WHAT THEY CAN FROM HIS BODY AND TAKEING HIM OUT BIT BY BIT THE COPS ARE THROWING TONS");
	        GameCode.getTextInterface().println("OF MILITARY GRENDATES AT HIM THE BASEBALL PLAYERS ARE THROWING BALLS AT HIM THE MECHANIC IS FIXING EVERYBODYS GEAR THE DOCTOR IS TREATING THE WOUNDED");
	        GameCode.getTextInterface().println("THE HOMELESS ARE DOING EVERYTHING THEY CAN THE GHOST WRITER IS TAKEING NOTES");
	        if (MobiusChase.hasButterflys) {
	          GameCode.getTextInterface().print("THE CREEPY BUTTERFLYS ARE SWARMING HIS HEAD (EVEN THOUGH THE HOARD IS MINISULE COMPARED TO IT) ");
	          butterflySquad = 1;
	        }
	        GameCode.getTextInterface().println("ITS HEARTWARMING TO SEE EVERYONE YOU MET ON YOUR QUEST HELPING YOU FINISH IT OFF FRIENDS ENEMYS AQUANTANCES THERE ALL HERE TO FIGHT FOR WHAT THEY");
	        GameCode.getTextInterface().println("BELIVE IN AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND WITH EVERYONE FIGHTING TOGETHER THERE IS NO WAY YOU CAN LOSE YOU TURN TO YOUR FOE");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STANDS FIRM");
	        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM HEALTH " + hywayHealth);
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "FIGHT", "ALLIES", "SPECIAL ATTACK" });
	      }
	      if (GameCode.getDataManager().getPlayerHealth() <= 0) {
	        GameCode.getTextInterface().println("EVEN AFTER ALL YOUR EFFORS THE TITAN WAS JUST TO MASSIVE TO DEFEAT YOU ARE CRUSED LIKE A BUG");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("GAME OVER");
	        GameCode.getDataManager().setPlayerHealth(700);
	        GameCode.getTextInterface().query(new String[] { "DARN IT" });
	      }
	      if (this.checkSelected("DARN IT")) {
	    	  GameCode.setCurrentEvent(new TitleScreen());
	      }
	      if (hywayHealth <= 0) {
	    	hywayHealth = 1;
	        GameCode.getTextInterface().println("FINALY AFTER A LONG TIME OF SMALL CHIPS THE BEAST CAN'T TAKE ANY MORE AND FALLS TO THE GROUND IN DEFEAT ITS MOUTH IS OPEN");
	        GameCode.getTextInterface().println("YOU AND GROUP DECIDE TO VENTRUE IN BUT AFTER YOU WALK IN A THE MOUTH CLOSED LOCKING YOU ALONE IN THIS DARK PLACE");
	        GameCode.getTextInterface().println("(NOTE THIS NEXT PORTION WONT PROGRESS IF YOU HAVE CONTROL PRESSED DOWN WHEN YOUR NOT SUPPOSED TO)");
	        GameCode.getTextInterface().query(new String[] { "PROGRESS (HAVE YOUR FINGER HOVERING OVER THE CONTROL BUTTON)" });
	      }
	      if (GameCode.getTextInterface().selected.equals("PROGRESS (HAVE YOUR FINGER HOVERING OVER THE CONTROL BUTTON)")) {
	        GameCode.setCurrentEvent(new MobiusFinalPhase());
	      }
	      if (GameCode.getTextInterface().selected.equals("SPECIAL ATTACK")) {
	        GameCode.getTextInterface().selected = "not important";
	        if ((hasCable) || (specialAttack)) {
	          if (hasCable) {
	            if (!car) {
	              GameCode.getTextInterface().println("YOU NEED A CAR");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "BACK" });
	            }
	          }
	          else if (!teamDead) {
	            isPlayingBaseball = true;
	            canReturn = true;
	          } else {
	            GameCode.getTextInterface().println("THE TEAM IS DOWN SO YOU CAN'T ATTACK");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        }
	        else {
	          GameCode.getTextInterface().println("YOU DON'T HAVE A SPECIAL ATTACK READY SO YOU CAN'T USE AN ATTACK");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	      }
	      if (isPlayingBaseball) {
	        if (canReturn) {
	          GameCode.getTextInterface().println("HE STEPS UP TO THE PLATE AND IS ABOUT TO THROW THE BALL AT YOU HE THROWS");
	          eventRandom = (RNG.nextInt(9) + 1);
	          canReturn = false;
	          GameCode.getTextInterface().selected = "unimportant";
	          if (eventRandom <= 4) {
	            GameCode.getTextInterface().print("A FASTBALL WHAT DO YOU DO");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "SWING", "DONT SWING" });
	          }
	          if ((eventRandom >= 5) && (eventRandom <= 8)) {
	            GameCode.getTextInterface().print("A CURVEBALL WHAT DO YOU DO");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "GO FOR IT", "NO NO NO" });
	          }
	          if ((eventRandom == 9) || (eventRandom == 10)) {
	            GameCode.getTextInterface().print("SOMETHING YOU HAVE NEVER SEEN BEFORE AS HE ENGULFS THE BALL IN A TORNADO BUT ITS STILL GOING STAITE DOWN THE CENTER WHAT DO YOU DO");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "YOLO", "HOW ABOUT YONO" });
	          }
	        }
	        eventRandom = (RNG.nextInt(9) + 1);
	        if (GameCode.getTextInterface().selected.equals("SWING")) {
	          GameCode.getTextInterface().selected = "not important";
	          if (eventRandom <= 7) {
	            eventRandom = (RNG.nextInt(1500) + 2000);
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT THOUGH THE CHEST OF AUTOMOBIELS AND THE EISNEHOWER HYWAY SYSTEM AND DEALS " + Integer.toString(eventRandom) + " DAMAGE");
	            canReturn = true;
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	          } else {
	            GameCode.getTextInterface().println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
	            strikes += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("DONT SWING")) {
	          GameCode.getTextInterface().selected = "not important";
	          if (eventRandom <= 7) {
	            GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
	            strikes += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          } else {
	            GameCode.getTextInterface().println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
	            balls += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("GO FOR IT")) {
	          GameCode.getTextInterface().selected = "not important";
	          if (eventRandom <= 5) {
	            eventRandom = (RNG.nextInt(1500) + 2000);
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT THOUGH THE CHEST OF AUTOMOBIELS AND THE EISNEHOWER HYWAY SYSTEM AND DEALS " + Integer.toString(eventRandom) + " DAMAGE");
	            canReturn = true;
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	          } else {
	            GameCode.getTextInterface().println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
	            strikes += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("NO NO NO")) {
	          GameCode.getTextInterface().selected = "not important";
	          if (eventRandom <= 5) {
	            GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
	            strikes += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          } else {
	            GameCode.getTextInterface().println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
	            balls += 1;
	            GameCode.getTextInterface().println(" ");
	            canReturn = true;
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("HOW ABOUT YONO")) {
	          GameCode.getTextInterface().selected = "not important";
	          GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
	          strikes += 1;
	          GameCode.getTextInterface().println(" ");
	          canReturn = true;
	        }
	        if (GameCode.getTextInterface().selected.equals("YOLO")) {
	          GameCode.getTextInterface().selected = "not important";
	          if ((eventRandom == 1) || (eventRandom == 2)) {
	            eventRandom = (RNG.nextInt(3500) + 5000);
	            hywayHealth -= eventRandom;
	            canReturn = true;
	 
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	            GameCode.getTextInterface().println("YOU HIT IN INSAIN HOMERUN PUSHING THE TWISTER BACK AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IT DOES " + Integer.toString(eventRandom) + " DAMAGE");
	          }
	          else {
	            GameCode.getTextInterface().println("YOU SWING BUT TO NO AVAIL THE BALL WAS MOVING TO FAST AND YOU COULDEN'T HIT IT LIKE THAT");
	            strikes += 1;
	            canReturn = true;
	          }
	        }
	        if (strikes == 3) {
	          GameCode.getTextInterface().println("THREE STRIKES MEANS YOUR OUT AND THE BASEBALL PLAYER IS HAPPY (PROBABLY BECASUE HE FINALLY GOT TO STRIKE YOU OUT) SO THE ATTACK IS OVER");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println(" ");
	          isPlayingBaseball = false;
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	          specialAttack = false;
	        }
	        if (balls == 4) {
	          GameCode.getTextInterface().println("THEY CANT WALK YOU BECASUE ITS NOT A REAL GAME SO INSTEAD THEY JUST RESET YOUR STRIKES ");
	          strikes = 0;
	          balls = 0;
	        }
	      }
	      if (chase) {
	    	GameCode.getTextInterface().renderAtAPlace(520, 88, new String[] { "MILES LEFT " + milesLeft }, GameCode.getDataManager().getSprites().font);
	        GameCode.getTextInterface().println("YOU DROVE A MILE AROUND AUTOMOBEILS AND THE EISNHOWER HIGHWAY SYSTEM YOU ARE STARTING TO WRAP AROUND HIS COLUOSAL LEGS");
	        GameCode.getDataManager().setMilesLeft(GameCode.getDataManager().getMilesLeft() - 1);
	        decision = (RNG.nextInt(99) + 10001);
	      }
	      if (decision == 10001) {
	        GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM LIFTS UP ON THE TOW CABLE AND YOUR CAR FLYS INTO THE AIR WHEN IT FALLS");
	        GameCode.getTextInterface().println("BACK DOWN YOUR CAR IS DESTROYED (NOTE IF YOU FIX YOUR CAR YOU WILL BE ABLE TO RESUME THIS ATTACK)");
	        chase = false;
	        car = false;
	        decision = 4000000;
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	      }
	      if (decision == 10002) {
	        if (chase) {
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM PICKS YOU UP AND UNTANGLES HIS BODY UP YOU NOW MUST DRIVE 20 MORE MILES");
	          GameCode.getDataManager().setMilesLeft (GameCode.getDataManager().getMilesLeft() + 20);
	          chase = false;
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "OKAY" });
	        }
	        if (GameCode.getTextInterface().selected.equals("OKAY")) {
	          chase = true;
	          GameCode.getTextInterface().selected.equals("not important");
	        }
	      }
	      if (decision == 10003) {
	        if (chase) {
	          eventRandom = (RNG.nextInt(100) + 25);
	          GameCode.getTextInterface().println("YOUR CAR HIT A MINOR STUMP AND YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	          chase = false;
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "OKAY" });
	        }
	        if (GameCode.getTextInterface().selected.equals("OKAY")) {
	          chase = true;
	          GameCode.getTextInterface().selected.equals("not important");
	        }
	      }
	      if (GameCode.getDataManager().getMilesLeft() <= 0) {
	        GameCode.getTextInterface().println("YOU GOT ALL THE WAY AROUND THE CREATURE AND NOW HE IS STUCK IN PLACE AND HE PROBABLY WILL BE FOR THE NEXT 5 TURNS");
	        hasCable = false;
	        tiedUp = true;
	        chase = false;
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	        GameCode.getDataManager().setMilesLeft(100);
	      }
	      if (GameCode.getTextInterface().selected.equals("FIGHT")) {
	        eventRandom = (RNG.nextInt(8) + 1);
	        GameCode.getTextInterface().selected = "not important";
	        if ((eventRandom == 1) && (car)) {
	          GameCode.getTextInterface().println("YOU RUN FROM AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IN THE CAR AND WHEN HE ");
	          GameCode.getTextInterface().println("CHASES YOU HE HITS A HUGE POTHOLE AND HAS TO BREAK OF PEICES OF HIMSELF TO ESCAPE");
	          eventRandom = (RNG.nextInt(300) + 250);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 2) || ((eventRandom == 1) && (!car))) {
	          GameCode.getTextInterface().println("YOU THROW YOUR HAT AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND ...");
	          eventRandom = (RNG.nextInt(2) + 1);
	          if (eventRandom == 1) {
	            GameCode.getTextInterface().print(" IT WAS A HARD HAT IT DID A LOT OF DAMAGE");
	            eventRandom = (RNG.nextInt(320) + 150);
	            eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          }
	          if (eventRandom == 2) {
	            GameCode.getTextInterface().print(" AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM GETS CRAPTURED HE WONT BE ABLE TO ATTACK YOUR ALLIES THIS TURN ");
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	            inBunker = true;
	          }
	          if (eventRandom == 3) {
	            GameCode.getTextInterface().print(" IT WAS JUST A BASEBALL CAP IT BOUNCES OFF HIM LIKE A FLY");
	            eventRandom = (RNG.nextInt(25) + 50);
	            eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          }
	        }
	        if ((eventRandom == 3) && (car)) {
	          GameCode.getTextInterface().println("AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM ATTEMPTS TO STOMP YOU BUT YOU ");
	          GameCode.getTextInterface().println("DODGET IT THEN YOU DRIVE ONTO ITS ENORMUS FOOT IT TRYS TO SHAKE YOU OFF BUT YOU STAY FIRM AND ");
	          GameCode.getTextInterface().println("EVENTUALLY REACH ITS COLLUSAL LEGS YOU DITCH YOUR CAR AND JUMP OFF HIS FOOT ");
	          GameCode.getTextInterface().println("YOU RIGGED THE CAR TO EXPOLODE IT DOES IMMENSE DAMAGE TO HIS LEGS HIS FOOT ALMOST GETS DETACHED");
	          GameCode.getTextInterface().println("BUT YOUR CAR GETS DESTROYED");
	          this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
	          if (gasCoating) {
	            GameCode.getTextInterface().println("THE EXPLOSION CAUGHT THE GAS ON FIRE");
	            isBurrned = true;
	          }
	          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	          eventRandom = (RNG.nextInt(750) + 500);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          car = false;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 3) && (!car)) {
	          GameCode.getTextInterface().println("YOU START THROWING A BUNCH OF PIECES OF YOUR DESTORYED CAR AT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          eventRandom = (RNG.nextInt(500) + 50);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if (eventRandom == 4) {
	          GameCode.getTextInterface().println("YOU USE RANDOM ELECTRICITY MAGIC THAT YOU DIDEN'T KNOW YOU HAD UNTIL NOW ... ");
	          GameCode.getTextInterface().println("NOTHING HAPPENS I GUESS MAGIC ISEN'T CANNON IN THIS REALITY THEN RANDOMLY OUT OF NOWHERE");
	          GameCode.getTextInterface().println("A THUNDERSTORM STARTS AND SIENCE ITS THE BIGGEST OBJECT IT GETS STRUCK BY LIGHTNING WHAT LUCK!");
	          this.playSoundEffect(6.0F, "soundEffects/lightning.wav");
	          if (gasCoating) {
	            GameCode.getTextInterface().println("THE ELECTRISITY CAUGHT THE GAS ON FIRE");
	            isBurrned = true;
	          }
	          eventRandom = (RNG.nextInt(500) + 50);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 5) || ((eventRandom == 7) && (!car))) {
	          GameCode.getTextInterface().println("YOU SCREAM AS LOUD AS YOU CAN AND FEEL POWER GROW IN YOUR SOUL ...");
	          GameCode.getTextInterface().println(" NO? NO WAIT NEVERMIND THIS IS THE REAL WORLD WHERE JUST RANDOMLY SCEAMING DOESEN'T MAKE YOU MORE POWERFUL");
	        }
	        if (eventRandom == 6) {
	          GameCode.getTextInterface().println("YOU GRAB A MINIGUN AND START SHOOTING THE ABSOLUTE CRAP OUT OF AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println("THANK GOD FOR HEAVY WEAPONS AND THE EISENHOWER HIGHWAY SYSTEM");
	          eventRandom = (RNG.nextInt(400) + 150);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 7) && (car)) {
	          GameCode.getTextInterface().println("YOU SHOOT A 17TH CENTRY CANON THAT WAS MOUNTED TO YOUR CAR FOR SOME REASON");
	          GameCode.getTextInterface().println("THANK GOD FOR HISTORY AND THE EISENHOWER HIGHWAY SYSTEM");
	          eventRandom = (RNG.nextInt(150) + 550);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 8) && (car)) {
	          GameCode.getTextInterface().println("YOU ATTACH A LARGE BUZZ SAW TO YOUR CAR AND SLASH THE TITAN GOING OVER 90 MPH");
	          GameCode.getTextInterface().println("THANK GOD FOR ILLOGICAL VECHICALS AND THE EISENHOWER HIGHWAY SYSTEM");
	          eventRandom = (RNG.nextInt(250) + 250);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 9) || ((eventRandom == 8) && (!car))) {
	          GameCode.getTextInterface().println("YOU POUR A CUP OF WATER ON AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM ... FOR SOME REASON ITS KINDA EFFECTIVE BECAUSE EROSION BUT EHH");
	          GameCode.getTextInterface().println("THANK GOD FOR EROSION AND THE EISENHOWER HIGHWAY SYSTEM?");
	          eventRandom = (RNG.nextInt(5) + 10);
	          eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * playerBuffs));
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if (eventRandom == 10) {
	          GameCode.getTextInterface().println("YOU COULDEN'T ATTACK THIS TURN BECAUSE YOU HAVE TO UPDATE YOUR PHONE (YOU SHOULDEN'T HAVE GOTTEN A WINDOWS PHONE)");
	        }
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	      }
	      if (GameCode.getTextInterface().selected.equals("ALLIES")) {
	        GameCode.getTextInterface().println("WHICH COMPAINION DO YOU CALL UPON");
	        GameCode.getTextInterface().selected = "not important";
	        GameCode.getTextInterface().println(" ");
	        if (!MobiusChase.hasButterflys) {
	          GameCode.getTextInterface().query(new String[] { "USELESS RALTZ", "MARSH-ANS", "BANDITS", "MECHANIC", "COPS", "BASEBALL PLAYERS", "DOCTOR", "GHOAST WRITER", "SOMEBODY ELSE", "BACK" });
	        } else {
	          GameCode.getTextInterface().query(new String[] { "USELESS RALTZ", "MARSH-ANS", "BANDITS", "MECHANIC", "COPS", "CREEPY BUTTERFLYS", "BASEBALL PLAYERS", "DOCTOR", "GHOAST WRITER", "SOMEBODY ELSE", "BACK" });
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("USELESS RALTZ")) {
	        GameCode.getTextInterface().selected = "not important";
	        if (!raltzDead) {
	          if (playerBuffs == 6) {
	            GameCode.getTextInterface().println("BUT RALTZ IS OUT OF X SPECIAL");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	          GameCode.getTextInterface().println("USELESS RALTZ COMES OUT AND GIVES YOU A X SPECIAL YOUR ATTACK INCREASED");
	          GameCode.getTextInterface().println(" ");
	          playerBuffs += 1;
	          raltzAttack = false;
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	        } else {
	          GameCode.getTextInterface().println("USELESS RALTZ LIES DEAFEATED SHE WILL BE UNABLE TO HELP AT THIS TIME");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("MARSH-ANS")) {
	        GameCode.getTextInterface().selected = "not important";
	        if (!felpeDead) {
	          if (MobiusChase.maximumHealth >= 2000) {
	            GameCode.getTextInterface().println("FELEPE CAN'T RAISE YOUR MAX HEALTH BECASUE YOUR MAX HEALTH IS MAXED OUT");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          } else {
	            MobiusChase.maximumHealth += 300;
	            GameCode.getTextInterface().println("THE MARSH-ANS BLAST YOU WITH A RAY BEAM WHICH MAKES YOU FEEL ENGRGIZED MAX HP INCREASED TO " + Integer.toString(MobiusChase.maximumHealth));
	            GameCode.getTextInterface().println(" ");
	            felpeAttack = false;
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          }
	        } else {
	          GameCode.getTextInterface().println("THE MARSH-AN SAUCER IS DESTROYED IT CAN'T HELP YOU");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("BANDITS")) {
	        if (gasUsed) {
	          if (!banditsDead) {
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println("YOU GIVE SOME OF YOUR GAS TO THE BANDITS AND TOGETHER YOU COAT THE BOSS WITH GAS");
	            gasCoating = true;
	 
	            this.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	            banditsAttack = false;
	            gasUsed = true;
	          } else {
	            GameCode.getTextInterface().println("THE BANDITS HAVE A LOT OF WOUNDED AND CAN'T BOTHER WITH HELPING YOU ATTACK RIGHT NOW");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        } else {
	          GameCode.getTextInterface().selected = "not important";
	          GameCode.getTextInterface().println("BUT YOU DON'T HAVE ANY MORE GAS TO SPARE");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("BACK")) {
	        GameCode.getTextInterface().selected = "OUCH";
	      }
	      if (GameCode.getTextInterface().selected.equals("MECHANIC")) {
	        if (!car) {
	          if (!mechanicDead) {
	            GameCode.getTextInterface().println("THE MECHANIC COMES UP AND FIXES YOUR CAR (FOR FREE THIS TIME)");
	 
	            this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println("");
	            car = true;
	            mechanicAttack = false;
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          } else {
	            GameCode.getTextInterface().println("THE MECHANIC HAS TO DEAL WITH HIS OWN CAR BEFORE HE CAN HELP YOU WITH YOURS");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        } else {
	          GameCode.getTextInterface().println("BUT THERE WAS NO PROBLEM WITH YOUR CAR");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	        GameCode.getTextInterface().selected = "not important";
	      }
	      if (GameCode.getTextInterface().selected.equals("COPS")) {
	        if (!cableUsed) {
	          if (car) {
	            if (!copsDead) {
	              if (!specialAttack) {
	                GameCode.getTextInterface().println("THE COPS TIE A ENORMUS CABLE TO THE END OF YOUR CAR WITH THE INTERTION OF YOU DRIVING AROUND AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().println("SPECIAL ATTACK CHARGED");
	                GameCode.getTextInterface().println(" ");
	                copsAttack = false;
	                cableUsed = true;
	                hasCable = true;
	                GameCode.getDataManager().setMilesLeft(100);
	                imbilizedTurns = 0;
	                GameCode.getTextInterface().query(new String[] { "EPIC" });
	              } else {
	                GameCode.getTextInterface().println("YOU ALREADY HAVE A SPECIAL ATTACK CHARGED WOULD YOU LIKE TO CHARGE THIS ONE INSTEAD");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "SOUNDS LEGIT TO ME", "EH NO THANKS" });
	              }
	            } else {
	              GameCode.getTextInterface().println("THE COPS CAN'T HELP YOU WITHOUT THIER EQUIPMENT");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "BACK" });
	            }
	          } else {
	            GameCode.getTextInterface().println("YOU NEED A WORKING CAR TO USE THIS ATTACK");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        } else {
	          GameCode.getTextInterface().println("NOT EVEN THE COPS HAVE ANOTHER TOW CABLE BIG ENOUGH TO WRAP UP AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	        
	        GameCode.getTextInterface().selected = "not important";
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("CREEPY BUTTERFLYS")) {
	        if (butterflyBirths > 0) {
	          GameCode.getTextInterface().println("YOU CALL THE NEWLY BORN BUTTERFLYS THEY JOIN YOUR SQUAD");
	          butterflySquad += butterflyBirths;
	          butterflyBirths = 0;
	          GameCode.getTextInterface().println("CURRENT BUTTERFLY COUNT = " + Integer.toString(butterflySquad));
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	        } else {
	          GameCode.getTextInterface().println("BUT THERE WERE NO BUTTERFLYS LEFT TO JOIN YOU");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	        GameCode.getTextInterface().selected = "not important";
	      }
	      if (GameCode.getTextInterface().selected.equals("BASEBALL PLAYERS")) {
	        if (baseballAttackUsed == false) {
	          if (teamDead == false) {
	            if (!hasCable) {
	              GameCode.getTextInterface().println("THE BASEBALL PLAYERS GET READY TO PITCH");
	              GameCode.getTextInterface().println(" ");
	              teamAttack = false;
	              GameCode.getTextInterface().println("SPECIAL ATTACK CHARGED");
	              GameCode.getTextInterface().println(" ");
	              baseballAttackUsed = true;
	              specialAttack = true;
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            } else {
	              GameCode.getTextInterface().println("YOU ALREADY HAVE A SPECIAL ATTACK CHARGED WOULD YOU LIKE TO CHARGE THIS ONE INSTEAD");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "SOUNDS LEGIT TO ME", "EH NO THANKS" });
	            }
	          } else {
	            GameCode.getTextInterface().println("THE BASEBALL TEAM STRUCK OUT THEY CAN'T HELP YOU RIGHT NOW");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        } else {
	          GameCode.getTextInterface().println("THE PITCHER SEEMS TO STILL HOLD A GRUDGE ABOUT HOW HE LOST THE BET");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	        GameCode.getTextInterface().selected = "not important";
	      }
	      if (GameCode.getTextInterface().selected.equals("DOCTOR")) {
	        GameCode.getTextInterface().selected = "not important";
	        if (!docterDead) {
	          if (GameCode.getDataManager().getPlayerHealth() < MobiusChase.maximumHealth) {
	            GameCode.getTextInterface().println("THE DOCTOR HEALS ALL YOUR WOUNDS");
	            docterAttack = false;
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getDataManager().setPlayerHealth(MobiusChase.maximumHealth);
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          } else {
	            GameCode.getTextInterface().println("YOU DON'T NEED ANY CARE");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "BACK" });
	          }
	        }
	        else if (healthSpray) {
	          GameCode.getTextInterface().println("THE DOCTOR IS INCOPASITATED AND CAN'T GET TO YOU LUCKILY YOU DO HAVE A HEALTH SPRAY IF YOU NEED TO USE IT (NOTE YOU CAN ONLY HEAL WITHOUT THE DOCTOR ONCE)");
	          GameCode.getTextInterface().println("DO YOU WANT TO USE IT");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "HELL YEAH", "ILL WAIT ON THAT" });
	        } else {
	          GameCode.getTextInterface().println("THE DOCTOR CAN'T GET TO YOU AND YOU ALREADY USED YOUR HEALTH SPRAY SO YOUR JUST GONNA HAVE TO DEAL");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "BACK" });
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("SOUNDS LEGIT TO ME")) {
	        GameCode.getTextInterface().selected = "not important";
	        if (!specialAttack) {
	          GameCode.getTextInterface().println("THE COPS TIE A ENORMUS CABLE TO THE END OF YOUR CAR WITH THE INTERTION OF YOU DRIVING AROUND AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("SPECIAL ATTACK CHARGED");
	          GameCode.getTextInterface().println(" ");
	          copsAttack = false;
	          cableUsed = true;
	          hasCable = true;
	          GameCode.getDataManager().setMilesLeft(100);
	          chase = true;
	          imbilizedTurns = 0;
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	        } else {
	          GameCode.getTextInterface().println("THE BASEBALL PLAYERS GET READY TO PITCH");
	          GameCode.getTextInterface().println(" ");
	          teamAttack = false;
	          GameCode.getTextInterface().println("SPECIAL ATTACK CHARGED");
	          GameCode.getTextInterface().println(" ");
	          baseballAttackUsed = true;
	          specialAttack = true;
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("EH NO THANKS")) {
	        GameCode.getTextInterface().selected = "BACK";
	      }
	      if (GameCode.getTextInterface().selected.equals("HELL YEAH")) {
	        GameCode.getTextInterface().selected = "not important";
	        GameCode.getTextInterface().println("YOU USED YOUR HEALTH SPRAY AND RETURNED TO MAXIMUM HEALTH");
	        GameCode.getDataManager().setPlayerHealth(MobiusChase.maximumHealth);
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	      }
	      if (GameCode.getTextInterface().selected.equals("ILL WAIT ON THAT")) {
	        GameCode.getTextInterface().println("YOU DECIDED TO SAVE YOUR FIRST AID SPRAY FOR A BETTER TIME PROBABLY A SMART CHOICE");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().query(new String[] { "BACK" });
	      }
	      if (GameCode.getTextInterface().selected.equals("GHOAST WRITER")) {
	        GameCode.getTextInterface().println("THE GHOAST WRITER COMES UP TO YOU AND SAYS AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM A BEAST BIGGER THAN ANY SEEN BEFORE IT WAS CREATED BY MOBIUS");
	        GameCode.getTextInterface().println("FROM AUTOMOBIELS AND A LOT OF PEICES OF THE EISENHOWER HIGHWAY SYSTEM ITS A LITTLE IRONIC THAT HE IS CONTROLLING THE THING YOU ARE TRYING TO SAVE");
	        GameCode.getTextInterface().println("HE HAS A CRAPTON OF HEALTH BUT IF YOU COOPERATE WITH YOUR ALLIES YOU CAN USE SPECIAL ATTACKS THAT DO MASSIVE DAMAGE AS WELL AS RAISE YOUR ATTACK AND MAX HP");
	        GameCode.getTextInterface().println("THIS IS MOSTLY A BATTLE TO SURVIVE SURE HES GOT A CRAPTON OF HEALTH BUT IF YOU KEEP ATTACKING AND DON'T LET YOURSELF RUN OUT OF HP HE SHOULDEN'T BE TOO TOUGH");
	        GameCode.getTextInterface().println("BY THE WAY IF YOU HAVENT FIGURED IT OUT YET IM THE EQUIVENLENT OF THE STATBOOK FOR THIS FIGHT GOOD LUCK");
	        GameCode.getTextInterface().println("AND THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	        GameCode.getTextInterface().selected = "not important";
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	      }
	      if (GameCode.getTextInterface().selected.equals("SOMEBODY ELSE")) {
	        eventRandom = (RNG.nextInt(8) + 1);
	        GameCode.getTextInterface().println("YOU CAN UPON SOMEONE RANDOM AND ...");
	        if (eventRandom == 1) {
	          GameCode.getTextInterface().println("THE GRAIN BUYER LETS YOUR PARTY INTO HIS SECRET GRAIN BUNKER YOUR ALLIES WONT TAKE DAMAGE THIS TURN");
	          inBunker = true;
	          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM");
	        }
	        if (eventRandom == 2) {
	          eventRandom = (RNG.nextInt(499) + 500);
	          GameCode.getTextInterface().println("THE FRUITE SALESMAN THROWS CUT ORANGES AT HIM THE CITRIC ACID STARTS CORRODING HIS BODY FOR " + Integer.toString(eventRandom) + " DAMAGE");
	          GameCode.getTextInterface().println(" ");
	          hywayHealth -= eventRandom;
	        }
	        if (eventRandom == 3) {
	          GameCode.getTextInterface().println("THE DEER THAT YOU DIDEN'T RUN INTO ON THE ROAD COMES BACK AND AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STOPS FOR HIM LOWERING HIS ACCURACY");
	          lowAccuracy = true;
	        }
	        if (eventRandom == 4) {
	          GameCode.getTextInterface().println("THE CANDY BAR MERCHANT SELLS HIM A CANDY BAR (SOME VERY POWERFUL PEOPLE MIGHT TAKE NOTICE OF THIS)");
	          isComunist = true;
	        }
	        if (eventRandom == 5) {
	          GameCode.getTextInterface().println("THE TIMESHARE HITCHIKER CONSIDERS USING THE CORPSE OF THE COLUSIS TO MAKE A NEW ISLAND TO SELL TIMESHARES ON ... AND THATS IT NOTHING HAPPENS HE JUST DOES THAT");
	        }
	        if (eventRandom == 6) {
	          GameCode.getTextInterface().println("THE HITCHIKER WHOSE CAR BROKE DOWN ACTIVATED THE SELF DESTRUCT SWITCH ON HIS CAR (ONE OF THE ONES ABSORBED BY AUTOMOBIELS AND THE EISEHOWER HIGHWAY SYSTEM)");
	          GameCode.getTextInterface().println("MOBIUS TEATH BROKE HE WONT BE ABLE TO USE TEATH ATTACKS FOR A WHILE");
	          this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
	          hasTeeth = false;
	        }
	        if (eventRandom == 7) {
	          if (playerBuffs <= 7) {
	            GameCode.getTextInterface().println("THE SCIENTIST GIVES YOU A STRENGTH ENCHANCER YOU GOT TWO BUFFS");
	            playerBuffs += 2;
	          } else {
	            GameCode.getTextInterface().println("THE SCIENTIST TRYS TO INJECT YOU WITH STUFF BUT YOU HAVE TOO MANY BUFFS ALREADY");
	          }
	        }
	        if (eventRandom == 8) {
	          GameCode.getTextInterface().println("THE HOMELESS GIVE YOU ANOTHER TOW CABLE (YOU CAN NOW REUSE THE COPS SPECIAL ATTACK IF YOU USED IT ALREADY)");
	          cableUsed = false;
	        }
	        if (eventRandom == 9) {
	          GameCode.getTextInterface().println("THE RADIO SALESMAN COMES IN AND PLAYS SOME FUNKY MUSIC AUTOMOBIES AND THE EISENHOWER HIGHWAY SYSTEM IS CONFUSED IT MAY ATTACK ITSELF THIS TURN");
	          isConfused = true;
	        }
	        GameCode.getTextInterface().selected = "not important";
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "EPIC" });
	      }
	      if (GameCode.getTextInterface().selected.equals("EPIC")) {
	        if ((raltzAttack != false) && (raltzDead == false)) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if ((eventRandom < 5) || (raltzBuffs == 6)) {
	            eventRandom = (RNG.nextInt(9) + 1);
	            if ((eventRandom <= 3) || (eventRandom == 8) || (eventRandom == 9)) {
	              GameCode.getTextInterface().println("THE USELESS RALTZ USED EXTRASENSORY");
	              GameCode.getTextInterface().println(" ");
	              eventRandom = (RNG.nextInt(260) + 150);
	              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * raltzBuffs));
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	              hywayHealth -= eventRandom;
	              GameCode.getTextInterface().selected = "not important";
	              GameCode.getTextInterface().query(new String[] { "SWEET!" });
	            }
	            if (((eventRandom >= 4) && (eventRandom <= 7)) || ((eventRandom == 10) && (usedTrumpCard))) {
	              GameCode.getTextInterface().println("THE USELESS RALTZ USED GUNK SHOT");
	              eventRandom = (RNG.nextInt(350) + 60);
	              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * raltzBuffs));
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISNHOWER HIGHWAY SYSTEM TOOK  " + damage + " DAMAGE");
	              hywayHealth -= eventRandom;
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "SWEET!" });
	              GameCode.getTextInterface().selected = "not important";
	            }
	            if ((eventRandom == 10) && (!usedTrumpCard)) {
	              GameCode.getTextInterface().println("USELESS RALTZ USED TRUMP CARD");
	              eventRandom = (RNG.nextInt(1200) + 700);
	              eventRandom = ((int)Math.ceil(eventRandom + eventRandom * 0.3D * raltzBuffs));
	              String damage = Integer.toString(eventRandom);
	              usedTrumpCard = true;
	              GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISNHOWER HIGHWAY SYSTEM TOOK  " + damage + " DAMAGE");
	              hywayHealth -= eventRandom;
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "SWEET!" });
	              GameCode.getTextInterface().selected = "not important";
	            }
	          } else {
	            GameCode.getTextInterface().println("THE USELESS RALTZ USED A X SPECIAL SHE GAINED A BUFF");
	            raltzBuffs += 1;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "SWEET!" });
	            GameCode.getTextInterface().selected = "not important";
	          }
	        }
	        else if (raltzAttack == false) {
	          GameCode.getTextInterface().println("USELESS RALTZ WAS TOO BUSY HELPING YOU TO ATTACK THIS TURN");
	          GameCode.getTextInterface().println(" ");
	          raltzAttack = true;
	          GameCode.getTextInterface().query(new String[] { "SWEET!" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("USELESS RALTZ TRYS TO ATTACK BUT CAN'T FIND THE STRENGTH");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "SWEET!" });
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("SWEET!")) {
	        if ((felpeAttack != false) && (felpeDead == false)) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if (eventRandom <= 4) {
	            GameCode.getTextInterface().println("THE UFO SHOOTS AND ENORMUS LAZER AT THE TITAN ITS VERY EFFECTIVE");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(555) + 370);
	 
	            this.playSoundEffect(6.0F, "soundEffects/lazer.wav");
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "YEAH!" });
	          }
	          if (eventRandom == 7) {
	            GameCode.getTextInterface().println("FELEPE BUILDS SOME SHELTERS (YOUR ALLIES CAN'T BE DEFEATED THIS TURN)");
	            inBunker = true;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "YEAH!" });
	            GameCode.getTextInterface().selected = "unimportant";
	          }
	          if ((eventRandom == 5) || (eventRandom == 6) || (eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
	            GameCode.getTextInterface().println("A WHOLE GROUP OF MARSH-ANS TAKE EXPERMANTAL CHEMECALS AND START MORPHING INTO MONSTERS AND ATTACK AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(420) + 269);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "YEAH!" });
	          }
	        }
	        else if (!felpeAttack) {
	          GameCode.getTextInterface().println("THE MARSH-ANS ARE TOO BUSY POWERING UP YOU TO ATTACK");
	          GameCode.getTextInterface().println(" ");
	          felpeAttack = true;
	          GameCode.getTextInterface().query(new String[] { "YEAH!" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("THE MARSH-ANS CAN'T ATTACK WITH THIER SHIP DESTROYED");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "YEAH!" });
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("YEAH!")) {
	        if ((banditsAttack != false) && (banditsDead == false)) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
	            GameCode.getTextInterface().println("THE BANDITS FORM A FIREING SQUAD AND SHOOT ALL THIER SHOTGUNS TOWARDS THE GIANT AT ONCE");
	 
	            this.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
	            if ((gasCoating) && (eventRandom == 6)) {
	              GameCode.getTextInterface().println("IT SET THE GAS ON FIRE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS BURNED");
	              isBurrned = true;
	            }
	            eventRandom = (RNG.nextInt(750) + 100);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "RAD!" });
	            GameCode.getTextInterface().selected = "not important";
	          }
	          if (eventRandom == 10) {
	            GameCode.getTextInterface().println("THE BANDITS CLIMB TO THE TOP OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND START RIPPING HIS COLLOSAL CAR TEATH OFF HIS BODY ONE BY ONE");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(1350) + 100);
	            hasTeeth = false;
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "RAD!" });
	          }
	          if ((eventRandom == 8) || (eventRandom <= 3)) {
	            GameCode.getTextInterface().println("THE BANDITS ALL GRAB PICKAXES AND START SMASHING AWAY AT AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(220) + 560);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "RAD!" });
	          }
	        }
	        else if (banditsAttack == false) {
	          GameCode.getTextInterface().println("THE BANDITS WERE TOO BUSY SPREADING GAS TO ATTACK");
	          GameCode.getTextInterface().println(" ");
	          banditsAttack = true;
	          GameCode.getTextInterface().query(new String[] { "RAD!" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("THE BANDIT GANG HAS TOO MANY WONUNDED TO WORRY ABOUT TO BE ABLE TO ATTACK RIGHT NOW");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "RAD!" });
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("RAD!")) {
	        GameCode.getTextInterface().selected = "not important";
	        if (sentryAttack != false) {
	          GameCode.getTextInterface().println("THE SENTRY GUN UNLOADS ON THE CONCRATE BEAST");
	          GameCode.getTextInterface().println(" ");
	          eventRandom = (RNG.nextInt(360) + 360);
	          String damage = Integer.toString(eventRandom);
	          GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	          hywayHealth -= eventRandom;
	        }
	        if ((mechanicAttack != false) && (mechanicDead == false)) {
	          if ((felpeDead != false) || (copsDead != false) || (docterDead != false)) {
	            eventRandom = RNG.nextInt(2);
	            if (felpeDead != false) {
	              if (eventRandom == 1) {
	                GameCode.getTextInterface().println("THE MECHANIC FIXED THE MARSH-AN SAUCER ITS UP AND RUNNING AGAIN");
	                felpeDead = false;
	     
	                this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "SICK!" });
	              } else {
	                GameCode.getTextInterface().println("THE MECHANIC ATTEMPTS TO FIX THE MARSH-AN SAUCER BUT ITS NOT GOING WELL");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "SICK!" });
	              }
	            }
	            else if (docterDead != false) {
	              if (eventRandom == 1) {
	                GameCode.getTextInterface().println("THE MECHANIC FIXES THE DOCTORS ABULANCE NOW THE DOCTOR CAN GET BACK TO RESCUING PACIENTS");
	                docterDead = false;
	                GameCode.getTextInterface().println(" ");
	     
	                this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	                GameCode.getTextInterface().query(new String[] { "SICK!" });
	              } else {
	                GameCode.getTextInterface().println("THE MECHANIC IS ATTEMPTING TO FIX THE AMBULANCE BUT HE IS HAVING TROUBLE");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "SICK!" });
	              }
	            }
	            else if (eventRandom == 1) {
	              GameCode.getTextInterface().println("THE MECHANIC FIXES ALL OF THE COPS CARS THE FLEET RETURNS TO ATTACKING AUTOMOBIES AND THE EISENHOWER HIGHWAY SYSTEM");
	              copsDead = false;
	              GameCode.getTextInterface().println(" ");
	   
	              this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	              GameCode.getTextInterface().query(new String[] { "SICK!" });
	            } else {
	              GameCode.getTextInterface().println("THE MECHANIC IS ATTEMPTING TO FIX THE POLICE FORCES CARS BUT ITS TOO MUCH TO DO");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "SICK!" });
	            }
	            

	          }
	          else if (sentryAttack == false) {
	            GameCode.getTextInterface().println("THE MECHANIC USED HIS DOWN TIME TOO BUILD A SENTRY GUN THAT STARTS UNLOADING ON THE BEAST");
	            sentryAttack = true;
	 
	            this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "SICK!" });
	          } else {
	            GameCode.getTextInterface().println("THE MECHANIC HAS NOTHING TO DO SO HE JUST STARTS SMASHING AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM WITH A WRENCH");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(20) + 60);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "SICK!" });
	          }
	          
	        }
	        else if (mechanicAttack == false) {
	          mechanicAttack = true;
	          GameCode.getTextInterface().println("THE MECHANIC WAS TOO BUSY FIXING YOUR CAR TO WORRY ABOUT ANYBODY ELSE");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "SICK!" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          eventRandom = RNG.nextInt(2);
	          if (eventRandom == 1) {
	            GameCode.getTextInterface().println("THE MECHANIC FIXED HIS OWN CAR AND IS READY TO GET BACK TO HELPING WITH EVERYBODY ELSES");
	            GameCode.getTextInterface().println(" ");
	 
	            this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	            mechanicDead = false;
	            GameCode.getTextInterface().query(new String[] { "SICK!" });
	            GameCode.getTextInterface().selected = "not important";
	          } else {
	            GameCode.getTextInterface().println("THE MECHANIC CAN'T GET TO EVERYBODY BECAUSE HIS CAR IS BROKEN HE IS WORKING ON FIXING IT BUT ITS NOT GOING GREAT");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "SICK!" });
	            GameCode.getTextInterface().selected = "not important";
	          }
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("SICK!")) {
	        if ((copsAttack != false) && (copsDead == false)) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
	            GameCode.getTextInterface().println("THE COPS START CHUCHKING A BUCNH OF MILLITARY GRENDATES AT AUTOMOBILES AND THE EISENHOWER HYWAY SYSTEM");
	 
	            this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
	            if ((gasCoating) && (eventRandom == 6)) {
	              GameCode.getTextInterface().println("IT SET THE GAS ON FIRE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS BURNED");
	              isBurrned = true;
	            }
	            eventRandom = (RNG.nextInt(250) + 500);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println(" ");
	            if (MobiusChase.hasButterflys) {
	              GameCode.getTextInterface().query(new String[] { "GOOD!" });
	            } else {
	              GameCode.getTextInterface().query(new String[] { "NICE!" });
	            }
	            GameCode.getTextInterface().selected = "not important";
	          }
	          if (eventRandom == 10) {
	            GameCode.getTextInterface().println("THE COPS ALL RAM THEM WITH THEIR CARS IT DOES INSAIN DAMAGE BUT THEY ARE OUT OF COMMISION FOR A WHILE");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(1000) + 2550);
	            copsDead = true;
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            if (MobiusChase.hasButterflys) {
	              GameCode.getTextInterface().query(new String[] { "GOOD!" });
	            } else {
	              GameCode.getTextInterface().query(new String[] { "NICE!" });
	            }
	          }
	          if ((eventRandom == 8) || (eventRandom <= 3)) {
	            GameCode.getTextInterface().println("THE COPS UNLOAD A CRAP TON OF CLIPS ON THE CONCREATE MONSTOR");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(120) + 260);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            if (MobiusChase.hasButterflys) {
	              GameCode.getTextInterface().query(new String[] { "GOOD!" });
	            } else {
	              GameCode.getTextInterface().query(new String[] { "NICE!" });
	            }
	          }
	        }
	        else if (copsAttack == false) {
	          GameCode.getTextInterface().println("THE COPS ARE TOO BUSY SETTING UP YOUR TOW CABLE TO ATTACK");
	          GameCode.getTextInterface().println(" ");
	          copsAttack = true;
	          if (MobiusChase.hasButterflys) {
	            GameCode.getTextInterface().query(new String[] { "GOOD!" });
	          } else {
	            GameCode.getTextInterface().query(new String[] { "NICE!" });
	          }
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("THE COPS CAN'T HELP WITHOUT A FLEET OF CARS THIER JUST CHILLIN AND EATHING SOME EARTH SHAPED PASTRYS (DOUNUTS)");
	          GameCode.getTextInterface().println(" ");
	          if (MobiusChase.hasButterflys) {
	            GameCode.getTextInterface().query(new String[] { "GOOD!" });
	          } else {
	            GameCode.getTextInterface().query(new String[] { "NICE!" });
	          }
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("GOOD!")) {
	        if (butterflySquad > 0) {
	          GameCode.getTextInterface().println("A BUTTERFLY SQUAD OF " + Integer.toString(butterflySquad) + " SWARM THE TITAN");
	          eventRandom = 0;
	          int damage = 0;
	          int x = butterflySquad;
	          while (x > 0) {
	            x--;
	            eventRandom = (RNG.nextInt(29) + 1);
	            damage += eventRandom;
	          }
	          GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(damage) + " DAMAGE");
	          if (butterflySquad + butterflyBirths >= 100) {
	            GameCode.getTextInterface().println("THERE ARE TOO MANY ACTIVE BUTTERFLYS TO BE ABLE TO MAKE MORE");
	          } else {
	            eventRandom = RNG.nextInt((int)Math.ceil(butterflySquad / 2) - 1 + 1);
	            butterflyBirths += eventRandom;
	            GameCode.getTextInterface().println("THE CREEPY BUTTERFLYS BREED AND " + Integer.toString(eventRandom) + " NEW BUTTERFLYS ARE BORN");
	          }
	          GameCode.getTextInterface().println("CURRENT AMOUNT OF BUTTERFLYS " + Integer.toString(butterflySquad) + " CURRENT AMOUNT OF NEWLYBORN BUTTERFLYS " + Integer.toString(butterflyBirths));
	          hywayHealth -= damage;
	          GameCode.getTextInterface().selected = "not important";
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "NICE!" });
	        }
	        else if (butterflyBirths == 0) {
	          GameCode.getTextInterface().println("THERE WERE NO CREEPY BUTTERFLYS LEFT IT SEEMS THE ENTIRE SPEICIS WAS WIPED OUT");
	          GameCode.getTextInterface().println("WELL AT LEAST THE WORLD WILL BE A LITTLE LESS CREEPY");
	          MobiusChase.hasButterflys = false;
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("THANK GOD FOR SAFTY AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().query(new String[] { "NICE!" });
	        } else {
	          GameCode.getTextInterface().println("BUT THERE WERE NO ACTIVE BUTTERFLYS LEFT TO ATTACK");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "NICE!" });
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("NICE!")) {
	        if ((teamAttack != false) && (!teamDead)) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if (((eventRandom >= 4) && (eventRandom <= 7)) || (eventRandom == 9)) {
	            GameCode.getTextInterface().println("THE BASEBALL PLAYERS THROW HUGE ROCKS AT THE TITAN AT HIGH SPEEDS USING THIER GOOD ARMS ITS PRETTY EFFECTIVE");
	            eventRandom = (RNG.nextInt(100) + 250);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "NEAT" });
	            GameCode.getTextInterface().selected = "not important";
	          }
	          if (eventRandom == 8) {
	            GameCode.getTextInterface().println("THE BASEBALL PLAYERS START RUNNING AROUND THE TITAN HE IS TOO FOCUSED ON THEM TO ATTACK YOUR ALLIES THIS TURN");
	            inBunker = true;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "NEAT" });
	          }
	          if ((eventRandom <= 3) || (eventRandom == 10)) {
	            GameCode.getTextInterface().println("THE BASEBALL PLAYERS START SMASHING THE CONCREATE MONSTERS LEGS WITH BATS ITS VERY EFFECTIVE");
	            GameCode.getTextInterface().println(" ");
	 
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	            eventRandom = (RNG.nextInt(80) + 360);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "NEAT" });
	          }
	        }
	        else if (!teamAttack) {
	          teamAttack = true;
	          GameCode.getTextInterface().println("THE BASEBALL PLAYERS ARE TO EXCITED FROM ANTICIPATING THE PITCH TO ATTACK");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "NEAT" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("THE BASEBALL PLAYERS ARE DEFEATED AND CAN'T ATTACK");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "NEAT" });
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("NEAT")) {
	        GameCode.getTextInterface().selected = "not important";
	        if ((docterAttack != false) && (docterDead == false)) {
	          if ((raltzDead != false) || (banditsDead != false) || (teamDead != false)) {
	            eventRandom = RNG.nextInt(2);
	            if (raltzDead != false) {
	              if (eventRandom == 1) {
	                GameCode.getTextInterface().println("THE DOCTOR USED A MAX REVIVE USELESS RALTZ IS BACK IN THE GAME");
	                raltzDead = false;
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "WICKED!" });
	              } else {
	                GameCode.getTextInterface().println("THE DOCTOR USES A REVIVE BUT THE MOVE FAILED");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "WICKED!" });
	              }
	            }
	            else if (banditsDead != false) {
	              if (eventRandom == 1) {
	                GameCode.getTextInterface().println("THE DOCTOR FIXES UP THE BANDIT TRIBE THEY ARE BACK IN THE FIGHT");
	                banditsDead = false;
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "WICKED!" });
	              } else {
	                GameCode.getTextInterface().println("THE DOCTOR IS TRYING TO HEAL THE BANDITS BUT THERE IS JUST TOO MANY WOUNDED TO DEAL WITH");
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "WICKED!" });
	              }
	            }
	            else if (eventRandom == 1) {
	              GameCode.getTextInterface().println("THE DOCTOR PATCHES UP THE BASEBALL TEAM AND THEY GET BACK TO PUMELING THE CONCREATE");
	              teamDead = false;
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "WICKED!" });
	            } else {
	              GameCode.getTextInterface().println("THE DOCTOR TRYS TO FIX THE BASEBALL TEAM BUT THEY ARE USING METAPHORES THE DOCTOR DOESEN'T GET");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "WICKED!" });
	            }
	            

	          }
	          else if (!healthSpray) {
	            GameCode.getTextInterface().println("THE DOCTOR USED HIS DOWN TIME TO GIVE YOU ANOTHER MEDICAL SPRAY");
	            healthSpray = true;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "WICKED!" });
	          } else {
	            GameCode.getTextInterface().println("THE DOCTOR HAS NOTHING TO DO SO HE MAKES A CORROSIVE MIXTURE AND THROWS IT AT AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYTEM");
	            GameCode.getTextInterface().println(" ");
	            eventRandom = (RNG.nextInt(240) + 160);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISNEHOWER HIGHWAY SYSTEM TOOK " + damage + " DAMAGE");
	            hywayHealth -= eventRandom;
	            GameCode.getTextInterface().selected = "not important";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "WICKED!" });
	          }
	          
	        }
	        else if (docterAttack == false) {
	          GameCode.getTextInterface().println("THE DOCTOR WAS TOO BUSY TAKEING CARE OF YOU TO WORRY ABOUT ANYBODY ELSE");
	          GameCode.getTextInterface().println(" ");
	          docterAttack = true;
	          GameCode.getTextInterface().query(new String[] { "WICKED!" });
	          GameCode.getTextInterface().selected = "not important";
	        } else {
	          GameCode.getTextInterface().println("THE DOCTOR'S CAR IS BROKEN AND HE CAN'T GET TO THE PACIENTS WITHOUT IT HE NEEDS THE MECHANIC TO FIX IT");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "WICKED!" });
	          GameCode.getTextInterface().selected = "not important";
	        }
	      }
	      
	      if (GameCode.getTextInterface().selected.equals("WICKED!")) {
	        eventRandom = (RNG.nextInt(8) + 1);
	        GameCode.getTextInterface().selected = "not important";
	        if (tiedUp) {
	          imbilizedTurns += 1;
	          if (imbilizedTurns != 5) {
	            GameCode.getTextInterface().println("THE GIGANTIC BEAST IS IMOBILIZED BY SOME CHAINS AND IS UNABLE TO ATTACK THIS TURN");
	            eventRandom = 420;
	          } else {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM PUSHES WITH ALL ITS MIGHT AND SNAPS THE TOW CABLE RIGHT IN HALF HE IS FREE TO ATTACK AGAIN");
	            tiedUp = false;
	            imbilizedTurns = 0;
	          }
	        }
	        if ((isConfused) && (eventRandom != 420)) {
	          if (eventRandom >= 6) {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TRYS TO ATTACK BUT IS TOO CONFUSED TO DO SO HE ENDS UP PUNCHING HIMSELF");
	            eventRandom = (RNG.nextInt(350) + 200);
	            hywayHealth -= eventRandom;
	            isConfused = false;
	            eventRandom = 420;
	          } else {
	            GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM IS CONFUSED BUT SMASHING SOME FOOLS DOESEN'T REQUIRE A LOT OF IQ");
	            eventRandom = (RNG.nextInt(8) + 1);
	            isConfused = false;
	          }
	        }
	        if ((lowAccuracy) && (eventRandom != 420)) {
	          if (eventRandom == 1) {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TRYS TO ATTACK BUT HE CAN'T BECASUE HIS ACCURACY IS LOWERED");
	            eventRandom = 420;
	          } else {
	            eventRandom = (RNG.nextInt(8) + 1);
	          }
	        }
	        if (eventRandom == 1) {
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HYWAY SYSTEM TRYS TO SQUISH YOU");
	          if (raltzDead == false) {
	            GameCode.getTextInterface().print("BUT USELESS RALTZ BLOCKS IT AND YOU ESCAPE");
	            GameCode.getTextInterface().println(" ");
	          } else {
	            eventRandom = (RNG.nextInt(550) + 850);
	            GameCode.getTextInterface().print("AND DOES YOU TAKE " + Integer.toString(eventRandom) + " DAMAGE");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	            GameCode.getTextInterface().println(" ");
	          }
	        }
	        if ((eventRandom == 2) || (eventRandom == 7) || (eventRandom == 9)) {
	          if (hasTeeth) {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STARTS SHOOTING A CRAPTON OF CARS OUT OF ITS TEETH THEY ALL GO FLYING INTO");
	            int random2;
	            int maxOptions = 7;
	            if (butterflySquad > 0) {
	            	maxOptions = maxOptions + 1;
	            }
	            if (sentryAttack) {
	            	maxOptions = maxOptions + 1;
	            }
	              eventRandom = (RNG.nextInt(maxOptions) + 1);
	              random2 = eventRandom;
	              while (random2 == eventRandom) {
	            	  random2 = (RNG.nextInt(maxOptions) + 1);
	              }
	            if (inBunker || eventRandom == 8 || random2 == 8) {
	              eventRandom = (RNG.nextInt(275) + 150);
	              GameCode.getTextInterface().print(" YOU IT HIT YOU FOR " + Integer.toString(eventRandom) + " DAMAGE ");
	              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	            }
	            if (!inBunker) {
	              if (((eventRandom == 1) || (random2 == 1)) && (raltzDead == false)) {
	                GameCode.getTextInterface().print(" USELESS RALTZ IT TAKES HER OUT ");
	                raltzDead = true;
	              }
	              if (((eventRandom == 2) || (random2 == 2)) && (felpeDead == false)) {
	                GameCode.getTextInterface().print(" THE MARSH-AN SAUSER IT FALLS OUT OF THE SKY ");
	                felpeDead = true;
	              }
	              if (((eventRandom == 3) || (random2 == 3)) && (banditsDead == false)) {
	                GameCode.getTextInterface().print(" THE BANDITS THEY GET WOUNDED ");
	                banditsDead = true;
	              }
	              if (((eventRandom == 4) || (random2 == 4)) && (mechanicDead == false)) {
	                GameCode.getTextInterface().print(" THE MECHANIC HIS CAR GETS DESTROYED ");
	                mechanicDead = true;
	              }
	              if (((eventRandom == 5) || (random2 == 5)) && (copsDead == false)) {
	                GameCode.getTextInterface().print(" THE COPS THIER SQUDEREN BREAKS DOWN ");
	                copsDead = true;
	              }
	              if (((eventRandom == 9) || (random2 == 9))) {
	            	  if (butterflySquad != 0) {
	                GameCode.getTextInterface().print(" A GROUP OF BUTTERFLYS 30 OF THEM DIED ");
	                butterflySquad -= 30;
	                if (butterflySquad < 0) {
	                  butterflySquad = 0;
	                }
	            	  } else {
	            		  this.print("THE SENTRY GUN IT IS DESTROYED");
	            		  sentryAttack = false;
	            	  }
	              }
	              if (((eventRandom == 10) || (random2 == 10))) {
	            	  this.print("THE SENTRY GUN IT IS DESTROYED");
            		  sentryAttack = false;
	              }
	              if (((eventRandom == 6) || (random2 == 6)) && (teamDead == false)) {
	                GameCode.getTextInterface().print(" THE BASEBALL PLAYERS THE TEAM IS DOWN ");
	                teamDead = true;
	              }
	              if (((eventRandom == 7) || (random2 == 7)) && (docterDead == false)) {
	                GameCode.getTextInterface().print(" THE DOCTOR HIS CAR BREAKS DOWN HE CAN'T HEAL PAICENTS WITHOUT GETTING TO THEM ");
	                docterDead = true;
	              }
	            }
	          } else {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM REPAIRS HIS TEETH");
	            hasTeeth = true;
	          }
	          eventRandom = 420;
	        }
	        if (eventRandom == 3) {
	          if ((felpeDead == false) && (!inBunker)) {
	            GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM BATTED THE MARSH-AN SAUCER OUT OF THE AIR WITH A BAT MADE OF CARS IT CRASHED INTO YOU");
	            eventRandom = (RNG.nextInt(200) + 220);
	            felpeDead = true;
	 
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	            GameCode.getTextInterface().println("SAUCER DESTROYED YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          } else {
	            GameCode.getTextInterface().println("OUT OF A WORMHOLE A HUGE BAT APPEARS MADE ENTIRLY OUR OF CARS YOU GET BASHED WITH IT YOUR CAR IS DESTROYED IF YOU HAVE ONE");
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND GIANT BATS MADE OUT OF THEM");
	            eventRandom = (RNG.nextInt(347) + 145);
	 
	            this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	            car = false;
	            GameCode.getTextInterface().println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	          }
	        }
	        if (eventRandom == 4) {
	          GameCode.getTextInterface().println("AUTOMOBEILS AND THE EISENHOWER HIGHWAY SYSTEM GRABED DIRT FROM ALL AROUND THE AREA IT CURED ITS BURN (IF IT HAD ONE) THE DIRT COVERING YOU MADE YOU LOSE POWER");
	          if (MobiusChase.hasButterflys) {
	            GameCode.getTextInterface().println("IT ALSO DESTROYED ALL NEWBORN BUTTERFLYS");
	            butterflyBirths = 0;
	          }
	          isBurrned = false;
	          playerBuffs -= 1;
	          if (playerBuffs < 0) {
	            playerBuffs = 0;
	          }
	        }
	        if ((eventRandom == 5) && (hasTeeth)) {
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM USED A CHOMPING ATTACK");
	          eventRandom = (RNG.nextInt(430) + 850);
	          GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	          GameCode.getTextInterface().println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if ((eventRandom == 6) || ((eventRandom == 5) && (!hasTeeth))) {
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM STARTS SHOOTING EYE LAZERS IT HITS");
	          int maxOptions = 7;
	            if (butterflySquad > 0) {
	            	maxOptions = maxOptions + 1;
	            }
	            if (sentryAttack) {
	            	maxOptions = maxOptions + 1;
	            }
	              eventRandom = (RNG.nextInt(maxOptions) + 1);
	          if (!inBunker) {
	            if ((eventRandom == 1) && (raltzDead == false)) {
	              GameCode.getTextInterface().print(" USELESS RALTZ IT TAKES HER OUT ");
	              raltzDead = true;
	            }
	            if ((eventRandom == 2) && (felpeDead == false)) {
	              GameCode.getTextInterface().print(" THE MARSH-AN SAUSER IT FALLS OUT OF THE SKY ");
	              felpeDead = true;
	            }
	            if ((eventRandom == 3) && (banditsDead == false)) {
	              GameCode.getTextInterface().print(" THE BANDITS THEY GET WOUNDED ");
	              banditsDead = true;
	            }
	            if ((eventRandom == 4) && (mechanicDead == false)) {
	              GameCode.getTextInterface().print(" THE MECHANIC HIS CAR GETS DESTROYED ");
	              mechanicDead = true;
	            }
	            if ((eventRandom == 5) && (copsDead == false)) {
	              GameCode.getTextInterface().print(" THE COPS THIER SQUDEREN BREAKS DOWN ");
	              copsDead = true;
	            }
	            if (eventRandom == 9) {
	            	if (butterflySquad != 0) {
	              GameCode.getTextInterface().print(" A GROUP OF BUTTERFLYS 30 OF THEM DIED ");
	              butterflySquad -= 30;
	              if (butterflySquad < 0) {
	                butterflySquad = 0;
	              }
	            	} else {
	            		 GameCode.getTextInterface().print(" THE SENTERY GUN IT GETS DESTROYED ");
	     	            sentryAttack = false;
	            	}
	            }
	            if ((eventRandom == 6) && (teamDead == false)) {
	              GameCode.getTextInterface().print(" THE BASEBALL PLAYERS THE TEAM IS DOWN ");
	              teamDead = true;
	            }
	            if ((eventRandom == 7) && (docterDead == false)) {
	              GameCode.getTextInterface().print(" THE DOCTOR HIS CAR BREAKS DOWN HE CAN'T HEAL PAICENTS WITHOUT GETTING TO THEM ");
	              docterDead = true;
	            }
	          }
	          if (eventRandom == 10) {
	            GameCode.getTextInterface().print(" THE SENTERY GUN IT GETS DESTROYED ");
	            sentryAttack = false;
	          }
	          
	          if ((inBunker) || eventRandom == 8) {
	            eventRandom = (RNG.nextInt(275) + 150);
	            GameCode.getTextInterface().print("YOU IT HIT YOU FOR " + Integer.toString(eventRandom) + " DAMAGE");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	          }
	          eventRandom = 420;
	        }
	        if (eventRandom == 8) {
	          eventRandom = (RNG.nextInt(4) + 1);
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM USED A SPIN ATTACK YOU WERE HIT " + Integer.toString(eventRandom) + " TIMES");
	          eventRandom = ((RNG.nextInt(180) + 145) * eventRandom);
	          GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	          GameCode.getTextInterface().println("YOU TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        if (isBurrned) {
	          eventRandom = (RNG.nextInt(120) + 100);
	          hywayHealth -= eventRandom;
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("THE FIRE STARTED TO CHIP AWAY AT THE CONCREATE IT DID " + Integer.toString(eventRandom) + " DAMAGE");
	        }
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "OUCH" });
	      }
	      if (GameCode.getTextInterface().selected.equals("OUCH")) {
	    	  if (isComunist) {
	    	        eventRandom = (RNG.nextInt(20) + 1);
	    	        if (eventRandom == 3) {
	    	          GameCode.getTextInterface().println("THE SOVIETS ARE ANGRY THAT THE BEAST BOUGHT A CANDY BAR LIKE A CAPTALIST SO THEY HIT IT WITH A NUCLEAR BOMB");
	    	          GameCode.getTextInterface().println(" ");
	    	          eventRandom = (RNG.nextInt(1000) + 5000);
	    	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM TOOK " + Integer.toString(eventRandom) + " DAMAGE");
	    	          hywayHealth -= eventRandom;
	    	          isComunist = false;
	    	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	    	        }
	    	      }
	        eventRandom = (RNG.nextInt(6) + 1);
	        inBunker = false;
	        if (eventRandom == 1) {
	          GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IS STANDING TALL");
	        }
	        if (eventRandom == 2) {
	          GameCode.getTextInterface().println("YOU WONDER IF SOMETHING LIKE A GINORMUS BEAST QUALIFYS FOR A PLACE IN A COMPYRIGHTED AUGMENTRED REALITY GAME");
	        }
	        if (eventRandom == 3) {
	          GameCode.getTextInterface().println("EVERYBODY IS COOPERATING TO SLOW DOWN MOBIUS");
	        }
	        if (eventRandom == 4) {
	          GameCode.getTextInterface().println("DARK CLOUDS HAVE FORMED IN THE DISTANCE PROVIDEING A PERFECT ATMOSPHERE FOR A FINAL BATTLE");
	        }
	        if (eventRandom == 5) {
	          GameCode.getTextInterface().println("THE MOUNTAINS IN THE DISTANCE LOOK PUNY COMPARED TO AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	        }
	        if (eventRandom == 6) {
	          GameCode.getTextInterface().println("YOU WONDER WHAT WILL BECOME OF THE ROADWAY IF YOU WIN THIS BATTLE");
	        }
	        if (eventRandom == 7) {
	          GameCode.getTextInterface().println("YOU WONDER IF MOBIUS IS CONTROLLING AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM OR IF THEY ARE ONE ENTITY");
	        }
	        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  HEALTH OF THE HIGHWAY SYSTEM " + Integer.toString(hywayHealth));
	        GameCode.getTextInterface().println("WHAT DO YOU DO");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "FIGHT", "ALLIES", "SPECIAL ATTACK" });
	        GameCode.getTextInterface().selected = "notimportant";
	      }
	    }
	}
