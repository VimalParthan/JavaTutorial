package com.vimal;

public class Player {

	public String fullname;
	public int health;
	public String weapon;

	public void looseHealth(int damage) {
		this.health = this.health - damage;
		if (this.health <= 0) {
			System.out.println("Player Knocked out");
		}
	}

	public int healthRemaining() {
		return this.health;
	}

}
