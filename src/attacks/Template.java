package attacks;

import enemys.Attack;
import enemys.Enemy;

public class Template extends Attack {
	

	
	public Template (String attackText) {
		super (attackText);
		text = attackText;
	}
	
	public Template (String attackText, int chance) {
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
