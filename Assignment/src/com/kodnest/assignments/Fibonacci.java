package com.kodnest.assignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int n= scan.nextInt();
		 for(int i = 0; i < n; i++){
		      System.out.print(fibonacciUsingRecursion(i)+ " ");
		    }
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

}
