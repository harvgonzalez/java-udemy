package arrays;
import java.util.*;

public class Kata {

  public static int maxDiff(int[] lst) {
  
    if(lst.length == 1) {
    	
      return 0;
    }
    int[] sortedArray = Arrays.copyOf(lst, lst.length);
    
    boolean flag = true;
    int aux= 0;
    
    while(flag) {
      flag = false;
      
      for(int i=0; i < lst.length-1; i++){
        if(sortedArray[i] < sortedArray[i+1]){
          aux = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = aux;
          flag = true;
        }
      }
    }
    //System.out.println(sortedArray.toString());
    int result = sortedArray[lst.length-1] - sortedArray[0];
    return result;
    
  }
  
  public static void main(String args[]) {
	 int[] test1 = new int[]{ 1, 2, 3, 4, 5, 5, 4 };
	  //System.out.println(maxDiff(test1).toString());
	 	System.out.println(Arrays.toString(test1));
	   System.out.println(maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
	   System.out.println(maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
	   System.out.println(maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
	;
	  
  }
}