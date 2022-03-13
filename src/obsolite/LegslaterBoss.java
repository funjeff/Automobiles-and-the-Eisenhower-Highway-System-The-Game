package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class LegslaterBoss extends Location {
	int legislaterHealth = 1;
	int amountToWait = 0;
	int eventRandom = 0;
	boolean canLegislate = true;
	Random RNG = new Random ();
	public LegslaterBoss () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println("YOU GET PULLED OVER BUT ARE SUPPRISED THAT A POLICEMAN DOES NOT EXIT THE VEHICAL INSTEAD A MAN IN A EXPENSIVE SUIT HE EXPLAINS THAT HE WORKS FOR THE US");
         GameCode.getTextInterface().println("GOVERNMENT AND YOUR LARGE AMOUNT OF GRAIN IS NOT UP TO CODE HE OFFERS TO LET YOU GO FOR 20 PECENT OF YOUR GRAIN");
         GameCode.getTextInterface().println(" ");
         
		this.changeMusic("music/jumping through hoops.wav", DataManager.getVolume());
         GameCode.getTextInterface().query(new String[] { "WRECK EM", "GIVE UP GRAIN" });
         GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	 @Override
	public void runEventCode () {
		 if ( GameCode.getDataManager().getPlayerHealth()<= 0) {
	          GameCode.getTextInterface().println("THE LEGISLATER LEAVES A MINOR TICKET ON YOUR VEHICAL YOUR SO OFFENDED YOU GIVE UP ON YOUR QUEST AND GO HOME");
	          GameCode.getTextInterface().selected = "unimportant";
	          GameCode.getTextInterface().println("THANK GOD FOR UNENDEING BUERACURACY AND THE EISNEHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().query(new String[] { "DARN IT" });
	          GameCode.getTextInterface().selected = "unimportant";
	          GameCode.getDataManager().setPlayerHealth(700);
	        }
	        if (legislaterHealth <= 0) {
	          GameCode.getTextInterface().println("YOU LIGHTLY TAP THE LEGISLATER ON THE SHOLDER HE RUNS AWAY CRYING YOU STEAL HIS DIPLOMATIC LICENCE PLATE");
	          GameCode.getTextInterface().println("NOW ITS IMPOSBLE FOR THE COPS TO PULL YOU OVER AND YOU DON'T NEED TO PAY TOLLS ANYMORE");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("GET DIPLOMATIC IMMUNITY");
	          GameCode.getDataManager().setPlayerHealth(700);
	          legislaterHealth = 1;
	          
			this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	          GameCode.getDataManager().diplomaticImmunity = true;
	          GameCode.getTextInterface().selected = "unimportant";
	          GameCode.getTextInterface().println("THANK GOD FOR WEAK LOSERS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        }
	        if (GameCode.getTextInterface().selected.equals("GIVE UP GRAIN")) {
	            if (GameCode.getDataManager().grain >= 31) {
	              GameCode.getTextInterface().println("YOU RELCUTENTLY OPEN UP THE BACK OF YOUR CAR AND HE DESIDES TO BE A SCUMBAG AND TAKES 30 PERCENT INSTEAD OF 20 ");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().println("LOSE 30 PERCENT GRAIN");
	              GameCode.getDataManager().grain -= 30;
		    	  
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	              GameCode.getTextInterface().selected = "unimportant";
	            } else {
	              GameCode.getTextInterface().println("YOU OPEN UP THE BACK OF YOUR CAR AND HE STARTS COMPLAINING THAT YOU DON'T HAVE THAT MUCH GRAIN AT ALL YOU GET SO ANNOYED YOU ATTACK");
	              GameCode.getTextInterface().selected = "unimportant";
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "WRECK EM" });
	            }
	          }
	        if (GameCode.getTextInterface().selected.equals("WRECK EM")) {
	          GameCode.getTextInterface().println("THE UNCOMPERMISING LEGISLATER LAUGHS AT YOU");
	          GameCode.getTextInterface().println("HEALTH  " + 1 + " CONGRESSMAN HEALTH 1");
	          GameCode.getTextInterface().println("WHAT DO YOU DO");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
	          GameCode.getTextInterface().selected = "unimportant";
	        }
			if (GameCode.getTextInterface().selected.equals("ATTACK")) {
	        	if (amountToWait <= 0) {
	          eventRandom = (RNG.nextInt(9) + 1);
	          if (eventRandom == 1) {
	            legislaterHealth = 0;
	          }
	          if (eventRandom == 2) {
	            GameCode.getTextInterface().println("YOU THROW A DEADLY PUNCH THE VECTOR THAT COULD BE USED TO EVALUATE THE FORCE OF THE PUNCH IS OWNED BY THE GOVERMENT AND YOUR FINED");
	            GameCode.getTextInterface().println("FOR USE OF GOVERNMENT PROPERTY WITHOUT A LICENCE");
	            if (GameCode.getDataManager().money > 100) {
	            GameCode.getDataManager().money = GameCode.getDataManager().money - 100;
	            } else {
	            GameCode.getTextInterface().println("BUT YOU DIDEN'T HAVE THE MONEY SO YOU GET SENTINCED TO THE BEATING STICK YOU TOOK 100 DAMAGE");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - 100);
	            }
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	            GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 3) {
	            GameCode.getTextInterface().println("YOU ATTEMPT TO BANISH THE UNCOMPRIMISING LEGISLATOR TO THE SHADOW REALM, BUT HE PLAYS A TRAP CARD AND ATTACKS YOUR LIFE POINTS DIRECTLY");
	            int health = RNG.nextInt(200 + 100);
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - health);
	            GameCode.getTextInterface().println("YOU TOOK " + Integer.toString(health) + " DAMAGE");
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	            GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 4) {
	              GameCode.getTextInterface().println("YOU ATTEMPT TO RUN OVER THE LEGISLATER WITH YOUR CAR BUT YOUR CAR WASEN'T LICENCED FOR MANSLAUGTER SO YOU HAVE TO WAIT IN LINE TO GET THAT DONE");
	              GameCode.getTextInterface().println("YOU CAN NOT ATTACK FOR THE NEXT TWO TURNS");
	              amountToWait = 3;
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	          if (eventRandom == 5) {
	              GameCode.getTextInterface().println("YOU SHOOT SOME RANDOM GUY IN THE BACKGROUND THE LEGISLATER PRETENDS NOT TO NOTICE ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	          if (eventRandom == 6) {
	        	  GameCode.getTextInterface().println("YOU MAKE CLEAR TO THE LEGISLATER THAT HIS INCLUTION IN THIS GAME IS PURELY SARCASTIC AND IMPLYS NOTHING ABOUT THE POLITICAL CONDITION OF THE UNITED STATES");
	        	  GameCode.getTextInterface().println("HE AGREES");
	        	  GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 7) {
	        	  GameCode.getTextInterface().println("YOU STEAL A 100 DOLLAR BILL FROM THE LEGISLATORS POCKET HE NOTICES YOU TAKE IT TURNS AROUND AND GIVES YOU ANOTHER BILL FROM HIS ENORMOS STACK");
	        	  GameCode.getTextInterface().println("GAIN 200 DOLLARS");
	        	  GameCode.getDataManager().money = GameCode.getDataManager().money + 200;
	        	  GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 8) {
	        	  GameCode.getTextInterface().println("YOU DECK IM IN THE TEATH BUT HIS EXTENCIVE DENTAL INSURANCE REPLACES THOSE TEATH IN NO TIME");
	        	  GameCode.getTextInterface().query(new String[] { "EPIC" }); 
	              GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 9) {
	        	  GameCode.getTextInterface().println("YOU THROW SOME DIRT AT THE LEGISLATORS SUIT HE WILL HAVE TO SPEND THIS TURN BUYING ANOTHER ONE");
	        	  GameCode.getTextInterface().println("LEGISLATER LOSES TURN");
	        	  canLegislate = false;
	        	  GameCode.getTextInterface().query(new String[] { "EPIC" });
	              GameCode.getTextInterface().selected = "unimportant";
	          }
	          if (eventRandom == 10) {
	        	  GameCode.getTextInterface().println("YOU SAY HI THE LEGISLATOR STARTS RANTING ABOUT HOW HE WOULD HAVE PERFERED HELLO");
	        	  GameCode.getTextInterface().query(new String[] { "EPIC" }); 
	              GameCode.getTextInterface().selected = "unimportant";
	          }
	        	} else {
	        		GameCode.getTextInterface().println("BUT YOU ARE WAITING IN LINE AND CAN'T ATTACK");
	        		amountToWait = amountToWait -1;
	        		GameCode.getTextInterface().selected = "unimportant";
	        		 GameCode.getTextInterface().query(new String [] {"WRECK EM"});
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
	          
			if (!DataManager.isHardModeEnabled()) {
	          if (GameCode.getDataManager().grain >= 5) {
	            GameCode.getTextInterface().println("YOU ATE 5 PERCENT OF YOUR GRAIN YOU RETURNED TO FULL HEALTH");
	            GameCode.getDataManager().setPlayerHealth(700);
	            GameCode.getDataManager().grain -= 5;
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          } else {
	            GameCode.getTextInterface().println("BUT THERE WAS NO GRAIN LEFT!");
	            GameCode.getTextInterface().query(new String[] { "DARN IT" });
	          }
	          } else {
	        	  if (GameCode.getDataManager().grain >= 3) {
	                  GameCode.getTextInterface().println("YOU ATTEMPTED TO EAT 5 PERCENT GRAIN BUT THE GOVERNMENT PUT A RESTRICTION ON HOW MUCH YOU COULD EAT AT ONCE");
	                  GameCode.getTextInterface().println("SO YOU COULD ONLY EAT 3 PERCENT YOU RECOVERED 350 HEALTH");
	                  GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() + 350);
	                  GameCode.getDataManager().grain -= 5;
	                  GameCode.getTextInterface().query(new String[] { "EPIC" });
	                } else {
	                  GameCode.getTextInterface().println("BUT THERE WAS NO GRAIN LEFT!");
	                  GameCode.getTextInterface().query(new String[] { "DARN IT" });
	                }
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("3 GAS")) {
	          GameCode.getTextInterface().selected = "unimportant";
	          if (GameCode.getDataManager().gas >= 2.0D) {
	          	GameCode.getTextInterface().println("YOU PULL OUT SOME GAS TO ATTACK WITH BUT AS SOON AS YOU DO THE LEGISLATER SCREAMS OIL! STEALS THE GAS AND DROPS A 50 DOLLAR BILL"); 
	          	GameCode.getTextInterface().println("GAIN 50 DOLLARS");
	          	GameCode.getDataManager().gas = GameCode.getDataManager().gas - 3;
	          	GameCode.getDataManager().money = GameCode.getDataManager().money + 50;
	            GameCode.getTextInterface().query(new String[] { "EPIC" });
	          } else {
	            GameCode.getTextInterface().println("BUT THERE WAS NO GAS LEFT!");
	            GameCode.getTextInterface().query(new String[] { "DARN IT" });
	          }
	        }
	        if (GameCode.getTextInterface().selected.equals("RADIO")) {
	          GameCode.getTextInterface().selected = "unimportant";
	          if (GameCode.getDataManager().workingRadio) {
	            if (amountToWait >0) {
	            	
					if (DataManager.isHardModeEnabled()) {
	              GameCode.getTextInterface().println("YOU TURNED THE RADIO ON IT WAS SO ANNOYING SOME PEOPLE LEFT THE LINE ");
	              amountToWait = amountToWait - 1;
	            	} else {
	              GameCode.getTextInterface().println("YOU TURNED THE RADIO ON APPARENTLY MANSLAUGHTER HAS BEEN ILLIGALISED ACCORDING TO A TALK SHOW SUCKS BUT AT LEAST YOU CAN LEAVE THE LINE");
	            	amountToWait = 0;
	            	}
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "EPIC" });
	            } else {
	            GameCode.getTextInterface().println("YOU TURRNED ON THE RADIO TO A POLITICAL TALK SHOW YOU STAB YOURSELF OUT OF BORDOM");
	            int damage = RNG.nextInt(20 + 10);
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - damage);
	            
	            GameCode.getTextInterface().println("YOU TOOK " +Integer.toString(damage)+ " DAMAGE");
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
	          GameCode.getTextInterface().println("THE UNCOMPERMISING LEGISLATER HAS TROUBLE WORKING WITH PEOPLE WHO DISAGREE WITH HIM BUT HE HAS A LOOPHOLE FOR EVERY SITUATION");
	          GameCode.getTextInterface().println("BUT HE CAN'T TAKE A BEATING ALL YOU GOTTA DO IS KEEP ATTACKING HE CAN COUNTER MOST THINGS BUT NOT EVERYTHING");
	          GameCode.getTextInterface().println("");
	          GameCode.getTextInterface().query(new String[] { "EPIC" });
	        }
	        if (GameCode.getTextInterface().selected.equals("BACK")) {
	          GameCode.getTextInterface().selected = "WRECK EM";
	        }
	        if (GameCode.getTextInterface().selected.equals("RUN")) {
	                GameCode.getTextInterface().println("YOU RUN HE CATCHS YOU IMMIDETLY FINES YOU 700 DOLLARS AND LETS YOU GO ON YOUR WAY");
	                GameCode.getTextInterface().println(" ");
	  	    	  
				this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	                if (GameCode.getDataManager().money > 700) {
	                GameCode.getTextInterface().println("LOSE 700 DOLLARS");
	                GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	                GameCode.getTextInterface().selected = "unimportant";
	                } else {
	                	GameCode.getTextInterface().println("BUT YOU CAN'T PAY IT SO YOU HAVE TO WORK AS A SECRATARY");
	                	GameCode.getTextInterface().println("ONCE YOU WORK OFF YOUR DEBT YOU WILL TRULLY THANK GOD FOR AUTOMOBILES AND THE EISNEHOWER HIGHWAY SYTEM");
	                    GameCode.getTextInterface().query(new String[] { "DARN IT" });
	                    GameCode.getTextInterface().selected = "unimportant";	
	                }
	            
	        }
	        if (GameCode.getTextInterface().selected.equals("EPIC")) {
	      	  String chair = " ";
	      	  if (amountToWait > 0) {
	      	  amountToWait = amountToWait - 1;
	      	  if (amountToWait <= 0) {
	      		  GameCode.getTextInterface().println("YOU GET TO THE FRONT OF THE LINE BUT YOU GET KICKED OUT FOR NOT HAVING TWO PEICES OF MAIL");
	      	  }
	      	  }
	      	  if (canLegislate) {
	      	  if (GameCode.getDataManager().foldingChair) {
	      		  eventRandom = RNG.nextInt(3);
	           	if (eventRandom == 1) {
	           		chair = "BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE";
	           	} else {
	           		chair = " ";
	           	}
	      	  }
	          eventRandom = (RNG.nextInt(9) + 1);
	            if (eventRandom <= 3) {
	              GameCode.getTextInterface().println("THE LEGISLATER PULLS OUT A NEWFANGALED LASER DEVICE AND SHINES IT IN YOUR EYES");
	              GameCode.getTextInterface().println(" ");
	   
	              this.playSoundEffect(6.0F, "soundEffects/lazer.wav");
	              GameCode.getTextInterface().println(chair);
	              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
	            	  String damag = Integer.toString(0);
	                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
	              } else {
	              
				if (DataManager.isHardModeEnabled()) {
	            	  eventRandom = (RNG.nextInt(150) + 100);
	              } else {
	              eventRandom = (RNG.nextInt(100) + 70);
	              }
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("YOU TOOK " + damage + "  DAMAGE");
	              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	              }
	              GameCode.getTextInterface().selected = "unimportant";
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "OUCH" });
	            }
	            if ((eventRandom >= 4) && (eventRandom <= 7)) {
	              GameCode.getTextInterface().println("THE LEGISLATER IMPOSESES NEW TAXES (THIS IMPLYES HE WORKS IN THE HOUSE OF REPRESENTIVES)");
	              GameCode.getTextInterface().println(chair);
	   
	              this.playSoundEffect(6.0F, "soundEffects/ding.wav");
	              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING TAXES INEFFECTIVE SOMEHOW")) {
	            	  String damag = Integer.toString(0);
	                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
	              } else {
	            	
					if (!DataManager.isHardModeEnabled()) {
	            	if (GameCode.getDataManager().money > 100) {
	            		GameCode.getTextInterface().println("LOSE 100 DOLLARS");
	            		GameCode.getDataManager().money = GameCode.getDataManager().money - 100;
	            	} else {
	            	GameCode.getTextInterface().println("YOU DIDEN'T HAVE ANY CASH SO HE JUST DECIDED TO TAX YOUR SOUL INSTEAD");
	              GameCode.getTextInterface().println("YOU TOOK 100 DAMAGE");
	              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - 100);
	            	}
	              } else {
	            	  if (GameCode.getDataManager().money > 200) {
	              		GameCode.getTextInterface().println("LOSE 200 DOLLARS");
	              		GameCode.getDataManager().money = GameCode.getDataManager().money - 200;
	              	} else {
	              	GameCode.getTextInterface().println("YOU DIDEN'T HAVE ANY CASH SO HE JUST DECIDED TO TAX YOUR SOUL INSTEAD");
	                GameCode.getTextInterface().println("YOU TOOK 400 DAMAGE");
	                GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - 400);
	              	}  
	              }
	              }
	              GameCode.getTextInterface().query(new String[] { "OUCH" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
	              GameCode.getTextInterface().println("THE LEGISLATER PUNCHES YOU FULL FORCE");
	              GameCode.getTextInterface().println("YOU TOOK 1 DAMAGE");
	              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - 1);
	              GameCode.getTextInterface().println("");
	              GameCode.getTextInterface().println("THEN HE PAYS SOME GUY TO DO IT");
	              GameCode.getTextInterface().println(chair);
	              if(chair.equals("BUT YOU FLATTENED YOU CHAIR MAKEING THE ATTACK INEFFECTIVE")) {
	            	  String damag = Integer.toString(0);
	                  GameCode.getTextInterface().println("YOU TOOK" + damag + " DAMAGE");
	              } else {
	            	  
					if (!DataManager.isHardModeEnabled()) {
	              eventRandom = (RNG.nextInt(80) + 100);
	            	  } else {
	            	eventRandom = (RNG.nextInt(100) + 150);
	            	  }
	              String damage = Integer.toString(eventRandom);
	              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
	              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	              }
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "OUCH" });
	              GameCode.getTextInterface().selected = "unimportant";
	            }
	      	  } else {
	      		  GameCode.getTextInterface().println("THE LEGISLATER IS BUSY BUYING A NEW SUIT");
	      		GameCode.getTextInterface().println(" ");
	      		canLegislate = true;
	      		GameCode.getTextInterface().selected = "unimportant";
	            GameCode.getTextInterface().query(new String[] { "OUCH" });
	      	  }
	        }
	     
	        if (GameCode.getTextInterface().selected.equals("OUCH")) {
	          eventRandom = (RNG.nextInt(9) + 1);
	            if (eventRandom <= 3) {
	              GameCode.getTextInterface().println("THE LEGISLATER IS ON THE PHONE");
	            }
	            if ((eventRandom <= 7) && (eventRandom >= 4)) {
	              GameCode.getTextInterface().println("THE LEGISLATER HAS STOPED PAYING ATTENTION TO YOU");
	            }
	            if (eventRandom >= 8) {
	              GameCode.getTextInterface().println("THE US LEGISLATERS ACTUALLY WORK REALLY HARD AND I HAVE ONLY POSITIVE THINGS TO SAY ABOUT THEM I JUST THOUGHT THIS WOULD");
	              GameCode.getTextInterface().println("A FUNNY IDEA FOR A BOSS SO YOU KNOW DON'T TAKE THIS BOSS THE WRONG WAY");
	              }
	          if (GameCode.getDataManager().isPoisoned()) {
	            eventRandom = (RNG.nextInt(75) + 25);
	            String damage = Integer.toString(eventRandom);
	            GameCode.getTextInterface().println("YOUR POISON STARTS ACTING UP AND GIVES YOU " + damage + " DAMAGE");
	            GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
	          }
	          GameCode.getTextInterface().println("HEALTH  " + Integer.toString(GameCode.getDataManager().getPlayerHealth()) + "  LEGISLATER HEALTH  1");
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
