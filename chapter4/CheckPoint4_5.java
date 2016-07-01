package chapter4;

import java.util.Scanner;

public class CheckPoint4_5 {

	public static void main(String[] args) {

		String str = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter Y or y | N or n");
		str = keyboard.nextLine();
		str = str.toUpperCase();

		while (str.charAt(0) == 'Y' || str.charAt(0) == 'N') {
			System.out.println("You entered Y or N");
			break;
		}
	}
}
