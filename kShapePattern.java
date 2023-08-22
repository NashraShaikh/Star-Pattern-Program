package com.jsp.patterns;

public class kShapePattern {

	public static void main(String[] args) {
      // no of rows
		int n=5;
		// upper triangle
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	      //lower triangle
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
