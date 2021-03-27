package com.raghav.javabasics;

//Given an array of numbers, write a program to find the sum of all even numbers and sum of all odd numbers.

public class SumOfAllEvenAndOddNumbersInAnArray {
    public static void main(String[] args) {
        SumOfAllEvenAndOddNumbersInAnArray result = new SumOfAllEvenAndOddNumbersInAnArray();
        result.sumOfEvenOdd(new int[]{2,1,5,4,3,6,8,4,5});
    }

    public void sumOfEvenOdd(int[] myArray){
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
