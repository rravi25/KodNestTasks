package com.kodnest.assignments;

import java.util.Scanner;
//	A     E
//	 B   D 
// 	  C C  
// 	  B D 
//	A     E
public class PatternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of alphabets : ");
		int num = scan.nextInt();
		int n=1;
		for(int i=num;i>=1;i--) {
			int count=0;
			for(int j=65;count!=num;j++) {
				if(n==j-64 && n<=num || i+64==j) 
				{
					System.out.print((char)j+" ");
				}
				else 
				{
					System.out.print("  ");
				}
				count++;
			}
			n++;
			System.out.println();
		}
		scan.close();
	}

}
