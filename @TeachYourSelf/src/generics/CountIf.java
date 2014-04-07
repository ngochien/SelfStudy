package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CountIf {
	
	public static <T> int countIf(Collection<T> c, Predicate<T> p) {
		int count = 0;
		for (T element : c) {
			if (p.check(element)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,11,13);
		int countOdd = countIf(li, new OddPredicate());
		System.out.println(countOdd);
	}
}
