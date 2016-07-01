package finalReview;

import java.io.*;

/** Write a program to write multiple lines 
 * to a file using loop, for loop, or while loop.
 */

public class writeMultipleLines {
	
	public static void main(String[] args) throws IOException {
	
	// String array variable
	String[] myArray = {"Gustavo", "Adolfo", "Arismendi", "Camero"};
	
	// PrintWriter outputFile
	FileWriter fwriter = new FileWriter("MyText.txt");
	PrintWriter outputFile = new PrintWriter(fwriter);
	
	// Loop to write lines to file
	for(int index = 0; index < myArray.length; index++)
		outputFile.println(myArray[index]);
	
	// Close the file
	outputFile.close();	
	
	}
}
