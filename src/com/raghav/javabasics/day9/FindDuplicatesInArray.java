package com.raghav.javabasics.day9;
// Given an array of numbers, write a program to find the duplicates.
import java.util.Hashtable;

public class FindDuplicatesInArray {
    public static void main(String args[]){
        FindDuplicatesInArray result = new FindDuplicatesInArray();
        result.findDuplicates(new int[]{1,2,1,2,3,5});
    }

    public void findDuplicates(int[] arr) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i< arr.length; i++){
            if(hashtable.containsKey(arr[i])){
                hashtable.put(arr[i], hashtable.get(arr[i]) + 1);
            }
            else{
                hashtable.put(arr[i], 1);
            }
        }
        for(Integer key : hashtable.keySet()){
            if(hashtable.get(key) > 1){
                System.out.print(key + " ");
            }
        }
    }
}
