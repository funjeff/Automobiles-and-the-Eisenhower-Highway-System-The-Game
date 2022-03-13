package obsolite;

import location.Location;
import main.GameCode;

public class Homeless extends Location {
	public Homeless () {
		super(false);
	}
	@Override
	public void eventStart() {
		 GameCode.getTextInterface().println("YOU DRIVE BY A GROUP OF HOMELESS THAT SEEM TO BE IN TROUBLE YOUR CONCERNED ");
         GameCode.getTextInterface().println("SO YOU GO CHECK ON THEM AND THEY TELL YOU THEY ARE VERY CLOSE TO DYING OF STARVATION");
         GameCode.getTextInterface().println("YOU COULD GIVE THEM SOME OF YOUR GRAIN OR YOU COULD NOT NOT LIKE IT REALLY AFFECTS YOU");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().query(new String[] { "GIVE THEM FOOD", "WHY WOULD I DO THAT I CANT CLICKBAIT IT IN THE FIFTYS" });
	}
	 @Override
	public void runEventCode () {
	        if (GameCode.getTextInterface().selected.equals("GIVE THEM FOOD")) {
	          GameCode.getTextInterface().println("YOU GIVE THEM SOME FOOD AND FEEL REALLY GOOD ABOUT YOURSELF BUT THATS ABOUT IT");
	          GameCode.getTextInterface().println("GAIN GOOD KARMA");
	          GameCode.getDataManager().setKarma(1);
	          GameCode.getDataManager().grain -= 30;
	          this.playSoundEffect(6.0F, "soundEffects/THANK YOU!.wav");
	          GameCode.getTextInterface().println("THOSE HOMELESS MUST THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().println("LOSE 30 PERCENT OF GRAIN");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getDataManager().setHomelessFed(true);
	          GameCode.getTextInterface().query(new String[] {"GET BACK ON THE ROAD"});
	          GameCode.getTextInterface().selected = "unimportant";
	        }
	        if (GameCode.getTextInterface().selected.equals("WHY WOULD I DO THAT I CANT CLICKBAIT IT IN THE FIFTYS")) {
	          GameCode.getTextInterface().println("YOU LEAVE AND LAUGH AT THOSE LOSERS FOR NOT HAVEING THE LARGE PORTIAN OF FOOD YOU HAVE");
	          GameCode.getDataManager().setKarma(2);
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] {"GET BACK ON THE ROAD"});
	          GameCode.getTextInterface().selected = "unimportant";
	        }
	        
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 4;
			if (!GameCode.getDataManager().isHomelessFed()){
				return probablity;
			} else {
				return 0;
			}
	 }
}
