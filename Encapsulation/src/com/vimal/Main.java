package com.vimal;

public class Main {

	public static void main(String[] args) {
		
//		Player player = new Player();
//		player.fullname = "Vimal";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.looseHealth(damage);
//		System.out.println("Remaing health = "+ player.healthRemaining());
//		
//		damage = 11;
//		player.health =200;
//		player.looseHealth(damage);
//		System.out.println("Remaing health = "+ player.healthRemaining());
		
		EnhansedPlayer player = new EnhansedPlayer("Time", 200, "sword");
		System.out.println("Initial Health is " + player.getHealth());
				
	}

}
