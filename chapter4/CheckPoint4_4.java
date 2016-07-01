package chapter4;

import java.util.Scanner;

public class CheckPoint4_4 {

	public static void main(String[] args) {
		
		System.out.print("Enter a number between 10 and 24 ");
		
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		while (number > 9 && number < 25){
			System.out.println("The number " + number +
							" is in the range of 10 to 24");
			break;
		}
	}
}
		