package com.praj.two;

// write a java program to repeated substring in a string
public class RepetedSubString {
    public static void main(String[] args) {
        String str ="abab";
        boolean rs= hasRepeated(str);
        if(rs == true) {
            System.out.println("Yes, Repeated SubString");
        } else {
            System.out.println("No, Repeated SubString");
        }
    }

    public static boolean hasRepeated(String st) {
        int n = st.length();
//        check for substring
        for(int len =1; len <= n/2;len++) {
            String sub = st.substring(0,len);
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<n/len;i++) {
                sb.append(sub);
            }
            if(sb.toString().equals(st)) {
                return true;
            }
        }
        return false;
    }
}
