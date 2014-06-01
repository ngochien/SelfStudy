package review;

import java.util.Arrays;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {

		List<Integer> c = Arrays.asList(1,2,3,5,7);
		int countOdd = Algorithm.checkProperty(c, new ParitaetCheck());
		System.out.printf("There are %d odd numbers in the list", countOdd);
	}

}
