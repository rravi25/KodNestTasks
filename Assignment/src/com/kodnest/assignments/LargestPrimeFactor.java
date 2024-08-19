package com.kodnest.assignments;

import java.util.Scanner;
/*
Largest Prime Factor: Find the largest prime factor of a given large integer n.

Test Case 1: largest_prime_factor(28) should return 7.
Test Case 2: largest_prime_factor(45) should return 5.
Test Case 3: largest_prime_factor(13) should return 13.
Test Case 4: largest_prime_factor(100) should return 5.
Test Case 5: largest_prime_factor(13195) should return 29.  
 */
public class LargestPrimeFactor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = scan.nextInt();
			int large = 0;
			while(num!=0) 
			{
				int ans =returnFact(num);
				if(ans>large) 
				{
					large=ans;
				}
				if(num/ans==1) 
				{
					break;
				}
				else
				{
				num/=ans;	
				}
				
			}
			System.out.println("Largest number : "+large);
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