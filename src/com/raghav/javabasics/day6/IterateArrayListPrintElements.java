package com.raghav.javabasics.day6;
// Write a program to iterate over the ArrayList and print all the elements in it.

import java.util.Arrays;
import java.util.List;

public class IterateArrayListPrintElements {
    public static void main(String args[]){
        IterateArrayListPrintElements result = new IterateArrayListPrintElements();
        result.iterateArrayList(Arrays.asList(new String[]{"program", "to", "iterate", "over", "the", "ArrayList"}));
        result.iterateArrayList(Arrays.asList(new String[]{}));
        result.iterateArrayList(Arrays.asList(new String[]{null}));
    }

    private void iterateArrayList(List<String> arrList) {
        if (arrList == null || arrList.size() == 0 ) {
            System.out.println("Array is Empty/Null");
            return;
        }
        for(int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }

}
