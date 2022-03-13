package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class KidBoss extends Location {
	int KidHealth;
	int eventRandom = 0;
	Random RNG = new Random ();
	boolean gasCoating = false;
	public KidBoss () {
		super(false);
	}
	@Override
	public void eventStart() {
		   GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
   		GameCode.getTextInterface().println("AS YOU ARE DRVING ALONG THE EISENHOWER HIGHWAY SYSTEM YOU SEE A KID ON THE SIDE OF THE ROAD YOU SLOW DOWN TO TALK WITH HIM");
   		GameCode.getTextInterface().println("YOU START SAYING HI BUT BEFORE YOU CAN FINISH THE MAN SCREAMS OUT");
   		GameCode.getTextInterface().println("SUBSCRIBE TO PEWDIEPIE (YOU REMEMBER THAT IT MAY BE USEFUL AT SOME POINT)");
   		GameCode.getTextInterface().println("THE KID EXPLAINS THAT HE GOT THROWN OUT OF HIS HOUSE FOR SPENDNG $399 ON A CHAIR FROM HIS FAVORATE YOUTUBER HE BEGS YOU TO");
   		GameCode.getTextInterface().println("GIVE HIM 399 DOLLARS SO HE CAN PAY FOR THE CHAIR (HE MAY BE VERY ANGRY IF YOU REFUSE)");
   		GameCode.getDataManager();
			if (DataManager.isHardModeEnabled()) {
   			KidHealth = 2000;
   		}
   		GameCode.getDataManager();
			this.changeMusic("music/ROAD RAGE!.wav", DataManager.getVolume());
           GameCode.getTextInterface().query(new String[] { "GIVE HIM 399", "SCREW THIS" });
	}
	 @Override
	public void runEventCode () {
		 if (GameCode.getDataManager().getPlayerHealth() <= 0) {
	            GameCode.getTextInterface().println("GG EZ UTTERS THE KID AS HE QUICKSCOPES YOU OUT OF RELAVENCE A FEW DAYS LATER YOU FIND YOUR CREDIT CARD");
	            GameCode.getTextInterface().println("HAS BEEN OVERCHARGED DUE TO MULTIPLE CHARGES FOR FORKNIFE SKINS");
	            GameCode.getTextInterface().selected = "unimportant";
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println("THANK GOD FOR FORKNIFE AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "DARN IT" });
	            GameCode.getTextInterface().selected = "unimportant";
	            GameCode.getDataManager().setPlayerHealth(700);
	          }
	          if (KidHealth <= 0) {
	            GameCode.getTextInterface().println("");
	            GameCode.getTextInterface().println("CONGRADULATIONS YOU BEAT UP A CHILD IF THIS GAME WAS ACCURATE YOU WOULD GET A CRIMINAL RECORD FOR THIS ... BUT FROM A GAME DESIGN");
	            GameCode.getTextInterface().println("PERSPECTIVE IT IS A REALLY BAD IDEA TO PUNISH THE PLAYER FOR BEATING A BOSS SO YOU TAKE THE KIDS CHAIR ITS ABILITY TO BEND DOWN");
	            GameCode.getTextInterface().println("WILL HELP YOU IN BATTLE");
	            GameCode.getDataManager().foldingChair = true;
	            GameCode.getDataManager().setPlayerHealth(700);
	            KidHealth = 1500;
	            GameCode.getTextInterface().selected = "unimportant";
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND BAD HISTORICAL ACCURACY IN VIDEO GAMES");
	            GameCode.getTextInterface().println(" ");
	        
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          }
	          if (GameCode.getTextInterface().selected.equals("GIVE HIM 399")) {
	            if (GameCode.getDataManager().money >= 399) {
	              GameCode.getTextInterface().println("YOU PAY THE KID FOR HIS CHAIR HE IMMEDIATELY GETS ON HIS PHONE AND BUYS ANOTHER CHAIR WITH THE MONEY BUT HE LETS YOU PASS");
	              GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBILES AND THE EISENHOWER HIGHWAY SYSTEM");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().println("PAY 399 DOLLARS");
	              GameCode.getDataManager().money -= 399;
	              GameCode.getTextInterface().println(" ");
	          
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	              GameCode.getTextInterface().selected = "unimportant";
	            } else {
	              GameCode.getTextInterface().println("YOU DONT HAVE ENOGH MONEY TO GET HIM THE CHAIR WHICH MAKES HIM EVEN MORE MAD.  HE REFUSES TO LEAVE YOU ALONE UNTIL YOU PAY");
	              GameCode.getTextInterface().selected = "unimportant";
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "SCREW THIS" });
	            }
	          }
	          
	          if (GameCode.getTextInterface().selected.equals("SCREW THIS")) {
	            GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD SHOUTS REEEEEEEEEE ..... AND THEN HE LIKE ATTACKS OR SOMETHING");
	            GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  9 YEAR OLD HEALTH  " + KidHealth);
	            GameCode.getTextInterface().println("WHAT DO YOU DO");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
	            GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (GameCode.getTextInterface().selected.equals("ATTACK")) {
	        	eventRandom = RNG.nextInt(3);
	        	String chair;
	        	if (eventRandom == 1) {
	        		chair = "BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE";
	        	} else {
	        		chair = " ";
	        	}
	            eventRandom = (RNG.nextInt(9) + 1);
	            if (eventRandom <= 3) {
	              GameCode.getTextInterface().println("YOU EXPLAIN TO THE RAGEING 9 YEAR OLD THAT WHAT HE IS DOING IS WRONG .... HE DIDEN'T UNDERSTAND");
	              GameCode.getTextInterface().println("*SIGH* DEFINITLY A PEWDIEPIE SUBSCRIBER");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	            if ((eventRandom >= 4) && (eventRandom <= 7)) {
	              GameCode.getTextInterface().println("YOU SUBSCRIBE TO T-(CAN'T PUT THERE NAME HERE WITHOUT GETTING SUIED PROBABLY) THE 9 YEAR OLD IS DISGUSTED");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().println(chair);
	              if(chair.equals("BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
	            	  String damage = Integer.toString(0);
	                  GameCode.getTextInterface().println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
	              } else {
	              eventRandom = (RNG.nextInt(60) + 60);
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
	              KidHealth -= eventRandom;
	              }
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
	              GameCode.getTextInterface().println("YOU ATTEMPT TO PUNCH THE 9 YEAR OLD HE DODGES IT THEN FALLS OVER AND HURTS HIMSELF");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().println(chair);
	              if(chair.equals("BUT THE ENEMY FLATTENED HIS CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
	            	  String damage = Integer.toString(0);
	                  GameCode.getTextInterface().println("THE 9 YEAR OLD TOOK " + damage + " DAMAGE");
	              } else {
	              eventRandom = (RNG.nextInt(180) + 20);
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("THE KID TOOK " + damage + " DAMAGE");
	              KidHealth -= eventRandom;
	              }
	              GameCode.getTextInterface().println(" ");
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
	              GameCode.getDataManager().setPlayerHealth (700);
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
	                 this.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
	              GameCode.getTextInterface().println("YOU COATED THE 9 YEAR OLD IN GAS IF THERE WAS ANY FIRE AROUND HE WOULD TAKE MAJOR DAMAGE");
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
	            	if (gasCoating) {
	              GameCode.getTextInterface().println("YOU USE THE RADIO TO PLAY YOUR MIXTAPE THE KID TAKES MASSIVE DAMAGE BECAUSE HE IS COVERED IN GAS AND THE TAPE IS FIRE");
	              eventRandom = (RNG.nextInt(300) + 300);
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("THE KID TOOK " + damage + " DAMAGE");
	              KidHealth -= eventRandom;
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            	}else {
	              GameCode.getTextInterface().println("YOU TURN ON THE RADIO YOU HEAR A SWEEDISH MAN SINGING SOME STUPID HEJ HEJ MUMBO JUMBO THE KID SEEMS TO LIKE IT");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            	}
	            } else {
	              GameCode.getTextInterface().println("BUT YOU DON'T HAVE A RADIO ANYMORE");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            }
	          }
	          if (GameCode.getTextInterface().selected.equals("STATBOOK")) {
	            GameCode.getTextInterface().selected = "unimportant";
	            GameCode.getTextInterface().println("RAGEING 9 YEAR OLD A KID WHO IS ON A MISSION FROM STOPPING INDIA FROM OVERTAKEING THE BIGGEST YOUTUBER BUT HE IS STILL A 9 YEAR OLD");
	            GameCode.getTextInterface().println("SO THAT MEANS LOTS OF DABBING FIDGET SPINNERS AND OTHER THINGS I CAN'T EVEN PUT IN THIS GAME BECAUSE WHEN I TRY TO THE COMPUTER CRINGES SO");
	            GameCode.getTextInterface().println("MUCH IT CRASHES AND NEVER RUNS AGAIN");
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          }
	          if (GameCode.getTextInterface().selected.equals("BACK")) {
	            GameCode.getTextInterface().selected = "SCREW THIS";
	          }
	          if (GameCode.getTextInterface().selected.equals("RUN")) {
	            eventRandom = RNG.nextInt(2);
	            if (eventRandom == 0) {
	              GameCode.getTextInterface().println("YOU TRY TO RUN FROM THE KID YOU GET AWAY BUT A BIT OF BLOOD IS LEFT ON YOUR TRUCK SEEMS LIKE YOU GOTTA A CRIMINAL RECORD");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().println("GET CRIMINAL RECORD");
	              GameCode.getDataManager().isCriminal = true;
	          
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	              GameCode.getTextInterface().selected = "unimportant";
	            } else {
	              GameCode.getTextInterface().println("YOU TRY TO RUN BUT THE KID QUICKSCOPES YOU LIKE THE TRUE SCRUB YOU ARE");
	              eventRandom = (RNG.nextInt(70) + 40);
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
	              GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            }
	          }
	          if (GameCode.getTextInterface().selected.equals("EPIC")) {
	            eventRandom = (RNG.nextInt(9) + 1);
	              if (eventRandom <= 3) {
	                GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD DOES A SICK DAB RIGHT ON YOUR FACE IT KNOCKS YOU OUT OF THE PARK");
	                eventRandom = (RNG.nextInt(180) + 70);
	                String damage = Integer.toString(eventRandom);
	                GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
	                GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "OUCH" });
	                GameCode.getTextInterface().selected = "unimportant";
	              }
	              if ((eventRandom >= 4) && (eventRandom <= 7)) {
	                GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD DRINKS A CAN OF MOUNTAIN LIGHTNING YOU DIE OF JEALOUSY ... WELL MAYBE NOT DIE BUT TAKE DAMAGE I GUESS");
	                eventRandom = (RNG.nextInt(60) + 100);
	                String damage = Integer.toString(eventRandom);
	                GameCode.getTextInterface().print("IT WAS VERY EFFECTIVE ");
	                GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
	                GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "OUCH" });
	                GameCode.getTextInterface().selected = "unimportant";
	              }
	              if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
	                GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD SCREAMES THATS RIGHT GET NOSCOPED GET NOSCOPED YOU ARE CONFUSED CAUSE THERE ARE NO GUNS AROUND MUCH LESS");
	                GameCode.getTextInterface().println("SCOPES HE THEN PUNCHES YOU");
	                eventRandom = (RNG.nextInt(60) + 40);
	                String damage = Integer.toString(eventRandom);
	                GameCode.getTextInterface().print("IT WAS VERY EFFECTIVE ");
	                GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
	                GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
	                GameCode.getTextInterface().println(" ");
	                GameCode.getTextInterface().query(new String[] { "OUCH" });
	                GameCode.getTextInterface().selected = "unimportant";
	              }
	            }
	          if (GameCode.getTextInterface().selected.equals("OUCH")) {
	            eventRandom = (RNG.nextInt(9) + 1);
	            if (eventRandom <= 3) {
	              GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD IS JAMMING OUT TO HIS THEME MUSIC (HE DOESEN'T LIKE IT BUT IT HAPPY HE FINALLY HAS IT)");
	            }
	            if ((eventRandom <= 7) && (eventRandom >= 4)) {
	              GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD JUST REMEMBER THIS TAKES PLACE IN THE FIFTYS");
	            }
	            if (eventRandom >= 8) {
	              GameCode.getTextInterface().println("THE RAGEING 9 YEAR OLD PUTS ON SOME VLOGGER MERCH");
	            }
	            if (GameCode.getDataManager().isPoisoned()) {
	              eventRandom = (RNG.nextInt(75) + 25);
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
	            }
	            GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  9 YEAR OLD HEALTH  " + KidHealth);
	            GameCode.getTextInterface().println("WHAT DO YOU DO");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
	            GameCode.getTextInterface().selected = "unimportant";
	          }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 3;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			if (GameCode.getDataManager().foldingChair) {
				probablity = 0;
			}
			return probablity;
	 }
}
