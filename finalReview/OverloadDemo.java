package finalReview;

public class OverloadDemo {
	
	void test() {
		
		System.out.println("No methods are overloaded");
	}
	
	void test(int num, int num1) {
		
		System.out.println("The values in num and num1 are: " + num + " and " + num1);
	}
	
	void test(double count) {
		
		System.out.println("Inside the test (double) method the count is " + count);
	}
	
	public static void main(String[] args) {
		
		OverloadDemo test1 = new OverloadDemo();
		test1.test();
		test1.test(10,20);
		test1.test(15);
		test1.test(17.5);
	}

}
