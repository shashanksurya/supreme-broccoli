package com.raghav.javabasics.day4;
//Given a string, write a program to print the first non-repeating character in the String.

public class FindFirstNonRepeatingChar {
    public static void main(String args[]) {
        FindFirstNonRepeatingChar result = new FindFirstNonRepeatingChar();
        result.findNonRepeatingChar("abhddabc");
        result.findNonRepeatingChar("c");
        result.findNonRepeatingChar("cccc0000c");
        result.findNonRepeatingChar("cia");
        result.findNonRepeatingChar("abhddabc");
        result.findNonRepeatingChar("abcdefghijklmnopqrst()_+");
        result.findNonRepeatingChar("");
        result.findNonRepeatingChar(null);
    }

    public void findNonRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            boolean a = false;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.length() - 1 && j == str.length() - 1) {
                    System.out.println(str.charAt(i));
                    break;
                }
                if (i == j) {
                    j++;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                } else {
                    if (j == str.length() - 1) {
                        System.out.println(str.charAt(i));
                        a = true;
                        break;
                    }
                }
            }
            if (a) {
                break;
            }
        }
    }
}
