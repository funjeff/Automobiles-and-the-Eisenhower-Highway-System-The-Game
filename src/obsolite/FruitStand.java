package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class FruitStand extends Location {
	public FruitStand () {
		super(false);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("YOU SEE A FRUIT STAND");
        GameCode.getTextInterface().println("WILL YOU PURCHASE ANYTHING?");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "WHAT YOU THINK IM GONNA EAT FRUIT", "FRUIT SALED YUMMY YUMMY" });
	}
	 @Override
	public void runEventCode () {
		 if (GameCode.getTextInterface().selected.equals("WHAT YOU THINK IM GONNA EAT FRUIT")) {
		        GameCode.getTextInterface().println("YOU DECIDE NOT TO BUY CRAPPY FRUIT WHY WOULD YOU ITS LAME");
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		      }
		      if (GameCode.getTextInterface().selected.equals("FRUIT SALED YUMMY YUMMY")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        if (GameCode.getDataManager().money >= 40) {
		        	int eventRandom = 0;
		        	Random RNG = new Random ();
		          eventRandom = RNG.nextInt(2);
		          GameCode.getTextInterface().println("YOU DECIDED TO SPEND 40 DOLLARS ON FRUIT AND");
		          if (eventRandom == 1) {
		            GameCode.getTextInterface().print("IT WAS PRETTY GOOD GET SOME GOOD KARMA FAM");
		            GameCode.getDataManager().money -= 40;
		            GameCode.getDataManager().setKarma(1);
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          } else {
		            GameCode.getTextInterface().print("IT WAS ROTTEN AND USELESS");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().println(" ");
		            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          }
		        } else {
		          GameCode.getTextInterface().println("BUT YOU DIDEN'T HAVE ENOUGH MONEY");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			return 5;
	 }
}
