package com.raghav.javabasics.day5;
// Write a java program to check whether input string is palindrome of the given string or not.

public class CheckStringIsPalindrome {
    public static void main(String args[]) {
        String str = "raaaasr";

        if (checkPalindrome(str))
            System.out.print("Is a palindrome");
        else
            System.out.print("Not a palindrome");
    }

    public static boolean checkPalindrome(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("String is empty/null");
            return false;
        }
        int j = str.length() - 1;
        for(int i = 0; i < j; i++){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}

