/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package ad;

/**
 * @author Le
 */
public class Algorithm {

	public static void simpleTrialDivision(int n) {
		boolean isPrime[] = new boolean[n];
		int i, j;
		int counter = 0;
		for (i = 0; i < n; i++) {
			isPrime[i] = true;
		}
		for (i = 2; i < n; i++) {
			for (j = 2; j < n; j++) {
				counter++;
				if (i % j == 0 && j != i) {
					isPrime[i] = false;
				}
			}
		}
		System.out.println(counter);
	}

	public static void improvedTrialDivision(int n) {
		boolean isPrime[] = new boolean[n];
		int i, j;
		int counter = 0;
		for (i = 0; i < n; i++) {
			isPrime[i] = true;
		}
		for (i = 2; i < n; i++) {
			for (j = 2; j < i; j++) {
				counter++;
				if (i % j == 0 && j != i) {
					isPrime[i] = false;
				}
			}
		}
		System.out.println(counter);
	}

	public static void sieb(int n) {
		boolean isPrime[] = new boolean[n];
		int i, j;
		int counter = 0;
		for (i = 0; i < n; i++) {
			isPrime[i] = true;
		}
		for (i = 2; i < Math.sqrt(n); i++) {
//			if (isPrime[i] == true) {
				for (j = 2; i * j < n; j++) {
					counter++;
					isPrime[i * j] = false;
				}
//			}
		}
		System.out.println(counter);
	}
	
	public static boolean isPrime(int n) {
		int counter = 0;
		boolean result = true;
		if (n > 2 && n % 2 == 0) {
			result = false;
		}
		for (int i = 3; i < n; i+=2) {
			counter++;
			if (n % i == 0) {
				result = false;
			}
		}
		System.out.println(counter);
		return result;
	}
}
