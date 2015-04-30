/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package basis;

/**
 * @author Le
 */
public class Lotto {

	static final int MOEGLICHKEITEN = 13983816;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] versuch = new int[50];
		int[] x;
		for (int i = 0; i < MOEGLICHKEITEN; i++) {
			x = ziehen();
			for (int zahl : x) {
				versuch[zahl]++;
			}
		}

		System.out.println("Superzahl " + versuch[0]);
		for (int k = 1; k < 7; k++) {
			int maxIndex = 1;
			int max = versuch[maxIndex];
			for (int i = 1; i < 50; i++) {
				if (versuch[i] > max) {
					maxIndex = i;
					max = versuch[maxIndex];
				}
			}
			System.out.println(maxIndex + " - " + max);
			versuch[maxIndex] = -1;
		}
	}

	private static int[] ziehen() {
		int[] ergebnisse = new int[7];
		int zahl;
		for (int i = 0; i < 7; i++) {
			zahl = (int) (Math.random() * 50);
			for (int j = 0; j < i; j++) {
				while (zahl == ergebnisse[j]) {
					zahl = (int) (Math.random() * 49) + 1;
				}
			}
			ergebnisse[i] = zahl;
		}
		return ergebnisse;
	}
}
