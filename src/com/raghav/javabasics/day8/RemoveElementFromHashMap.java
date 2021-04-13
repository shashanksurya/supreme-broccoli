package com.raghav.javabasics.day8;
// Write a program to remove a specific key-value pair from a HashMap.
import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromHashMap {
    public static void main(String args[]){
        Map<String, Integer> hMap = new HashMap<>();
        hMap.put("One", 1);
        hMap.put("Two", 2);
        hMap.put("Three", 3);
        hMap.put("Four", 4);
        hMap.put("Five", 5);

        hMap.remove("Three",4);
        System.out.println(hMap);

    }
}
