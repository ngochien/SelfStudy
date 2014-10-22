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
public class AlgorithmTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 35000; i*=2) {
//			System.out.print(i + " - ");
//			Algorithm.simpleTrialDivision(i);
//			Algorithm.improvedtrialDivision(i);
//			Algorithm.sieb(i);
			Algorithm.isPrime(i);
		}
		System.out.println(Algorithm.isPrime(9973));
	}

}
