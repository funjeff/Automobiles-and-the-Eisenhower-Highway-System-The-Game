package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;

public class Candy extends Location {
	public Candy () {
		super(false);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("YOU NOTICE A NICE LOOKING CANDY BAR IN THE WINDOWSILL YOU WANT TO EAT IT VERY BADLY SO YOU GO IN TO ASK ABOUT IT");
        GameCode.getTextInterface().println("THE SHOPKEPPER SAYS ITS DELUX AND THAT IT IS 100 DOLLARS WHAT DO YOU DO");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "PAY 100 DOLLARS", "ASK FOR DISCOUNT" });
	}
	 @Override
	public void runEventCode () {
		 if (GameCode.getTextInterface().selected.equals("PAY 100 DOLLARS")) {
		        if (GameCode.getDataManager().money >= 100) {
		          GameCode.getTextInterface().println("YOU PAY THE ENORMUS SUM OF MONEY FOR A CANDY BAR IT WASEN'T EVEN THAT GOOD");
		          GameCode.getDataManager().money -= 100;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        } else {
		          GameCode.getTextInterface().println("YOU CANT AFFORD IT IF ONLY YOU HAD A DISCOUNT");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "ASK FOR DISCOUNT" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		      }
		      if (GameCode.getTextInterface().selected.equals("ASK FOR DISCOUNT")) {
		    	  int eventRandom = 0;
		    	  Random RNG = new Random ();
		        eventRandom = RNG.nextInt(2);
		        if (eventRandom == 0) {
		          GameCode.getTextInterface().println("YOU ASK THE MAN FOR A DISCOUNT MAYBE SHARE THE WEALTH A LITTLE BIT HE FREAKS OUT ");
		          GameCode.getTextInterface().println("AND SHOUTS COMMIE THEN THROWS YOU OUT OF HIS STORE HE HIDES A COMMUNIST NOTE IN YOUR CAR");
		          GameCode.getDataManager().setCommunist(true);
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        } else {
		          GameCode.getTextInterface().println("YOU ASK THE MAN FOR A DISCOUNT AND HE IS REASONED WITH HE GIVES YOU THE BAR FOR FREE");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
		if (GameCode.getDataManager().getKarma() == 2) {
			return 8;
		} else {
			return 4;
		}
	 }
}
