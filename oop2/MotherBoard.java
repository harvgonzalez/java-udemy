package oop2;

public class MotherBoard {

	// instance fields
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	// Constructor
	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	// Methods
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading...");
	}
	// GETTERS
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}
	
	
	
}
