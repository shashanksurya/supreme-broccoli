package com.raghav.javabasics.day7;
import java.util.*;

// Write a program to compare elements of two ArrayLists and Return the non-common elements.

public class CompareReturnNonCommonElementsArrayList {
    public static void main(String args[]) {
        CompareReturnNonCommonElementsArrayList result = new CompareReturnNonCommonElementsArrayList();
        result.compareNonCommonElementsArrayList(Arrays.asList(new Integer[]{10, 2}),
                Arrays.asList(new Integer[]{1, 2, 5, 4}));
        result.compareNonCommonElementsArrayList(Arrays.asList(new Integer[]{}), Arrays.asList(new Integer[]{1, 2, 3}));
    }

    private void compareNonCommonElementsArrayList(List<Integer> arrList1, List<Integer> arrList2) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (Integer integer : arrList1) {
            if (!arrList2.contains(integer)) {
                arraylist.add(integer);
            }
        }
        for (Integer integer : arrList2) {
            if (!arrList1.contains(integer)) {
                arraylist.add(integer);
            }
        }
        for (int i : arraylist) {
            System.out.print(i + " ");
        }
    }
}
