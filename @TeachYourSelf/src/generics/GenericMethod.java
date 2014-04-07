/**
 * Prof. Philipp Jenke
 * Hochschule für Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */
package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Class to test a generic method.
 * @param <T>
 * 
 */
public class GenericMethod {

	/**
	 * Print the content of the ArrayList to the console.
	 * 
	 * @param <T>
	 * @param <T>
	 */
	private <T> void printHelper(ArrayList<T> list) {
		for (T element : list) {
			System.out.println(element);
		}
	}

	public void print(ArrayList<?> list) {
		printHelper(list);
	}

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Jan");
		list.add("Hein");
		list.add("Klaas");
		list.add("Pit");
		GenericMethod gm = new GenericMethod();
		gm.print(list);

		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));

		List<Double> ld = Arrays.asList(1.0, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
	}

}
