package LinkedLists_challenge1;

public class Song {
	private String title;
	private double duration;
	
	// CONSTRUCTOR
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}
	// GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
	
	
	
}
