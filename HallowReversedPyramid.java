package com.jsp.patterns;

public class HallowReversedPyramid {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		for(int i=n;i>=1;i--) {
			//print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//print star
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
