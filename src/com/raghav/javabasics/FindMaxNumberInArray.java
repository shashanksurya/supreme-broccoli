package com.raghav.javabasics;

//Given an array of numbers, write a program to identify the max number in the list.

public class FindMaxNumberInArray {
    public static void main(String[] args) {
        FindMaxNumberInArray result = new FindMaxNumberInArray();
        result.findMax(new int[]{1,5,858,2,5,4,5,2158,1,587,2158});
        result.findMax(new int[]{5,5,5});
        result.findMax(new int[]{});
        result.findMax(new int[]{-15,-16,-7});

    }
        public void findMax(int[] myArray){
        if(myArray.length==0 || myArray==null){
            System.out.println("array is null/empty");
            return;
        }
            int swapValue1 = 0; int swapValue2= 0;
            int[] newArray=myArray;
        for(int l=0;l<newArray.length;l++){
            if(newArray[l]<0){
                swapValue1=newArray[l];
                swapValue2=newArray[l];

            }
        }
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
