/*package abstract_challenge;

public class MyLinkedList implements NodeList {
	private ListItem root = null;
	
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}


	public ListItem getRoot() {
		
		return this.root;
	}

	public boolean addItem(ListItem newItem) {
		
		if(this.root == null) {
			// the list was empty, this item becomes the  head of list
			this.root = newItem;
			return true;
		}
		ListItem currentItem =  this.root;
		
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {
				// newItem is greater, move right if possible
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					// there is no next, insert  at the  end of list
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem); 
					return true;
				}
			}
			else if( comparison > 0) {
				// newItem is less, insert before
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {
					// The node with a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}
			}
		}
	}

	public boolean removeItem(ListItem item) {
		
		return false;
	}

	public void traverse(ListItem root) {
		
		
	}

	
}
*/
