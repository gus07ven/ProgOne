package chapter3;

public class AWCh3N3 {

	public static void main(String[] args) {

		int sales = 13000;
		double commission;

		if (sales <= 10000) {
			commission = .10;
			System.out.print("Your commission rate is " + commission);
		} else if (sales >= 10000 && sales <= 15000) {
			commission = .15;
			System.out.print("Your commission rate is " + commission);
		} else {
			commission = .20;
			System.out.println("Your commission rate is " + commission);
		}
	}
}
