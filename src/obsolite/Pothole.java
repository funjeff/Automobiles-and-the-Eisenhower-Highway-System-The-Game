package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Pothole extends Location {
	public Pothole () {
		super(false);
	}
	@Override
	public void eventStart() {
			GameCode.getTextInterface().println("YOU GET OUT OF YOUR CAR FOR A BIT FOR SOME FRESH AIR WHEN YOU FIND A POTHOLE ITS ");
	        GameCode.getTextInterface().println("PRETTY BIG YOU COULD FIX IT IF YOU WANT BUT THERE WOULDEN'T REALLY BE A POINT TO IT");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "YEAH SAVE THE ENVIROMENT", "AINT NOBODY GOT TIME FOR THAT" });
	}
	 @Override
	public void runEventCode () {
		
		      if (GameCode.getTextInterface().selected.equals("YEAH SAVE THE ENVIROMENT")) {
		        GameCode.getTextInterface().println("YOU TAKE THE TIME OUT OF YOUR DAY TO FIX THE ENORMUS POTHOLE YOU FEEL GOOD ABOUT YOURSELF");
		        GameCode.getTextInterface().println("GET GOOD KARMA");
		        GameCode.getTextInterface().println("YOU THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM AND THUS YOU MUST GIVE BACK TO AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getDataManager().setKarma(1);
		      }
		      if (GameCode.getTextInterface().selected.equals("AINT NOBODY GOT TIME FOR THAT")) {
		        GameCode.getTextInterface().println("YOU LEAVE KNOWING THAT THE POTHOLE IS STILL THERE LAUGHING AS IT AMUSES YOU EVER SO");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("GET BAD KARMA (BUT IF YOU GET TO NEW YORK WITHOUT TURRNING OFF THE GAME THERE MAY BE AN EXTRA REWARD IN IT FOR YOU)");
		        GameCode.getTextInterface().println("PRAY TO GOD FOR SAFTY OF THOSE WHO PASS THE POTHOLE ON THE EISENHOWER HIGHWAY SYSTEM");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getDataManager().pothole = true;
		        GameCode.getDataManager().setKarma(1);
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 2;
			return probablity;
	 }
}
