package chapter2;

public class CheckPoint225 {

	public static void main(String[] args) {
		
		short totalPay, basePay = 500, bonus = 1000;
		totalPay = basePay + bonus;
		
		/* a) Will the statement compile properly
		 * or cause an error? 
		 * Answer: It will cause an error.
		 * 
		 * b) If the statement causes an error, why?
		 * How can you fix it?
		 * Answer: It can be fixed by declaring totalPay
		 * as a int or using a cast operator like this:
		 * totalPay = (short)(basePay + bonus)
		 */
	}
}
