package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Deer extends Location {
	public Deer() {
		super(false);
		}
	static int eventRandom;
	@Override
	public void eventStart () {
		 Random rand = new Random ();
         eventRandom = (rand.nextInt(11) - 1);
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println("AS YOU ARE DRIVING ALONG A DEER SKUTTLES ACROSS THE ROAD YOU ARE GOING TO FAST TO COMPLEATLY STOP YOU COULD TRY BUT IT WOULD SPELL CERTAIN DAMAGE TO YOUR CAR");
         GameCode.getTextInterface().println("YOU COULD ALSO TRY AND SWERVE OUT OF THE WAY BUT THAT WOULD RISK A MORE SERIOS COLLISON");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().query(new String[] { "HIT THE BRAKES", "SWERVE AS FAR AS POSSIBLE" });
         GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	}
	@Override
	public void runEventCode () {
		super.runEventCode();
	       if (GameCode.getTextInterface().selected.equals("SWERVE AS FAR AS POSSIBLE")) {
	         GameCode.getTextInterface().selected = "unimportant";
	         if (eventRandom < 5) {
	           GameCode.getTextInterface().println("YOU SWERVED OUT OF THE WAY OF THE DEER LUCKILY NOBODY WAS IN THE OTHER LANE AND YOU AVOIDED A CRASH ENTIRLY");
	           GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	         }
	         if ((eventRandom == 6) || (eventRandom == 7)) {
	           GameCode.getTextInterface().println("YOU SWERVE AND SEE A HUGE TRUCK IN THE DISTANCE LUCKILY THEY SEE YOU IN THE DISTANCE AND STOP THIER TURCK YOU DO NOT HIT THEM");
	           GameCode.getTextInterface().println("UNFORCHANITLY IT TAKES A WHILE TO GET EVERYTHING STRATENED OUT BETWEEN YOU TWO AND WHEN YOU FINALLY DO YOU NOTICE THE DEER IN");
	           GameCode.getTextInterface().println("YOUR CARGO HOLD AND HE HAS EATEN A LARGE PORTIAN OF YOUR GRAIN");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("LOSE 25 PERCENT GRAIN");
	           GameCode.getDataManager().grain -= 25;
	           GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	         }
	         if (eventRandom >= 8) {
	           GameCode.getTextInterface().println("YOU SWERVE INTO THE OTHER LANE ONLY TO SEE THE TERRFIYING SHEEN OF ANOTHER CAR RIGHT IN FRONT OF YOU.  YOU CRASH INTO IT AT HIGH SPEEDS");
	           GameCode.getTextInterface().println("YOUR CAR IS TOTALLED AND YOU ARE SITTING BLOODY IN THE DRIVERS SEAT BY THE TIME YOU GOT TO THE HOSPITAL YOU WERE ALREADY GONE.");
	           GameCode.getTextInterface().println(" ");
	
	           this.playSoundEffect(6.0F, "soundEffects/crash.wav");
	           GameCode.getTextInterface().println("AT LEAST WE CAN THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("GAME OVER");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().query(new String[] { "DARN IT" });
	         }
	       }
	       if (GameCode.getTextInterface().selected.equals("HIT THE BRAKES")) {
	         GameCode.getTextInterface().println("YOU DECIDE TO PLAY IT SAFE AND JUST SLOW THE CAR DOWN AS MUCH AS YOU CAN YOUR CAR HITS THE DEER YOU GO FLYING AND ARE TAKEN TO THE HOSPITAL YOU WAKE");
	         GameCode.getTextInterface().println("UP A FEW HOURS LATER WHEN YOU DO THE DOCTORS CHARGE YOU 300 DOLLARS FOR THE EMERGENCY CARE AND THE MECHANIC CHARGES YOU 350 FOR REPAIRS TO YOUR CAR");
	         this.playSoundEffect(6.0F, "soundEffects/brakeing quickly.wav");
	         GameCode.getTextInterface().selected = "unimportant";
	         if (GameCode.getDataManager().money >= 650) {
	        	 GameCode.getDataManager().money -= 650;
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("AT LEAST YOUR ALIVE THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("LOSE 650 DOLLARS");
	           GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	         } else {
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("YOU DIDEN'T HAVE ENOGH MONEY TO PAY THE THE BILLS SO YOU WERE FORCED TO GIVE UP ON YOUR QUEST TO NEW YORK AND STAY HERE TO WORK OFF YOUR DEBT");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("GAME OVER");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().println("BUT YOUR ALIVE SO THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.getTextInterface().println(" ");
	           GameCode.getTextInterface().query(new String[] { "DARN IT" });
	         }
	       }
	       if (GameCode.getTextInterface().selected.equals("DARN IT")) {
	    	   GameCode.initialize();
	       }
	       if (GameCode.getTextInterface().selected.equals("GET BACK ON THE ROAD")) {
	         GameCode.getTextInterface().selected = "unimportant";
	         GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	       }
	}
	@Override
	public int getProbablity() {
		int probablity = 5;
		if (DataManager.isHardModeEnabled()) {
			probablity = probablity + 2;
		}
		if (GameCode.getDataManager().getKarma() == 2) {
			probablity = probablity + 2;
		}
		return probablity;
	}
}
