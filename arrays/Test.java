/*package arrays;
import java.util.*;
public class Test {
	static String encode(String word){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		char character;
		
		
	    for(int i=0; i < word.length(); i++){
			character =  String.valueOf(word.charAt(i)) ;
			
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == character){
				       list.add(i);
				    } else {
				    	listB.add(i);
				    }
			}
	    }
	    return boolArr.toString();
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "bannanas";
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		char character = 'n';
		for(int i = 0; i < string.length(); i++){
		    if(string.charAt(i) == character){
		       list.add(i);
		    } else {
		    	listB.add(i);
		    }
		}
	  System.out.println(list.toString());
	  System.out.println(listB.toString());
	}

}
/*
 * [2, 3, 5]

 */
/*
 * String string = "bannanas";
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		char character = 'n';
		for(int i = 0; i < string.length(); i++){
		    if(string.charAt(i) == character){
		       list.add(i);
		    } else {
		    	listB.add(i);
		    }
		}
	  System.out.println(list.toString());
	  System.out.println(listB.toString());
 */
