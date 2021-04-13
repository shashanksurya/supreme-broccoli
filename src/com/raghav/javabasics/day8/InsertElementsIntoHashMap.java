package com.raghav.javabasics.day8;

import java.util.HashMap;
import java.util.Map;

// Write a program to insert elements from HashMap.
public class InsertElementsIntoHashMap {
    public static  void main(String args[]){

        // Creating a HashMap
        Map<String, Integer> hMap = new HashMap<>();

        // Adding key-value pairs to a HashMap
        hMap.put("one", 1);
        hMap.put("two", 2);
        hMap.put("three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        hMap.putIfAbsent("four", 4);
        hMap.putIfAbsent("Three", 3);
        System.out.println(hMap);
    }
}
