package com.kodnest.assignments;

import java.util.Scanner;

public class PatternTwo {
	/*Hollow Pyramid with Number Borders:
	   1
  	  2 2
     3   3
    4 4 4 4
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int k=num-1;k>=i;k--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				if(i==num ||i==1 || j==1 ||j==i) {
					System.out.print(i+" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			scan.close();
		}
	}
}
