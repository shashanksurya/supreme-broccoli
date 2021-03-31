package com.raghav.javabasics.day4;
// Write a java program to count occurrences of each character in String in java.

public class FindHighestOccurredCharInString {
    public static void main(String[] args) {
        FindHighestOccurredCharInString result = new FindHighestOccurredCharInString();
        result.charCount("111");
        result.charCount("");
        result.charCount("cccc0000c");
        result.charCount("ascisa");
        result.charCount("abhddabc");
    }

    public void charCount(String str) {
        System.out.println();

        if (str == null || str.length() == 0) {
            System.out.print("Array is Empty/Null");
            return;
        }
        int[] myArray = new int[128];
        int val;
        int charVal1 = 0;
        int charVal2 = 0;
        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i);
            myArray[val] += 1;
        }
            int swapValue1 = 0; int swapValue2= 0;
            for (int i = 0; i < myArray.length; i++) {
                for(int j = i+1; j < myArray.length; j++){
                    if(myArray[i] >= myArray[j] && myArray[i] > swapValue1){
                        swapValue1 = myArray[i];
                        charVal1=i;
                    }
                    else {
                        swapValue2 = myArray[j];
                        charVal2=j;
                    }
                }
            }
            if(swapValue1>swapValue2)
                System.out.print("MAX occurred char is: "+(char)charVal1+" - "+swapValue1);
            else
                System.out.println("MAX occurred char is: "+(char)charVal2+" - "+swapValue2);
        }
    }
