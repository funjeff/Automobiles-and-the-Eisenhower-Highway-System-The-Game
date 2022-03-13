package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class OddJob extends Location {
public OddJob() {
		super(false);
	}
	@Override
	public void eventStart () {
        String placeholder = "ZORBITS";
        Random rand = new Random ();
        int eventRandom = (rand.nextInt(9) + 1);
        if (eventRandom == 1) {
          placeholder = "BANK";
        }
        if (eventRandom == 2) {
          placeholder = "FARM";
        }
        if (eventRandom == 3) {
          placeholder = "OFFICE BUILDING";
        }
        if (eventRandom == 4) {
          placeholder = "POST OFFICE";
        }
        if (eventRandom == 5) {
          placeholder = "SNAKE TAMERS SHOW";
        }
        if (eventRandom == 6) {
          placeholder = "COAL MINE";
        }
        if (eventRandom == 7) {
          placeholder = "GARDEN";
        }
        if (eventRandom == 8) {
          placeholder = "SHED PAINTING";
        }
        if (eventRandom == 9) {
          placeholder = "BAKEARY";
        }
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("AS YOU ARE DRIVING ALONG YOU NOTICE A HELP WANTED SIGN AT A " + placeholder + " FEELING A BIT LOW ON CASH YOU DECIDED TO CHECK IT OUT");
        GameCode.getTextInterface().println("YOU WERE SUPRISED TO FIND OUT THAT THEY WERE PAYING 200 DOLLARS FOR A FEW SIMPLE TASKS AND YOU JUMPED ON THAT BANDWAGON AS SOON AS YOU COULD");
        if (GameCode.getDataManager().amuletCoin) {
          GameCode.getTextInterface().println("YOU GOT SOME MORE CASH USING YOUR AMULET COIN");
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().println("GAIN 300 DOLLARS");
          GameCode.getDataManager().money += 300;
        } else {
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().println("GAIN 200 DOLLARS");
          GameCode.getDataManager().money += 200;
        }
        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	}
	@Override
	public void runEventCode() {
	      if (GameCode.getTextInterface().selected.equals("GET BACK ON THE ROAD")) {
	    	  GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	      }
	}
	@Override
	public int getProbablity() {
		int probablity = 8;
		if (GameCode.getDataManager().getKarma() == 1) {
			probablity = probablity + 4;
		}
		return probablity;
	}
}
