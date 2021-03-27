package com.raghav.javabasics;

//Given an array of numbers, write a program to identify the max number in the list.

public class FindMaxNumberInArray {
    public static void main(String[] args) {
        FindMaxNumberInArray result = new FindMaxNumberInArray();
        result.findMax(new int[]{1,5,858,2,5,4,5,2158,1,587,4});
        result.findMax(new int[]{});
    }
        public void findMax(int[] myArray){
        int[] newArray=myArray;
        int swapValue1 = 0; int swapValue2= 0;
        for (int i = 0; i < myArray.length; i++) {
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[i] >= myArray[j] && myArray[i] > swapValue1){
                    swapValue1 = myArray[i];
                }
                else {
                    swapValue2 = myArray[j];
                }
            }
        }
        if(swapValue1>swapValue2)
            System.out.println("MAX num is: "+swapValue1);
        else
            System.out.println("MAX num is: "+swapValue2);
    }
}
