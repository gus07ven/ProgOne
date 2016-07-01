package chapter8;

import java.util.Scanner;

/**
	Program that use a for loop to store -1 in 
	each element of the array.
*/

public class CheckPoint810 {

	public static void main(String[] args) {
		
		int[] array;				// Established an array named "array"	
		int numberArrayElements;	// Holds the number of elements in the "array" array
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the number of array elements
		System.out.print("How many elements are there in the array?");
		numberArrayElements = keyboard.nextInt();
		
		// Create an array to hold the specified number of elements
		array = new int[numberArrayElements];
		
		// Load -1 in each element of the array
		for( int i = 0; i < numberArrayElements; i++)
		{
			array[i] = -1;
		}

		// Display the values in each element of the array
		for(int arrayValue : array)
			System.out.println(arrayValue);
	}
}