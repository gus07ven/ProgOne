package chapter3;

import javax.swing.JOptionPane;

public class QuizPracticeCh3 
		{
			public static void main(String[] args)
			{
			double score1,score2,score3,Average;
			String input, LetterGrd;
			input = JOptionPane.showInputDialog("Enter FirstScore1");
			score1= Double.parseDouble(input);
			input = JOptionPane.showInputDialog("Enter FirstScore2");
			score2= Double.parseDouble(input);
			input = JOptionPane.showInputDialog("Enter FirstScore3");
			score3= Double.parseDouble(input);
			Average =(score1+score2+score3)/3;
			if(Average>89)LetterGrd="A";
				else if(Average>79)LetterGrd="B";
				else if(Average>69)LetterGrd="C";
				else if(Average>59)LetterGrd="D";
			else LetterGrd="F";
			JOptionPane.showMessageDialog(null,"The score is " + LetterGrd);
			}
		}
	

