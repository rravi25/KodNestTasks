package com.kodnest.assignments;

import java.util.Scanner;

/*List All Primes: Given an integer n, generate a list of all
prime numbers less than or equal to n.

 Input : 7
 Output : 2,3,5,7
 
 Input : 1
 Output : prints nothing
 
 Input : 20
 Output : 2,3,5,7,11,13,17,19
 */

public class PrimeTillN {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = scan.nextInt();
		for(int i=2;i<=num;i++) 
		{
			if(isPrime(i)) 
			{
				System.out.println(i);
			}
		}
		scan.close();
	}
	static boolean isPrime(int n) 
	{
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	
	

}
