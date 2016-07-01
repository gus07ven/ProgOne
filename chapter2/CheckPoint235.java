package chapter2;

import javax.swing.JOptionPane;

public class CheckPoint235 {

	public static void main(String[] args)
		{
			//Create String object variable
			String greeting;
			
			// Display message
			JOptionPane.showMessageDialog(null,"Greetings Earthling.");
			
			// Create number variable
			int number;
			String str;
			
			// User enters number
			str = JOptionPane.showInputDialog("Enter a number.");
			number = Integer.parseInt(str);
			
			//End the program
			System.exit(0);
			
	}
}
