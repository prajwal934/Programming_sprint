package com.praj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// write a java-8 program to find the third-highest salary
public class ThirdHighestSalary {
    public static void main(String[] args) {
        List<Integer> sal = Arrays.asList(10 ,20 , 430 ,65,68);

        List<Integer> distSal = sal.stream().distinct().sorted((a,b) -> b -a).collect(Collectors.toList());
//         check if there are at least 3 distinct salary
        if(distSal.size() >= 3) {
            System.out.println("Third Highest-Sal "+distSal.get(2));
        } else {
            System.out.println("Do, Hard work to earn more!");
        }
    }
}
