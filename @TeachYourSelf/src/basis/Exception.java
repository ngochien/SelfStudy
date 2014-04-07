package basis;

public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
			System.out.println(num1/num2);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
		}

	}

}
