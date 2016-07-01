package chapter3;

public class AWCh3N5 {

	public static void main(String[] args) {
		
		int amount1 = 27;
		int amount2 = 45;
		
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
