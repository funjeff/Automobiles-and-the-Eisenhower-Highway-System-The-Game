package location;

import gameElements.Door;
import main.Actor;
import resources.Sprite;

public class Truckstop extends Location {
	
	public Truckstop(boolean type) {
		super(type);
		Actor truckstop = new Actor (new Sprite ("resources/sprites/truckstop probably finished.png"));
		Door d = new Door ("resources/sprites/interiors/truckstop/");
		
		d.setSprite(new Sprite ("resources/sprites/amoung us door.png"));
		
		truckstop.adjustHitboxBorders();
		this.addActor(truckstop);
		this.addActor(d);
		
		d.adjustHitboxBorders();

		
		
	}
	
}
