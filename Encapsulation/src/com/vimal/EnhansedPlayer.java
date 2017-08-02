package com.vimal;

public class EnhansedPlayer {
	private String name;
	private int hitPoints = 100;
	private String weapon;
	public EnhansedPlayer(String name, int health, String weapon) {
		super();
		this.name = name;
		if(health>0 &&health<=100){
			this.hitPoints = health;
		}
		this.weapon = weapon;
	}
	public void looseHealth(int damage) {
		this.hitPoints = this.hitPoints - damage;
		if (this.hitPoints <= 0) {
			System.out.println("Player Knocked out");
		}
	}
	
	public int getHealth() {
		return hitPoints;
	}
	
	
	
}
