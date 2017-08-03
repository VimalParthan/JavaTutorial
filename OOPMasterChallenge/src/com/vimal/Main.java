package com.vimal;

public class Main {

	public static void main(String[] args) {
		
		HamBurger hamBurger = new HamBurger("Basic","White","Sausage",3.36);
		double price = hamBurger.itemizeHamburger();
		hamBurger.addHamburgerAddittion1("Tomato", 0.27);
		hamBurger.addHamburgerAddittion2("Lettuce", 0.75);
		hamBurger.addHamburgerAddittion3("Cheese", 1.13);
		System.out.println("Total burger price is :" +hamBurger.itemizeHamburger());
	
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddittion1("Egg", 5.67);
		healthyBurger.addHealthyAddition1("Lentils", 5.43);
		System.out.println("Total burger price is :" +hamBurger.itemizeHamburger());
	
		DeluxeBurger db = new DeluxeBurger();
		
		db.addHamburgerAddittion3("kol", price);
		db.itemizeHamburger();
	}

}
