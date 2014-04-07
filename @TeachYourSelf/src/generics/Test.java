package generics;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);

		int countOdd = Algorithm.<Integer> countIf(li, new OddPredicate());
		System.out.println(countOdd);

		int max = Algorithm.getMax(li, 3, 7);
		System.out.println(max);

		List<Integer> l = Arrays.asList(7, 18, 19, 25);
		Predicate<Integer> p = new RelativelyPrimePredicate(l);
		int i = Algorithm.findFirst(li, 0, li.size(), p);

		if (i != -1) {
			System.out.print(li.get(i) + " is relatively prime to ");
			for (Integer k : l)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}
