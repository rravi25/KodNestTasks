package com.kodnest.assignments;

import java.util.Scanner;
/*
 Sum of Prime Digits: Given a number, write a program 
 to find the sum of all prime digits (2, 3, 5, 7) in the number.
 
 Input: 123456789
 Output: 17 (2 + 3 + 5 + 7)

 Input: 908172
 Output: 9

 Input: 44444
 Output: 0
 */
public class SumOfPrimeInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			if(isPrime(rem)) {
				sum+=rem;
			}
			num/=10;
		}
		System.out.println("Sum : " + sum);
		scan.close();
	}
	static boolean isPrime(int num) {
		if(num<=1) {
			return false; 
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
