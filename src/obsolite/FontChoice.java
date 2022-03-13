package obsolite;

import location.Location;
import location.TitleScreen;
import main.GameCode;
import resources.DataManager;

public class FontChoice extends Location {
	public FontChoice () {
		super(true);
	}
	@Override
	public void eventStart () {
		  GameCode.getTextInterface().selected = "unimportant";
	      GameCode.getTextInterface().println("CHOSE A FONT");
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(DataManager.getColorChoices());
	}
	@Override
	public void runEventCode () {
		super.runEventCode();
	      if (GameCode.getTextInterface().selected.equals("WHITE")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().font;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("RED")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().redFont;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("BLUE")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().blueFont;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("YELLOW")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().yellowfont;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("WINGDINGS")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().wingdings;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("CHICKEN SCRATCH")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().chickenScratch;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("RAINBOW")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().rainbowfont;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	      if (GameCode.getTextInterface().selected.equals("GREEN")) {
	        GameCode.getTextInterface().selected = "unimportant";
	        GameCode.getTextInterface().font = DataManager.getSprites().greenFont;
	        GameCode.getTextInterface().println(" ");
	        GameCode.setCurrentEvent(new TitleScreen ());
	      }
	}
}
