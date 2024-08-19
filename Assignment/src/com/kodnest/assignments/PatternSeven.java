package com.kodnest.assignments;

import java.util.Scanner;
//	D
//	C D
//	B C D
//	A B C D
public class PatternSeven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int num = scan.nextInt();
		int start=64+num;
		for(int i=1;i<=num;i++) {
			int count=1;
			for(int j=start;j>=65 && count<=i;j++)
			{
				System.out.print((char)j+" ");
				count++;
			}
			start--;
			System.out.println();
		}
		scan.close();
	}

}
