package attacks;

import enemys.Attack;
import enemys.Enemy;

public class GasHatOn extends Attack {
	

	
	public GasHatOn (String attackText) {
		super (attackText);
		text = attackText;
	}
	
	public GasHatOn (String attackText, int chance) {
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
