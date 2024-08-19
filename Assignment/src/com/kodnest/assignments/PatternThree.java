package com.kodnest.assignments;

import java.util.Scanner;

/*
     
    Palindromic Number Triangle: 
     1
    121
   12321
  1234321
 123454321
 
 */
public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			int n=1;
			for(int l=num-1;l>=i;l--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				n++;
			}
			for(int k=2;k<=i;k++) {
				System.out.print(n-k);
			}
			System.out.println();
		}
		scan.close();
		
	}

}
