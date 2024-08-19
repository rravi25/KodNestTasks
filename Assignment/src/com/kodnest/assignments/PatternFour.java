package com.kodnest.assignments;

import java.util.Scanner;

/*  Hour glass of Numbers:

    Create an hour glass pattern where numbers decrease towards the
    center and increase as you move outward.
    
   543212345
 	4321234
  	 32123
      212
       1
      212
     32123
    4321234
   543212345
*/
public class PatternFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int c1=0;
		for(int i=num;i>=1;i--) {
			for(int x=1;x<=c1;x++) {
				System.out.print(" ");
			}
			c1++;
			for(int j=i;j>=1;j--) 
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		int c2=num-2;
		for(int i=2;i<=num;i++) {
			for(int y=c2;y>=1;y--) {
				System.out.print(" ");
			}
			c2--;
			for(int j=i;j>=1;j--) 
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		scan.close();
		
		
	}

}
