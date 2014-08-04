/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Le
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String exp = "a*\\d+1x";
		String r1 = ".*?foo";
		String greddy = "/(.*)";
		String reluc = "/(h+?)h";
		String pos = "/(.*+)";
		String point = "..";
		String mt = "\\s";
		String r2 = "[^abc]";

		String s = "xaaaaaa91x876a21x";
		String s1 = "adgg5x";
		String s2 = "xfooxxxxxxfoo";
		String s3 = "/local/file/index.html";
		String s4 = "12";
		String s5 = "\\";
		String s6 = " ";

		Pattern p = Pattern.compile(point);
		Matcher m = p.matcher(s6);
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.start());
		System.out.println();
		// boolean matches = m.matches();
		//
		// System.out.println(matches);
		// if (matches) {
		// System.out.println(m.group(1));
		// System.out.println(m.start() + " - " + m.end());
		// System.out.println(m.groupCount());
		// }
		//
		// File dir =
		// new File("/media/sda6/@Studium/Bachelor/BWI/RB_SS14/Praktikum/Aufgabe4/Testweb/");
		// System.out.println("Dir: " + dir.isDirectory());
		// HttpServerImpl http;
		// URLDecoder ud;
		// System.out.println(File.listRoots()[0].getAbsolutePath());

	}

}
