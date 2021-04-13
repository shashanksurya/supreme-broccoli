package com.raghav.javabasics.day8;
// Write a program to remove all duplicate elements in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class RemoveAllDuplicatesInHashMap {
    public static void main(String args[]){
    RemoveAllDuplicatesInHashMap result = new RemoveAllDuplicatesInHashMap();
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap.put(1,1);
        hMap.put(2,2);
        hMap.put(3,2);
        hMap.put(4,44);
        hMap.put(5,55);
        hMap.put(6,66);
        hMap.put(7,66);
        result.removeDuplicatesHashMap(hMap);
    }
    public void removeDuplicatesHashMap(Map<Integer, Integer> hMap){
        Map<Integer, Integer> newMap = new HashMap<>();
        for(Integer key : hMap.keySet()){
            newMap.put(hMap.get(key), 0);
        }
        for(Integer key : newMap.keySet()){
            System.out.println(key);
        }
    }
}
