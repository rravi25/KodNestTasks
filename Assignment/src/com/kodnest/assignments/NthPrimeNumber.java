package com.kodnest.assignments;

import java.util.Scanner;

/*Nth Prime Number: Write a function that returns the nth prime number.
  Input : 6
  Output : 13
  
  Input : 1
  Output : 2
  
  Input : 50
  Output : 229
 */


public class NthPrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		scan.close();
		for(i=2;count!=num;i++) 
		{
			if(isPrime(i)) 
			{
				count++;
			}
		}
		System.out.println("Nth Prime is : "+(i-1));
		
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
