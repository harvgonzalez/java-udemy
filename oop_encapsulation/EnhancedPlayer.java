package oop_encapsulation;

public class EnhancedPlayer {
	private String name;
	private int health = 100;
	private String weapon;
	public EnhancedPlayer(String fullName, int health, String weapon) {
		
		this.name = fullName;
		if( health>0 & health <=100) {
			this.health = health;
		}
		
		this.weapon = weapon;
	}
	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if (this.health <=0) {
			System.out.println("Player knocked out");
			// reduce number of lives remaining for the player
		}
	}
	public String getFullName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getWeapon() {
		return weapon;
	}
	
	
	
	
}
