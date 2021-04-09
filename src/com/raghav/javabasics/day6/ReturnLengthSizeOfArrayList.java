package com.raghav.javabasics.day6;
// Write a program to return the length and size of an ArrayList.
import java.util.Arrays;
import java.util.List;

public class ReturnLengthSizeOfArrayList {
    public static void main(String args[]){
        ReturnLengthSizeOfArrayList result = new ReturnLengthSizeOfArrayList();
        result.findLengthSize(Arrays.asList(new String[]{"hello", "world", "this", "is", "an", "ArrayList"}));
        result.findLengthSize(Arrays.asList(new String[]{}));
        result.findLengthSize(Arrays.asList(new String[]{null}));
    }

    private void findLengthSize(List<String> arrList) {
        System.out.println("Length/size of arrayList is: "+ arrList.size());
    }
}
