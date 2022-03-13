package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class RaltzBattle extends Location {
	int buffCount = 0;
	int raltzHealth = 160;
	boolean gasCoating = false;
	int eventRandom = 0;
	boolean usedTrumpCard = false;
	Random RNG = new Random ();
	public RaltzBattle () {
		super(false);
	}
	@Override
	public void eventStart() {
		
		this.changeMusic("music/extrasensory.wav", DataManager.getVolume());
		        GameCode.getTextInterface().println("AS YOU ARE DRVING ALONG YOU ARE ASTONISHED TO SEE A SMALL CREATURE PICK UP YOUR ENTIRE CAR");
		        GameCode.getTextInterface().println("A VOICE IN YOUR HEAD TELLS YOU TO GIVE IT 20 PERCENT OF YOUR GRAIN AND IT WILL GO AWAY");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		       
				if (DataManager.isHardModeEnabled()) {
		        	buffCount = 1;
		        }
		        GameCode.getTextInterface().query(new String[] { "FIGHT", "LISTEN TO THE VOICE IN YOUR HEAD" });
		        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	 @Override
	public void runEventCode () {
		 if (GameCode.getDataManager().getPlayerHealth() <= 0) {
		        GameCode.getTextInterface().println("YOU WERE DEAFEATED AND PAIED OUT ONE CAR TO THE WINNER YOU WHITED OUT");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        GameCode.getDataManager().setPlayerHealth(700);
		      }
		      if (raltzHealth <= 0) {
		        GameCode.getTextInterface().println("YOU DEAFEATED THE RALTZ AFTERWARDS YOU CHECK HER OUT AND FIND AN AMULET COIN USING IT YOU CAN GET MORE MONEY FROM ODD JOBS AND SUCH");
		        GameCode.getDataManager().amuletCoin = true;
		       
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		        GameCode.getDataManager().setPlayerHealth(700);
		        raltzHealth = 160;
		        gasCoating = false;
		        buffCount = 0;
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("LISTEN TO THE VOICE IN YOUR HEAD")) {
		       
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
		        if (GameCode.getDataManager().grain >= 21) {
		          GameCode.getTextInterface().println("YOU GIVE UP 20 PERCENT OF YOUR GRAIN AND SHE RETURNS YOUR CAR");
		          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("LOSE 20 PERCENT GRAIN");
		          GameCode.getDataManager().grain -= 20;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        } else {
		          GameCode.getTextInterface().println("YOU DONT HAVE ENOGH GRAIN TO APPEASE THE VOICE IN YOUR HEAD SO YOU MUST TAKE YOUR ANGER ISSUES OUT ON THIS CREATURE");
		          GameCode.getTextInterface().selected = "unimportant";
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "FIGHT" });
		        }
		      }
		      
		      if (GameCode.getTextInterface().selected.equals("FIGHT")) {
		        GameCode.getTextInterface().println("THE USELESS RALTZ STOLE YOUR CAR");
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  RALTZ HEALTH  " + raltzHealth);
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		        GameCode.getTextInterface().selected = "unimportant";
		      }
		      if (GameCode.getTextInterface().selected.equals("ATTACK")) {
		        if (!gasCoating) {
		          eventRandom = (RNG.nextInt(9) + 1);
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("YOU USE QUICK ATTACK ... YOU MISSEED BUT QUICKLY");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom >= 4) && (eventRandom <= 7)) {
		            GameCode.getTextInterface().println("YOU USED MEGA PUNCH (ITS ACCUALLY JUST A REGULAR PUNCH BUT WHATEVER)");
		    
		            this.playSoundEffect(6.0F, "soundEffects/punch.wav");
		            eventRandom = (RNG.nextInt(20) + 30);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("THE RALTZ TOOK " + damage + " DAMAGE");
		            raltzHealth -= eventRandom;
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		            GameCode.getTextInterface().println("YOU USED AROMATHERAPY (BUT YOU SMELL SO BAD IT DOES DAMAGE)");
		            eventRandom = (RNG.nextInt(30) + 10);
		            String damage = Integer.toString(eventRandom);
		            GameCode.getTextInterface().println("THE RALTZ TOOK " + damage + " DAMAGE");
		            raltzHealth -= eventRandom;
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        }
		        else {
		          GameCode.getTextInterface().println("YOU USED EXPLOSION (YOU CHUCKED A MATCH AT HIM BECAUSE HE IS COVERED IN GAS)");
		          eventRandom = (RNG.nextInt(120) + 35);
		          gasCoating = false;
		  
		          this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("THE RALTZ TOOK " + damage + " DAMAGE");
		          raltzHealth -= eventRandom;
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
		          GameCode.getTextInterface().println("YOU COATED THE RALTZ IN GAS NEXT TIME YOU ATTACK ITS GONNA BE A MUCH MORE POWERFUL ATTACK");
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
		          GameCode.getTextInterface().println("YOU TURNED THE RADIO ON AND PLAYED A STRANGE SCREECH THE RALTZ LOST ONE OF ITS BUFFS");
		          buffCount -= 1;
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
		        GameCode.getTextInterface().println("USSELESS RALTZ: A ONCE USELESS RALTZ THAT WAS TEMPORED INTO THIS FIGHTING MACHINE BY ONE MASSICISTIC MAN AS A WAY TO INFLICT PAIN UPON HIMSELF");
		        GameCode.getTextInterface().println("IT DOESEN'T HAVE A LOT OF HEALTH BUT IT HEALS A LOT AND IT BUFFS ITS ATTACK A LOT IF IT GETS THREE BUFFS IT CAN CONSISTANTLY DEAL HALF YOUR HEALTH");
		        GameCode.getTextInterface().println("AND ITS PRETTY MUCH GG IF THAT HAPPENS SO TAKE IT OUT BEFORE IT DOES THAT (IN HINDSIGHT THE STATBOOK PROBABLY WASEN'T THE BEST USE OF YOUR TURN)");
		        GameCode.getTextInterface().query(new String[] { "EPIC" });
		      }
		      if (GameCode.getTextInterface().selected.equals("BACK")) {
		        GameCode.getTextInterface().selected = "FIGHT";
		      }
		      if (GameCode.getTextInterface().selected.equals("RUN")) {
		        GameCode.getTextInterface().println("THERE IS NO RUNNING FROM A RALTZ BATTLE");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().query(new String[] { "BACK" });
		      }
		      if (GameCode.getTextInterface().selected.equals("EPIC")) {
		    	  int threshold;
		    	 
				if (DataManager.isHardModeEnabled()) {
		    		  threshold = 100;
		    	  } else {
		    		  threshold = 60;
		    	  }
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
		        if ((raltzHealth <= threshold) || (buffCount >= 3 && raltzHealth > 70) || ((buffCount >= 2) && (eventRandom == 10)) || ((buffCount >= 1) && (eventRandom == 8)) || ((buffCount >= 0) && (eventRandom == 6)) || ((buffCount < 0) && (eventRandom <= 1))) {
		          if ((eventRandom <= 3) || (eventRandom == 8) || (eventRandom == 9)) {
		            GameCode.getTextInterface().println("THE USELESS RALTZ USED EXTRASENSORY");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
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
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().selected = "unimportant";
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		          }
		          if (((eventRandom >= 4) && (eventRandom <= 7)) || ((eventRandom == 10) && (usedTrumpCard))) {
		            GameCode.getTextInterface().println("THE USELESS RALTZ USED GUNK SHOT");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
		            } else {
		            if (eventRandom == 5) {
		              GameCode.getDataManager().setPoisoned(true);
		              GameCode.getTextInterface().println("YOU WERE POISONED");
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
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		          if ((eventRandom == 10) && (!usedTrumpCard)) {
		            GameCode.getTextInterface().println("USELESS RALTZ USED TRUMP CARD");
		            GameCode.getTextInterface().println(chair);
		            if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
		          	  String damag = Integer.toString(0);
		                GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
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
		            GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		            GameCode.getDataManager().setPlayerHealth( GameCode.getDataManager().getPlayerHealth() - eventRandom);;
		            }
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        }
		        else if (raltzHealth > 80) {
		          GameCode.getTextInterface().println("THE USELESS RALTZ USED A X SPECIAL SHE GAINED A BUFF");
		          buffCount += 1;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "OUCH" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        else if (raltzHealth >= 30) {
		          GameCode.getTextInterface().println("THE USELESS RALTZ DRANK A MOO MOO MILK AND RECOVERED 100 HEALTH");
		          raltzHealth += 100;
		          if (raltzHealth > 160) {
		            raltzHealth = 160;
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "OUCH" });
		            GameCode.getTextInterface().selected = "unimportant";
		          }
		        } else {
		          GameCode.getTextInterface().println("THE USELESS RALTZ USED A FULL RESTORE AND RESTORED ALL HER HEALTH");
		          raltzHealth = 160;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "OUCH" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		      }
		      

		      if (GameCode.getTextInterface().selected.equals("OUCH")) {
		        eventRandom = (RNG.nextInt(9) + 1);
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("THE USELESS RALTZ IS DRINKING A LEMONADE");
		        }
		        if ((eventRandom <= 7) && (eventRandom >= 4)) {
		          GameCode.getTextInterface().println("THE USELESS RALTZ TELLS YOU ITS ACCUALLY CALLED IDIUTRALTZ");
		        }
		        if (eventRandom >= 8) {
		          GameCode.getTextInterface().println("THE USELESS RALTZ IS COMEING UP WITH MLG PRO STRATS");
		        }
		        if (GameCode.getDataManager().isPoisoned()) {
		          eventRandom = (RNG.nextInt(75) + 25);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
		        }
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  RALTZ HEALTH  " + raltzHealth);
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
			GameCode.getDataManager();
			if (DataManager.isHardModeEnabled()) {
				probablity = probablity + 4;
			}
			if (GameCode.getDataManager().getKarma() == 2) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
