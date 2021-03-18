//Search for an element in a given array and return true if the element is found, else false.
package com.raghav.javabasics;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
//        FindElementInArray m = new FindElementInArray();
        System.out.println("Enter integer: ");

        Scanner myInput = new Scanner(System.in);
        int a = myInput.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == a) {
                System.out.println("Element found in the array");
            }
            else if(i==myArray.length-1)
                System.out.println("Element not found in the array");

        }
    }
}


//take array input from user
//compare each element in array with given element