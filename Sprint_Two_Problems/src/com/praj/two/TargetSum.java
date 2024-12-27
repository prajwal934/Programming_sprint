package com.praj.two;
//WAJP to find the sum of the two number is 7(target) by the help of stream api
public class TargetSum {

	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		
		for(int i=0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target)
					System.out.println("Elements "+nums[i]+ " , "+ nums[j]);
			}
		}
	}
}
