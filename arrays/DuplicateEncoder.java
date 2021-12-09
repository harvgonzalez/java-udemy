package arrays;
import java.util.*;

public class DuplicateEncoder {
	
	static String encode(String word){
		ArrayList<Boolean> boolArr = new ArrayList<Boolean>();
	    String newWord = "";
	    String character = "";
	    
	    for(int i=0; i < word.length(); i++){
	    	character = String.valueOf(word.charAt(i)) ;
	    	if(newWord.contains(character)) {
	    		boolArr.add(true);
	    		newWord += word.charAt(i);	
	    	} else {
	    		boolArr.add(false);
	    		newWord += word.charAt(i);
	    	}
	    	System.out.println("value of character " +character);
	    	System.out.println("value of new word " +newWord);
	      //newWord+="(";
	    }
	    return boolArr.toString();
	  }
	public static void main(String[] args) {
		//System.out.println(encode("Hello"));
		System.out.println(encode("success"));

	}

}
