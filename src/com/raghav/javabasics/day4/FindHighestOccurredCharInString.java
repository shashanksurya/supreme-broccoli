package com.raghav.javabasics.day4;
// Given a string, write a program to return the highest occurred character in a String.
public class FindHighestOccurredCharInString {
    public static void main(String[] args) {
        FindHighestOccurredCharInString result = new FindHighestOccurredCharInString();
        result.charCount("abc");
        result.charCount("");
        result.charCount("cccc0000c");
        result.charCount("$1234$1234$123");
        result.charCount("abhddabc");
        result.charCount(null);
    }

    public void charCount(String str) {
        System.out.println();

        if (str == null || str.length() == 0) {
            System.out.print("Array is Empty/Null");
            return;
        }
        int[] myArray = new int[128];
        int val;
        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i);
            myArray[val] += 1;
        }
            int swapValue1 = 1; int swapValue2= 0;
            for(int i=0; i< myArray.length; i ++){
                if(myArray[i]>0 && myArray[i] >= swapValue1){
                    swapValue1 = myArray[i];
                }
            }
            for(int j=0; j< myArray.length;j++){
                if(myArray[j]==swapValue1){
                    System.out.print("MAX occurred char is: "+(char)j+" - "+swapValue1+", ");
                }
            }
        }
    }
