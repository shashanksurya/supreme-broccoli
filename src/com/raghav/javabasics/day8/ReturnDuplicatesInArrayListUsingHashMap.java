package com.raghav.javabasics.day8;
// Write a program to return duplicates in an array list using HashMap.
import java.util.*;

public class ReturnDuplicatesInArrayListUsingHashMap {
    public static void main(String args[]){
        ReturnDuplicatesInArrayListUsingHashMap result = new ReturnDuplicatesInArrayListUsingHashMap();
        result.findDuplicatesUsingHashMap(new ArrayList<>(Arrays.asList()));
        result.findDuplicatesUsingHashMap(null);
        result.findDuplicatesUsingHashMap(new ArrayList<>(Arrays.asList(1,2,6,5,1,2)));
    }

    private static void findDuplicatesUsingHashMap(ArrayList<Integer> arrayList){
        if (arrayList == null || arrayList.size() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arrayList){
            if(map.get(value) == null){
                map.put(value, 1);
            }
            else{
                map.put(value, map.get(value) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println("Duplicate Element : " + entry.getKey() + " - count: " + entry.getValue() + " times");
            }
        }
    }
}
