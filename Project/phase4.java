package Project;

/**
 * Phase 4: 7)-Enhance your project pahase3 by using 
 * case statement  for the following feature:
 * option:1 push the [Y, y] and try it again
 * option:2 push [N, n] to exit
 */

import java.util.Scanner;

public class phase4 {
	
	public static void main(String[] args) {
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Select [Y or y] to continue or [N or n] to stop");
		input = keyboard.nextLine(); input = input.toUpperCase();
		char option = input.charAt(0);
		do {
			switch(option)
			{ case 'Y':
			    { 
			    	System.out.println("Compute the average of three test codes here");
			    }
			    default:
			    {
			    	System.out.println("You did not select the right menu option");
			    	System.out.println("Select [Y or y] to continue or [N or n] to stop");
			    }
			}
			input = keyboard.nextLine(); input = input.toUpperCase();
			option = input.charAt(0);
		} while(option!='N'); System.out.println("Goodbye guys");	
	}
}
