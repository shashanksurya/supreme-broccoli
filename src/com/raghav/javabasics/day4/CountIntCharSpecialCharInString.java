package com.raghav.javabasics.day4;

//Write a program to count number of integers, number of characters and number of special characters.
public class CountIntCharSpecialCharInString {
    public static void main(String[] args) {
        CountIntCharSpecialCharInString result = new CountIntCharSpecialCharInString();
        result.charCount("abcdefghijklmnopqrstuvwxyz0123456789 !@#$%^&*()_+");
        result.charCount("");
        result.charCount(null);
        result.charCount("cccc0000c  ");
        result.charCount("ascisa%%%-1");
        result.charCount("aab");
    }

    public void charCount(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        int letterCount = 0;
        int numCount = 0;
        int specialCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) || ((int)str.charAt(i) >= 97 && i <= 122)) {
                if ((int)str.charAt(i) > 0) {
                    letterCount++;
                }
            } else if (i >= 48 && i <= 57) {
                if ((int)str.charAt(i) > 0) {
                    numCount++;
                }
            } else {
                if ((int)str.charAt(i) > 0) {
                    specialCount++;
                }
            }
        }
        System.out.println("Letter count: " + letterCount + "   Number Count: " + numCount + "   Special Char Count: " + specialCount);
    }
}
