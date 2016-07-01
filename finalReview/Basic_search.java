package finalReview;

import javax.swing.JOptionPane;

/**
 * This program will search the array elements.
 */

public class Basic_search {

	public static void main(String[] args) {

		int[] numbers = {2,4,6,8,10,12,14,16};
		
		String show = JOptionPane.showInputDialog("Please enter number to search for: ");
		int findThis = Integer.parseInt(show);
		JOptionPane.showMessageDialog(null, "The " + findThis + " is " + Search(numbers,findThis));
	}
	
	public static boolean Search(int[] numbers, int findThis) {
		
		boolean Yes = true;
		int i =0;
		do {
			if(numbers[i++] == findThis){ Yes = true; break;}
			else Yes = false;
		} while (i < numbers.length);
		return Yes;
		}
	}
