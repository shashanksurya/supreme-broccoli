package com.raghav.javabasics.day8;
// Write a program to identify duplicate words in an array of Strings using Hashtable.

import java.util.Hashtable;

public class FindDuplicateWordsHashTable {
    public static void main(String args[]){
        FindDuplicateWordsHashTable result = new FindDuplicateWordsHashTable();
        result.findDuplicateWords(new String[]{});
        result.findDuplicateWords(new String[]{"hi", "hello"});
        result.findDuplicateWords(new String[]{"11", "11"});

        result.findDuplicateWords(new String[]{"I", "felt", "happy", "because", "I", "saw", "the", "others", "were"," happy", "and",
                "because", "I", "knew", "I", "should", "feel", "happy", "but", "I", "wasn’t", "really", "happy"});
    }
    public void findDuplicateWords(String[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i < arr.length; i++){
            if(hashtable.containsKey(arr[i]) && hashtable.get(arr[i]) >= 1){
                hashtable.put(arr[i], hashtable.get(arr[i]) +1);
            }
            else{
                hashtable.put(arr[i], 1);
            }
        }
        boolean duplicateFlag = false;
        for(String key : hashtable.keySet()){
            if(hashtable.get(key) > 1){
                duplicateFlag = true;
                System.out.print(key + " ");
            }
        }
        if(!duplicateFlag){
            System.out.println("No duplicates");
        }
    }
}
