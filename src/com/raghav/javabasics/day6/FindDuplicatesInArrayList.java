package com.raghav.javabasics.day6;
// Write a program to identify duplicates in the ArrayList.
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInArrayList {
    public static void main(String args[]){
        FindDuplicatesInArrayList result = new FindDuplicatesInArrayList();
        result.findDuplicatesInArrayList(Arrays.asList(new String[]{"world","Hello","world","Hello", "world"}));
    }
    public void findDuplicatesInArrayList(List arrList){
        if (arrList == null || arrList.size() == 0 ) {
            System.out.println("Array is Empty/Null");
            return;
        }
        for(int i = 0; i < arrList.size(); i++){
            for(int j = i + 1; j < arrList.size(); j++){
                if(arrList.get(i).equals(arrList.get(j))){
                    System.out.println(arrList.get(i));
                }
            }
        }
    }
}
