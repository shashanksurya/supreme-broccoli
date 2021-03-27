package com.raghav.javabasics;

//Given an array of numbers, write a program to identify all the even indexed numbers and odd indexed numbers.

public class FindAllEvenOddIndexedNumbersInArray {
    public static void main(String[] args) {
        FindAllEvenOddIndexedNumbersInArray result = new FindAllEvenOddIndexedNumbersInArray();
        result.countIndices(new int[]{5,-5,6,2,1,99,23});
        }

    public void countIndices(int[] myArr){
        int evenCount=0;
        int oddCount =0;
        for( int i=0; i< myArr.length; i++){
            if(i == 0 || i % 2 ==0){
                evenCount = evenCount + 1;
            }
            else{
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Count of Even Indexes : "+evenCount+" Count of Odd Indexes : "+oddCount);
    }
}

