package com.jsp.patterns;

public class RhombusPattern {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//print rhombus
		for(int i=1;i<=n;i++) {
			//print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//print star
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
	}

}
