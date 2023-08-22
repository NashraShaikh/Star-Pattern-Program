package com.jsp.patterns;

public class RightDownTriangle {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//loop to print the pattern
		for(int i=1;i<=n;i++) {
			//loop for spaces
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			//loop to print columns
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
