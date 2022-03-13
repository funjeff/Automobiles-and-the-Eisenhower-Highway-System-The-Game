package main;

import java.util.Comparator;

import location.Location;

public class DistCompariter implements Comparator<Location> {
	
	@Override
	public int compare(Location o1, Location o2) {
		return (int)(o1.getDist() - o2.getDist());
	}

}
