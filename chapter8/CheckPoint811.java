package chapter8;

import java.util.Scanner;

/**
 * This program asks the user for the size of the array 
 * and then creates an array of the specified size, 
 * referencing the values variable.
 */

public class CheckPoint811 {
	
	public static void main(String[] args) {

	double[] values;	// Variable to store the elements of the specified array.
	int numbersEntries;
	
	// Create scanner object for keyboard input.
	Scanner keyboard = new Scanner(System.in);
	
	// Get number of elements from user. 
	System.out.print("How many items are in the array?");
	numbersEntries = keyboard.nextInt();
	
	// Create an array to hold the specified number of elements.
	values = new double[numbersEntries];
	
	// Display the values in each element of the array.
	System.out.println("Here are the default values" +
					 	" for all elements in the array.");
	for(double elementValue: values)
		System.out.println(elementValue);
	
	}	
}
