package com.raghav.javabasics;

//Given an array of numbers, write a program to find the sum of all even numbers and sum of all odd numbers.

public class SumOfAllEvenAndOddNumbersInAnArray {
    public static void main(String[] args) {
        SumOfAllEvenAndOddNumbersInAnArray result = new SumOfAllEvenAndOddNumbersInAnArray();
        result.sumOfEvenOdd(new int[]{2,1,5,4,3,6,8,4,5});
        result.sumOfEvenOdd(new int[]{-2,-1,-5,-4,-3,-6,-8,-4,-5});
        result.sumOfEvenOdd(new int[]{0});
        result.sumOfEvenOdd(new int[]{-5});
        result.sumOfEvenOdd(new int[]{});

    }

    public void sumOfEvenOdd(int[] myArray){
        if (myArray == null || myArray.length == 0) {
            System.out.print("Array is Empty/Null");
            return;
        }
        int evenCount=0;
        int oddCount =0;
        for( int i=0; i< myArray.length; i++){
            if(myArray[i]%2 == 0){
                evenCount = evenCount + myArray[i];
            }
            else{
                oddCount = oddCount + myArray[i];
            }
        }
        System.out.println("Addition of Even Numbers : "+evenCount+" Addition of Odd Numbers : "+oddCount);
    }
}
