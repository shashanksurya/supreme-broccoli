package com.raghav.javabasics;

//Given an array of numbers, write a program to identify all the even indexed numbers and odd indexed numbers.

public class FindAllEvenOddIndexedNumbersInArray {
    public static void main(String[] args) {
        FindAllEvenOddIndexedNumbersInArray result = new FindAllEvenOddIndexedNumbersInArray();
        result.countIndices(new int[]{5,-5,6,2,1,99,23});
        result.countIndices(new int[]{});
        result.countIndices(new int[]{1,2,3,4,5,6});
        result.countIndices(new int[]{1});
        result.countIndices(new int[]{1,2});
    }

    public void countIndices(int[] myArr){
        if (myArr == null || myArr.length == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        int evenCount=0;
        int oddCount =0;
        int count1=0;
        int count2=0;
        int[] evenCountArr = new int[myArr.length/2+1 ];
        int[] oddCountArr = new int[myArr.length/2 ];

        for( int i=0; i< myArr.length; i++){
            if(i == 0 || i % 2 ==0){
                evenCount = evenCount + 1;
                evenCountArr[count1]=myArr[i];
                count1+=1;
            }
            else{
                oddCount = oddCount + 1;
                oddCountArr[count2]=myArr[i];
                count2+=1;
            }
        }
        for(int i=0; i<count1;i++){
            if(i==0){
                System.out.print("Even indices list: ");
            }
            System.out.print(evenCountArr[i]+" ");
        }
        for(int i=0; i<count2;i++){
            if(i==0){
                System.out.print("   Odd indices list: ");
            }
            System.out.print(oddCountArr[i]+" ");
        }    }
}

