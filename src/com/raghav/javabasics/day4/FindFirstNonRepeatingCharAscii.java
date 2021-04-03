package com.raghav.javabasics.day4;
//Given a string, write a program to print the first non-repeating character in the String.

public class FindFirstNonRepeatingCharAscii {
    public static void main(String args[]) {
        FindFirstNonRepeatingCharAscii result = new FindFirstNonRepeatingCharAscii();
        result.findNonRepeatingChar("abc");
        result.findNonRepeatingChar("b");
        result.findNonRepeatingChar("  &&  c");
        result.findNonRepeatingChar("cccc0000c");
        result.findNonRepeatingChar("ascisca");
        result.findNonRepeatingChar("abcdedabc");
        result.findNonRepeatingChar("");
        result.findNonRepeatingChar(null);
    }

    public void findNonRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        char[] arr = new char[128];
        int val;
        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i);
            arr[val] += 1;
        }
        int j=0;
        for (j = 0; j < str.length(); j++) {
            val = (int) str.charAt(j);
            if (arr[val] == 1) {
                System.out.println(str.charAt(j));
                return;
            }
        }
        System.out.println("No non repetitive num in string");
    }
}
