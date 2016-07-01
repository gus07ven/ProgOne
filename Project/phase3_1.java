package Project;

/**
 * Phase 3_1:
 * 6)-Enhance your project pahase3 by using the switch statement  as follow:
 * Display System.out.println (?Select [Y or y] 
 * to continue or [N or n] to stop?);
 */

import java.util.Scanner;

public class phase3_1{

	public static void main(String[] args) {

		int test1 = 0, test2 = 0, test3 = 0;
		String Name = "", Grade = "";
		Scanner keyboard = new Scanner(System.in);
		Scanner key = new Scanner(System.in);
		System.out.println("Select [Y or y] to continue or [N or n] to stop");
		String input = key.nextLine(); input = input.toUpperCase();
		char option = input.charAt(0);
		switch(option)
		{ case 'Y': case 'y':
			{
				System.out.print("Enter student Name:");
				Name = keyboard.nextLine();
				test1 = keyboard.nextInt();
				test2 = keyboard.nextInt();
				test3 = keyboard.nextInt();
				double avg = (test1 + test2 + test3) / 3;
				if (avg >= 0 && avg <= 100) 
				{
					System.out.print("The average of " + test1 + ", " + test2 + ", "
					+ test3 + " for " + Name + " is ");
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
			System.out.println(avg + " and his/her grade is " + Grade);
		} else {
			System.out.println("The average is over 100 and cannot "
					+ " convert it to letter grade.");
			System.exit(0);
		}
	}
		case 'N': case 'n':
		  {
			System.out.println("Thanks for selecting my grade program.");
			System.exit(0);
			break;
		}
		default: System.out.println("You did not select the right menu option.");
		}
	}
}


