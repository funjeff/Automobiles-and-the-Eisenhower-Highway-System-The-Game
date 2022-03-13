package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class BanditFight extends Location {
	int playerHealth = 700;
	int banditHealth = 1500;
	int radioUsed = 0;
	boolean gasCoating = false;
	boolean isCoordinated = true;
	int eventRandom = 0;
	Random RNG = new Random ();
	public BanditFight () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	        GameCode.getTextInterface().println("AS YOU ARE DRVING ALONG YOU ARE BLOCKED BY A GROUP OF BANDITS EACH ONE IS CARRING A LARGE SHOTGUN THEY DEMAND YOU PAY THEM 450 DOLLARS TO PASS");
	        GameCode.getTextInterface().println("450 MIGHT SEEM LIKE A LOT BUT BANDITS LIKE THIS ARE USALLY EXEPTIONALLY CRUEL IF YOU FIGHT BACK");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
			this.changeMusic("music/vs bandits.wav", DataManager.getVolume());
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "FIGHT", "PAY 450 DOLLARS" });
	}
	 @Override
	public void runEventCode () {
		 if (playerHealth <= 0) {
		        GameCode.getTextInterface().println("YOU WERE DEAFEATED THE BANDITS DECIDE TO TIE YOU TO A POLE STEAL YOUR CAR AND ALL YOUR MONEY AND YOU REMAINED TIED TO THAT POLE FOREVER");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getDataManager().setPlayerHealth(700);
		      }
		      if (banditHealth <= 0) {
		        GameCode.getTextInterface().println("YOU DEAFEATED THE BANDITS AFTERWARDS YOU TURN THEM INTO THE POLICE AND RECIVE A REWARD OF 300 DOLLARS");
		        GameCode.getTextInterface().println("THE COPS ARE SO IMPRESSED THAT THEY CLEAR YOUR NAME OF ANY PRIVIOS CRIMES");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("GAIN 300 DOLLARS CLEAR RECORD");
		        GameCode.getDataManager().isCriminal = false;
		        GameCode.getDataManager().money += 300;
		        radioUsed = 0;
		        banditHealth = 1500;
		        gasCoating = false;
		        isCoordinated = true;
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		        GameCode.getTextInterface().println(" ");
		    
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		      }
		      if (GameCode.getTextInterface().selected.equals("PAY 450 DOLLARS")) {
		        if (GameCode.getDataManager().money >= 450) {
		          GameCode.getTextInterface().println("YOU PAY THE BANDITS OFF THEY KEEP TO THIER WORD AND LET YOU PASS");
		          GameCode.getTextInterface().println("THANK GOD FOR TRUSTWORTHY BANDITS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("PAY 450 DOLLARS");
		          GameCode.getDataManager().money -= 450;
		          GameCode.getTextInterface().println(" ");
		      
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        } else {
		          GameCode.getTextInterface().println("YOU DONT HAVE ENOGH MONEY TO PASS THE BANDITS BARRIER SO THEY DECIDE TO TAKE 10 PERCENT OF YOUR GRAIN TO MAKE UP FOR THE EXTRA MONEY");
		          GameCode.getTextInterface().println("LOSE ALL MONEY");
		          GameCode.getTextInterface().println("LOSE 10 PERCENT GRAIN");
		          GameCode.getDataManager().money = 0;
		          GameCode.getDataManager().grain -= 10;
		          GameCode.getTextInterface().selected = "unimportant";
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("THANK GOD FOR NEGOCIATIONS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		      }
		      
		      if (GameCode.getTextInterface().selected.equals("FIGHT")) {
		        GameCode.getTextInterface().println("THE BANDITS BLOCK THE WAY ");
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  BANDIT HEALTH  " + banditHealth);
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("ATTACK")) {
		        eventRandom = (RNG.nextInt(9) + 1);
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("YOU THROW A DEADLY PUNCH ... THEN THE BANDIT MOVES SLIGHTLY TO THE LEFT AND DODGES IT ATTACK FAILED");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if ((eventRandom >= 4) && (eventRandom <= 7)) {
		          GameCode.getTextInterface().println("YOU PICK UP A ROCK AND THROW IT AT THE BANDITS IT DOES SOME DAMAGE");
		          eventRandom = (RNG.nextInt(120) + 120);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("THE BANDITS TOOK " + damage + " DAMAGE");
		          banditHealth -= eventRandom;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		          GameCode.getTextInterface().println("YOU RAM THEM WITH THE CAR IT WAS VERY EFFECTIVE");
		          eventRandom = (RNG.nextInt(320) + 230);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("THE BANDITS TOOK " + damage + " DAMAGE");
		          banditHealth -= eventRandom;
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
		          this.playSoundEffect(6.0F, "soundEffects/gas spill.wav");
		          GameCode.getTextInterface().println("YOU COATED THE BANDITS IN GAS IF THEY TRY AND USE THIER SHOTGUNS IT COULD HAVE SIDEFFECTS");
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
		        	if (DataManager.isHardModeEnabled()) {
		        		if (radioUsed == 2) {
		        			GameCode.getTextInterface().println("THE BANDITS FINALLY GOT DISTRACTED BY THE NOISE THEY ARE NO LONGER ABLE TO CONCENTRATE");
		        			isCoordinated = false;
		        			GameCode.getTextInterface().println(" ");
		        			   GameCode.getTextInterface().query(new String[] { "EPIC" });
		        		} else {
		        		GameCode.getTextInterface().println("YOU TURRNED ON THE RADIO THE BANDITS ARE STILL FOCUSED YOU MAY HAVE TO USE THE RADIO AGAIN");
		        		radioUsed = radioUsed + 1;
		        		 GameCode.getTextInterface().query(new String[] { "EPIC" });
		        		}
		        	} else {
		          GameCode.getTextInterface().println("YOU TURNED THE RADIO ONTO SOME VERY DISTRACTING MUSIC THE BANDITS ARE NO LONGER ABLE TO CONCENTRATE");
		          isCoordinated = false;
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
		        GameCode.getTextInterface().println("BANDITS GREEDY PEOPLE WHO TAKE WHAT THEY WANT FROM PASSERBYS THEY HAVE VERY COORDINATED ATTACKS DISTRACT THEM TO MAKE THEM WEAKER");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "EPIC" });
		      }
		      if (GameCode.getTextInterface().selected.equals("BACK")) {
		        GameCode.getTextInterface().selected = "FIGHT";
		      }
		      if (GameCode.getTextInterface().selected.equals("RUN")) {
		        eventRandom = RNG.nextInt(1);
		        if (eventRandom == 0) {
		          GameCode.getTextInterface().println("YOU RUN FROM THE BANDITS YOU ESCAPE BUT YOU RAN SO FAST YOU DIDEN'T NOTICE YOU HOLD WAS EMPTY AND YOU LOST A LOT OF YOUR GRAIN");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("LOSE 20 PERCENT GRAIN");
		          GameCode.getDataManager().grain -= 20;
		      
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        } else {
		          GameCode.getTextInterface().println("YOU TRY TO RUN BUT THE BANDITS WONT LET YOU");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        }
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
		            GameCode.getTextInterface().println("A BANDIT STARTS ATTEMPTING TO PUNCH YOU YOU ARE ABLE TO BLOCK HIS PUNCHES UNTIL ANOTHER BANDIT COMES FROM BEHIND AND SMACKS YOU WITH A BOARD");
		            GameCode.getTextInterface().println(" ");
		            this.playSoundEffect(6.0F, "soundEffects/punch.wav");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damage = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damage + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(255) + 70);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().selected = "unimportant";
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		          }
		          if ((eventRandom >= 4) && (eventRandom <= 7)) {
		            GameCode.getTextInterface().println("THE BANDITS FORM A FIREING SQUAD AND SHOOT ALL THIER SHOTGUNS AT YOU AT ONCE");
		            eventRandom = (RNG.nextInt(350) + 100);
		            this.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
		            String damage = Integer.toString(eventRandom);
		            if (gasCoating) {
		              GameCode.getTextInterface().print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
		              GameCode.getTextInterface().println("THE BANDITS TOOK " + damage + " DAMAGE");
		              banditHealth -= eventRandom;
		              gasCoating = false;
		            } else {
		              GameCode.getTextInterface().print("IT WAS VERY EFFECTIVE");
		              GameCode.getTextInterface().println(chair);
		              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		            	  String damag = Integer.toString(0);
		                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		              } else {
		              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		              GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		              }
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		            GameCode.getTextInterface().println("THE BANDITS SURROUND AND TAKLE YOU");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(120) + 230);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        } else {
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("A BANDIT STARTS ATTEMPTING TO PUNCH YOU YOU ARE ABLE TO BLOCK HIS PUNCHES PRETTY WELL HE ONLY GETS A FEW HITS IN");
		            GameCode.getTextInterface().println(chair);
		            this.playSoundEffect(6.0F, "soundEffects/punch.wav");
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            eventRandom = (RNG.nextInt(55) + 70);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom >= 4) && (eventRandom <= 7)) {
		            GameCode.getTextInterface().println("A BANDIT TRYS TO SHOOT YOU WITH HIS SHOTGUN");
		            eventRandom = (RNG.nextInt(150) + 100);
		            this.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
		            String damage = Integer.toString(eventRandom);
		            if (gasCoating) {
		              GameCode.getTextInterface().print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
		              GameCode.getTextInterface().println("THE BANDITS TOOK " + damage + " DAMAGE");
		              banditHealth -= eventRandom;
		              gasCoating = false;
		            } else {
		              GameCode.getTextInterface().print("IT WAS VERY EFFECTIVE ");
		              GameCode.getTextInterface().println(chair);
		              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		            	  String damag = Integer.toString(0);
		                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		              } else {
		              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		              GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);
		            }
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		            GameCode.getTextInterface().println("A BANDIT TRYS TO SHOOT YOU WITH HIS SHOTGUN");
		            eventRandom = (RNG.nextInt(120) + 230);
		            this.playSoundEffect(6.0F, "soundEffects/shotgun.wav");
		            String damage = Integer.toString(eventRandom);
		            if (gasCoating) {
		              GameCode.getTextInterface().print("IT BACKFIRED DUE TO THE GAS COATING AND THEY TOOK THE DAMAGE (GAS COATING WEARS OFF)");
		              GameCode.getTextInterface().println("THE BANDITS TOOK " + damage + " DAMAGE");
		              banditHealth -= eventRandom;
		              gasCoating = false;
		            } else {
		              GameCode.getTextInterface().print("THE BANDIT MISSED");
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("OUCH")) {
		        eventRandom = (RNG.nextInt(9) + 1);
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("THE BANIDITS ARE MEMEING AROUND ");
		        }
		        if ((eventRandom <= 7) && (eventRandom >= 4)) {
		          GameCode.getTextInterface().println("THE BANIDITS LOOK THREATING");
		        }
		        if (eventRandom >= 8) {
		          GameCode.getTextInterface().println("THE BANIDITS ARE READY TO TEAR YOU UP ");
		        }
		        if (GameCode.getDataManager().isPoisoned()) {
		          eventRandom = (RNG.nextInt(75) + 25);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
		        }
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  BANDIT HEALTH  " + banditHealth);
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
			int probablity = 2;
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 5;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 1;
			}
			return probablity;
	 }
}
