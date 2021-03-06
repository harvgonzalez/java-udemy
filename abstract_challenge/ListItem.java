package abstract_challenge;

public abstract class ListItem {
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	protected Object value;
	
	public ListItem(Object value) {
		this.value = value;
	}
	
	// Getters and setters
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	// methods
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	abstract int compareTo(ListItem item);
	
}
