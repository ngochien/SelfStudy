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
public class OuterNested {

	private int outvar = 30;

	public void print() {
		System.out.println(outvar);
		System.out.println(new Middle().midvar);
	}

	public class Middle {
		private int midvar = 20;

		public class Inner {
			private int invar = 0;

			public void print() {
				System.out.println(outvar);
				System.out.println(midvar);
				System.out.println(invar);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterNested o = new OuterNested();
		o.print();
		o.new Middle().new Inner().print();
	}

}
