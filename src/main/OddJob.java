package main;

public class OddJob {
static int eventRandom;
	public static void useEvent() {
		 if (GameCode.isDriving)
	      {
	        String placeholder = "ZORBITS";
	        eventRandom = (GameCode.RNG.nextInt(8) + 1);
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
	        GameCode.textInterface.println(" ");
	        GameCode.textInterface.println("AS YOU ARE DRIVING ALONG YOU NOTICE A HELP WANTED SIGN AT A " + placeholder + " FEELING A BIT LOW ON CASH YOU DECIDED TO CHECK IT OUT");
	        GameCode.textInterface.println("YOU WERE SUPRISED TO FIND OUT THAT THEY WERE PAYING 200 DOLLARS FOR A FEW SIMPLE TASKS AND YOU JUMPED ON THAT BANDWAGON AS SOON AS YOU COULD");
	        if (GameCode.amuletCoin) {
	          GameCode.textInterface.println("YOU GOT SOME MORE CASH USING YOUR AMULET COIN");
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.println("GAIN 300 DOLLARS");
	          GameCode.money += 300;
	        } else {
	          GameCode.textInterface.println(" ");
	          GameCode.textInterface.println("GAIN 200 DOLLARS");
	          GameCode.money += 200;
	        }
	        GameCode.isDriving = false;
	        GameCode.textInterface.println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	        GameCode.textInterface.query(new String[] { "GET BACK ON THE ROAD" });
	      }
	      if (GameCode.textInterface.selected.equals("GET BACK ON THE ROAD")) {
	        GameCode.textInterface.selected = "unimportant";
	        GameCode.isDriving = true;
	      }
	}
}
