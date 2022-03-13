package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class MarshAns extends Location {
	int Martianhealth = 2000;
	boolean gasCoating = false;
	int eventRandom = 0;
	boolean isCoordinated = true;
	boolean felepesHappyness = true;
	int houseTurns = 3;
	Random RNG = new Random ();
	public MarshAns () {
		super(false);
	}
	@Override
	public void eventStart() {
		 
		this.changeMusic("music/marsh-ans theme version 2.wav", DataManager.getVolume());
	        GameCode.getTextInterface().println("AS YOU ARE DRVING ALONG YOU SUDDENLY REALISE YOU ARE BEING PULLED UPWARD YOU LOOK UP AND SEE THAT A UFO IS USING A TRACTOR BEAM ON YOU");
	        GameCode.getTextInterface().println("ONCE YOU ARE RAISED INTO THE USO YOU ARE INFORMED THAT THE MARSH-ANS ARE LED BY FELEPE COUSIN OF THE GUY WHO DID HOUSEWORK FOR THE NEPHEW OF THE KING OF MARS");
	        GameCode.getTextInterface().println("BASICLY FELEPE WANTS TO GET INTO HOUSEWORK TOO BUT CANT BECAUSE HE DOESEN'T HAVE THE ADMERIATION OF HIS COUSIN GUALUPE SO HE NEEDS TO KIDNAP A HUMAN TO BE USED");
	        GameCode.getTextInterface().println("IN ALIAN THOMPSONS ANATAMY EXPERMINT TO GET THE ADMERATION OF A TRUE HOUSEWORKER SO PREPARE FOR A FIGHT");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "FIGHT" });
	        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	 @Override
	public void runEventCode () {
		  if (GameCode.getDataManager().getPlayerHealth() <= 0) {
		        GameCode.getTextInterface().println("YOU WERE DEAFEATED BY THE MARSH-ANS AND TAKEN BACK TO THEIR HOME AND WERE USED AS A TEST SUBJECT IN ALIAN THOMPSONS EXPERMENT");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getDataManager().setPlayerHealth(700);
		      }
		      if (Martianhealth <= 0) {
		        
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		        GameCode.getTextInterface().println("YOU DEAFEATED THE MARSH-ANS AND DISCOVERED SOME STRNGE TECH ON THIER SHIP IT IS ");
		        GameCode.getTextInterface().println("INCREADBLY EFFICENT YOU INSTALL IT TO YOUR GAS TANK AND FIND THAT YOU ONLY NEED ");
		        GameCode.getTextInterface().println("TO USE HALF AS MUCH GAS AS YOU USED TO NOW");
		        GameCode.getTextInterface().println("GET MARSH-AN TECH ");
		        GameCode.getDataManager().setPlayerHealth(700);
		        Martianhealth = 2000;
		        gasCoating = false;
		        GameCode.getDataManager().marsianTech = true;
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		      }
		      if (GameCode.getTextInterface().selected.equals("FIGHT")) {
		        GameCode.getTextInterface().println("FELEPE AND THE MARSH-ANS ARE GONNA CUT YOU UP");
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  MARSH-ANS HEALTH  " + Martianhealth);
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("ATTACK")) {
		        eventRandom = (RNG.nextInt(9) + 1);
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("YOU SHOW FELEPE THE TRUE MEANING OF HOUSEWORKING ... USING GRAPHS AND STUFF IT WAS A PRETTY BORRNG LECUTRE AND AN EVEN LESS EFFECTIVE ATTACK");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if ((eventRandom >= 4) && (eventRandom <= 7)) {
		          GameCode.getTextInterface().println("YOU MIX A BUNCH OF RANDOM CHEMICALS FROM THE UFO LAB AND THROW IT AT THE MARSH-ANS");
		          eventRandom = (RNG.nextInt(100) + 490);
		          this.playSoundEffect(6.0F, "soundEffects/beaker smash.wav");
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("THE MARSH-ANS TOOK " + damage + " DAMAGE");
		          Martianhealth -= eventRandom;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		          GameCode.getTextInterface().println("YOU PUSH THE HUGE SELF DESTRUCT BUTTON ON THE SHIP DOES NOT DESTROY THE SHIP BUT IT DOES EXPLODE ALL THIER ARMOR SO WIN ILL TAKE IT");
		          eventRandom = (RNG.nextInt(310) + 90);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("THE MARSH-ANS TOOK " + damage + " DAMAGE");
		          Martianhealth -= eventRandom;
		          GameCode.getTextInterface().println(" ");
		          if (gasCoating) {
		            GameCode.getTextInterface().println("FELEPES HOUSE BURNED DOWN HE IS HEARTBROKEN");
		            isCoordinated = false;
		            felepesHappyness = false;
		          }
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		      }
		      
		      if (GameCode.getTextInterface().selected.equals("ITEMS")) {
		        GameCode.getTextInterface().println("WHICH ITEM DO YOU WANT TO USE");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println(" ");
		        
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "5 PERCENT GRAIN", "3 GAS", "RADIO", "STATBOOK", "BACK" });
		      }
		      if (GameCode.getTextInterface().selected.equals("5 PERCENT GRAIN")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (GameCode.getDataManager().grain >= 5) {
		          GameCode.getTextInterface().println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
		          GameCode.getDataManager().setPlayerHealth(700);
		          GameCode.getDataManager().grain -= 5;
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        } else {
		          GameCode.getTextInterface().println("BUT THERE WAS NO GRAIN LEFT!");
		          GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("3 GAS")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (GameCode.getDataManager().gas >= 2.0D) {
		             this.playSoundEffect(6.0F, "soundEffects/GameCode.getDataManager().gas spill.wav");
		          GameCode.getTextInterface().println("YOU COATED FELPES PASSION PROJECT (HOUSE) WITH GAS IF AN EXPLOSION WENT OFF THAT WOULD BE BAD FOR HIM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getDataManager().gas -= 3.0D;
		          gasCoating = true;
		        } else {
		          GameCode.getTextInterface().println("BUT THERE WAS NO GAS LEFT!");
		          GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("RADIO")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (GameCode.getDataManager().workingRadio) {
		          if (!isCoordinated) {
		            GameCode.getTextInterface().println("YOU TURNED THE RADIO ON ... BUT FELEPE DOESEN'T CARE");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          GameCode.getTextInterface().println("YOU TURNED THE RADIO ONTO A HOUSE TALK SHOW FELEPE WONT BE ABLE TO CONCENTRATE FOR THIS TURN");
		          isCoordinated = false;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        } else {
		          GameCode.getTextInterface().println("BUT YOU DON'T HAVE A RADIO ANYMORE");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("STATBOOK")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("FELEPE IS NOT THE ONLY NOTE-WORTHY MARSH-AN, OF COURSE THERE IS GUALUPE COUSIN OF FELEPE THAT DID THE HOUSEWORK FOR THE NEPHEW OF THE KING, HE WAS ALSO");
		        GameCode.getTextInterface().println("A FAIRLY POPULAR FIGHTER MOST HISTORYANS BELIVE THAT HE WAS THE MAIN REASON FOR THE SUCCESS OF THE BATTLE OF THE MEDIUM RED CANYON AND OF COURSE THE KINGS");
		        GameCode.getTextInterface().println("NEHPEW HIMSELF THAT LED NOT SO FEARLESSLY INTO BATTLE AT THE LARGE RED CANYON.  WHY DO PEOPLE ALWAYS THINK KINGS WOULD CHARGE FEARLESSLY INTO BATTLE THEY ");
		        GameCode.getTextInterface().println("HAVE JUST AS MUCH MILLATARY TRAINING AS EVERYBODY ELSE, AND ARGUABLY LESS BECAUSE THEY HAVE HAD A COUSHY DO NOTHING LIFE SO FAR ANYWAY BEAT FELEPE BY");
		        GameCode.getTextInterface().println("BURRNING DOWN HIS HOUSE WITH GAS AND EXPLOSIONS");
		        GameCode.getTextInterface().println("");
		        GameCode.getTextInterface().query(new String[] { "EPIC" });
		      }
		      if (GameCode.getTextInterface().selected.equals("BACK")) {
		        GameCode.getTextInterface().selected = "FIGHT";
		      }
		      if (GameCode.getTextInterface().selected.equals("RUN")) {
		        GameCode.getTextInterface().println("YOUR ON A UFO WHERE ARE YOU GONNA GO?");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "EPIC" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("EPIC")) {
		    	  String chair = " ";
		    	  if (GameCode.getDataManager().foldingChair) {
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
		            GameCode.getTextInterface().println("THE MARSH-ANS SHOOT OUT A COOL LAZER BEAM THING");
		            GameCode.getTextInterface().println(" ");
		 
		            this.playSoundEffect(6.0F, "soundEffects/lazer.wav");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(255) + 70);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + "  DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
		            }
		            GameCode.getTextInterface().selected = "unimportant";
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		          }
		          if ((eventRandom >= 4) && (eventRandom <= 7)) {
		            GameCode.getTextInterface().println("THE MARSHIANS BUILD A HOUSE AROUND YOU AND EXPLODE IT WITH YOU IN THERE");
		            GameCode.getTextInterface().println(chair);
		 
		            this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(450) + 20);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom); 
		            }
		            GameCode.getTextInterface().println(" ");
		            if (gasCoating) {
		                GameCode.getTextInterface().println("FELEPES HOUSE BURNED DOWN HE IS HEARTBROKEN");
		                isCoordinated = false;
		                felepesHappyness = false;
		              }
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		            GameCode.getTextInterface().println("THE MARSH-ANS SCAN YOUR BRAIN USING A HIGH TECH HELMET AND USE THE DATA TO PREDICT YOUR EVERY MOVE IT WORKS VERY WELL AND THEY GET SOME GOOD HITS IN");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(120) + 230);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        } else {
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("A MARSH-AN SHOOTS A TROPICAL FLAVORED TAFFY AT YOU ... WAIT NO THATS SLIME DEFFINITLY SLME");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(100) + 120);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom >= 4) && (eventRandom <= 7)) {
		        	  GameCode.getTextInterface().println(chair);
		              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		            	  String damag = Integer.toString(0);
		                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		              } else {
		            eventRandom = (RNG.nextInt(228) + 100);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().print("A MARSHAN DRINKS A WIERD LIQUID THEN TRANSFORMS INTO A GIANT AND SLASHES YOU WITH HIS CLAW ");
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		              }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		            GameCode.getTextInterface().println("FELEPE IS TAKEING A COFFEE BREAK");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          isCoordinated = true;
		        }
		      }
		      if ((isCoordinated) && (!felepesHappyness)) {
		        isCoordinated = false;
		      }
		      if (GameCode.getTextInterface().selected.equals("OUCH")) {
		        eventRandom = (RNG.nextInt(9) + 1);
		        if (isCoordinated) {
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("THE MARSH-ANS ARE CONTIMPLATING THIER NAME ");
		          }
		          if ((eventRandom <= 7) && (eventRandom >= 4)) {
		            GameCode.getTextInterface().println("THE MARSH-ANS ARE DISSCUSING ALIAN THOMPSONS LECTURE");
		          }
		          if (eventRandom >= 8) {
		            GameCode.getTextInterface().println("THE MARSH-ANS ARE BUILDING A HOUSE");
		          }
		        } else {
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("FELEPE IS WORKING ON A GRAVE FOR HIS HOUSE ");
		          }
		          if ((eventRandom <= 7) && (eventRandom >= 4)) {
		            GameCode.getTextInterface().println("FELEPE CANT STOP CRYING ");
		          }
		          if (eventRandom >= 8) {
		            GameCode.getTextInterface().println("FELPE IS TRYING TO CALL HIS COUSIN");
		          }
		        }
		        if (GameCode.getDataManager().isPoisoned()) {
		          eventRandom = (RNG.nextInt(75) + 25);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
		          GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
		        }
		        
				if (DataManager.isHardModeEnabled()) {
		        	eventRandom = RNG.nextInt(houseTurns + 3);
		        	houseTurns = houseTurns - 1;
		        	if (eventRandom == 0) {
		        		GameCode.getTextInterface().println("FELEPES HOUSE WAS REBUILT HE IS READY TO FOCUS ON BATTLE AGAIN");
		        		isCoordinated = true;
		        		felepesHappyness = true;
		        		houseTurns = 3;
		        	}
		        }
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  MARSH-ANS HEALTH  " + Martianhealth);
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("DARN IT")) {
		        
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
				probablity = probablity + 4;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
