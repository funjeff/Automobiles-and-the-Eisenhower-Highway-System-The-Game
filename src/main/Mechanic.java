package main;

public class Mechanic {
		static int eventRandom;
		public Mechanic () {
		}
		public static void useEvent () {
	 if (GameCode.isDriving) {
	        eventRandom = (GameCode.RNG.nextInt(11) - 1);
	        GameCode.textInterface.println("YOUR CAR STARTS MAKEING SOME STRANGE NOISES SO YOU GO OUTSIDE TO CHECK IT OUT AND IT LOOKS LIKE ITS TOAST YOU COULD EITHER TAKE IT TO A MECHAINC");
	        GameCode.textInterface.println("OR TRY AND FIX IT YOURSELF OBVIOSLY YOU WOULD HAVE TO PAY FOR THE MECHANIC BUT THEIR IS A CHANCE OF WRECKING YOUR CAR IF YOU DO IT YOURSELF");
	        GameCode.textInterface.println(" ");
	        GameCode.textInterface.println(" ");
	        GameCode.textInterface.println(" ");
	        GameCode.textInterface.println(" ");
	        GameCode.calamityCount += 1;
	        GameCode.textInterface.query(new String[] { "TAKE IT TO A MECHANIC", "CHECK IT OUT YOURSELF" });
	        GameCode.isDriving = false;
	      }
	      if (GameCode.textInterface.selected.equals("CHECK IT OUT YOURSELF")) {
	        if (eventRandom >= 7) {
	          GameCode.textInterface.println("BY SOME MIRICAL YOU WITH YOUR 0 MECHANICAL TRAINING MANAGED TO GET THE CAR UP AND RUNNING AGAIN GOOD JOB YOU PENNY PINCHER");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.println("WOW THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	          GameCode.textInterface.selected = "unimportant";
	        }
	        if (eventRandom <= 6) {
	          GameCode.textInterface.println("YOU DO YOUR BEST TO FIX THE CAR BUT YOU ONLY MANAGE TO MAKE IT MORE BROKEN EVENTUALLY YOU GIVE UP AND CALL A MECANIC SEEING WHAT YOU DID");
	          GameCode.textInterface.println("TO THE CAR HE RUNS YOU AT A SPECIAL RATE 600 DOLLARS");
	          GameCode.clip2.stop();
	          GameCode.stuff.playSoundEffect(6.0F, "soundEffects/explosion.wav");
	          GameCode.textInterface.selected = "unimportant";
	          if (GameCode.money >= 600) {
	            GameCode.textInterface.println("BEGRUDGINGLY YOU HAND OVER THE MONEY HAVEING NO OTHER OPTIONS AT THE MOMENT");
	            GameCode.money -= 600;
	            GameCode.textInterface.println(" ");
	            GameCode.textInterface.println(" ");
	            GameCode.textInterface.println("PAY 600 DOLLARS");
	            GameCode.textInterface.println(" ");
	            GameCode.textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.textInterface.println(" ");
	            GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	          } else {
	            GameCode.textInterface.println("BUT YOU DON'T REALLY HAVE THAT KINDA CASH SO YOUR JUST STUCK HERE WITH NO CAR TO DRIVE AND THUS ENDS YOUR QUEST");
	            GameCode.textInterface.println("WHAT A LAME WAY TO LOSE THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.textInterface.query(new String[] { "DARN IT" });
	          }
	        }
	      }
	      if (GameCode.textInterface.selected.equals("TAKE IT TO A MECHANIC")) {
	        if (GameCode.money >= 450) {
	            GameCode.clip2.stop();
	            GameCode.stuff.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	          GameCode.textInterface.println("YOU TOOK THE CAR TO A MECHANIC PROBABLY THE SMART CHOICE HE CHARGES YOU 350 DOLLARS AND THEN YOUR ON YOUR WAY");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.println("PAY 450 DOLLARS");
	          GameCode.textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	          GameCode.money -= 450;
	          GameCode.textInterface.selected = "unimportant";
	        } else {
	          GameCode.textInterface.println("YOU TOOK THE CAR TO A MECHANIC BUT HE WANTS 450 FOR REPAIRS HE THROWS YOU OUT FOR NOT BEING ABLE TO PAY AND NOW YOUR STUCK HERE");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.println("GAME OVER");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.query(new String[] { "DARN IT" });
	          GameCode.textInterface.selected = "unimportant";
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
