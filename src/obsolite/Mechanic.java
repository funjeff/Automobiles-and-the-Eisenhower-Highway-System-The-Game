package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Mechanic extends Location {
		static int eventRandom;
		public Mechanic () {
			super (false);
			
		}
		@Override
		public void eventStart () {
		 	Random rand = new Random ();
	        eventRandom = (rand.nextInt(11) - 1);
	        GameCode.getTextInterface().println("YOUR CAR STARTS MAKEING SOME STRANGE NOISES SO YOU GO OUTSIDE TO CHECK IT OUT AND IT LOOKS LIKE ITS TOAST YOU COULD EITHER TAKE IT TO A MECHAINC");
	        GameCode.getTextInterface().println("OR TRY AND FIX IT YOURSELF OBVIOSLY YOU WOULD HAVE TO PAY FOR THE MECHANIC BUT THEIR IS A CHANCE OF WRECKING YOUR CAR IF YOU DO IT YOURSELF");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getDataManager().setCalamityCount(GameCode.getDataManager().getCalamityCount() + 1);
	        GameCode.getTextInterface().query(new String[] { "TAKE IT TO A MECHANIC", "CHECK IT OUT YOURSELF" });
		}
		@Override
		public void runEventCode () {
	      if (GameCode.getTextInterface().selected.equals("CHECK IT OUT YOURSELF")) {
	        if (eventRandom >= 7) {
	          GameCode.getTextInterface().println("BY SOME MIRICAL YOU WITH YOUR 0 MECHANICAL TRAINING MANAGED TO GET THE CAR UP AND RUNNING AGAIN GOOD JOB YOU PENNY PINCHER");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("WOW THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          GameCode.getTextInterface().selected = "unimportant";
	        }
	        if (eventRandom <= 6) {
	          GameCode.getTextInterface().println("YOU DO YOUR BEST TO FIX THE CAR BUT YOU ONLY MANAGE TO MAKE IT MORE BROKEN EVENTUALLY YOU GIVE UP AND CALL A MECANIC SEEING WHAT YOU DID");
	          GameCode.getTextInterface().println("TO THE CAR HE RUNS YOU AT A SPECIAL RATE 600 DOLLARS");
	          this.playSoundEffect(6.0F, "soundEffects/explosion.wav");
	          GameCode.getTextInterface().selected = "unimportant";
	          if (GameCode.getDataManager().money >= 600) {
	            GameCode.getTextInterface().println("BEGRUDGINGLY YOU HAND OVER THE MONEY HAVEING NO OTHER OPTIONS AT THE MOMENT");
	            GameCode.getDataManager().money -= 600;
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println("PAY 600 DOLLARS");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          } else {
	            GameCode.getTextInterface().println("BUT YOU DON'T REALLY HAVE THAT KINDA CASH SO YOUR JUST STUCK HERE WITH NO CAR TO DRIVE AND THUS ENDS YOUR QUEST");
	            GameCode.getTextInterface().println("WHAT A LAME WAY TO LOSE THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	            GameCode.getTextInterface().query(new String[] { "DARN IT" });
	          }
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("TAKE IT TO A MECHANIC")) {
	        if (GameCode.getDataManager().money >= 450) {
	 
	            this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	          GameCode.getTextInterface().println("YOU TOOK THE CAR TO A MECHANIC PROBABLY THE SMART CHOICE HE CHARGES YOU 350 DOLLARS AND THEN YOUR ON YOUR WAY");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("PAY 450 DOLLARS");
	          GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          GameCode.getDataManager().money -= 450;
	          GameCode.getTextInterface().selected = "unimportant";
	        } else {
	          GameCode.getTextInterface().println("YOU TOOK THE CAR TO A MECHANIC BUT HE WANTS 450 FOR REPAIRS HE THROWS YOU OUT FOR NOT BEING ABLE TO PAY AND NOW YOUR STUCK HERE");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("GAME OVER");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "DARN IT" });
	          GameCode.getTextInterface().selected = "unimportant";
	        }
	      }
	      if (GameCode.getTextInterface().selected.equals("DARN IT")) {
	        GameCode.initialize();
	      }
	      if (GameCode.getTextInterface().selected.equals("GET BACK ON THE ROAD")) {
	        GameCode.getDataManager().getComunityDrive();
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
