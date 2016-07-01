package chapter8;

/**
   Program that multiplies element 0 of numbers1 array 
   by element 3 of the numbers2 array.
 */

public class CheckPoint89 {
	
	public static void main(String[] args) {
	
		int[] numbers1 = {1,3,6,9};		// Initializes the numbers1 array
		int[] numbers2 = {2,4,6,8};		// Initializes the numbers2 array
		int result;
		
		// Multiply element 0 of array numbers1 and element3 of array numbers2
		result = numbers1[0] * numbers2[3]; 
		
		// Display the result
		System.out.print("The result of multiplying " +
					numbers1[0] + " by " + numbers2[3]
					+ " is " + result);
	}
}
