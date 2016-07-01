package chapter3;

public class CheckPoint32 {
	
	public static void main(String[] args) {
		
		int payRate = 100;
		int hours = 45;
		
		if (hours > 40) {
			payRate *= 1.5;
			System.out.print("The payrate is " + payRate);
		}
		
	}

}
