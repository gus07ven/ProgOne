package Project;

import java.io.*;
import java.util.Scanner;

public class File_Reader2 {
	
	public static void main(String[] args) throws IOException {
		
		int counter = 0;
		String str;
		
		// Open the file.
		File file = new File("C:/Users/Gustavo/Documents/workspace/COSC 1436 - Programming I/src/Project/MyFile0.txt");
		Scanner inputFile = new Scanner(file);
				
		// Read the first five lines of the file only.
		while (inputFile.hasNext() && counter < 5) {
			str = inputFile.nextLine();
			System.out.println(str);
			counter++;
		}
	}
}
