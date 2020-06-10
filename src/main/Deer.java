package main;

public class Deer {
	static int eventRandom;
	public static void useEvent () {
	     if (GameCode.isDriving) {
	         eventRandom = (GameCode.RNG.nextInt(11) - 1);
	         GameCode.textInterface.println(" ");
	         GameCode.textInterface.println("AS YOU ARE DRIVING ALONG A DEER SKUTTLES ACROSS THE ROAD YOU ARE GOING TO FAST TO COMPLEATLY STOP YOU COULD TRY BUT IT WOULD SPELL CERTAIN DAMAGE TO YOUR CAR");
	         GameCode.textInterface.println("YOU COULD ALSO TRY AND SWERVE OUT OF THE WAY BUT THAT WOULD RISK A MORE SERIOS COLLISON");
	         GameCode.textInterface.println(" ");
	         GameCode.textInterface.println(" ");
	         
	         GameCode.textInterface.println(" ");
	         GameCode.textInterface.println(" ");
	         GameCode.textInterface.query(new String[] { "HIT THE BRAKES", "SWERVE AS FAR AS POSSIBLE" });
	         GameCode.isDriving = false;
	         GameCode.calamityCount += 1;
	       }
	       if (GameCode.textInterface.selected.equals("SWERVE AS FAR AS POSSIBLE")) {
	         GameCode.textInterface.selected = "unimportant";
	         if (eventRandom < 5) {
	           GameCode.textInterface.println("YOU SWERVED OUT OF THE WAY OF THE DEER LUCKILY NOBODY WAS IN THE OTHER LANE AND YOU AVOIDED A CRASH ENTIRLY");
	           GameCode.textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	         }
	         if ((eventRandom == 6) || (eventRandom == 7)) {
	           GameCode.textInterface.println("YOU SWERVE AND SEE A HUGE TRUCK IN THE DISTANCE LUCKILY THEY SEE YOU IN THE DISTANCE AND STOP THIER TURCK YOU DO NOT HIT THEM");
	           GameCode.textInterface.println("UNFORCHANITLY IT TAKES A WHILE TO GET EVERYTHING STRATENED OUT BETWEEN YOU TWO AND WHEN YOU FINALLY DO YOU NOTICE THE DEER IN");
	           GameCode.textInterface.println("YOUR CARGO HOLD AND HE HAS EATEN A LARGE PORTIAN OF YOUR GRAIN");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("LOSE 25 PERCENT GRAIN");
	           GameCode.grain -= 25;
	           GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	         }
	         if (eventRandom >= 8) {
	           GameCode.textInterface.println("YOU SWERVE INTO THE OTHER LANE ONLY TO SEE THE TERRFIYING SHEEN OF ANOTHER CAR RIGHT IN FRONT OF YOU.  YOU CRASH INTO IT AT HIGH SPEEDS");
	           GameCode.textInterface.println("YOUR CAR IS TOTALLED AND YOU ARE SITTING BLOODY IN THE DRIVERS SEAT BY THE TIME YOU GOT TO THE HOSPITAL YOU WERE ALREADY GONE.");
	           GameCode.textInterface.println(" ");
	           GameCode.clip2.stop();
	           GameCode.stuff.playSoundEffect(6.0F, "soundEffects/crash.wav");
	           GameCode.textInterface.println("AT LEAST WE CAN THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("GAME OVER");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.query(new String[] { "DARN IT" });
	         }
	       }
	       if (GameCode.textInterface.selected.equals("HIT THE BRAKES")) {
	         GameCode.textInterface.println("YOU DECIDE TO PLAY IT SAFE AND JUST SLOW THE CAR DOWN AS MUCH AS YOU CAN YOUR CAR HITS THE DEER YOU GO FLYING AND ARE TAKEN TO THE HOSPITAL YOU WAKE");
	         GameCode.textInterface.println("UP A FEW HOURS LATER WHEN YOU DO THE DOCTORS CHARGE YOU 300 DOLLARS FOR THE EMERGENCY CARE AND THE MECHANIC CHARGES YOU 350 FOR REPAIRS TO YOUR CAR");
	         GameCode.clip2.stop();
	         GameCode.stuff.playSoundEffect(6.0F, "soundEffects/brakeing quickly.wav");
	         GameCode.textInterface.selected = "unimportant";
	         if (GameCode.money >= 650) {
	        	 GameCode.money -= 650;
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("AT LEAST YOUR ALIVE THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("LOSE 650 DOLLARS");
	           GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	         } else {
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("YOU DIDEN'T HAVE ENOGH MONEY TO PAY THE THE BILLS SO YOU WERE FORCED TO GIVE UP ON YOUR QUEST TO NEW YORK AND STAY HERE TO WORK OFF YOUR DEBT");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("GAME OVER");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.println("BUT YOUR ALIVE SO THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	           GameCode.textInterface.println(" ");
	           GameCode.textInterface.query(new String[] { "DARN IT" });
	         }
	       }
	       if (GameCode.textInterface.selected.equals("DARN IT")) {
	    	   GameCode.initialize();
	       }
	       if (GameCode.textInterface.selected.equals("GET BACK ON THE ROAD")) {
	         GameCode.textInterface.selected = "unimportant";
	         GameCode.isDriving = true;
	       }
}
}
