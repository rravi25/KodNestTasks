package com.kodnest.assignments;

import java.util.Scanner;
/*
  Prime Neighbors: Given a number, find the nearest prime number greater than 
  and less than the given number.
  
  Input : 4
  Output : 3,5
  
   Input : 2
  Output : Already a Prime
 */
public class NeighbouringPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		int dup = num;
		if(isPrime(num)) {
			System.out.println("Already a prime");
		}
		else {
			System.out.println("Nearest Prime are : ");
			while(!isPrime(dup)&& dup>=0) {
				dup--;
			}
			System.out.println(dup+", ");
			while(!isPrime(num)) {
				num++;
			}
			System.out.print(num);
		}
		scan.close();
	}
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
