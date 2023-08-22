package com.jsp.patterns;

public class ReversePyramidStarPattern {

	public static void main(String[] args) {
	   
		// no of rows
				int n=5;
				//loop to print the pattern
				for(int i=n;i>=1;i--) {
					//loop to print space
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					//loop to print columns
					for(int j=1;j<=2*i-1;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
