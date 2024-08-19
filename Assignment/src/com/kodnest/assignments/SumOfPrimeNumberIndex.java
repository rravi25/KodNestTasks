package com.kodnest.assignments;

import java.util.Scanner;

/*
 Prime Index in Number: Write a program to find the sum of digits at 
 prime positions in a given number (1-based indexing).
 
 Input: 234567
 Output: 13 (2nd digit: 3, 3rd digit: 4, 5th digit: 6; 3 + 4 + 6 = 13)

 Input: 13579
 Output: 17 (2nd digit: 3, 3rd digit: 5, 5th digit: 9; 3 + 5 + 9 = 17)

 Input: 22222
 Output: 6
 
 */
public class SumOfPrimeNumberIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int count =digitCounter(num);
		int sum = 0;
		while(num!=0) {
			if(isPrime(count)) {
				int rem = num%10;
				System.out.println(rem);
				sum+=rem;
				num/=10;
				count--;
			}else {
				count--;
				num/=10;
			}
		}
		System.out.println("Sum : " + sum);
		scan.close();
	}
	static int digitCounter(int num) {
		int ans=0;
		while(num!=0) {
			ans++;
			num/=10;
		}
		return ans;
	}
	static boolean isPrime(int pos) {
		if(pos<=1) {
			return false;
		}
		for(int i = 2;i<=pos/2;i++) {
			if(pos%i==0) {
				return false;
			}
		}
		return true;
	}

}
