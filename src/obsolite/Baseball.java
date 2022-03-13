package obsolite;


import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Baseball extends Location {
	int amountBet;
	boolean canReturn;
	int eventRandom = 0;
	Random RNG = new Random ();
	int Strikes = 0;
	int Balls = 0;
	public Baseball () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println("AS YOU ARE DRIVING BY YOU SEE SOME PEOPLE PLAYING BASEBALL YOU ARE VERY INRESTED AND DECICDE YOU SHOULD ASK THEM IF YOU CAN JOIN");
	        GameCode.getTextInterface().println("YOU ASK THEM IF YOU CAN JOIN AND THEY LAUGH AT YOU STATEING THAT THEY COULD STRIKE YOU OUT WITHOUT YOU EVEN GETTING A HIT");
	        GameCode.getTextInterface().println("HE WANTS TO MAKE THIS INTRISTING BY PUTTING SOME MONEY ON THE LINE");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "SORRY DUDE IM BROKE", "50 DOLLARS", "100 DOLLARS", "500 DOLLARS", "1000 DOLLARS" });
	}
	 @Override
	public void runEventCode () {
		      if (GameCode.getTextInterface().selected.equals("SORRY DUDE IM BROKE")) {
		        GameCode.getTextInterface().println("HE ASSUMES THAT SIENCE YOU WERENT WILLING TO PUT MONEY ON IT YOU CANT DO IT AND YOU GO BACK TO YOUR CAR IN SHAME");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		      }
		      if (GameCode.getTextInterface().selected.equals("50 DOLLARS")) {
		        amountBet = 50;
		      }
		      if (GameCode.getTextInterface().selected.equals("100 DOLLARS")) {
		        amountBet = 100;
		      }
		      if (GameCode.getTextInterface().selected.equals("500 DOLLARS")) {
		        amountBet = 500;
		      }
		      if (GameCode.getTextInterface().selected.equals("1000 DOLLARS")) {
		        amountBet = 1000;
		      }
		      if ((canReturn) || (GameCode.getTextInterface().selected.equals("50 DOLLARS")) || (GameCode.getTextInterface().selected.equals("100 DOLLARS")) || (GameCode.getTextInterface().selected.equals("500 DOLLARS")) || (GameCode.getTextInterface().selected.equals("1000 DOLLARS"))) {
		        GameCode.getTextInterface().println("HE STEPS UP TO THE PLATE AND IS ABOUT TO THROW THE BALL AT YOU HE THROWS");
		        eventRandom = (RNG.nextInt(9) + 1);
		        canReturn = false;
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 4) {
		          GameCode.getTextInterface().print("A FASTBALL WHAT DO YOU DO");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "SWING", "DONT SWING" });
		        }
		        if ((eventRandom >= 5) && (eventRandom <= 8)) {
		          GameCode.getTextInterface().print("A CURVEBALL WHAT DO YOU DO");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GO FOR IT", "NO NO NO" });
		        }
		        if ((eventRandom == 9) || (eventRandom == 10)) {
		          GameCode.getTextInterface().print("SOMETHING YOU HAVE NEVER SEEN BEFORE AS HE ENGULFS THE BALL IN A TORNADO BUT ITS STILL GOING STAITE DOWN THE CENTER WHAT DO YOU DO");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "YOLO", "HOW ABOUT YONO" });
		        }
		      }
		      eventRandom = (RNG.nextInt(9) + 1);
		      if (GameCode.getTextInterface().selected.equals("SWING")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 5) {
		          GameCode.getTextInterface().println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT OUT OF THE PARK YOU LEAVE A HERO WITH DOUBLE THE AMOUNT YOU BET");
		          GameCode.getTextInterface().println(" ");
		          this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
		          GameCode.getTextInterface().println("GAIN MONEY");
		          GameCode.getDataManager().money += amountBet;
		          GameCode.getTextInterface().println(" ");
		          Strikes = 0;
		          Balls = 0;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        } else {
		          GameCode.getTextInterface().println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
		          Strikes += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("DONT SWING")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 5) {
		          GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
		          Strikes += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        } else {
		          GameCode.getTextInterface().println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
		          Balls += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("GO FOR IT")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("YOU HIT THE BALL REALLY HARD AND IT GOES RIGHT OUT OF THE PARK YOU LEAVE A HERO WITH DOUBLE THE AMOUNT YOU BET");
		          GameCode.getTextInterface().println(" ");
		          this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
		          GameCode.getTextInterface().println("GAIN MONEY");
		          GameCode.getDataManager().money += amountBet;
		          GameCode.getTextInterface().println(" ");
		          Strikes = 0;
		          Balls = 0;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        } else {
		          GameCode.getTextInterface().println("YOU SWING BUT IT WASEN'T QUITE IN THE HITABLE BOX AND YOU GET A STRIKE");
		          Strikes += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("NO NO NO")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (eventRandom <= 3) {
		          GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
		          Strikes += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        } else {
		          GameCode.getTextInterface().println("YOU DON'T SWING AND IT GOES INTO THE AREA FOR A BALL SO YOU GET A BALL");
		          Balls += 1;
		          GameCode.getTextInterface().println(" ");
		          canReturn = true;
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("HOW ABOUT YONO")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("THE BALL GOES RIGHT THROUGHT THE STRIKE BOX AND YOU GET A STRIKE");
		        Strikes += 1;
		        GameCode.getTextInterface().println(" ");
		        canReturn = true;
		      }
		      if (GameCode.getTextInterface().selected.equals("YOLO")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if ((eventRandom == 1) || (eventRandom == 2)) {
		          this.playSoundEffect(6.0F, "soundEffects/baseball.wav");
		          GameCode.getTextInterface().println("YOU MAKE THE MOST AMAZING HOME RUN IN HISTORY HITTING A TWISTER BACK OUT OF THE ");
		          GameCode.getTextInterface().println("PARK YOU LEAVE WITH DOUBLE THE AMOUNT OF MONEY YOU BET AND A SHOCKED LOOK ON YOUR OPPONITS FACE");
		          GameCode.getDataManager().money += amountBet;
		          GameCode.getTextInterface().println(" ");
		          Strikes = 0;
		          Balls = 0;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        } else {
		          GameCode.getTextInterface().println("YOU SWING BUT TO NO AVAIL THE BALL WAS MOVING TO FAST AND YOU COULDEN'T HIT IT LIKE THAT");
		          Strikes += 1;
		          canReturn = true;
		        }
		      }
		      if (Strikes == 3) {
		        GameCode.getTextInterface().println("YOU LOST THE BET AND WITH YOUR HEAD HANG LOW IN SHAME GAVE UP YOUR CASH AND RETURNED TO YOUR CAR");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        Strikes = 0;
		        if (GameCode.getDataManager().money >= amountBet) {
		          GameCode.getDataManager().money -= amountBet;
		          canReturn = false;
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        } else {
		          GameCode.getTextInterface().println("OR YOU WOULD HAVE IF YOU COULD OF PAID OFF YOUR DEBT INSTEAD YOU HAD TO STAY THERE FOR A WHILE AND BE THIER BUTLER TO PAY YOUR DEBT AND YOU HAD TO NOT GO TO NEW YORK");
		          GameCode.getTextInterface().query(new String[] { "DARN IT" });
		        }
		      }
		      if (Balls == 4) {
		        GameCode.getTextInterface().println("THEY CANT WALK YOU BECASUE ITS NOT A REAL GAME SO INSTEAD THEY JUST RESET YOUR STRIKES ");
		        Strikes = 0;
		        Balls = 0;
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
			int probablity = 4;
			if (GameCode.getDataManager().getKarma() == 1) {
				probablity = probablity + 2;
			}
			return probablity;
	 }
}
