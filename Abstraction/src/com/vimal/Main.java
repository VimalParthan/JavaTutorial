package com.vimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =  new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Bird parrot= new Parrot("Australian ringneck");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
	}

}
