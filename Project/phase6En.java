package Project;

import java.util.Scanner;
import java.io.*;

/**
 * Enhance Phase 6
 * 11)-Add Menu following Menu option:
 * оооSelect Menu Option
 * ооо [Y | y] Start Program to Compute Grade
 * оо [Q | q] Stop Program
 * ооо [P | p] Print Report
 * [W | w] Write the list to Report.txt
 * ооо [S | s] Search Student
 * оо [H | h] Highest, Lowest, and average of Grades
 */

public class phase6En {
	
	public static void main(String[] args) throws IOException{

		String input = "", Name = "",
		Menu = " Select Menu Option\n \t"+
				" [Y | y] Start Program to Compute Grade\n \t" +
				" [Q | q] Stop Program\n \t" +
				" [P | p] Print Report\n \t" +
				" [W | w] Write the list to Report.txt\n \t" +
				" [S | s] Search Student\n \t" +
				" [H | h] Highest, Lowest, and average of Grades";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Number of test:");
		int NoTest = keyboard.nextInt();
		System.out.print("Enter Student Name:");
		Name = keyboard.nextLine();
		System.out.println(Menu);
		input = keyboard.nextLine();	input = input.toUpperCase();
		char option = input.charAt(0);
		double avg = 0;
		StudentGrade Student = new StudentGrade("You did not Enter", "F", 0.0);
		do {
			switch (option) 
			{ case 'Y':
				{
					System.out.print("Enter student Name:"); Name = keyboard.nextLine();
					avg = getAverage(4);
					String Grade = getLetterGrade(avg);
					Student = new StudentGrade(Name,Grade,avg);
					System.out.println(Menu);
					break;
				}
			case 'P':
				System.out.println(Student.getName() + " average is " +
										Student.getAvg() + " with grade= " + Student.getGrade());
				break;
			case 'W':
				WritToFile(Student, NoTest);
				System.out.println(Menu);
				break;
			case 'S':
				System.out.println(Menu);
				break;
			case 'H':
				System.out.println(Menu);
				break;
			default:
				{
					if(option == 'Q') {
						System.exit(0);
						break; 
				} 
				else 
						System.out.println(Menu);
				}
			}
			input = keyboard.nextLine(); input = input.toUpperCase();
			option = input.charAt(0);
		} while(option!='Q'); System.out.println("Goodbye guys");
	}
	
public static double getAverage(int NTest) {
		double avg = 0;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 1; i <= NTest; i++)
		{
			System.out.println("Enter test" + i +":");
			avg += keyboard.nextInt();
		}
		return (avg/NTest);
}	

public static String getLetterGrade(double avg) {
		String Grade = "Can't compute \nThe average is over 100";
		if (avg >= 0 && avg <= 100) {
			if (avg > 89)
				Grade = "A";
			else if (avg > 79)
				Grade = "B";
			else if (avg > 69)
				Grade = "C";
			else if (avg > 59)
				Grade = "D";
			else
				Grade = "F";
		} else {
			System.out.println("The average is over 100 and cannot "
					+ " convert it to letter grade.");
			System.exit(0);
		}
	return(Grade);
}

public static void WritToFile(StudentGrade ClassAdd, int NoStudent) throws IOException {
	
	String StudentINFO= "";
	StudentGrade Student = new StudentGrade("You did not Enter","F", 0.0);
	Student = ClassAdd;
	FileWriter FWriter = new FileWriter("Report.txt");
	PrintWriter outputFile = new PrintWriter(FWriter);
	StudentINFO = Student.getName() + " average is " + Student.getAvg() + " with grade= " + Student.getGrade();
	outputFile.println(StudentINFO);
	outputFile.close();
}
}

