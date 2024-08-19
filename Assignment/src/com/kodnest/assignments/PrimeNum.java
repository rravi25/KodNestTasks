package com.kodnest.assignments;
import java.util.*;

/*Prime Number Check: Write a function that takes an integer 
as input and returns True if the number is prime and False otherwise.
 Input : 6
 Output : false
 
 Input : 1
 Output : false
 
 Input : 19
 Output : true
 
 */

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		System.out.println(isPrimeOptimized(num));
		scan.close();
	}
	//my method
	 public static boolean isPrime(int num) {
		int count = 0;
		if(num<=1) {
			return false;
		}
		for(int i=1;i<=num/2;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}else {
			return true;
		}
	}
	 
	//Optimized Code
	 static boolean isPrimeOptimized(int num) {
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
