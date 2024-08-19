package com.kodnest.assignments;

/*
 
    1
   1 2
  1   2
 1     2
1       2
 1     2
  1   2
   1 2
    1
 
 */


public class PatternTen {

	public static void main(String[] args) {
		int num=1;
		int size=5;
		  for (int i = 1; i <= size; i++) {
		    for (int j = size; j > i; j--) {
		      System.out.print(" ");
		    }
		    for (int k = 0; k < i*2-1; k++) {
		      if (k == 0 || k == 2*i-2) {
		        System.out.print(num++);
		      } else {
		        System.out.print(" ");
		      }
		    }
		    num = 1;
		    System.out.println();
		  }
		  for (int i = 1; i < size; i++) {
		    for (int j = 0; j < i; j++) {
		    	 System.out.print(" ");
		    }
		    for (int k = (size-i)*2-1; k >= 1; k--) {
		      if (k == 1 || k == (size-i)*2-1) {
			        System.out.print(num++);
		      } else {
		    	  System.out.print(" ");
		      }
		    }
		    num = 1;
		    System.out.println();
		  }
	}

}
