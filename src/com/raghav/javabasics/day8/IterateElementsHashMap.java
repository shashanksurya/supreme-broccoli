package com.raghav.javabasics.day8;
// Write a program to iterate over and print all the elements in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class IterateElementsHashMap {
    public static void main(String args[]){
        IterateElementsHashMap result = new IterateElementsHashMap();
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap.put(1,1);
        hMap.put(21,22);
        hMap.put(77,33);
        hMap.put(42,44);
        hMap.put(555,55);
        hMap.put(6,66);
        result.iterateAndPrintHashMap(hMap);
    }

    private void iterateAndPrintHashMap(Map<Integer, Integer> hMap) {
        for(Map.Entry<Integer, Integer> entry : hMap.entrySet()){
            System.out.println("Key = "+ entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
