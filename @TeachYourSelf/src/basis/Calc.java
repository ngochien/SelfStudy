package basis;

import javax.swing.JOptionPane;

public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte b = 5;
		
		switch (b) {
		case 1 : b -= 1; break;
		case 5 : b -= 2; break;
		}
		System.out.println(Integer.toBinaryString(b));
	}

}
