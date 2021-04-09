package com.raghav.javabasics.day5;
//Write a java program to check whether two given strings are anagram.

public class CheckTwoStringsAreAnagram {
    public static void main(String args[]) {
        CheckTwoStringsAreAnagram result = new CheckTwoStringsAreAnagram();
        result.anagramCheck("abavvvaac", "bavvaavca");
        result.anagramCheck("", "bavvaavca");
        result.anagramCheck("", "");
        result.anagramCheck(null, "bavvaavca");
        result.anagramCheck(null, null);
        result.anagramCheck("abavvvaac", "bavvavca");
        result.anagramCheck("aaaa", "aaaa");
        result.anagramCheck("a", "a");
        result.anagramCheck("a", "b");
    }

    private void anagramCheck(String str1, String str2) {
        if (str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        if(str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams!!!");
            return;
        }
            int val;
            char[] arr1 = new char[128];
            int val1;
            char[] arr2 = new char[128];
            int val2;
            for (int i = 0; i < str1.length(); i++) {
                val1 = (int) str1.charAt(i);
                arr1[val1] += 1;
            }
            for (int i = 0; i < str1.length(); i++) {
                val2 = (int) str2.charAt(i);
                arr2[val2] += 1;
            }
            for(int i =0; i< str1.length(); i++){
                val = (int) str1.charAt(i);
                if (arr1[val] != arr2[val]) {
                    System.out.println("Strings are not anagram!!!");
                    return;
                }
            }
            System.out.println("Strings are anagram!!!");
    }
}
