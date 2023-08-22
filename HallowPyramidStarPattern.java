package com.jsp.patterns;

public class HallowPyramidStarPattern {

	public static void main(String[] args) {
		// no of rows
				int n=5;
				//loop to print the pattern
				for(int i=1;i<=n;i++) {
					//loop to print space
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					//loop to print right columns
					for(int j=1;j<=2*i-1;j++) 
					if(j==1||i==n||j==2*i-1) {
						System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					
					System.out.println();
				}
	   }
	}

