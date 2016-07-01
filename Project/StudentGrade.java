package Project;

public class StudentGrade {
	
	private String Student_name;
	private String Grade;
	private double avg;
	public StudentGrade(String Name, String LGrade, double av)
		{
			Student_name = Name;
			Grade = LGrade;
			avg = av;
		}
	
	public String getGrade() {
		
		return Grade;
	}
	
	public String getName() {
		
		return Student_name;
	}

	public double getAvg() {
		
		return avg;
	}
}

	
