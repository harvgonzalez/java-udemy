package oop;

public class AnimalClassMain {
	
	public static void main(String[] args) {
		
		AnimalClass animal = new AnimalClass("Animal", 1, 1, 5, 5);
		DogClass dog = new DogClass("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
		
		dog.eat();
		//dog.walk();
		dog.run();
		
		
		
	}
	
}
