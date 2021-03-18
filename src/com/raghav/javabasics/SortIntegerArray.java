package com.raghav.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created:");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        int[] newArray=myArray;
        for (int i = 0; i < myArray.length; i++) {
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[i] >= myArray[j]){
                    int swapValue;
                    swapValue = myArray[i];
                    newArray[i] = myArray[j];
                    newArray[j] = swapValue;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
// myArray[]=[4,3,2,1]
// myArray[]=[1,2,3,4]
// 4
// 3 4
// 2 4 4
// 1 4 4 4
    //  1 3
    //  1 2 3
    //
