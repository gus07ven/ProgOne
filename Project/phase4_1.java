package Project;

/** 
 * 8)-Create a report file by Writing the average of the grade and student name to file, name it "Repot.txt"
 */

import java.util.Scanner;
import java.io.*;

public class phase4_1 {

	public static void main(String[] args) throws IOException {

		String input = "", Name = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Select [Y or y] to continue or [N or n] to stop");
		input = keyboard.nextLine();
		input = input.toUpperCase();
		char option = input.charAt(0);
		String Grade = "";
		double avg = 0;
		do {
			switch (option) {
			case 'Y': {
				System.out.println("Enter student Name:");
				Name = keyboard.nextLine();
				avg = getAverage(3);
				Grade = getLetterGrade(avg);
				System.out.println(Name + " average is " + avg
						+ " with grade= " + Grade);
				break;
			}
			case 'F':
				try {
					WritToFile(Name, avg, Grade);
				} catch (Exception el) {;}
				break;
			default: {
				System.out
						.println("Select [Y or y] to continue or [N or n] to stop");
			}
		}
		input = keyboard.nextLine();
		input = input.toUpperCase();
		option = input.charAt(0);
		} while (option != 'N');
		System.out.println("Goodbye guys");
	}

	public static void WritToFile(String Name, double avg, String Grade)
			throws IOException {

		FileWriter FWriter = new FileWriter("Report.txt"); // FileWriter("C\\Report.txt")
		PrintWriter outputFile = new PrintWriter(FWriter);
		WritToFile(Name, avg, Grade);
		outputFile.println(Name + " average is " + avg + " with grade= "
				+ Grade);
		outputFile.close();
	}

}
