package generics;

public class OddPredicate implements Predicate<Integer> {

	@Override
	public boolean check(Integer i) {
		return i % 2 != 0;
	}
}
