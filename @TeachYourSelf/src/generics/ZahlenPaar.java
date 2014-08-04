/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package generics;


/**
 * @author Le
 */
public class ZahlenPaar<T extends Number> {

	private T z1, z2;

	public ZahlenPaar(T z1, T z2) {
		this.z1 = z1;
		this.z2 = z2;
	}

	public int add() {
		if (z1 instanceof Integer) {
			return (Integer) z1 + (Short) z2;
		} else {
			return 0;
		}
	}

	public T get1() {
		return z1;
	}

	public void set1(T z1) {
		this.z1 = z1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZahlenPaar<? extends Number> s = new ZahlenPaar<>(1, 2);
		System.out.println(s.add());
		Object n = s.get1();
		// s.set1(new Object());
	}

}
