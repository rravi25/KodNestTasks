package com.kodnest.assignments;
//	   A
//    B C
//   D   E
//  F     G
// HIJKLMNOP

public class PatternNine {

	  public static void main(String[] args) 
	  {
		  int start='A';
		  int num =5;
		  int b=num*2;
		  int a=1;
		  for(int i=num;i>=1;i--) {
			  for(int j=1;j<i;j++)
			  {
				  System.out.print(" ");
			  }
			  for(int k=1;k<=a;k++) 
			  {
				  if(k==1 && i!=1 ||k==a) {
					  System.out.print((char)start+" ");
					  start++;
				  }
				  else if(i==1){
					  while(b!=1) {
						  System.out.print((char)start);
						  start++; 
						  b--;
					  }
					  break;
				  }else {
					  System.out.print("  ");
				  }
			  }
			  a++;
			  
			  System.out.println();
		  }
		  
	  }
	  
}

