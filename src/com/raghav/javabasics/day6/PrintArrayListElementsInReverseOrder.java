package com.raghav.javabasics.day6;
import java.util.Arrays;
import java.util.List;
//Write a program to iterate over the ArrayList and print all the elements in reverse order.

public class PrintArrayListElementsInReverseOrder {
    public static void main(String args[]){
        PrintArrayListElementsInReverseOrder result =new PrintArrayListElementsInReverseOrder();
        result.printInReverseOrder(Arrays.asList(new String[]{"Hello","beautipool","world"}));
        result.printInReverseOrder(Arrays.asList(new String[]{}));
        result.printInReverseOrder(Arrays.asList(new String[]{null}));
        result.printInReverseOrder(Arrays.asList(new String[]{"Hello"}));

    }

    private void printInReverseOrder(List<String> arrList) {
        if (arrList == null || arrList.size() == 0 ) {
            System.out.println("Array is Empty/Null");
            return;
        }
        for(int i= arrList.size()-1; i>=0;i--){
            System.out.println(arrList.get(i));
        }
    }
}
