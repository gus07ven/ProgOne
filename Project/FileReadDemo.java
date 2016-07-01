package Project;

import java.util.Scanner;
import java.io.*;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		
		String filename; 
		String friendName;
		
		Scanner keyboard = new Scanner(System.in);
		
		FileReader freader = new FileReader("C:/Users/Gustavo/Documents/workspace/COSC 1436 - Programming I/src/Project/MyFile0.txt");
		BufferedReader inputFile = new BufferedReader(freader);
		
		friendName = inputFile.readLine();
		
		while (friendName != null) {
			
			System.out.println(friendName);
			
			friendName = inputFile.readLine();
		}
		
		inputFile.close();
	}
}
