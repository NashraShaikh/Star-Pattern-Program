package com.jsp.patterns;

public class HallowSandGlassPattern {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//UPPER TRIANGLE
				for(int i=n;i>=1;i--) {
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					for(int j=1;j<=2*i-1;j++) {
						if(i==n||j==1||j==2*i-1) {
						System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
		//LOWER TRIANGLE
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(i==n||j==1||j==2*i-1) {
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
