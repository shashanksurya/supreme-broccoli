package com.raghav.javabasics.day4;
//Write a java program to count occurrences of each character in String in java.

public class CountOccurrencesOfCharInString {
    public static void main(String[] args) {
        CountOccurrencesOfCharInString result = new CountOccurrencesOfCharInString();
        result.charCount("abc");
        result.charCount("");
        result.charCount(null);
        result.charCount("cccc0000c");
        result.charCount("asc^%$(#&%$&$a");
        result.charCount("abh        ddabc");
        }

        public void charCount(String str) {
            System.out.println();
            if (str == null || str.length() == 0) {
                System.out.print("Array is Empty/Null");
                return;
            }
            int[] arr = new int[128];
            int val;
            for (int i = 0; i < str.length(); i++) {
                val = (int) str.charAt(i);
                arr[val] += 1;
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=0)
                System.out.print((char)j+ ": " +arr[j]+"  ");
            }
        }
}
