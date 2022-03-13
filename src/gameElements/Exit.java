package gameElements;

import main.Actor;
import main.LocationHandler;
import resources.Sprite;

public class Exit extends Actor {
	
	
	public Exit() {
		this.setSprite(new Sprite ("resources/exit.png"));
	}
	
	@Override
	public void frameEvent () {
		if (Road.isColidingFarmer(this)) {
			LocationHandler.goOutside();
		}
	}

}
