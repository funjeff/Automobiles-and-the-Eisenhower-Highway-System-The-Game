package main;

import java.util.ArrayList;

public class Walls {
	
	public static ArrayList <Actor> walls;
	 
	public static void addWall (Actor newWall) {
		walls.add(newWall);
	}
	
	public static void removeWall (Actor oldWall) {
		walls.remove(oldWall);
	}
	
	public boolean isColiding (Actor) {
		
	}
	
}
