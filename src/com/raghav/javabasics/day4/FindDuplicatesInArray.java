package com.raghav.javabasics.day4;

// Given an array of numbers, write a program to find the duplicates.

public class FindDuplicatesInArray {
    boolean abc= false;
    public static void main(String[] args) {
        FindDuplicatesInArray result = new FindDuplicatesInArray();
        result.findDuplicates(null);
        result.findDuplicates(new int[]{});
        result.findDuplicates(new int[]{23, -5, 5, 0, 1,5, 99,2,0, 23,1});
        result.findDuplicates(new int[]{1,2,2,3,66,55,44,3});
        result.findDuplicates(new int[]{1,2,3,4,5});

    }

    public void findDuplicates(int[] myArray) {
        if(myArray==null || myArray.length==0){
            System.out.println("Array is Null");
            return;
        }
        int[] newArray = new int[myArray.length];
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && searchNewArray(newArray, myArray[i]) == true) {
                    newArray[count] = myArray[i];
                    count += 1;
                    abc=true;
                }
            }
        }
        for(int l =0; l<=count;l++){
            System.out.print(" "+newArray[l]+" ");
        }
        System.out.println();

    }

    public boolean searchNewArray(int[] newArray, int searchNum) {
        if(abc==false) {
            return true;
        } else {
            for (int k = 0; k < newArray.length; k++) {
                if (newArray[k] == searchNum) {
                    return false;
                }
            }
            return true;
        }
    }
}

