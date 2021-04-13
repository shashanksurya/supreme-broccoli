package com.raghav.javabasics.day7;
import java.util.*;

// Write a program to compare elements of two ArrayLists and Return the common elements.

public class CompareReturnCommonElementsArrayList {
    public static void main(String args[]) {
        CompareReturnCommonElementsArrayList result = new CompareReturnCommonElementsArrayList();
        result.compareCommonElementsArrayList(Arrays.asList(new Integer[]{10,2, 3,4,34}),
                Arrays.asList(new Integer[]{1, 2, 5, 4, 3, 2, 1, 4}));
        result.compareCommonElementsArrayList(Arrays.asList(new Integer[]{}), Arrays.asList(new Integer[]{1, 2}));
    }

    private void compareCommonElementsArrayList(List<Integer> arrList1, List<Integer> arrList2) {
        if (arrList1 == null || arrList1.size() == 0 || arrList2 == null || arrList2.size() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int i = 0; i < arrList1.size(); i++) {
            if (arrList2.contains(arrList1.get(i))) {
                arraylist.add(arrList1.get(i));
            }
        }
        for (int i : arraylist) {
            System.out.print(i + " ");
        }
    }
}
