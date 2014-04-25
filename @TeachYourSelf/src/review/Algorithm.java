package review;

import java.util.Collection;

public class Algorithm {

	public static <E> int checkProperty(Collection<E> c, PropertyCheck<E> p) {
		int count = 0;
		for (E e : c) {
			if (p.check(e)) {
				count++;
			}
		}
		return count;
	}
}
