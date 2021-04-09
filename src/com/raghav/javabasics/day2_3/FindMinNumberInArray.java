package com.raghav.javabasics.day2_3;

//Given an array of numbers, write a program to identify the min number in the list.

public class FindMinNumberInArray {
    public static void main(String[] args) {
        FindMinNumberInArray result = new FindMinNumberInArray();
        result.findMin(new int[]{53,11,544,15,55,21,54,5});
        result.findMin(new int[]{});
    }

    public void findMin(int[] myArray) {
        if (myArray.length == 0) {
            System.out.println("Null");
        }
        else{
            int swapValue1 = myArray[0];
        int swapValue2 = myArray[0];
         for (int i = 0; i < myArray.length; i++) {
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[i] <= myArray[j] && myArray[i] <= swapValue1) {
                        swapValue1 = myArray[i];
                    } else {
                        swapValue2 = myArray[j];
                    }
                }
            }
            if (swapValue1 < swapValue2)
                System.out.println("Min num is: " + swapValue1);
            else
                System.out.println("Min num is: " + swapValue2);
        }
    }
}
