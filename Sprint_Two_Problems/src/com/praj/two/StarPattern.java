package com.praj.two;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		int p = n/2 , q = 1;
		for(int i =1; i<=n;i++) {
			for(int j =1; j<=p;j++) {
				System.out.print(" ");
			}
			for(int j=1;j <= q;j++) {
				System.out.print("*");
			}
			if(i <= n/2) {
				p--;
				q = q+2;
			} else {
				p++;
				q= q-2;
			}
			System.out.println();
		}
	}
}
