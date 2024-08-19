package com.kodnest.assignments;

import java.util.Scanner;

public class IsFibonacciOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		System.out.println(isFibonacci(num));
		scan.close();

	}
	 static int fibonacciUsingRecursion(int n)
	  {
	    if(n == 0){
	      return 0;
	    }
	    else if(n == 1){
	      return 1;
	    }
	    else{
	      return fibonacciUsingRecursion(n-2) + fibonacciUsingRecursion(n-1);
	    }
	  }
	 
	 static boolean isFibonacci(int num) {
		 for(int i=0;i<=num;i++) 
			{
					if(fibonacciUsingRecursion(i)==num) 
					{
						return true;
					}
			}
		 return false;
	 }


}
