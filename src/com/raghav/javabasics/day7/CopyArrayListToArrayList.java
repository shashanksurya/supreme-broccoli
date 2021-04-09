package com.raghav.javabasics.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a program to copy elements of one ArrayList to another ArrayList.
public class CopyArrayListToArrayList {
    public static void main(String args[]) {
        CopyArrayListToArrayList result = new CopyArrayListToArrayList();
        result.copyArrayList(Arrays.asList(new Integer[]{3, 62, 2, 5, 3, 7, 8, 34, 0}));
        result.copyArrayList(Arrays.asList(new Integer[]{}));
    }

    private void copyArrayList(List<Integer> arrList) {
        if (arrList == null || arrList.size() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        ArrayList<Integer> arraylist = new ArrayList<>(arrList);
        for (int i: arraylist) {
            System.out.print(i+" ");
        }
    }
}
