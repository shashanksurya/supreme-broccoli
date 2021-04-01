package com.raghav.javabasics;
//Given two numbers, write a program to compare the numbers and return the max among them.

public class CompareTwoNumbersReturnMax {
    public static void main(String args[]){
        CompareTwoNumbersReturnMax max =new CompareTwoNumbersReturnMax();
        max.findMax(-5, -10);
        max.findMax(-5, 10);
        max.findMax(5, 5);
        max.findMax(10, 50);
        max.findMax(0, 40);
    }

    public void findMax(int num1, int num2){
        if(num1==num2)
            System.out.println("Both are equal");
            else if (num1 > num2)
                System.out.println(num1 + " is greater");
            else
                System.out.println(num2+" is greater");
    }
}
