package obsolite;

import location.Location;
import location.TitleScreen;
import main.GameCode;
import resources.DataManager;

public class VolumeControl extends Location {
	/** 
	 * uses the original constructer
	 */
	public VolumeControl () {
		super(true);
	}
	
	 @Override
	 public void eventStart () {
		 GameCode.getTextInterface().selected = "unimportant";
	     GameCode.getTextInterface().query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
	 }
	public void runEventCode () {
	super.runEventCode();
   
	  if (GameCode.getTextInterface().selected.equals("RAISE VOLUME")) {
          GameCode.getTextInterface().selected = "unimportant";
          GameCode.getTextInterface().println(" ");
 
          GameCode.getTextInterface().println("VOLUME RAISED");
          DataManager.setVolume(DataManager.getVolume() + 2.0F);
          if (DataManager.getVolume() > 6.0F) {
        	 DataManager.setVolume(DataManager.getVolume() - 2.0F);
            GameCode.getTextInterface().println(" ");
            GameCode.getTextInterface().println("VOLUME MAXXED");
            GameCode.getTextInterface().query(new String[] { "LOWER VOLUME", "DONT CHANGE VOLUME" });
          } else {
            this.changeMusic(this.getSongString(), DataManager.getVolume());
            GameCode.getTextInterface().query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
          }
        }
        if (GameCode.getTextInterface().selected.equals("LOWER VOLUME")) {
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().selected = "unimportant";
          GameCode.getTextInterface().println("VOLUME LOWERED");
          DataManager.setVolume(DataManager.getVolume() - 2.0F);
          this.changeMusic(this.getSongString(), DataManager.getVolume());
          GameCode.getTextInterface().query(new String[] { "RAISE VOLUME", "LOWER VOLUME", "DONT CHANGE VOLUME" });
        }
        if (GameCode.getTextInterface().selected.equals("DONT CHANGE VOLUME")) {
          GameCode.getTextInterface().selected = "unimportant";
          GameCode.setCurrentEvent(new TitleScreen());
        }
    
	}
}
