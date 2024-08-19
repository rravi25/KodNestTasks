package com.kodnest.assignments;

import java.util.Scanner;

/* PASCALS TRIANGLE WITH POWER OF 2
               1
             2   2
            4  4  4
           8  8  8  8
         16  16  16  16  16
 */
public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(power(2,i)+" ");
			}
			System.out.println();
		}
		scan.close();
	}
	static int power(int n,int m) {
		int count=m;
		int pow=1;
		if(m==0) {
			return pow;
		}
		while(count!=0) {
			pow*=n;
			count--;
		}
		return pow;
	}
}
