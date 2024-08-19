package com.kodnest.assignments;

import java.util.Scanner;

/*Prime Factorization: Implement a function that takes an integer
n and returns a list of its prime factors.
Test Case 1: prime_factors(28) should return [2, 2, 7].
Test Case 2: prime_factors(45) should return [3, 3, 5].
Test Case 3: prime_factors(13) should return [13].
Test Case 4: prime_factors(100) should return [2, 2, 5, 5].
Test Case 5: prime_factors(1) should return [].
*/

public class ReturnPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		while(num!=0) 
		{
			int ans =returnFact(num);
			System.out.println(ans);
			if(num/ans==1) {
				break;
			}else {
			num/=ans;	
			}
			
		}
		scan.close();
	}
	static int returnFact(int n) 
	{
		int i=2;
		while(n%i!=0) 
		{
			i++;
		}
		return i;
		
	}

}
