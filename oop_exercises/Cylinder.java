package oop_exercises;

public class Cylinder extends Circle {
	
	// instance variables
	private double height;
	
	// constructor
	public Cylinder(double radius, double height) {
		super(radius);
		
		this.height = height;
		
		if( height < 0 ) {
			this.height = 0;
		}
	}
	// getters
	public double getHeight() {
		return height;
	}
	
	// methods
	
	public double getVolume() {
		return getArea() * height;
	}
}
