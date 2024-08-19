package com.kodnest.assignments;

import java.util.Scanner;

public class GoldBachsConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int sum=0;
		int n1=2,n2=0;
		outer :while(sum!=num) {
			for(int i=3;i<=num;i++)
			{
				if(isPrime(i)) {
					n2=i;
					sum=n1+n2;
					if(sum==num) {
						break outer;
					}
				}
			}
			n1=n2;
		}
		System.out.println("The number "+num+" is a sum of prime number "+n1+" and "+n2);
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
