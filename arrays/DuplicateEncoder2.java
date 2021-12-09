package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateEncoder2 {
	
	static String encode(String word){
		boolean[] myArr = new boolean[word.length()];
		ArrayList<Integer> trueArray = new ArrayList<Integer>();
		char character = 0;
		String newWord="";
		
		for (int i = 0; i < word.length(); i++) {
			character = word.charAt(i);
			if(word.charAt(i) == character){
				trueArray.add(i);
			    }
		}
		for (int i = 0; i < trueArray.size(); i++) {
			int index = trueArray.get(i);
			System.out.println("value of index = " + index);
			myArr[index] = true;	
			System.out.println("value of array = " + myArr[index]);
		}
		
		for (boolean elem : myArr) {
			if(elem) {
				newWord+=")";
			} else {
				newWord+="(";
			}
		}
	    return trueArray.toString();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encode("success"));
	}

}
