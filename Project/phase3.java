package Project;

/**
 * Phase 3:(optional: Extra credit on test1 if submitted before the first test*)
 * 4)-Enhance your project pahase2 with the following feature:
 * If the average of three numbers are between 0 to 100 then computer the following
 * A- if avarge >89 return the letter Grade "A".
 * else avarge >79 return the letter Grade "B".
 * else avarge >69 return the letter grade "C".
 * else avarge >59 return the letter Grade "D".
 * else return the letter Grade "F".
 * 5) display the message ?The average is over 100 and cannot 
 * convert it to letter grade and exit.
 */

import java.util.Scanner;

public class phase3 {

	public static void main(String[] args) {

		int test1 = 0, test2 = 0, test3 = 0;
		String Name = "", Grade = "";
		Scanner keyboard = new Scanner(System.in);
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
			if (avg > 89)      Grade = "A";
			else if (avg > 79) Grade = "B";
			else if (avg > 69) Grade = "C";
			else if (avg > 59) Grade = "D";
			else               Grade = "F";
			System.out.print(avg);
			System.out.println(" and his/her grade is " + Grade);
		} else {
			System.out.println("The average is over 100 and cannot convert it to letter grade");
			System.exit(0);
		}
	} 
}
