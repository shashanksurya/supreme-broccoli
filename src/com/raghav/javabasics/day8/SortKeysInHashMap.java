package com.raghav.javabasics.day8;
import java.util.*;
// Write a program to sort keys in a HashMap.

public class SortKeysInHashMap {
    public static void main(String args[]){
        SortKeysInHashMap result = new SortKeysInHashMap();
        Map<Integer, Integer> hMap = new HashMap<>();
        Random random = new Random();
        for(int i = 5; i >0 ; i--){
            hMap.put(random.nextInt(100), i+100);
        }
        result.sortElementsInHashMap(hMap);
    }

    private static Map<Integer, Integer> sortElementsInHashMap(Map<Integer, Integer> hMap) {
        int[] arr = new int[hMap.size()];
        int count = 0;
        for(Integer key : hMap.keySet()){
            arr[count] = key;
            count++;
        }
        int[] newArray = arr;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] >= arr[j]){
                    int swapValue;
                    swapValue = arr[i];
                    newArray[i] = arr[j];
                    newArray[j] = swapValue;
                }
            }
        }
        for(int i = 0; i < newArray.length; i++){
            System.out.println("Key: "+newArray[i]+" Value: "+hMap.get(newArray[i]));
        }
            return null;
    }
}
