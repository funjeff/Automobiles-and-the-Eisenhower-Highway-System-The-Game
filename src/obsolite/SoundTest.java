package obsolite;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class SoundTest extends Location  {
	/** 
	 * uses the original constructer
	 */
	public SoundTest () {
		super(true);
	}
	@Override
	public void eventStart () {
		GameCode.getTextInterface().println("WHAT SONG DO YOU WANT TO HEAR");
	  	  GameCode.getTextInterface().selected = "unimportant";
	  	  GameCode.getTextInterface().query(new String [] {"TITLE THEME", "THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM", "MARSH-ANS THEME", "EXTRASENSORY", "VS BANDITS", "JUMPING THROUGH HOOPS", "ROAD RAGE!", "VS MOBIUS", "CLEAR THE ROADS", "BACK TO NORMAL"});
	}
	@Override
	public void runEventCode () {
	super.runEventCode();
	  if (GameCode.getTextInterface().selected.equals("BACK TO NORMAL")) {
	      GameCode.getTextInterface().println(" ");
	      DataManager.setInTest(false);
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("CLEAR THE ROADS")) {
	      GameCode.getTextInterface().selected = "unimport"; 
	      this.changeMusic("music/clear the roads (final).wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      DataManager.setInTest(true);
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("VS BANDITS")) {
		      GameCode.getTextInterface().selected = "unimport"; 
		      this.changeMusic("music/vs bandits.wav", DataManager.getVolume());
		      GameCode.getTextInterface().println(" ");
		      DataManager.setInTest(true);
		      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		      }
	      if (GameCode.getTextInterface().selected.equals("TITLE THEME")) {
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/tital theme.wav", DataManager.getVolume());
	    	  GameCode.getTextInterface().println(" ");
	      	  DataManager.setInTest(true);
	      	  GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("MARSH-ANS THEME")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/marsh-ans theme version 2.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("EXTRASENSORY")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/extrasensory.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("JUMPING THROUGH HOOPS")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/jumping through hoops.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("ROAD RAGE!")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/ROAD RAGE!.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      }
	      if (GameCode.getTextInterface().selected.equals("VS MOBIUS")) {
	    	  DataManager.setInTest(true);
	    	  GameCode.getTextInterface().selected = "unimport";
	    	  this.changeMusic("music/mobius batte.wav", DataManager.getVolume());
	      GameCode.getTextInterface().println(" ");
	      GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
	      } 
	    
	}
}
