package com.raghav.javabasics.day8;
// Write a program to add/remove elements from Hashtable.
import java.util.Hashtable;

public class AddRemoveElementsHashTable {
    public static void main(String args[]){
        AddRemoveElementsHashTable result = new AddRemoveElementsHashTable();
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);
        hashtable.put("Five", 5);

        hashtable.remove("Three",3);
        System.out.println(hashtable);
    }
}
