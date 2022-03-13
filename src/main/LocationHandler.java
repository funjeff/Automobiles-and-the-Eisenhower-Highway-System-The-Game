package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import location.Interior;
import location.Location;

public class LocationHandler {

	public final static int DRAW_DISTANCE = 10;
	
	public static ArrayList <Location> locations = new ArrayList <Location> ();
	
	int veiwX = 0;
	int veiwY = 0;
	
	public static Interior inside = null;
	
	public LocationHandler () {
		
	}
	
	public static void addLocation (Location toAdd) {
		locations.add(toAdd);
		
	}
	
	
	public static void drive (double dist) {
		for (int i = 0; i < locations.size(); i++) {
			locations.get(i).setDist(locations.get(i).getDist() - dist);
		}
	}
	
	//renders all locations that the player can see on the road
	//when inside buildings renderInteriorLocation is used instead to render the place the player is in 
	public static void renderClosestLocation () {
		
		Iterator<Location> allLocsIter = locations.iterator ();
		Location [] locationsArr = new Location[locations.size()];
		
		int cur = 0;
		while (allLocsIter.hasNext ()) {
			locationsArr[cur] = allLocsIter.next();
			cur = cur + 1;
		}
		
		DistCompariter comp = new DistCompariter ();
		Arrays.parallelSort (locationsArr, comp);
		
		for (int i = 0; i < locationsArr.length; i++) {
			if (locationsArr[i].getDist() < DRAW_DISTANCE && locationsArr[i].getDist() > 0.2) {
				locationsArr[i].drawElements(); //draws elements
			} else {
				break;
			}
		}	
	}
	
	public static void renderInteriorLocation() {
		inside.renderInterior();
	}
	
	//gets all locations that are close enough to the player to be rendered
	public static ArrayList <Location> getRenderedLocations(){
		Iterator<Location> allLocsIter = locations.iterator ();
		Location [] locationsArr = new Location[locations.size()];
		
		int cur = 0;
		while (allLocsIter.hasNext ()) {
			locationsArr[cur] = allLocsIter.next();
			cur = cur + 1;
		}
		
		DistCompariter comp = new DistCompariter ();
		Arrays.parallelSort (locationsArr, comp);
		
		ArrayList <Location>returnArray = new ArrayList <Location>();
		
		for (int i = 0; i < locationsArr.length; i++) {
			if (locationsArr[i].getDist() < DRAW_DISTANCE && locationsArr[i].getDist() > 0.2) {
				returnArray.add(locationsArr[i]);
			} else {
				break;
			}
		}
		return returnArray;
	}
	//returns true if the player is coliding with any location works inside and outside of interiors
	public static boolean isCollidingLocation(Actor with) {
		if (inside == null) {
			ArrayList <Actor> allActors = new ArrayList <Actor>();
			ArrayList <Location> renderedLocations = getRenderedLocations();
			for (int i = 0; i < renderedLocations.size(); i++) {
				allActors.addAll(renderedLocations.get(i).getActors());
			}
			
			if (allActors.contains(with)) {
				return false;
			}
			
			for (int i = 0; i < allActors.size(); i++) {
				if (with.isColliding(allActors.get(i)) && allActors.get(i).isSolid()) {
					return true;
				}
			}
			return false;
		} else {
			return inside.isColidingInterior(with);
		}
	}
	
	public static void locationEvents() {
		
	}
	
	/**
	 * 
	 * @returns true if the player is outside of a building (technically speaking of course)
	 */
	public static boolean isOutside () {
		return inside == null;
	}
	
	public static void enterInterior (Interior in) {
		inside = in;
	}
	
	public static void goOutside () {
		inside = null;
	}
}
