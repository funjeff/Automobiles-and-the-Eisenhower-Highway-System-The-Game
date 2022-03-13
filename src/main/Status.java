package main;

import java.util.ArrayList;

import enemys.Attack;
import items.Item;


public class Status {
	
	ArrayList <Item> inventory = new ArrayList <Item>();
	ArrayList <Attack> availableSummons = new ArrayList <Attack>();
	
	//hopefully I will replace this some day
	// miles left  
	   private int milesLeft = 1000;
		  
	// resources
	  public int money = 1000;
	  public int grain = 100;
	  public double gas = 30;
	  public boolean amuletCoin = false;
	  public boolean marsianTech = false;
	  public boolean workingRadio = true;
	  public boolean diplomaticImmunity = false;
	  public boolean foldingChair = false;
	
	//karma that affects RNG
	  private int karma;
	
	// tiredness of the player
	  public int tiredness = 0;
	  private boolean poisoned = false;
	  private boolean isCommunist = false;
	  private boolean homelessFed = false;
	  public boolean isCriminal = false;
	   
	public Status () {
		
	}
	
	public int getMilesLeft() {
		return milesLeft;
	}

	public void setMilesLeft(int milesLeft) {
		this.milesLeft = milesLeft;
	}
	
	public boolean isPoisoned() {
		return poisoned;
	}
	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
	public boolean isCommunist() {
		return isCommunist;
	}
	public void setCommunist(boolean isCommunist) {
		this.isCommunist = isCommunist;
	}
	public boolean isHomelessFed() {
		return homelessFed;
	}
	public void setHomelessFed(boolean homelessFed) {
		this.homelessFed = homelessFed;
	}
	
	public int getKarma() {
		return karma;
	}

	public void setKarma(int karma) {
		this.karma = karma;
	}
	
}
