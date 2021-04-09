package com.raghav.javabasics.day5;
// Write a java program to reverse a given string.
import java.util.Arrays;

public class ReverseString {
    public static void main(String args[]){
        ReverseString result = new ReverseString();
        result.getReverseString("abcdef");
        result.getReverseString("123456");
        result.getReverseString("");
        result.getReverseString(null);
    }

    private void getReverseString(String str) {
        if(str == null || str.length() == 0){
            System.out.println("Array is Empty/Null");
            return;
        }
        char[] arr = new char[str.length()];
        int counter = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(counter);
            counter--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
