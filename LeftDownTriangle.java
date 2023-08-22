package com.jsp.patterns;

public class LeftDownTriangle {

	public static void main(String[] args) {
	
			// no of rows
			int n=5;
			//loop to print the pattern
			for(int i=n;i>=1;i--) {
				//loop to print columns
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
	  }

}
