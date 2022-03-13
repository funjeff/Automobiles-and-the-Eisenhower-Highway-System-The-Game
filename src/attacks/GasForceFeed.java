package attacks;

import enemys.Attack;
import enemys.Enemy;

public class GasForceFeed extends Attack {
	

	
	public GasForceFeed (String attackText) {
		super (attackText);
		text = attackText;
	}
	
	public GasForceFeed (String attackText, int chance) {
		super(attackText,chance);
		text = attackText;
		this.chance = chance;
	}
	
	@Override
	public void use() {
		
	}
	
	@Override
	public void useOn(Enemy on) {
		
	}
	
	
}
