package com.raghav.javabasics.day6;
import java.util.ArrayList;
//Write a program to convert an array of String to an ArrayList.

public class ConvertArrayOfStringToArrayList {
    public static void main(String args[]){
        ConvertArrayOfStringToArrayList result = new ConvertArrayOfStringToArrayList();
        result.convertToArrayList(new String[]{"Write", " a", " program", " to"," convert"});
        result.convertToArrayList(null);
        result.convertToArrayList(new String[]{""});
    }

    private void convertToArrayList(String[] str) {
        if (str == null || str.length == 0 ) {
            System.out.println("Array is Empty/Null");
            return;
        }
        ArrayList<String> newStr = new ArrayList();
        for(int i=0; i<str.length;i++){
            newStr.add(i, str[i]);
        }
        for (int i =0; i<str.length;i++) {
            System.out.print(newStr.get(i));
        }
    }
}
