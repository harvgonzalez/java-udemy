
public class ASum {
	
	public static long findNb(long m) {
		// your code
	
    long currentInt = 1;
    long total=0;
    boolean flag = true;
    
    while(flag){
    	flag = false;
    	total += (long) Math.pow(currentInt, 3);
    	currentInt++;
    
    	if( total < m){
    		flag = true;
    		//System.out.println("Value of current integer = " + currentInt);
    	} else if (total > m) {
    		currentInt = -1;
    		flag = false;
    	}
    }
    return currentInt;
    
	}
	
	public static void main(String args[]) {
		System.out.println(findNb(91716553919377L));
		System.out.println(findNb(1071225));
	}
}
