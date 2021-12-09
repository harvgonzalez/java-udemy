package oop2_exercises;

public class Room {
	private Furniture furniture;
	private Roof roof;
	
	public Room(Furniture furniture, Roof roof) {
		
		this.furniture = furniture;
		this.roof = roof;
	}
	public Furniture getFurniture() {
		return furniture;
	}
	public Roof getRoof() {
		return roof;
	}
	
	
	

}
