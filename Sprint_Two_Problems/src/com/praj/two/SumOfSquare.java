package com.praj.two;

import java.util.Scanner;

// write a java program to find the sum of square of all even numbers of all n
public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = sumOfSquares(n);
        System.out.println("The Sum of squares is: "+result);
    }
    public static int sumOfSquares(int n) {
        int sum=0;
//         check even number or not
       for(int i=1;i <=n ;i++) {
           if(i % 2==0){
               sum += i * i;
           }
       }
       return sum;
    }
}
