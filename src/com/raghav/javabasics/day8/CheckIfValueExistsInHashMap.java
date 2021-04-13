package com.raghav.javabasics.day8;
// Given a HashMap with existing key-value pairs, write a program to check if a given value exists in HashMap or not.
// If value exists, return true and return false if value does not exist in the HashMap.

import java.util.HashMap;
import java.util.Map;

public class CheckIfValueExistsInHashMap {
    public static void main(String args[]) {
        CheckIfValueExistsInHashMap hMapObj = new CheckIfValueExistsInHashMap();
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "One");
        hMap.put(2, "Two");
        hMap.put(3, "Three");
        hMap.put(4, "Four");
        hMap.put(5, "Five");
        System.out.println(hMapObj.checkIfValueExists(hMap, "One"));
        System.out.println(hMapObj.checkIfValueExists(hMap, "Three"));
        System.out.println(hMapObj.checkIfValueExists(hMap, "one"));
        System.out.println(hMap.values());
    }

    private boolean checkIfValueExists(Map<Integer, String> hMap, String value) {
        return hMap.containsValue(value);
    }
}
