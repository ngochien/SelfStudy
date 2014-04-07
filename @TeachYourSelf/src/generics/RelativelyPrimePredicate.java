package generics;

import java.util.List;

public class RelativelyPrimePredicate implements Predicate<Integer> {

	private List<Integer> list;
	
	public RelativelyPrimePredicate(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public boolean check(Integer obj) {
		for (Integer i : list) {
			if (Algorithm.gcd(obj, i) != 1) {
				return false;
			}
		}
		return list.size() > 0;
	}

}
