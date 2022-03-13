package gameElements;

import location.Interior;
import main.Actor;
import main.LocationHandler;
import resources.Sprite;

public class Door extends Actor {
	
	Interior to;
	
	public Door(String goesTo) {
		super();
		to = new Interior(goesTo);
		this.solid = false;
	}
	
	@Override
	public void frameEvent () {
		if (Road.isColidingFarmer(this)) {
			LocationHandler.enterInterior(to);
		}
	}

}
