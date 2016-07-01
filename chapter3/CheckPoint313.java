package chapter3;

import javax.swing.JOptionPane;

public class CheckPoint313 {
	
	public static void main(String[] args) 
	{
		int books, coupons;
		String input;
		input = JOptionPane.showInputDialog("How many books " +
										"are being purchased? ");
		books = Integer.parseInt(input);
		if (books < 1)
			coupons = 0;
		else if (books < 3)
			coupons = 1;
		else if (books < 5)
			coupons = 2;
		else 
			coupons = 3;
		JOptionPane.showMessageDialog(null, 
				"The number of coupons to give is " + 
				coupons);
		System.exit(0);
	}
}
