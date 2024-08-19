package com.kodnest.assignments;

import java.util.Scanner;

/*Sum of Primes: Find the sum of all prime numbers below a given integer n.
 
   Input : 16
   Output : 41 (2+3+5+7+11+13) sum of all the prime till N=16
   
   Input : 1
   Output : 0 () no prime before 1
  
   Input : 13
   Output : 28 (2+3+5+7+11)
 */



public class SumOfAllPrimeTillN {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(isPrime(i)) 
			{
				sum+=i;
			}
		}
		System.out.println("Sum is : "+sum);
		scan.close();
	}
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
