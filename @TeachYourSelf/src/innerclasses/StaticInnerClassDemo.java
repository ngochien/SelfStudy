/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package innerclasses;


/**
 * @author Le
 */
public class StaticInnerClassDemo {

	private int id;
	private static int uniqueNumber = 1;

	public static class UniqueNumberGenerator {

		public int generate() {

			uniqueNumber *= 2;
			return uniqueNumber;
		}
	}

	public static int nextNumber() {
		return new UniqueNumberGenerator().generate();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(nextNumber());
		}

		int n = new StaticInnerClassDemo.UniqueNumberGenerator().generate();
		System.out.println(n);

		System.out.println(new UniqueNumberGenerator().generate());

		StaticInnerClassDemo outer = new StaticInnerClassDemo();
		UniqueNumberGenerator inner = new UniqueNumberGenerator();
	}

}
