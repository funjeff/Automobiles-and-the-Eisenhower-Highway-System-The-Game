package items;

import java.util.HashMap;

import enemys.Attack;
import enemys.Enemy;
import main.Actor;
import resources.Sprite;

public class Item extends Actor {

	String itemName;
	
	Sprite itemSprite;
	
	HashMap <String,Attack> attacks4EnemiesDotCom = new HashMap<String,Attack>();
	
	public Item() {
		
	}
	
	public void useItem() {
		
	}
	
	public void setName (String name) {
		itemName = name;
	}
	
	public String getName () {
		return itemName;
	}
	
	public Attack getAttack (Enemy on) {
		return attacks4EnemiesDotCom.get(on.getClass().getSimpleName());
	}
	
}
