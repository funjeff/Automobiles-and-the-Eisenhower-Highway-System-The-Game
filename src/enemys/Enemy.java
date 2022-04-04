package enemys;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import json.JSONArray;
import json.JSONException;
import json.JSONObject;
import json.JSONUtil;
import main.Actor;
import resources.Sprite;

public class Enemy {
	
	public Sprite sprite;
	public String enemyName = "DEFAULT";
	
	public String encounterText = "DEFAULT ENCOUNTER TEXT";
	
	public ArrayList <Attack> turnInbetweenText;
	
	public ArrayList <Attack> attacks;
	public ArrayList <Attack> gettingAttacked;
	public ArrayList <Attack> turnInbetweenEffects;
	
	int health = 1000;
	
	public HashMap <String, Object> enemyData = new HashMap <String,Object>();
	
	public Enemy () {
		attacks = new ArrayList <Attack> ();
		gettingAttacked = new ArrayList <Attack> ();
		turnInbetweenEffects = new ArrayList <Attack> ();
		turnInbetweenText = new ArrayList<Attack>();
		
	}
	
	public void importEnemyData(String filepath) {
		try {
			JSONObject data = JSONUtil.loadJSONFile(filepath);
			
			JSONArray dataArray = data.getJSONArray("enemyData");
			
			for (int i = 0; i < dataArray.getContents().size(); i++) {
				String curData = (String)dataArray.get(i);
				String [] splitData = curData.split(";");
				
				try {
					enemyData.put(splitData[0],Integer.parseInt(splitData[1]));
				} catch (NumberFormatException e) {
					if (splitData[1].equals("true") || splitData[1].equals("false")) {
						enemyData.put(splitData[0], Boolean.parseBoolean(splitData[1]));
					} else {
						enemyData.put(splitData[0], splitData[1]);
					}
				}
			}
			
			JSONObject stats = data.getJSONObject("stats");
			health = stats.getInt("health");
			encounterText = stats.getString("encounterText");
			enemyName = stats.getString("name");
			sprite = new Sprite (stats.getString("sprite"));
			
			JSONArray idleText = data.getJSONArray("inbetweenText");
			
			for (int i = 0; i < idleText.getContents().size();i++) {
				turnInbetweenText.add(new Attack ((String)idleText.get(i)));
			}
			
			JSONArray attacks = data.getJSONArray("attacks");
			
			for (int i = 0; i < attacks.getContents().size(); i++) {
				JSONObject curAttack = (JSONObject) attacks.get(i);
				Attack toUse = null;
				if (curAttack.get("effect") != null) {
					try {
						Class<?> cls = Class.forName("attacks." + curAttack.getString("effect"));
						
						Class <?> string = Class.forName("java.lang.String");
						
						toUse = (Attack)cls.getConstructor(string).newInstance(curAttack.getString("text"));
						
					} catch (ClassNotFoundException  | InstantiationException | IllegalAccessException | IllegalArgumentException
							| InvocationTargetException | NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					toUse = new Attack(curAttack.getString("text"));
				}
				toUse.setAttackName(curAttack.getString("name"));
				
				toUse.setChance(curAttack.getInt("chance"));
				
				try {
					toUse.minDamage = curAttack.getInt("minDamage");
				} catch (NumberFormatException e) {
					
				}
				try {
					toUse.maxDamage = curAttack.getInt("maxDamage");
				} catch (NumberFormatException e) {
					
				}
				this.addAttack(toUse);
			}
			
			JSONArray attacks2 = data.getJSONArray("farmerAttacks");
			
			for (int i = 0; i < attacks2.getContents().size(); i++) {
				JSONObject curAttack = (JSONObject) attacks2.get(i);
				Attack toUse = null;
				if (curAttack.get("effect") != null) {
					try {
						Class<?> cls = Class.forName("attacks." + curAttack.getString("effect"));
						
						Class <?> string = Class.forName("java.lang.String");
						
						toUse = (Attack)cls.getConstructor(string).newInstance(curAttack.getString("text"));
						
					} catch (ClassNotFoundException  | InstantiationException | IllegalAccessException | IllegalArgumentException
							| InvocationTargetException | NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					toUse = new Attack(curAttack.getString("text"));
				}
				toUse.setAttackName(curAttack.getString("name"));
				
				toUse.setChance(curAttack.getInt("chance"));
				
				try {
					toUse.minDamage = curAttack.getInt("minDamage");
				} catch (NumberFormatException e) {
					
				}
				
				try {
					toUse.maxDamage = curAttack.getInt("maxDamage");
				} catch (NumberFormatException e) {
					
				}
				
				this.addPlayerAttack(toUse);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Attack pullAttack () {
		Random rand = new Random ();
		int pulledNum = rand.nextInt(100);
		double curVal = 0;
		for (int i = 0; i < attacks.size(); i++) {
			curVal = curVal + attacks.get(i).getChance();
			if (pulledNum < curVal) {
				return attacks.get(i);
			}
		}
		
		System.out.println("Bruh what?");
		return null;//shoulden't ever be run
	}
	public Attack pullPlayerAttack () {
		Random rand = new Random ();
		int pulledNum = rand.nextInt(100);
		double curVal = 0;
		for (int i = 0; i < gettingAttacked.size(); i++) {
			curVal = curVal + gettingAttacked.get(i).getChance();
	
			if (pulledNum < curVal) {
				return gettingAttacked.get(i);
			}
		}
		System.out.println("Bruh what?");
		return null;//shoulden't ever be run
	}
	
	public Attack pullInBetweenText() {
		Random rand = new Random ();
		return turnInbetweenText.get(rand.nextInt(turnInbetweenText.size()));
	}
	
	public void addAttack(Attack toAdd) {
		
		double totalChance = 0;
		
		for (int i = 0; i < attacks.size(); i++) {
			totalChance = totalChance + attacks.get(i).getChance();
		}
		
		if (totalChance > 99) {
			
			double totalDisplace = 0;
			
			for (int i = 0; i < attacks.size(); i++) {
				totalDisplace = totalDisplace + attacks.get(i).getChanceDisplace();
			}
			
			totalDisplace = totalDisplace - toAdd.chance;
			
			attacks.add(toAdd);
			double loweredChance = totalDisplace/attacks.size();
			
			for (int i = 0; i < attacks.size(); i++) {
				attacks.get(i).setChanceDisplace(loweredChance);
			}
			
		} else {
			attacks.add(toAdd);
		}
		
	}
	
	public void removeAttack(Attack toRemove) {
		
		
		attacks.remove(toRemove);
		
		double totalDisplace = 0;
		
		for (int i = 0; i < attacks.size(); i++) {
			totalDisplace = totalDisplace + attacks.get(i).getChanceDisplace();
		}
		
		totalDisplace = totalDisplace + toRemove.getChance();
		
		double raisedChance = totalDisplace/attacks.size();
		
		for (int i = 0; i < attacks.size(); i++) {
			attacks.get(i).setChanceDisplace(raisedChance);
		}
		
	}
	
	public void removeAttack(int toRemove) {
		
		
		double totalDisplace = 0;
		
		for (int i = 0; i < attacks.size(); i++) {
			if (i != toRemove) {
			totalDisplace = totalDisplace + attacks.get(i).getChanceDisplace();
			}
		}
		
		totalDisplace = totalDisplace + attacks.get(toRemove).getChance();
		
		double raisedChance = totalDisplace/(attacks.size() - 1);
		
		attacks.remove(toRemove);
		
		for (int i = 0; i < attacks.size(); i++) {
			attacks.get(i).setChanceDisplace(raisedChance);
		}
		
	}
	
	public void addPlayerAttack(Attack toAdd) {
		
		double totalChance = 0;
		
		for (int i = 0; i < gettingAttacked.size(); i++) {
			totalChance = totalChance + gettingAttacked.get(i).getChance();
		}
		
		if (totalChance > 99) {
		
			double totalDisplace = 0;
			
			for (int i = 0; i < attacks.size(); i++) {
				totalDisplace = totalDisplace + attacks.get(i).getChanceDisplace();
			}
			
			totalDisplace = totalDisplace - toAdd.chance;
			
			gettingAttacked.add(toAdd);
			
			double loweredChance = totalDisplace/attacks.size();
			for (int i = 0; i < gettingAttacked.size(); i++) {
				gettingAttacked.get(i).setChanceDisplace(loweredChance);
			}
		
		} else {
			gettingAttacked.add(toAdd);
		}
		
		
		
	}
	
	public void removePlayerAttack(Attack toRemove) {
		
		gettingAttacked.remove(toRemove);
		
		double totalDisplace = 0;
		
		for (int i = 0; i < gettingAttacked.size(); i++) {
			totalDisplace = totalDisplace + gettingAttacked.get(i).getChanceDisplace();
		}
		
		totalDisplace = totalDisplace + toRemove.getChance();
		
		double raisedChance = totalDisplace/gettingAttacked.size();
		
		for (int i = 0; i < attacks.size(); i++) {
			gettingAttacked.get(i).setChanceDisplace(raisedChance);
		}
		
		
	}
	
	public void removePlayerAttack(int toRemove) {
		double totalDisplace = 0;
		
		for (int i = 0; i < gettingAttacked.size(); i++) {
			if (i != toRemove) {
			totalDisplace = totalDisplace + gettingAttacked.get(i).getChanceDisplace();
			}
		}
		
		totalDisplace = totalDisplace + gettingAttacked.get(toRemove).getChance();
		
		double raisedChance = totalDisplace/(gettingAttacked.size() - 1);
		
		gettingAttacked.remove(toRemove);
		
		for (int i = 0; i < gettingAttacked.size(); i++) {
			gettingAttacked.get(i).setChanceDisplace(raisedChance);
		}
		
		
	}
	
	
}
