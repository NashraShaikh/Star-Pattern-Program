package com.jsp.patterns;

public class ButterflyStarPattern {

	public static void main(String[] args) {
		//no of rows
		int n=5;
		//UPPER TRIANGLE
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner loop to print spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		//LOWER TRIANGLE
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner loop to print spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		
		}
	}

}
