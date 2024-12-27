package com.praj.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//By the help of stream api , find the 3rd highest salary 
public class HighestSalary {

	public static void main(String[] args) {
		List<Integer> sal = Arrays.asList(10,23,45,67,89,98,76,34);
		
		List<Integer> distSal = sal.stream().distinct().sorted( (a,b) -> b - a).collect(Collectors.toList());
		
//		if there are atleast 3 distinct salaries
		
		if(distSal.size() >= 3) {
			System.out.println("3rd highest salary is: "+distSal.get(2));
		} else {
			System.out.println("Not enough!!!");
		}
	}
}
