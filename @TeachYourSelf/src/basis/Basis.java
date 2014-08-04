package basis;

import innerclasses.StaticInnerClassDemo;

public class Basis {
	enum list { G, H, M };
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**	System.out.println("abc".length());
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_EXPONENT);
		int a = 2;
		int b = 4;
		System.out.println(a++*b);
		int[] numArray = new int[5];
		for (int i=1; i<numArray.length; i++)
		{
			numArray[i] = i;
			System.out.println(numArray[i]);
		}
		 */	int[][] matrix = new int[9][9];
		 for (int x=0; x<9; x++) {
			 for (int y=0; y<9; y++) {
				 matrix[x][y] = x + y;
				 System.out.print(matrix[x][y] + " ");
			 }
			 System.out.println("");
		 }

		 /** 1			00
		  *	2 3			10 11
		  *	4 5 6		20 21 22
		  *	7 8 9 10 	30 31 32 33
		  */
		 for (int x=1; x<4; x++) {
			 for (int y=0; y<x; y++) {

				 System.out.print(x+y + " ");	
			 }	
			 System.out.println("");
		 }	
		 for (int x=5; x>=0; x--) {
			 for (int y=0; y<x+1; y++) {
				 System.out.print("*");	
			 }	
			 System.out.println("");
		 }
		 StaticInnerClassDemo.UniqueNumberGenerator in = new StaticInnerClassDemo.UniqueNumberGenerator();
	}
}
