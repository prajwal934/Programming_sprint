package com.praj.two;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int n = sc.nextInt();
		System.out.println("Enter the end number: ");
		int e = sc.nextInt();
		
		for(int i=0;i <=10 ; i++) {
			for(int j =n ; j <= e;j++) {
				System.out.print(j + " * " + i + " = " + ( j * i) + " ");
			}
		}
		System.out.println();
	}
}
