package com.raghav.javabasics;

// Given an array of numbers, write a program to find the number of odd and number of even numbers.

public class FindEvenOddInArray {
    public static void main(String[] args) {
        FindEvenOddInArray result = new FindEvenOddInArray();
        result.findEvenOddNum(new int[]{5,-5,6,2,1,99,23});
        result.findEvenOddNum(new int[]{});
    }
    public void findEvenOddNum(int[] myArray){
        int evenCount=0;
        int oddCount =0;
        for( int i=0; i< myArray.length; i++){
            if(myArray[i]%2 == 0){
                evenCount +=1;
            }
            else{
                oddCount+=1;
            }
        }
        System.out.println("Even Number Count: "+evenCount+" Odd Number Count: "+oddCount);
    }
}
