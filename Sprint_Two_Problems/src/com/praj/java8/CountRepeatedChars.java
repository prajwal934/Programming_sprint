package com.praj.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// write a java program to count how many repeated charecters present in the given string
public class CountRepeatedChars {
    public static void main(String[] args) {
        String input = "Prajwal Samal";

        List<Character> chr = input.replaceAll("\\s+" , " ")
                                .chars().mapToObj(c -> (char) c)
                                .collect(Collectors.toList());

        Map<Character, Long> charCounts = chr.stream()
                                    .collect(Collectors.groupingBy( c -> c, Collectors.counting()));
        Map<Character, Long> repetingChars = charCounts.entrySet().stream().filter(entry -> entry.getValue() > 1)
                                        .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));

        System.out.println("Repeting charecters and their counts are: "+repetingChars);
        System.out.println("Total Repeting Charecters: "+repetingChars.size());
    }
}
