package com.jsp.patterns;

public class HallowDiamondPattern {

	public static void main(String[] args) {
		// no of rows
		int n=5;
		//upper triangle
		for(int i=1;i<=n;i++) {
			//print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//print star
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//lower triangle
				for(int i=n-1;i>=1;i--) {
					//print space
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					//print star
					for(int j=1;j<=2*i-1;j++) {
						if(j==1||j==2*i-1) {
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
