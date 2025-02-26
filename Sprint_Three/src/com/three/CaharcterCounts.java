package com.three;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CaharcterCounts {
    public static void main(String[] args) {
        String input = "Prajwal Samal";

        Map<Character, Long> counts = input.chars().mapToObj( c -> (char) c)
                                    .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println("The String is: "+ input);
        System.out.println("The charecters counts is: "+ counts);
    }
}
