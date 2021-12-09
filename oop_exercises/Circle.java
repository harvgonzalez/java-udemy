package oop_exercises;

public class Circle {
	
	//  instance variables
	private double radius;
	
	// constructor
	public Circle(double radius) {
		this.radius = radius;
		
		if( radius < 0 ) {
			this.radius = 0;
		}
	}
	
	// GETTERS
	public double getRadius() {
		return radius;
	}
	
	// instance methods
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	
}
