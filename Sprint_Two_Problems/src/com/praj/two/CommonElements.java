package com.praj.two;

// write a java program to find the common elements in the two  array
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};

        int n = arr1.length;
        int m = arr2.length;
        System.out.println("The common elements are: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
    }
}
