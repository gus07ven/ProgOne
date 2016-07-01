package Project;

/** 
 * Project  Phase 2:(optional: Extra credit on test1)
 * 2)-Modify your program to accept a String variable "Name" and three 
 * integers and return the double average and the name.
 * @author Gustavo
 *
 */

public class phase2 {
		
		public static void main(String[] args) {
			
		int test1 = 70, test2 = 90, test3 = 100;
		double avg = (test1 + test2 + test3)/3;
		String Name = "Gustavo Arismendi";
		
		System.out.print("The average of 70, 90, 100 for " 
				+ Name + " is ");
		System.out.println(avg);
	}
}

