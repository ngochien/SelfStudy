package generics;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13);
		int countOdd = Algorithm.<Integer> countIf(li, new OddPredicate());
		System.out.println(countOdd);
		int max = Algorithm.getMax(li, 3, 10);
		System.out.println(max);

	}
}
