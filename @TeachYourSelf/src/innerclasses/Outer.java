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
public class Outer {

	public void doIt() {
		System.out.println("Outer does it");
	}

	public class Inner extends Outer {
		@Override
		public void doIt() {
			System.out.println("Inner does it");
		}

		public void tell() {
			Outer.this.doIt();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();

		o.doIt();
		i.doIt();
		i.tell();
	}

}
