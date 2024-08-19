package com.kodnest.assignments;

import java.util.Scanner;

public class PrimeNumberBetweenXandY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range from and to : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The prime number between"+num1+" and "+num2+" are: ");
		for(int i=num1;i<=num2;i++) {
			if(isPrime(i)) {
				System.out.print(i+",");
			}
		}
		scan.close();
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
