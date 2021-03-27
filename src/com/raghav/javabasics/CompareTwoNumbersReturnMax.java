package com.raghav.javabasics;
//Given two numbers, write a program to compare the numbers and return the max among them.

public class CompareTwoNumbersReturnMax {
    public static void main(String args[]){
        CompareTwoNumbersReturnMax max =new CompareTwoNumbersReturnMax();
        System.out.println(max.findMax(5, 10));
        System.out.println(max.findMax(0,2));
    }

    public int findMax(int num1, int num2){
        if(num1>num2)
            return num1;
        else
            return num2;
    }
}
