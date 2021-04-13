package com.raghav.javabasics.day2_3;

//Given an array of numbers, write a program to return the sum of all the numbers.

public class SumOfAllNumbersInArray {
    public static void main(String[] args) {
        SumOfAllNumbersInArray result = new SumOfAllNumbersInArray();
        result.sumOfAllNums(new int[]{1,2,3,5,4,6,2});
        result.sumOfAllNums(new int[]{});
        result.sumOfAllNums(new int[]{-1,-2,-3,-4, 5});

    }

    public void sumOfAllNums(int[] myArray){
        if (myArray == null || myArray.length == 0) {
            System.out.print("Array is Empty/Null");
            return;
        }
        int swapValue= 0;
        for (int i = 0; i < myArray.length; i++) {
            swapValue = swapValue + myArray[i];
        }
            System.out.println("Addition of all elements in the array is: "+swapValue);
    }
}
