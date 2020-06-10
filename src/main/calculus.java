package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class calculus {
	private static int score = 0;
	  private static boolean[] problemsUsed = new boolean [9];
	  private static boolean notPicked = false;
	  private static int eventRandom = 0;
	  private static Random RNG = new Random ();
	public static void startMinigame() {
	    if (GameCode.getTextInterface().selected.equals("ADVANCED CALCULUS")) {
		  GameCode.getTextInterface().selected = "unimportant";
		  GameCode.getTextInterface().println(" ");
		  GameCode.getTextInterface().println("WELCOME TO THE ADVANCED CALCULUS MINIGAME SOLVE 3 CALCULUS PROBLEMS TO WIN A PRIZE THERE ARE 9 PROBLEMS IN TOTAL");
		  GameCode.getTextInterface().println(" ");
	      score = 0;
	      notPicked = true;
	      Arrays.fill(problemsUsed, false);
	      GameCode.getTextInterface().query(new String[] { "HELL YEAH CALCULUS IS MY FAVORATE", "OH GOD NO PLEASE NO" });
	    }
	    if (GameCode.getTextInterface().selected.equals("HELL YEAH CALCULUS IS MY FAVORATE")) {
	      eventRandom = RNG.nextInt(9);
	      GameCode.getTextInterface().selected = "unimportant";
	      while (notPicked) {
	        if (problemsUsed[eventRandom] == false) {
	          problemsUsed[eventRandom] = true;
	          notPicked = false;
	        } else {
	          eventRandom = RNG.nextInt(9);
	        }
	      }
	      if (eventRandom == 0) {
	    	GameCode.getTextInterface().println("FIND EXPLICITLY AS A FUNCTION OF Z SO THAT F(Z) = U(X,Y).");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().query(new String[] { "Z^2 + (-1 + I)Z + IK", "IK -Z^2(-1 + I)", "6" });
	      }
	      
	      if (eventRandom == 1) {
	    	GameCode.getTextInterface().println("CONSIDER THE FOLLOWING INTEGRAL I = COS X/(4X^2 - GPI^2)(X^2 + G)");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("LOCATE AND CHARACTERIZE ALL SINGULARITIES OF THE INEGRAND COS Z/(4Z^2 - 9PI^2) (Z^2 + 9) IN THE COMPLEX Z PLANE");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().query(new String[] { "Z = I", "Z = 2.5I OR 8.532464I", "Z = + OR - 3I" });
	      }
	      
	      if (eventRandom == 2) {
	        GameCode.getTextInterface().println("SOLVE FOR X -32345235 + 32345235.01X = 0.0099897532");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "X = 1", "X = 83156.32356", "X = 0.0934753235" });
	      }
	      
	      if (eventRandom == 3) {
	    	GameCode.getTextInterface().println("CONSIDER THE FOLLOWING INTEGRAL I = COS X/(4X^2 - GPI^2)(X^2 + G)");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("EVALUATE THE INTEGRAL BY USE OF THE RESIDUE THEOREM");
	    	GameCode.getTextInterface().query(new String[] { "I = 2 - PI E^-3/27(PI^2 + 4)", "I = PI^2 + 4", "I = (2 - PI E^-3/27(PI^2 + 4))^2" });
	      }
	      
	      if (eventRandom == 4) {
	    	GameCode.getTextInterface().println("CONSIDER THE FOLLOWING ODE XY'' - XY' - Y = 0");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("CLASSIFY THE POINT X0 = 0");
	    	GameCode.getTextInterface().query(new String[] { "X0 IS A SUPER COOL POINT", "X0 = 0 IS A REGULAR SINGULAR POINT", "X0 = 0 IS A COMPLEX SINGULAR POINT" });
	      }
	      
	      if (eventRandom == 5) {
	    	GameCode.getTextInterface().println("CONSIDER THE FOLLOWING ODE XY'' - XY' - Y = 0");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("FIND THE INDICIAL EXPONENTS S1 AND S2 FOR THIS ODE");
	    	GameCode.getTextInterface().query(new String[] { "S1 = 2 AND S2 = 0", "S1 = -1 AND S2 = 0", "S1 = 1 AND S2 = 0" });
	      }
	      
	      if (eventRandom == 6) {
	    	GameCode.getTextInterface().println("CONSIDER THE FOLLOWING ODE XY'' - XY' - Y = 0");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("HOW MANY INDEPENDENT SOLUTIONS CAN YOU FIND BY USING THE FROBENUIUS METHOD FOR S = S2");
	    	GameCode.getTextInterface().query(new String[] { "INFINTE SOLUTIONS", "FOUR SOLUTIONS", "NO SOLUTIONS" });
	      }
	      
	      if (eventRandom == 7) {
	    	GameCode.getTextInterface().println("CONSIDER THE BESSEL EQUATION X^2Y^N + XY' + (X^2 - P^2)Y = 0");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("FIND THE GENERAL SOLUTION TO THIS ODE IN TERMS OF ELEMENTARY FUNCTIONS WHEN P =1/2");
	    	GameCode.getTextInterface().query(new String[] { "C1 SQRT(2/PIX) SINX + C2 SQRT (2/PIX) COS X", "C1 SQRT(2/PIX) COS X + C2 SQRT (2/PIX) SIN X", "NO SOLUTION" });
	      }
	      
	      if (eventRandom == 8) {
	    	GameCode.getTextInterface().println("CONSIDER THE BESSEL EQUATION X^2Y^N + XY' + (X^2 - P^2)Y = 0");
	    	GameCode.getTextInterface().println(" ");
	    	GameCode.getTextInterface().println("FIND THE GENERAL SOLUTION TO THE ODE WHEN P = 2");
	    	GameCode.getTextInterface().query(new String[] { "C1 SQRT(2/PIX) SINX + C2 SQRT (2/PIX) COS X", "C2 J2(X) + C1Y2(X)", "C1 J2(X) + C2Y2(X)" });
	      }
	    }
	    
	    if ((GameCode.getTextInterface().selected.equals("IK -Z^2(-1 + I)")) || (GameCode.getTextInterface().selected.equals("X = 83156.32356")) || (GameCode.getTextInterface().selected.equals("X = 0.0934753235")) || (GameCode.getTextInterface().selected.equals("Z = I")) || (GameCode.getTextInterface().selected.equals("Z = 2.5I OR 8.532464I")) || (GameCode.getTextInterface().selected.equals("I = PI^2 + 4")) || (GameCode.getTextInterface().selected.equals("I = (2 - PI E^-3/27(PI^2 + 4))^2")) || (GameCode.getTextInterface().selected.equals("X0 = 0 IS A COMPLEX SINGULAR POINT")) || (GameCode.getTextInterface().selected.equals("X0 = 0 IS A COMPLEX SINGULAR POINT")) || (GameCode.getTextInterface().selected.equals("S1 = 2 AND S2 = 0")) || (GameCode.getTextInterface().selected.equals("S1 = -1 AND S2 = 0")) || (GameCode.getTextInterface().selected.equals("INFINTE SOLUTIONS")) || (GameCode.getTextInterface().selected.equals("FOUR SOLUTIONS")) || (GameCode.getTextInterface().selected.equals("C1 SQRT(2/PIX) COS X + C2 SQRT (2/PIX) SIN X")) || (GameCode.getTextInterface().selected.equals("NO SOLUTION")) || (GameCode.getTextInterface().selected.equals("C2 J2(X) + C1Y2(X)"))) {
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().selected = "unimportant";
	      GameCode.getTextInterface().println("IM SORRY THATS INCORRECT YOU FREAKIN NOOB LOSER SCRUB GUY DUDE WHAT KIND OF MORON WOULDE'T KNOW THIS STUFF");
	      GameCode.getTextInterface().println(" ");
	      GameCode.clip2.stop();
	        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/scrible.wav");	      GameCode.getTextInterface().println("YOU COULD TRY AGAIN BUT YOUR PROBABLY TOO STUPID TO DO IT");
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	    }
	    if (GameCode.getTextInterface().selected.equals("6")) {
	      GameCode.getTextInterface().selected = "unimportant";
	    GameCode.getTextInterface().println(" ");
	    GameCode.clip2.stop();
        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/scrible.wav");	      GameCode.getTextInterface().println("6?         ...  WHAT ARE YOU FREAKING KIDDING ME YOU ANSWERED 6 LIKE I DON'T EVEN KNOW WHAT TO SAY ABOUT THAT");
	      GameCode.getTextInterface().println("DUDE I DIDEN'T KNOW THE ANSWER EITHER BUT ITS MULTIPLE CHOICE USE YOUR TEST TAKEING SKILLS ...........");
	      GameCode.getTextInterface().println("UHH YEAH YOU GOT IT WRONG");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	    }
	    if (GameCode.getTextInterface().selected.equals("X0 IS A SUPER COOL POINT")) {
	      GameCode.getTextInterface().selected = "unimportant";
	      GameCode.getTextInterface().println(" ");
	      GameCode.clip2.stop();
	        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/scrible.wav");	      GameCode.getTextInterface().println("YEAH I AGREE IT IS BUT THAT WASENT THE ANSWER WE WERE LOOKING FOR");
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	    }
	    if ((GameCode.getTextInterface().selected.equals("C1 J2(X) + C2Y2(X)")) || (GameCode.getTextInterface().selected.equals("C1 SQRT(2/PIX) SINX + C2 SQRT (2/PIX) COS X")) || (GameCode.getTextInterface().selected.equals("NO SOLUTIONS")) || (GameCode.getTextInterface().selected.equals("S1 = 1 AND S2 = 0")) || (GameCode.getTextInterface().selected.equals("X0 = 0 IS A REGULAR SINGULAR POINT")) || (GameCode.getTextInterface().selected.equals("I = 2 - PI E^-3/27(PI^2 + 4)")) || (GameCode.getTextInterface().selected.equals("X = 1")) || (GameCode.getTextInterface().selected.equals("Z = + OR - 3I")) || (GameCode.getTextInterface().selected.equals("Z^2 + (-1 + I)Z + IK"))) {
	      score += 1;
	      notPicked = true;
	      GameCode.getTextInterface().selected = "unimportant";
	      if (score == 3) {
	        GameCode.getTextInterface().println("YOU WIN A LIME GREEN FONT YAY BUT THERE IS MORE CALC TO BE DONE");
	        try {
	        	File fakeFile = new File ("./SavesDir");
	            File realFile = new File (fakeFile, "math.txt");
	            FileWriter fw = new FileWriter (realFile);
	            PrintWriter pw = new PrintWriter (fw);
	            pw.println("true");
	            pw.close();
	        }
	        catch (IOException localIOException1) {}
	      }
	      if (score <= 8) {
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("CONGRADULATIONS YOU GOT THE PROBLEM CORRECT LETS DO ANOTHER");
	        GameCode.clip2.stop();
	        GameCode.stuff.playSoundEffect(6.0F, "soundEffects/scrible.wav");
	        GameCode.getTextInterface().query(new String[] { "HELL YEAH CALCULUS IS MY FAVORATE" });
	      } else {
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("YOU ARE AN ABSOLUTE GENUS I GUESS YOU COULD SAY YOU HAVE STREET SMARTS (YES ALL THIS WAS FOR THAT PUN)");
	        GameCode.getTextInterface().println(" ");
	        thingy.userStats.setAchievement("master mathematician_1_1");
	        GameCode.getTextInterface().println("THANK GOD FOR ADVANCED CALCULUS AND THE EISENHOWER HIGHWAY SYSTEM");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	    }
	    if (GameCode.getTextInterface().selected.equals("OH GOD NO PLEASE NO")) {
	      GameCode.getTextInterface().println("YOU SEEM TO HAVE GOOD DECISON MAKEING SKILLS THOSE WILL SERVE YOU WELL IN THIS GAME");
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().selected = "unimportant";
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	    }
	}
}
