package com.sprint.one;

public class ModOfNumber {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,3,3,3,3,4,4,4,4};
		int mFreq = a[0];
		int maxCount =0;
		
//		By using for-loop we can check
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=0;j<a.length;j++) {
//				check a[i] == a[j]
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count > maxCount) {
				maxCount=count;
				mFreq=a[i];
			}
		}
		System.out.println("The most frequent number is: "+mFreq);
	}
}
