package Project;

/**
 * Phase 2_1:(optional: Extra credit on test1 if submitted before the first test*)
 * 3)-Modify your program to accept a String variable "Name" and three integers by using 
 * the import statement which is the library utility “java.util.Scanner” and return 
 * the double average and the name
 */

import java.util.Scanner;

public class phase2_1 {
		
		public static void main(String[] args) {
			
		int test1 = 0, test2 = 0, test3 = 0;
		String Name = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter student Name:");
		Name = keyboard.nextLine();
		test1 = keyboard.nextInt();
		test2 = keyboard.nextInt();
		test3 = keyboard.nextInt();
		
		double avg = (test1 + test2 + test3)/3;
		System.out.print("The average of "
				+ test1 + ", " + test2 + ", " + test3 + " for "
				+ Name + " is ");
		System.out.println(avg);
		}
	}

