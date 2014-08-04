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
public class Welcomizer {

	public Welcomizer(String name) {
		class ConsoleOutPut {
			public ConsoleOutPut(String s) {
				System.out.println(s);
			}
		}
		new ConsoleOutPut("Welcome " + name);
	}

	public static void main(String[] args) {
		Welcomizer w = new Welcomizer("Le");
	}

}
