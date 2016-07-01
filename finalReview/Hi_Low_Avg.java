package finalReview;

public class Hi_Low_Avg {
	
	public static void main(String[] args) {
		
		int[] value = {1,2,3,8,30,50};
		System.out.println(Find_Highest(value));
		System.out.println(Find_Lowest(value));
		System.out.println(Find_Avg(value));
	}
	
	public static int Find_Highest(int[] numbers) {
		
		int highest = numbers[0];
		for(int i = 0; i < numbers.length; i++)
			if (numbers[i] > highest)
				highest = numbers[i];
		return highest;
	}
	
	public static int Find_Lowest(int[] numbers) {
		
		int lowest = numbers[0];
		for(int i = 1; i < numbers.length; i++)
			if (numbers[i] < lowest)
				lowest = numbers[i];
		return lowest;
	}
	
	public static double Find_Avg(int[] numbers) {
		
		double total = 0;
		for (int i = 1; i < numbers.length; i++)
			total += numbers[i];
		return (total/numbers.length);
	}
}
