package chapter3;

public class CheckPoint314 {
	
	// Write nested if statements that perform the following test: 
	// If amounts is greater than 10 and amount2 
	// is less than 100, display the greater of the two.
	
	public static void main(String[] args) 
	{
		int amount1 = 87;
		int amount2 = 25;
		
		if (amount1 > 10 && amount2 < 100) 
		{
			if (amount1 > amount2) {
				System.out.print("The greater of the two " +
							"variables is amount1 with a " +
							"value of " + amount1);
			} else {
				System.out.print("The greater of the two " +
						"variables is amount2 with a " +
						"value of " + amount2);
			}
		} else {
			System.out.print("Amount1 has to be more than 10, " +
					" and amount2 has to be less than 100.");
		}		
	}
}

