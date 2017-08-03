package com.vimal;

public class DeluxeBurger extends HamBurger {
	
	public DeluxeBurger(){
		super("Deluxe","White","Sausage & Bacon",14.54);
		super.addHamburgerAddittion1("Chips", 2.75);
		super.addHamburgerAddittion1("Drink", 6.78);
	}
	
	@Override
	public void addHamburgerAddittion1(String name, double price) {
		System.out.println("cannot add additional items to deluxe burger");
	}
	
	@Override
	public void addHamburgerAddittion2(String name, double price) {
		System.out.println("cannot add additional items to deluxe burger");

	}
	
	@Override
	public void addHamburgerAddittion3(String name, double price) {
		System.out.println("cannot add additional items to deluxe burger");

	}
	
	@Override
	public void addHamburgerAddittion4(String name, double price) {
		System.out.println("cannot add additional items to deluxe burger");

	}
}
