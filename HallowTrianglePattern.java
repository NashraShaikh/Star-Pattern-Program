package com.jsp.patterns;

public class HallowTrianglePattern {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//loop to print the pattern
		for(int i=1;i<=n;i++) {
			//loop to print columns
			for(int j=1;j<=i;j++) {
				if(j==1||i==n||i==j) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		

	}
}
}
