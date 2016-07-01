package finalReview;

public class PracticeClass {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 10, 8, 12, 15 };

		System.out.print("Before: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
		}
		System.out.println();

		for (int i = 1; i < numbers.length; i++) 
		{
			if(numbers[i - 1] > numbers[i])
				numbers = swap(numbers);
		}

		System.out.print("After: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
		}
	}

	public static int[] swap(int Array[]) {

		int temp = 0;
		
		for (int index = 0; index < Array.length - 1; index++)
		{
			if (Array[index] > Array[index + 1])
				{
				temp = Array[index];
				Array[index] = Array[index + 1];
				Array[index + 1] = temp;
				}
		}
		return Array;
	}
}