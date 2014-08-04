/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Le
 */
public class Verkettung {

	public static void main(String[] args) throws IOException {

		FileInputStream fis =
				new FileInputStream("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile");

		InputStreamReader isr = new InputStreamReader(fis);
		System.out.println(isr.read()); // print 76

		BufferedReader br1 = new BufferedReader(isr);
		System.out.println(br1.readLine()); // print e Ngoc Hien
		br1.close();

		FileReader fileReader =
				new FileReader("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile");

		BufferedReader br2 = new BufferedReader(fileReader);
		System.out.println(br2.readLine()); // Le Ngoc Hien
		System.out.println(br2.readLine());
		System.out.println(br2.readLine());
		br2.close();


		// BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		// String s;
		// while (!(s = br3.readLine()).equalsIgnoreCase("quit")) {
		// System.out.println(s.toUpperCase());
		// }

		// FileOutputStream fos =
		// new FileOutputStream("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile");
		// OutputStreamWriter osw = new OutputStreamWriter(fos);
		FileWriter fw =
				new FileWriter("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile", true);

		PrintWriter pwriter = new PrintWriter(fw);
		pwriter.println("PWriter");
		pwriter.flush();
		BufferedWriter bw1 = new BufferedWriter(fw);
		bw1.write("Le Ngoc Hien"); bw1.newLine();
		bw1.write("Le Ngoc Hien");
		bw1.newLine();
		bw1.close();

	}

}
