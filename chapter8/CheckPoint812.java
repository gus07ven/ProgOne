package chapter8;

/**
 * This program copies the a array
 * to the b array.
 */

public class CheckPoint812 {
	
	public static void main(String[] args) {
	
		// Create the arrays.
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int[7];
		
		// Copy elements from array a to array b
		for (int i = 0 ; i < a.length; i++)
		{
			b[i] = a[i];
		}
		
		// Display the elements of array b
		for (int value : b)
		{
			System.out.println("The default values of"
					+ " array b are: " + value);	
		}
	}
}
