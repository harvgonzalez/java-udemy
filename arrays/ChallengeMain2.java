package arrays;
import java.util.*;

public class ChallengeMain2 {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How many elements in your array?: ");
		int elem = scanner.nextInt();
		
		int[] returnedArray = readIntegers(elem);
		
		System.out.println("The smallest value of you array is " + findMin(returnedArray));

	}
	
	private static int[] readIntegers(int count) {
		
		int[] myArray = new int[count];
		
		System.out.println("Write the values of your integers array \r");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scanner.nextInt();		
		}
		System.out.println("The array you wrote is: " + Arrays.toString(myArray));
		return myArray;
	}
	
	private static int findMin(int[] array) {
		
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int aux = 0;
		
		while(flag) {
			flag = false;
			
			for(int i=0; i < sortedArray.length -1; i++) {
				if(sortedArray[i] > sortedArray[i+1]) {
					aux = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = aux;
					flag = true;
				}
			}
			
		}
		System.out.println("The sorted array is " + Arrays.toString(sortedArray));
		 return sortedArray[0];
	}
}
