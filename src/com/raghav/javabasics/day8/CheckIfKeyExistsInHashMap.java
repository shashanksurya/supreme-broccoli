package com.raghav.javabasics.day8;
// Given a HashMap with existing key-value pairs, write a program to check if a given key exists in HashMap or not.
// If key exists, return true and return false if key does not exist in the HashMap.

import java.util.HashMap;
import java.util.Map;

public class CheckIfKeyExistsInHashMap {
    public static void main(String args[]) {
        CheckIfKeyExistsInHashMap hMapObj = new CheckIfKeyExistsInHashMap();
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "One");
        hMap.put(2, "Two");
        hMap.put(3, "Three");
        hMap.put(4, "Four");
        hMap.put(5, "Five");
        System.out.println(hMapObj.checkIfKeyExists(hMap, 6));
        System.out.println(hMapObj.checkIfKeyExists(hMap, 4));
    }

    private boolean checkIfKeyExists(Map<Integer, String> hMap, int key) {
        return hMap.containsKey(key);
    }
}
