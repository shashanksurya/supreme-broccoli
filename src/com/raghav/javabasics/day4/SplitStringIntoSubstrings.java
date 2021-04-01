package com.raghav.javabasics.day4;
// Given a string and an index, write a program to split the string into two substrings based on the index.

public class SplitStringIntoSubstrings {
    public static void main(String[] args) {
        SplitStringIntoSubstrings result = new SplitStringIntoSubstrings();
        result.splitString("",21);
        result.splitString(null,15);
        result.splitString("abcdefg",0);
        result.splitString("abcdefg",15);
        result.splitString("abcdefg",4);
        result.splitString("abcdefg",-1);
        result.splitString("abcdefg",6);
        result.splitString("abc   defg",5);
        result.splitString("ab$^%..cdefg",5);
        result.splitString(".",1);

    }

    public void splitString(String str, int index) {
        if (str == null || str.length() == 0) {
            System.out.println("String is Empty/Null");
            return;
        }
        if (index >= 0 && index < str.length()) {
            StringBuffer str1 = new StringBuffer();
            StringBuffer str2 = new StringBuffer();
            for (int i = 0; i <= index; i++) {
                str1.append(str.charAt(i));
            }
            System.out.print("First substring: " + str1+"   ");
            for (int i = index+1; i < str.length(); i++) {
                str2.append(str.charAt(i));
            }
            System.out.println("Second substring: " + str2);
        }
        else{
            System.out.println("Enter Valid Index");
        }
    }
}
