package finalReview;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] values = { 2, 4, 10, 8, 12, 15 };
			System.out.print("Before: ");
		for(int i =0; i < values.length; i++)
			System.out.print(values[i] + "\t");
			System.out.println();
			
		for(int i = 1; i < values.length; i++)
		{
			if(values[i-1] > values[i])
				values = swap(values);
		}
		System.out.print("After:  ");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + "\t");
}
	public static int[] swap (int Array[]) {
		
		int temp = 0;
		
		for(int index = 0; index < Array.length - 1; index++)
		{
			// Compare an element with its neighbor.
			if (Array[index] > Array[index + 1])
			{  // Swap the two elements.
				temp = Array[index];
				Array[index] = Array[index + 1];
				Array[index + 1] = temp;
			}
		}	return Array;
	}
}
