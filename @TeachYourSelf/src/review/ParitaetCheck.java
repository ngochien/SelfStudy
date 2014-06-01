package review;

public class ParitaetCheck implements PropertyCheck<Integer> {

	/**
	 * Check odd-parity
	 */
	@Override
	public boolean check(Integer i) {
		return i % 2 != 0;
	}
}
