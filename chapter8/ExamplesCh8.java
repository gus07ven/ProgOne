package chapter8;

public class ExamplesCh8 {

	public static void main(String[] args) {
		
		int[] values = {3,4,5,6,7};
		int work = 0;
		
		for(int count = 0; count < values.length ; count++)
		{
			work = values[0]++ + 1;
			System.out.println(work);
	}
}
}