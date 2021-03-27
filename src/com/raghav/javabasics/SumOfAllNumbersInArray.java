package com.raghav.javabasics;

//Given an array of numbers, write a program to return the sum of all the numbers.

public class SumOfAllNumbersInArray {
    public static void main(String[] args) {
        SumOfAllNumbersInArray result = new SumOfAllNumbersInArray();
        result.sumOfAllNums(new int[]{1,2,3,5,4,6,2});
        result.sumOfAllNums(new int[]{});
    }

    public void sumOfAllNums(int[] myArray){
        int swapValue1; int swapValue2= 0;
        for (int i = 0; i < myArray.length; i++) {
            swapValue1 = myArray[i];
            swapValue2 = swapValue2 + swapValue1;
        }
            System.out.println("Addition of all elements in the array is: "+swapValue2);
    }
}
