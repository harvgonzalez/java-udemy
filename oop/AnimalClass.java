package oop;

public class AnimalClass {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public AnimalClass(String name, int brain, int body, int size, int weight) {
	
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("animal.eat() called...");
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() called.  is moving at speed: " + speed );
		
	}

	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
	
	

}
