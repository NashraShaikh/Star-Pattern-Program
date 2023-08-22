package com.jsp.patterns;

public class PyramidStarPattern {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//loop to print the pattern
		for(int i=1;i<=n;i++) {
			//loop to print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//loop to print right columns
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}

			//loop to print left columns
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
