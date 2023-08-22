package com.jsp.patterns;

public class RightPascalTriangle {

	public static void main(String[] args) {
		//UPPER half
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
		    System.out.print("*");
			}
			System.out.println();
		}
		//LOWER HALF
        for(int i=n-1;i>=1;i--) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
