package location;

import java.util.ArrayList;

import indecators.Indecator;
import main.Actor;
import main.GameCode;
import resources.DataManager;
import resources.Sprite;

public class Location {

	static ArrayList <Location> randomEvents = new ArrayList <Location>();
	ArrayList <Actor> actors = new ArrayList <Actor>();
	
	double distanceFromPlayer = 0;
	
	
	public static ArrayList<Location> getRandomEvents() {
		return randomEvents;
	}
	public static void setRandomEvents(ArrayList<Location> randomEvents) {
		Location.randomEvents = randomEvents;
	}
	/**
	 * pretty generic constructor
	 * @param refers to whearter or not the event is added to the pool of random events false for yes true for no (I know thats dumb but Its pretty much too late to change now)
	 * @author Jeffrey
	 */
	public Location (boolean type) {
		if(!type){
			boolean good = true;
			for (int i = 0; i < randomEvents.size(); i++) {
				if (randomEvents.getClass().equals(this.getClass())) {
					good = false;
				}
			}
			if (good) {
				randomEvents.add(this);
			}
		}
	}
	
	public void place (double distance) {
		distanceFromPlayer = distance;
	}
	public void setDist (double newDist) {
		distanceFromPlayer = newDist;
	}
	public double getDist () {
		return distanceFromPlayer;
	}
	
	public void addActor (Actor newActor) {
		newActor.setX(newActor.getX() + 350);
		actors.add(newActor);
	}
	public void removeActor (Actor removeActor) {
		actors.remove(removeActor);
	}
	public ArrayList <Actor> getActors (){
		return actors;
	}
	public void drawElements () {
		for (int i = 0; i < actors.size(); i++) {
			
			actors.get(i).frameEvent ();
			actors.get(i).setDistanceFromCamera(distanceFromPlayer);
			actors.get(i).draw();
		}
	}
	
	
	
	
	
//	
//	
//	
//	//the rest of this code is probably depricated but Im not sure
//	/**
//	 * prints a line to the screen a bit easier
//	 * @param s the text to print to the screen
//	 */
//	protected void print(String s){
//		GameCode.getTextInterface().println(s.toUpperCase());
//		
//	}
//	/**
//	 * checks if the string is the selected string
//	 * @param s the string to check
//	 * @return weather or not that string is selected
//	 */
//	protected boolean checkSelected(String s){
//		return GameCode.getTextInterface().selected.equals(s);
//	}
//	/**
//	 * gives the given options to the players
//	 * @param an array of options to give to the player
//	 */
//	protected void query(String[] s){
//		for (int i=0; i<s.length; i++){
//			s[i]=s[i].toUpperCase();
//		}
//		GameCode.getTextInterface().query(s);
//	}
//	/**
//	 * sets the selected string to this string
//	 * @param the string to set the selected option too
//	 */
//	protected void setSelected(String s){
//		GameCode.getTextInterface().selected = s.toUpperCase();
//	}
//	public void renderAtAPlace (int x, int y, String [] content, Sprite sprite) {
//		GameCode.getTextInterface().renderAtAPlace(x, y, content, sprite);
//	}
	/**
	 * sets the background to a new background
	 * @param backgroundToUse a filepath to the background to change it too
	 */
	/*protected void changeBackground (String backgroundToUse){
		GameCode.getTextInterface().changeBackgorund(backgroundToUse);
	}*/

	/**
	 * plays a quick sound effect
	 * @param effect a filepath to the effect you want
	 * @param volume the volume to play the sound effect at
	 */
	protected void playSoundEffect ( float volume, String effect){
		DataManager.getPlayer().playSoundEffect(volume, effect);
	}
	
	
	public int getProbablity() {
		return 0;
	}
}
