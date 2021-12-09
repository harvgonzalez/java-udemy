package oop_exercises;

public class Vehicle {
	// class fields
	
	private int wheels;
	private String engine;
	private String medium;
	
	private int currentVelocity;
	private int currentDirection;
	// constructor
	public Vehicle(int wheels, String engine, String medium) {
		this.wheels = wheels;
		this.engine = engine;
		this.medium = medium;
		
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}

	// getters
	public int getWheels() {
		return wheels;
	}

	public String getEngine() {
		return engine;
	}

	public String getMedium() {
		return medium;
	}
	
	// methods 
	public void steer( int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle steering at " + currentDirection + " degrees");
		
	}
	public void changingGears() {
		
	}
	public void move( int velocity, int direction) {
		this.currentDirection = direction;
		this.currentVelocity = velocity;
		System.out.println("Vehicle is moving at speed: " + velocity + " in direction " + currentDirection );
	}
	
	
}
