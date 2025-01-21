package com.praj.two;

import java.util.Stack;

// write  a java program to a balanced Bracket sequence
public class BalancedBracket {
    public static void main(String[] args) {
        String input = "{[()]}";
        boolean  bl = isBalanced(input);
        System.out.println(bl + " , " + "Yeah the given string is balanced!");
    }

    public static boolean isBalanced(String st) {
        Stack<Character> sta = new Stack<>();

        for(char ch : st.toCharArray()) {
            if( ch == '(' || ch == '{' || ch == '[') {
                sta.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if(sta.isEmpty() || !isMatch(sta.pop() , ch)) {
                    return false;
                }
            }
        }
        return sta.isEmpty();
    }

    public static  boolean isMatch(char open , char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
