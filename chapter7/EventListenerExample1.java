package chapter7;

import javax.swing.*;
import java.awt.event.*;

public class EventListenerExample1 extends JFrame {

	private JPanel panel; // To reference a panel
	private JLabel messgLabel; // To reference a label
	private JTextField base; // To reference x value
	private JTextField exp; // To reference y value
	private JButton Button1; // To reference a button
	private JButton Button2; // To reference b button

	// Constructor

	public EventListenerExample1() {

		setTitle("Rise x to the power of y");
		setSize(310, 100);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel and add it to frame.
		messgLabel = new JLabel("Enter a values for x and y\n Power(x,y)");
		base = new JTextField(2);
		exp = new JTextField(2);
		Button1 = new JButton("X^y");
		Button2 = new JButton("+");

		Button1.addActionListener(new Button1Listener());
		Button2.addActionListener(new Button2Listener());
		// Create an instance of JPanel and add the items to panel
		panel = new JPanel();
		panel.add(messgLabel);
		panel.add(base);
		panel.add(exp);
		panel.add(Button1);
		panel.add(Button2);
		// Add the panel to the frame's content pane
		add(panel);

		// Display the window.
		setVisible(true);
	}

	private class Button1Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String input;
			int x, y;
			input = base.getText();
			x = Integer.parseInt(input);
			input = exp.getText();
			y = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, power(x, y));

		}
	}

	private class Button2Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String input;
			int x, y;
			input = base.getText();
			x = Integer.parseInt(input);
			input = exp.getText();
			y = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, (x + y));

		}
	}

	private static int power(int x, int y) {

		int Tmp, Base;
		Base = Tmp = x;
		for (int i = 1; i < y; i++)
			Base = Base * x;
		if (y == 0)
			Base = 0;
		return (Base);
	}

//	public static void main(String[] args) {

//		EventListenerExample1 Obj = new EventListenerExample1();
//	}
}
