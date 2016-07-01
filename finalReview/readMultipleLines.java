package finalReview;

import java.io.*;
import java.util.Scanner;

/**
 * Write a program to read multiple lines from a file using loop, for loop, or
 * while loop.
 */

public class readMultipleLines {

	public static void main(String[] args) throws IOException {

		String line = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the file name:");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext()) {
			line = inputFile.nextLine();
			System.out.println(line);
		}
		inputFile.close();
	}
}
