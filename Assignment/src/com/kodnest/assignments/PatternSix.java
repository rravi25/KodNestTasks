package com.kodnest.assignments;

import java.util.Scanner;
//	A
//	B C
//	C D E
//	E F G H
//	H I J K L
public class PatternSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int num = scan.nextInt();
		int start =65;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(start==97) {
					start=71;
				}
				if(i<=2) {
					System.out.print((char)start+" ");	
				}else if(i>2 && start<=96){
					System.out.print((char)(start-(i-2))+" ");
				}
				start++;
			}
			
			System.out.println();
		}
		scan.close();
		

	}

}
