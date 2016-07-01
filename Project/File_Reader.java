package Project;

import java.io.*;

public class File_Reader {
	
	public static void main(String [] args) throws IOException {

		String line = null;
		FileReader reader = new FileReader("C:/Users/Gustavo/Documents/workspace/COSC 1436 - Programming I/src/Project/MyFile0.txt");
		BufferedReader inputFile = new BufferedReader(reader);
		        int lineCounter = 0;
		        while(((line = inputFile.readLine()) != null) && lineCounter < 5) {
		            System.out.println(line);
		            lineCounter++;
		        }        
		}
}
