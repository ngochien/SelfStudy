/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Le
 */
public class MyIO {

	public List<String> readFile(String fileName) {
		File f = new File(fileName);
		File f1 = new File(fileName);
		System.out.println(f.equals(f1));
		System.out.println(f.getPath());
		System.out.println((f.getAbsolutePath()));
		System.out.println(File.separator);
		System.out.println("CanWrite: " + f.canWrite());
		System.out.println("CanRead: " + f.canRead());
		System.out.println("CanExecute: " + f.canExecute());
		System.out.println("Length: " + f.length());
		System.out.println("Last Modified: " + f.lastModified());

		List<String> strings = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String s = reader.readLine();
			while (s != null) {
				strings.add(s);
				s = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("No file found: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error while reading file: " + e.getMessage());
			e.printStackTrace();
		}

		return strings;
	}

	public List<String> readFileWithScanner(String fileName) {
		List<String> strings = new ArrayList<String>();
		try (
				Scanner scanner =
				new Scanner(new File("/home/h13n/git/SelfStudy/@TeachYourSelf/bin/streams/txtfile"))) {
			String s;
			while (scanner.hasNextLine()) {
				s = scanner.nextLine();
				strings.add(s);
			}
		} catch (FileNotFoundException e) {
			System.err.println("No file found: " + e.getMessage());
			e.printStackTrace();
		}
		return strings;
	}
}
