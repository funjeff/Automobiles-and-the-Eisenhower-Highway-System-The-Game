package main;

import enemys.Attack;
import enemys.Enemy;
import gameElements.Farmer;
import items.Item;
import resources.Textbox;

public class BattleInterface {
	
	Enemy enemy;
	
	Textbox dialogBox;
	
	boolean itemMenu = false;
	
	boolean summonMenu = false;
	
	Textbox nameBox;
	
	public BattleInterface() {
		
	}
	
	public void draw () {
		
		boolean emptyEntered = dialogBox.isEmpty();
		int queryResults = dialogBox.getQueryResult();
		
		nameBox.draw();
		
		if (queryResults == -1) {
			if(emptyEntered) {
				promptInput();
			}
		} else {
			if (itemMenu) {
				useItem(queryResults);
			} else if (summonMenu) {
				useSummon(queryResults);
			} else {
				choseOption(queryResults);
			}
		}
		
		enemy.sprite.draw(211, 80);
		dialogBox.draw();
	}

	
	public void useItem (int itemSlot) {
		useItem(Farmer.status.inventory.get(itemSlot));
	}
	
	public void useSummon(int summonSlot) {
		useSummon(Farmer.status.availableSummons.get(summonSlot));
	}
	
	public void choseOption(int option) {
		if (option == 0) {
			
			attack();
		}
		
		if (option == 1) {
			itemMenu = true;
			dialogBox.pushString("WHITCH ITEM WILL YOU USE");
			String query = "~Q";
			for (int i = 0; i < Farmer.status.inventory.size(); i++) {
				query = query + Farmer.status.inventory.get(i).getName() + ":";
			}
			dialogBox.pushString(query);
		}
		
		if (option == 2) {
			summonMenu = true;
			dialogBox.pushString("USE WITCH ATTACK?");
			String query = "~Q";
			for (int i = 0; i < Farmer.status.availableSummons.size(); i++) {
				query = query + Farmer.status.availableSummons.get(i).getAttackName() + ":";
			}
			dialogBox.pushString(query);
		}
	}
	
	public void attack () {
		generateTurn(enemy.pullPlayerAttack());
	}
	
	public void useItem(Item toUse) { //TODO pass in an Item
		generateTurn(toUse.getAttack(enemy));
	}
	
	public void useSummon(Attack summonAttack) {
		generateTurn(summonAttack);
	}
	
	public void generateTurn (Attack playerAttack) {
		playerAttack.useOn(enemy);
		dialogBox.pushString(playerAttack.getText());
		
		Attack enemyAttack = enemy.pullAttack();
		enemyAttack.use();
		dialogBox.pushString(enemyAttack.getText());
		
		for (int i =0; i < enemy.turnInbetweenEffects.size(); i++) {
			Attack inbetweenEffect = enemy.turnInbetweenEffects.get(i);
			inbetweenEffect.use();
			dialogBox.pushString(inbetweenEffect.getText());
		}
		
		Attack inBetweenAttack = enemy.pullInBetweenText();
		inBetweenAttack.use();
		dialogBox.pushString(inBetweenAttack.getText());
	}
	
	public void setEnemy(Enemy toFight) {
		enemy = toFight;
		dialogBox = new Textbox (toFight.encounterText);
		dialogBox.changeWidth(32);
		dialogBox.changeHeight(7);
		dialogBox.setX(80);
		dialogBox.setY(340);
		nameBox = new Textbox(toFight.enemyName);
		nameBox.setX(257);
		nameBox.setY(20);
		
	}
	
	public void promptInput() {
		dialogBox.pushString("~QATTACK:ITEMS:SPECIAL");
	}
	
	
}
