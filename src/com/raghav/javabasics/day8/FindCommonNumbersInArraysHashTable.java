package com.raghav.javabasics.day8;

import java.util.ArrayList;
import java.util.Hashtable;

// Find out if two different arrays of numbers have the common numbers. Hint: Using Hashtable.
public class FindCommonNumbersInArraysHashTable {
    public static void main(String args[]){
        FindCommonNumbersInArraysHashTable result = new FindCommonNumbersInArraysHashTable();
        result.findCommonNumbers(new int[]{}, new int[]{3,2,3,7,8,9,4,4,5,6,7});
        result.findCommonNumbers(new int[]{}, new int[]{});
        result.findCommonNumbers(new int[]{1,2,3,4,5,6}, new int[]{3,2,3,7,8,9, 4,4,5,6,7});

    }
    public void findCommonNumbers(int[] arr1, int[] arr2){
        if ((arr1 == null || arr2 == null) || (arr1.length == 0 && arr2.length == 0)) {
            System.out.println("Array is Empty/Null");
            return;
        }
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i < arr1.length; i++){
            hashtable.put(arr1[i], i);
        }
        ArrayList<Integer> resultArrList = new ArrayList();

        for(int i = 0; i < arr2.length; i++){
            if(hashtable.containsKey(arr2[i]) && !resultArrList.contains(arr2[i])){
                resultArrList.add(arr2[i]);
            }
        }
        for(int i=0; i<resultArrList.size(); i++){
            System.out.print(resultArrList.get(i) + " ");
        }
    }
}
