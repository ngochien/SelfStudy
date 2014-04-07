package generics;

import java.util.Collection;
import java.util.List;

public final class Algorithm {

	/**
	 * A generic method that counts the number of elements in a collection that
	 * have a specific property.
	 * 
	 * @param c
	 * @param p
	 * @return
	 */
	public static <T> int countIf(Collection<T> c, Predicate<T> p) {
		int count = 0;
		for (T element : c) {
			if (p.check(element)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * A generic method that exchanges the positions of two different elements
	 * in an array.
	 * 
	 * @param anArray
	 * @param src
	 * @param dest
	 */
	public static <T> void swap(T[] anArray, int src, int dest) {
		T tmp = anArray[src];
		anArray[src] = anArray[dest];
		anArray[dest] = tmp;
	}

	/**
	 * A generic method that returns the maximal element in the range [begin,
	 * end) of a list.
	 * 
	 * @param list
	 * @param begin
	 * @param end
	 * @return
	 */
	public static <T extends Comparable<? super T>> T getMax(
			List<? extends T> list, int begin, int end) {

		T max = list.get(begin);
		begin++;
		while (begin < end) {
			if (list.get(begin).compareTo(max) > 0) {
				max = list.get(begin);
			}
			begin++;
		}
		return max;
	}

	/**
	 * Find the first integer in a list that is relatively prime to a list of
	 * specified integers
	 * 
	 * @param list
	 * @param begin
	 * @param end
	 * @param p
	 * @return
	 */
	public static <T> int findFirst(List<T> list, int begin, int end,
			Predicate<T> p) {

		while (begin < end) {
			if (p.check(list.get(begin))) {
				return begin;
			}
		}
		return -1;
	}
	
//	public static
}
