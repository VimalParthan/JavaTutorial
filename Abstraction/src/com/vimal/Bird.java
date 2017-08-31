package com.vimal;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
		
	}
	
	@Override
	public void fly() {
		System.out.println(getName()+" is Flapping wings");
		
	}

}
