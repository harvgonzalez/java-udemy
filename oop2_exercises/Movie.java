package oop2_exercises;

// Parent class
public class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
	

}
// Child movie jaws
class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}
	
	public String pot() {
		return "A shark eats a lot of people";
	}
}

// Child movie Independence
class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence day");
	}

	@Override
	public String plot() {
		
		return "Aliens attempt to take over earth";
	}
	
}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kids trying to escape a maze";
	}
	
	
	
}

class StarWars extends Movie{

	public StarWars() {
		super("Star wars");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial Forces try to take over the universe";
	}
	
	
}

class Forgetable extends Movie{

	public Forgetable() {
		super("Forgetable");
		
	}
	
	// No plot method
	
}



class MainMovie {
	
	public static void main(String[] args) {
		for(int i=1; i <11 ; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i +" : " + 
								movie.getName() + "\n" + "Plot: " + movie.plot() +
								"\n");
		}
		
	}
	
	public static Movie randomMovie() {
		int randomNumber =(int) (Math.random() * 5) + 1;
		
		switch (randomNumber){
			case 1: {return new Jaws();}
			case 2: {return new IndependenceDay();}
			case 3: {return new MazeRunner();}
			case 4: {return new StarWars();}
			case 5: {return new Forgetable();}
		}
		return null;
	}
}
