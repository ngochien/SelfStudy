/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package streams;

import java.util.List;

/**
 * @author Le
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyIO myIO = new MyIO();

		List<String> strings =
				myIO.readFile("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile");
		for (String s : strings) {
			System.out.println(s);
		}

		List<String> strings_2 =
				myIO.readFileWithScanner("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile");
		for (String s : strings_2) {
			System.out.println(s);
		}
	}
}
