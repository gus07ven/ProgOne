package Project;

import java.util.Scanner;

/*
 * 
 */

public class phase5_1 {

		public static void main(String[] args) {

			String input = "", Name = "";
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Select [Y or y] to continue or [N or n] to stop");
			input = keyboard.nextLine();	input = input.toUpperCase();
			char option = input.charAt(0);
			do {
				switch (option) 
				{ case 'Y':
					{
						System.out.print("Enter student Name:"); Name = keyboard.nextLine();
						double avg = getAverage(4);
						String Grade = getLetterGrade(avg);
						System.out.println(Name+ " average is " +
											avg+ " with grade " + Grade);
					}
				default:
					{
						System.out.println("Select [Y or y] to continue or [N or n] to stop");
					}
				}
				input = keyboard.nextLine(); input = input.toUpperCase();
				option = input.charAt(0);
			} while(option!='N'); System.out.println("Goodbye guys");
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
	}

