package chapter3;

public class AWCh3N9 {
	
	public static void main(String[] args) {
		
		String title1 = "Hello";
		String title2 = "Goodbye";
		
		if (title1.compareTo(title2) < 0) {
			System.out.println(title1);
			System.out.println(title2);
		} else {
			System.out.println(title2);
			System.out.println(title1);
		}
	}
}
