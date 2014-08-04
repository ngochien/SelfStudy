/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package innerclasses;

import innerclasses.StaticInnerClassDemo.UniqueNumberGenerator;

/**
 * @author Le
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = new StaticInnerClassDemo.UniqueNumberGenerator().generate();
		System.out.println(i);

		UniqueNumberGenerator uniqueNumberGenerator = new StaticInnerClassDemo.UniqueNumberGenerator();
		System.out.println(uniqueNumberGenerator.generate());

		StaticInnerClassDemo outer = new StaticInnerClassDemo();

	}

}
