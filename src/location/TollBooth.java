package location;

import main.Actor;
import resources.Sprite;

public class TollBooth extends Location {
	
	public TollBooth(boolean type) {
		super(type);
		Actor tollBooth = new Actor (new Sprite ("resources/sprites/toll booth (no bar).png"));
		tollBooth.setX(0);
		this.addActor(tollBooth);
		
	}
	
}
