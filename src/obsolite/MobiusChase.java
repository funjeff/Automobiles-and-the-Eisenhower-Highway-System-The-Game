package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class MobiusChase extends Location  {
	int distanceFromMobius = 1;
	boolean mobiusChase = true;
	MobiusBattle parent;
	static boolean hasButterflys = false;
	static int maximumHealth = 700;
	public MobiusChase(MobiusBattle battle) {
		super(false);
		parent = battle;
	}
	@Override
	public void eventStart () {
		
	}
	@Override
	public void runEventCode () {
		 if (GameCode.getDataManager().getMilesLeft() > 200) {
		        GameCode.getDataManager().setMilesLeft(200);
		      }
		 Random RNG = new Random ();
		 int decicion = (RNG.nextInt(99) + 1);
		        if ((GameCode.getDataManager().getMilesLeft() == 190) || (GameCode.getDataManager().getMilesLeft() == 180) || (GameCode.getDataManager().getMilesLeft() == 170) || (GameCode.getDataManager().getMilesLeft() == 160) || (GameCode.getDataManager().getMilesLeft() == 150) || (GameCode.getDataManager().getMilesLeft() == 140) || (GameCode.getDataManager().getMilesLeft() == 130) || (GameCode.getDataManager().getMilesLeft() == 120) || (GameCode.getDataManager().getMilesLeft() == 110) || (GameCode.getDataManager().getMilesLeft() == 100) || (GameCode.getDataManager().getMilesLeft() == 90) || (GameCode.getDataManager().getMilesLeft() == 80) || (GameCode.getDataManager().getMilesLeft() == 70) || (GameCode.getDataManager().getMilesLeft() == 60) || (GameCode.getDataManager().getMilesLeft() == 50) || (GameCode.getDataManager().getMilesLeft() == 40) || (GameCode.getDataManager().getMilesLeft() == 30) || (GameCode.getDataManager().getMilesLeft() == 20) || (GameCode.getDataManager().getMilesLeft() == 10)) {
		          GameCode.getTextInterface().println("YOU DROVE 1 LIGHT YEAR TOWARDS EARTH MOBIUS IS FALLING BEHIND");
		          GameCode.getDataManager().setMilesLeft(GameCode.getDataManager().getMilesLeft() - 1);
		          distanceFromMobius += 1;
		        } else {
		          GameCode.getTextInterface().println("YOU DROVE 1 LIGHT YEAR TOWARDS EARTH BUT MOBIUS IS HOT ON YOUR TAIL");
		          GameCode.getDataManager().setMilesLeft( GameCode.getDataManager().getMilesLeft()- 1);
		        }
		      if ((decicion == 5) && (mobiusChase)) {
		    	  GameCode.getTextInterface().println("YOU THINK ABOUT AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM HOPE SLIGHTLY RESTORED");
			        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
			        GameCode.getTextInterface().println(" ");
			        parent.hope += 1;
			        GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
			        mobiusChase = false;
		      }
		      
		      if (decicion == 6) {
		        if (mobiusChase) {
		          GameCode.getTextInterface().println("AS YOUR DRIVING THROUGH SPACE A VOID APPEARS YOU COULD TRY AND OUTRUN IT BUT YOU WONT MAKE IT UNLESS YOUR REALLY FAR AWAY FROM MOBIUS");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "I CAN MAKE IT", "CHECK OUT WHERE THE VOID GOES" });
		          mobiusChase = false;
		          GameCode.getTextInterface().selected = "not important";
		        }
		        if (GameCode.getTextInterface().selected.equals("I CAN MAKE IT")) {
		          GameCode.getTextInterface().selected.equals("not important");
		          GameCode.getTextInterface().println("YOU BELIVE WITH ALL YOUR SOUL THAT YOU CAN MAKE IT AND");
		          if (distanceFromMobius > 6) {
		            GameCode.getTextInterface().print("YOU COULD YOU END UP ESCAPING WITHOUT BEING CAUGHT BUT MOBIUS IS MUCH CLOSER NOW");
		            distanceFromMobius -= 6;
		            GameCode.getTextInterface().selected = "not important";
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
		          } else {
		            GameCode.getTextInterface().println("YOU COULDEN'T");
		            distanceFromMobius = 0;
		          }
		        }
		        if (GameCode.getTextInterface().selected.equals("CHECK OUT WHERE THE VOID GOES")) {
		         int eventRandom = (RNG.nextInt(9) + 1);
		          GameCode.getTextInterface().selected = "not important";
		          if ((eventRandom == 1) || (eventRandom == 2)) {
		            GameCode.getTextInterface().println("YOU WIND UP 12 LIGHT YEARS AHEAD OF WHERE YOU WERE HOW LUCKY");
		            GameCode.getDataManager().setMilesLeft(GameCode.getDataManager().getMilesLeft()- 12);
		            distanceFromMobius += 1;
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
		          }
		          if (eventRandom == 3) {
		            GameCode.getTextInterface().println("IT TURNS OUT IT DIDEN'T GO ANYWHERE HOW LAME!");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
		          }
		          if ((eventRandom == 4) || (eventRandom == 5) || (eventRandom == 6)) {
		            GameCode.getTextInterface().println("YOU WIND UP ON SOME STRANGE UNKNOWN PLANET ON THE PLANET YOU FIND STRANGE BUTTERFLY LIKE CREATURES SOMETHING ABOUT THEM UNSETLES YOU");
		            GameCode.getTextInterface().println(" BUT YOU RECUIT THEM ANYWAY THEN GET BACK ON YOUR WAY THIS COST YOU A BIT OF TIME AND MOBIUS HAS DRAWN A BIT CLOSER BUT YOU GOT CREEPY BUTTERFLYS");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().println("GET BUTTERFLYS LOSE SOME DISTANCE ON MOBIUS");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
		            distanceFromMobius -= 3;
		            hasButterflys = true;
		          }
		          if (eventRandom >= 7) {
		            GameCode.getDataManager().setMilesLeft(GameCode.getDataManager().getMilesLeft() + distanceFromMobius * 5);
		            distanceFromMobius = 0;
		          }
		        }
		      }
		      if (distanceFromMobius <= 0) {
		        decicion = 4000000;
		        distanceFromMobius = 1;
		        GameCode.getTextInterface().println("MOBIUS CAUGHT UP YOU HE TAKES THE KEY BACK AND RESUMES THE FIGHT (HE IS STILL TIRED SO JUST ATTACK FOR VICTORY)");
		        GameCode.getTextInterface().println(" ");
		        GameCode.setCurrentEvent(parent);
		      }
		      if (GameCode.getDataManager().getMilesLeft() <= 0) {
		        mobiusChase = false;
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getDataManager().setMilesLeft(200);
		        GameCode.getTextInterface().println("YOU MAKE IT TO EARTH AND THE CAR TURNS TO A COMMENT AS IT STARTS FALLING THROUGH THE ATMOSPHERE EVENTUALLY TURNING INTO A FIREBALL");
		        GameCode.getTextInterface().println("YOU EJECT FROM THE CAR AND START PARASHOOTING DOWN FROM EARTH THE CAR CRASHES INTO THE EARTH WITH YOUR ITEMS AND CREATES AN ENORMUS CRATER");
		        GameCode.getTextInterface().println("YOU TAKE A QUICK BREATHER AS YOU SLOWLY FALL TO EARTH AND YOUR HOPE BRINGS YOU STRENGTH ONCE YOU REACH THE SURFACE MOBIUS APPEARS OUT OF NOWHERE");
		        GameCode.getTextInterface().println("AND SHOUTS ENOUGH!");
		        GameCode.getTextInterface().println("REMAINING HOPE INCREASED MAXIMUM HEALTH");
		        maximumHealth = (700 + 100 * parent.hope);
		        GameCode.getDataManager().setPlayerHealth(maximumHealth);
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "OH NO!" });
		      }
		      if (GameCode.getTextInterface().selected.equals("OH NO!")) {
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getTextInterface().println("YOU FEEL THE GROUND SHAKE MORE THAT IT EVER HAS BEFORE BUT ONLY FOR A MOMENT BEFROE YOU SEE THOUSANDS OF TONS OF CONCRETE FLY INTO THE SKY");
		        GameCode.getTextInterface().println("FROM EVERY DIRECTION WHERE A BLACK HOLE HAS FORMED THIS GOES ON FOR ABOUT 3O SECONDS UNTIL YOU CAN'T EVEN TELL HOW MUCH CONCRTE IS GOING IN");
		        GameCode.getTextInterface().println("AT ONCE AFTER A COUPLE MINUTES TRAPPED IN THE STORM IT FINALLY STOPS THE BLACK HOLE FIZZLES OUT AND WHERE IT STOOD NOW STANDS A ENORMUS BEAST");
		        GameCode.getTextInterface().println("ITS AS TALL AS 400 SKYSCRAPERS EACH OF ITS TEATH ARE MADE OUT OF 16 BY 16 NETWORK OF CARS ITS FOOT IS SO LONG THAT IF YOU WERE DRIVING FULL");
		        GameCode.getTextInterface().println("SPEED IN A CAR YOU STILL WOULDEN'T ESCAPE BEFORE IT SQUISHED YOU LIKE A BUG");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "RUN!", "RUN FASTER", "PANIC" });
		      }
		      if ((GameCode.getTextInterface().selected.equals("RUN!")) || (GameCode.getTextInterface().selected.equals("RUN FASTER")) || (GameCode.getTextInterface().selected.equals("PANIC"))) {
		        GameCode.getTextInterface().selected = "not important";
		        GameCode.getTextInterface().println("AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM LIFTS ITS ENORMUS FOOT AND YOU ARE POWERLESS TO STOP IT FROM CRUSHING YOU AS YOU SEE IS SHADOW ENGULF YOU");
		        GameCode.getTextInterface().println(" ");
		        GameCode.setCurrentEvent(new AutomobilesBattle());
		      }
	}

}
