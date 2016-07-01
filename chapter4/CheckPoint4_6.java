package chapter4;

import java.util.Scanner;

public class CheckPoint4_6 {

	public static void main(String[] args) {
		
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter Yes or No:");
		input = keyboard.nextLine();
		
		while(input.equals("Yes") || input.equals("No")){
			System.out.println("You entered " + input);
			break;
		}
	}
}
