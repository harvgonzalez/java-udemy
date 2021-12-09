package arrays;
import java.util.Scanner;
import java.util.Arrays;  

public class ChallengeMain {
	private static Scanner scanner = new Scanner(System.in);
	private static int number;
	
	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want in you array: \r");
		number = scanner.nextInt();
		int[] myArray = getIntegers(number);
		
		System.out.println("Your array is: " + printArray(myArray));
		System.out.println("Your sorted array is: " + Arrays.toString(sortIntegers(myArray)));
	}
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		for(int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	public static String printArray(int[] array) {
		return Arrays.toString(array);
		
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp = 0;
		while(flag) {
			flag = false;
			
			for(int i=0; i< sortedArray.length-1; i++) {
				if( sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag=true;
				}
			}
				
		}
		return sortedArray;
	}
}
