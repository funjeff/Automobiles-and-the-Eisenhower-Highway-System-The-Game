package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class MobiusBattle extends Location {
	boolean isVisable = false;
	int amountOfAttacks = 0;
	boolean hasKey = false;
	int hope = 3;
	boolean isCharged = false;
	public MobiusBattle() {
		super(true);
	}
	@Override
	public void eventStart () {
		 GameCode.getTextInterface().println("YOU HAVE RETURNED TO IOWA AND ARE ENJOYING SPENDING YOUR GRAIN MONEY WHEN SUDDENLY OUT WITH NOW WARNING YOU FIND YOURSELF TRNSPORTED TO SPACE");
	        GameCode.getTextInterface().println("IN FRONT OF YOU LIES A BEING (PRESMUBLEY WHAT BROUGHT YOU HERE) HE IS LARGE AND BLACK ALMOST LIKE LIVING SMOKE WITH EVIL LOOKING PURPLE EYES");
	        GameCode.getTextInterface().println("HE SPEAKS AND YOU LISTEN GREETINGS HUMAN HE SAYS I AM THE GOD OF TRANSPORTATION AND I JUST PLAIN DON'T LIKE YOU I FIND IT FUN TO TOY WITH THOSE");
	        GameCode.getTextInterface().println("BUT RECENTLY I HAVE BEEN HAVEING SOME TROUBLES ITS ALL BECAUSE OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM I USED TO BE ABLE TO DO ANYTHING");
	        GameCode.getTextInterface().println("AND CAUSE MAJOR CATACISMS TO TRAVLERS OF ANCHENT TRAILS, BUT NOW ITS ALMOST IMPOSIBLE TO STOP THE MOST DETERMINED OF TRAVLERS WHICH IS HOW YOU");
	        GameCode.getTextInterface().println("GOT HERE YOU SURVIVED ALL MY TRAPS THROUGH SOME INSAIN MIX OF DETERMINATION AND PURE LUCK SO IM GONNA FINISH WHAT I STARTED RIGHT HERE RIGH NOW");
	        GameCode.getTextInterface().println("YOUR GOING DOWN FOOL AND ONCE I FINISH YOU OFF IM GOING TO DESTORY AUTOMOBIELS AND THE EISNEHOWER HIGHWAY SYSTEM WITH A CURSE THAT PREVENTS ANY HUMANS");
	        GameCode.getTextInterface().println("FROM REBUILDING SO WITHOUT ANY FURTHER ADO");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().renderImage(DataManager.getSprites().mobiusDrawing, true);
	        this.playSoundEffect(6.0F, "soundEffects/heee hee hee.wav");
	        GameCode.getTextInterface().selected = "not important";
	        GameCode.getTextInterface().query(new String[] { "HERE WE GO" });
	}
	@Override
	public void runEventCode () {
		      if (GameCode.getDataManager().getPlayerHealth() <= 0) {
		        GameCode.getTextInterface().println("YOU WERE DEFEATED BY MOBIUS AND WERE SUBSEQUENTLY TORN APPART AND THROWN INTO THE ABISS");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("GAME OVER");
		        GameCode.getDataManager().setPlayerHealth(700);
		        GameCode.getTextInterface().query(new String[] { "DARN IT" });
		      }
		      if (GameCode.getTextInterface().selected.equals("HERE WE GO")) {
		        GameCode.getTextInterface().println("MOBIUS HAS COME A LONG WAY TO DESTROY YOU");
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  MOBIUS HEALTH INFINITE");
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		      }
		      if (GameCode.getTextInterface().selected.equals("ATTACK")) {
		        if (!isVisable) {
		          GameCode.getTextInterface().println("YOU TRY AND ATTACK BUT YOU CANT FIND HIM THE SHADOWS AND HE MOVES TOO QUICKLY");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        } else {
		          if (amountOfAttacks == 0) {
		            GameCode.getTextInterface().println("YOU ATTACK BUT TO NO AVAIL HE SEEMS INVINCABLE IN THIS FORM ABSORBING YOUR BLOWS SEEMS TO TIRE HIM OUT A BIT THOUGH");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          if (amountOfAttacks == 1) {
		            GameCode.getTextInterface().println("HE LAUGHS AT WHAT HE CALLS YOUR PATHETIC EXCUSE FOR AN ATTACK BUT ITS CLEAR HE IS STARTING TO GET TIRED KEEP ATTACKING !!!!");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          if (amountOfAttacks == 2) {
		            GameCode.getTextInterface().println("HE TELLS YOU TO STOP ATTACKING BECAUSE ITS FUTILE BUT ITS PROBABLY JUST BECASUE HE DOESENT WANT TO ADMIT YOU STAND A CHANCE");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          if (amountOfAttacks == 3) {
		            GameCode.getTextInterface().println("BINGO YOU HIT HIM WITH A PUNCH TO THE FACE IT DOESENT HURT HIM BUT THE KEY TO HIS CAR FALLS OUT OF HIS POCKET YOU SNATCH THE KEY WITH THE CAR YOU COULD ESCAPE");
		            GameCode.getTextInterface().println(" ");
		            this.playSoundEffect(6.0F, "soundEffects/punch.wav");
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		            hasKey = true;
		          }
		          if (amountOfAttacks >= 4) {
		        	if (hasKey) {
			            GameCode.getTextInterface().println("YOU WERE ABLE TO RE-STEAL THE KEY HOW LUCKY!");
			            GameCode.getTextInterface().println(" ");
			            GameCode.getTextInterface().query(new String[] { "EPIC" });
		        	} else {
		        		GameCode.getTextInterface().println("HAVE YOU NOT HIT HIM ENOUGH ALREADY?");
			            GameCode.getTextInterface().println(" ");
			            GameCode.getTextInterface().query(new String[] { "EPIC" });
		        	}
		            hasKey = true;
		          }
		          amountOfAttacks += 1;
		        }
		        GameCode.getTextInterface().selected = "not important";
		      }
		      
		      if (GameCode.getTextInterface().selected.equals("ITEMS")) {
		        GameCode.getTextInterface().println("WHICH ITEM DO YOU WANT TO USE");
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "HOPE", "RADIO", "STATBOOK", "BACK" });
		      }
		      if (GameCode.getTextInterface().selected.equals("HOPE")) {
		        GameCode.getTextInterface().selected = "not important";
		        if (hope != 0) {
		          if (hope == 1) {
		            GameCode.getTextInterface().println("YOU TRY TO THINK ABOUT READING THE NEWSPAPER BUT YOU COULDENT FOCUS");
		            GameCode.getTextInterface().println("ALL HEALTH RESTORED BUT THERE IS NO HOPE LEFT");
		            GameCode.getDataManager().setPlayerHealth(700);
		            hope -= 1;
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          if (hope == 2) {
		            GameCode.getTextInterface().println("YOU THINK ABOUT RELAXING IN YOUR COOL TIMESHARE");
		            GameCode.getTextInterface().println("ALL HEALTH RESTORED BUT YOU CAN FEEL YOUR HOPE SLIPPING AWAY");
		            GameCode.getDataManager().setPlayerHealth(700);
		            hope -= 1;
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		          if (hope == 3) {
		            GameCode.getTextInterface().println("YOU THINK ABOUT ALL THE PROBLEMS YOU HAVE HAD ON THE HIGHWAY AND HOW YOU OVERCAME THEM AND KNOW THIS WILL BE NO DIFFRENT");
		            GameCode.getTextInterface().println("ALL HEATH RESTORED BUT YOUR STARTING TO LOSE HOPE");
		            GameCode.getDataManager().setPlayerHealth(700);
		            hope -= 1;
		            GameCode.getTextInterface().query(new String[] { "EPIC" });
		          }
		        } else {
		          GameCode.getTextInterface().println("BUT IT WAS HOPELESS! NO HEALTH RESTORED");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("RADIO")) {
		        GameCode.getTextInterface().selected = "not important";
		        if (!isVisable) {
		          GameCode.getTextInterface().println("YOU TURN ON THE RADIO OBVIOSLY YOU CANT GET SIGNAL IN THE MIDDLE OF SPACE BUT THE STATIC REALLY ANNOYES MOBIUS FORCEING HIM OUT OF THE SHADOWS");
		          GameCode.getTextInterface().println(" ");
		          isVisable = true;
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        } else {
		          GameCode.getTextInterface().println("YOU TURN THE RADIO ONTO SOME STATIC BUT MOBIUS DOESENT CARE");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("STATBOOK")) {
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getTextInterface().println("MOBIUS-THE GOD OF AUTOMOBIES AND THE EISNEHOWER HIGHWAY SYSTEM, HE IS 100 PERCENT INVUNERABLE IN THIS FORM.  THE ONLY THING YOU CAN DO RIGHT NOW IS RUN");
		        GameCode.getTextInterface().println("HIS CORE ON EARTH IS VUNERABLE. BUT YOU HAVE A LONG WAY TO GO IF YOU WANT TO GET THERE AND MOBIUS IS THE SECOND FASTEST THING YOU WILL FIND AROUND HERE");
		        GameCode.getTextInterface().println("RIGHT BEHIND HIS CAR IF YOU WANT TO ESCAPE YOU ARE GOING TO HAVE TO STEAL THE CAR TIRE HIM OUT ENOGH, AND HE MIGHT DROP THE KEY SO KEEP ATTACKING");
		        GameCode.getTextInterface().println("IF YOU CAN SEE HIM ATTACK, IF NOT TURN ON THE RADIO AND HE WILL BE DRAWN OUT OF THE SHADOWS");
		        GameCode.getTextInterface().println("");
		        GameCode.getTextInterface().query(new String[] { "EPIC" });
		      }
		      if (GameCode.getTextInterface().selected.equals("BACK")) {
		        GameCode.getTextInterface().selected = "OUCH";
		      }
		      if (GameCode.getTextInterface().selected.equals("RUN")) {
		        if (hasKey) {
		          GameCode.getTextInterface().println("YOU USE THE KEY YOU STOLE FROM MOBIUS TO GET IN THE CAR AND START SPEEDING BACK TOWARDS EARTH AT INSAIN SPEEDS");
		          GameCode.getTextInterface().println("");
		          GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
		        } else {
		          GameCode.getTextInterface().println("YOU TRY YOUR BEST TO ESCAPE BUT MOBIUS MOVES MUCH TO FAST AND EARTH IS FAR FAR AWAY IF YOU WANT TO GET THERE YOU WILL NEED SOMETHING FASTER THAN MOBIUS");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "EPIC" });
		        }
		        GameCode.getTextInterface().selected = "not important";
		      }
		      if (GameCode.getTextInterface().selected.equals("EPIC")) {
		    	     Random RNG = new Random ();
		        if (isCharged) {
		          GameCode.getTextInterface().println("MOBIUS UNLEASHES AN INSAINLY POWERFUL ATTACK");
		          GameCode.getTextInterface().println(" ");
		          int eventRandom = (RNG.nextInt(200) + 400);
		          String damage = Integer.toString(eventRandom);
		          GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		          GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
		          GameCode.getTextInterface().selected = "not important";
		          GameCode.getTextInterface().println(" ");
		          isCharged = false;
		          GameCode.getTextInterface().query(new String[] { "OUCH" });
		        } else {
		         int eventRandom = (RNG.nextInt(9) + 1);
		          if (isVisable) {
		            if ((eventRandom == 6) || (eventRandom <= 3)) {
		              GameCode.getTextInterface().println("MOBIUS ATTEMPTS TO SPAWN A LAZER FROM A VOID BUT YOU SEE IT COMEING AND QUICKLY DODGE IT");
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().selected = "not important";
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		            }
		            if ((eventRandom == 4) || (eventRandom == 5)) {
		              GameCode.getTextInterface().println("MOBIUS CHARGES UP A POWERFUL ATTACK");
		              isCharged = true;
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		              GameCode.getTextInterface().selected = "not important";
		            }
		            if ((eventRandom == 7) || (eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		              GameCode.getTextInterface().println("MOBIUS RETURNS TO THE SHADOWS AND SUDDENLY PUNCHES COME FROM NOWHERE");
		              eventRandom = (RNG.nextInt(90) + 134);
		              String damage = Integer.toString(eventRandom);
		              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
		              GameCode.getTextInterface().println(" ");
		              isVisable = false;
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		              GameCode.getTextInterface().selected = "not important";
		            }
		          } else {
		            if (eventRandom <= 3) {
		              GameCode.getTextInterface().println("OUT OF NOHWHERE A VOID APEARS AND WITH IT A GIANORMUS BEAM YOU TRY TO DODGE BUT IT MOVES TO FAST");
		              eventRandom = (RNG.nextInt(100) + 200);
		              String damage = Integer.toString(eventRandom);
		              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		              GameCode.getTextInterface().selected = "not important";
		            }
		            if ((eventRandom >= 4) && (eventRandom <= 7)) {
		              eventRandom = (RNG.nextInt(228) + 100);
		              String damage = Integer.toString(eventRandom);
		              GameCode.getTextInterface().print("MOBIUS CHARGES AT YOU WITH A SPEAR ");
		              GameCode.getTextInterface().println("YOU TOOK " + damage + " DAMAGE");
		              GameCode.getDataManager().setPlayerHealth(GameCode.getDataManager().getPlayerHealth() - eventRandom);
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		              GameCode.getTextInterface().selected = "not important";
		            }
		            if ((eventRandom == 8) || (eventRandom == 9) || (eventRandom == 10)) {
		              GameCode.getTextInterface().print("MOBIUS STARTS CHARGING A VERY STRONG ATTACK");
		              isCharged = true;
		              GameCode.getTextInterface().println(" ");
		              GameCode.getTextInterface().query(new String[] { "OUCH" });
		              GameCode.getTextInterface().selected = "not important";
		            }
		          }
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("OUCH")) {
		        if (isVisable) {
		          if (amountOfAttacks == 0) {
		            GameCode.getTextInterface().println("MOBIUS LOOKS THREATNING");
		          }
		          if (amountOfAttacks == 1) {
		            GameCode.getTextInterface().println("MOBIUS COUNTINUES TO BLOCK ALL OF YOUR ATTACKS");
		          }
		          if (amountOfAttacks == 2) {
		            GameCode.getTextInterface().println("MOBIUS IS BEGINNING TO LOOK REALLY TIRED");
		          }
		          if (amountOfAttacks == 3) {
		            GameCode.getTextInterface().println("MOBIUS IS EXAUSTED");
		          }
		          if (amountOfAttacks >= 4) {
		            GameCode.getTextInterface().println("MOBIUS CAN BARLEY MOVE ANYMORE");
		          }
		        } else {
		        	 Random RNG = new Random ();
		          int eventRandom = (RNG.nextInt(9) + 1);
		          if (eventRandom <= 3) {
		            GameCode.getTextInterface().println("YOUR STANDING TERRIFIED IN THE DARKNESS");
		          }
		          if ((eventRandom <= 7) && (eventRandom >= 4)) {
		            GameCode.getTextInterface().println("MOBIUS COULD BE ANYWHERE");
		          }
		          if (eventRandom >= 8) {
		            GameCode.getTextInterface().println("YOU START RANDOMLY SWINGING YOUR WEAPON AROUND IN HOPES OF RANDOMLY HITING HIM");
		          }
		        }
		        GameCode.getTextInterface().println("HEALTH  " + GameCode.getDataManager().getPlayerHealth() + "  MOBIUS HEALTH INFINTE");
		        GameCode.getTextInterface().println("WHAT DO YOU DO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "ATTACK", "ITEMS", "RUN" });
		        GameCode.getTextInterface().selected = "not important";
		      }
		      if (GameCode.getTextInterface().selected.equals("DARN IT")) {
		        GameCode.initialize();
		      }
		      if (GameCode.getTextInterface().selected.equals("RUN RUN RUN")) {
		        GameCode.setCurrentEvent(new MobiusChase (this));
		      }
		}
	}
