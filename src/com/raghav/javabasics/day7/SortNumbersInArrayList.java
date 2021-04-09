package com.raghav.javabasics.day7;
// Write a program to sort the numbers in the ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortNumbersInArrayList {
    public static void main(String args[]){
        SortNumbersInArrayList result = new SortNumbersInArrayList();
        result.sortArrayList(Arrays.asList(new Integer[]{3,62,2,5,3,7,8,34,0}));
        result.sortArrayList(Arrays.asList(new Integer[]{}));
    }

    private void sortArrayList(List<Integer> arrList) {
        if (arrList == null || arrList.size() == 0 ) {
            System.out.println("Array is Empty/Null");
            return;
        }
        ArrayList<Integer> arraylist = new ArrayList<>(arrList);
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {
                    int tmp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, tmp);
                }
            }
        }
        for (int i: arraylist) {
            System.out.print(i+" ");
        }
    }
}
