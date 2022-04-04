package enemys;

public class Attack {
	
	public double chance;

	public int minDamage = 0;
	public int maxDamage = 0;
	
	public String text;
	
	public String attackName; //unused most of the time but certain selectable attacks do require a name
	
	public double chanceDisplace = 0;
	
	
	public Attack (String attackText) {
		text = attackText;
	}
	
	public Attack (String attackText, int chance) {
		text = attackText;
		this.chance = chance;
	}
	
	public void use() {
		
	}
	public void useOn(Enemy on) {
		
	}
	
	
	public String getText () {
		return text;
	}
	
	public void setAttackName (String name) {
		attackName = name;
	}
	
	public String getAttackName () {
		return attackName;
	}
	
	public double getChance() {
		return chance + chanceDisplace;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}
	
	public double getChanceDisplace () {
		return chanceDisplace;
	}
	
	public void setChanceDisplace (double displace) {
		chanceDisplace = displace;
	}
	
}
