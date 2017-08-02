package com.vimal;


class Car {
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;
	public Car(int cylinders,String name) {
		super();
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name=name;
	}
	
	public void startEngine(){
		System.out.println("Engine started");
	}
	
	public void accelerate(){
		System.out.println("accelerating");
	}
	
	
	public void brake(){
		System.out.println("braking");
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getName() {
		return name;
	}
	
	
	
}

class EType extends Car{
	
	public EType() {
		super(12,"Etype");
	}

	@Override
	public void brake() {
		System.out.print("Etype" + " is ");
		super.brake();
	}
	
	@Override
	public void startEngine() {
		System.out.print("Etype" + " is ");
		super.startEngine();
	}
	@Override
	public void accelerate() {
		System.out.print("Etype" + " is ");		
		super.accelerate();
	}
	
}

class FerrariGTO extends Car{

	public FerrariGTO() {
		super(12,"Ferrari GTO");
	}

	@Override
	public void brake() {
		System.out.print("Ferrari GTO" + " is ");
		super.brake();
	}
	
	@Override
	public void startEngine() {
		System.out.print("Ferrari GTO" + " is ");
		super.startEngine();
	}
	@Override
	public void accelerate() {
		System.out.print("Ferrari GTO" + " is ");		
		super.accelerate();
	}
	
}

class Gullwing extends Car{
	

	public Gullwing() {
		super(6,"Mercedes 300 SL Gullwing");
	}

	@Override
	public void brake() {
		System.out.print("Mercedes 300 SL Gullwing" + " is ");
		super.brake();
	}
	
	@Override
	public void startEngine() {
		System.out.print("Mercedes 300 SL Gullwing" + " is ");
		super.startEngine();
	}
	@Override
	public void accelerate() {
		System.out.print("Mercedes 300 SL Gullwing" + " is ");		
		super.accelerate();
	}
	
}

class Unknown extends Car{

	public Unknown() {
		super(-1,"unknown");
	}

	
	
}

public class Main {

	public static void main(String[] args) {
		
		Car car;
		
		for(int i=0;i<10;i++){
			car = generateRandomCar();
			System.out.println("the random car generated is " + car.getName());
			car.getCylinders();
			car.getWheels();
			car.startEngine();
			car.accelerate();
			car.brake();
		}
		
	}

	private static Car generateRandomCar(){
		int randomNumber = (int)(Math.random()*4)+1;
		System.out.println("Random number generated is : " + randomNumber);
		switch(randomNumber){
		case 1:
			return new EType();
		case 2:
			return new FerrariGTO();	
		case 3:
			return new Gullwing();
		case 4:
			return new Unknown();
		}
		return null;
	}
}
