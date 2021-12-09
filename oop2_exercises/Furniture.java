package oop2_exercises;

public class Furniture {
	private String name;
	private String model;
	private Dimensions dimension;
	public Furniture(String name, String model, Dimensions dimension) {
		
		this.name = name;
		this.model = model;
		this.dimension = dimension;
	}
	
	public void useFurniture(String typeOfFurniture) {
		System.out.println("Using furniture " + typeOfFurniture );
	}
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public Dimensions getDimension() {
		return dimension;
	}
	

}
