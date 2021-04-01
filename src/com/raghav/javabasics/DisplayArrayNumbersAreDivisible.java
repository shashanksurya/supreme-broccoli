package com.raghav.javabasics;
import java.util.Arrays;

//Given an array of numbers, write a program to identify all numbers divisible by 2,
// divisible by 3, divisible by 5, divisible by 7, divisible by 5 and divisible by 7.

public class DisplayArrayNumbersAreDivisible {
    public static void main(String[] args) {

        DisplayArrayNumbersAreDivisible result = new DisplayArrayNumbersAreDivisible();
        result.divisibilityChecker(new int[]{1,2,3,4,5,6,7,8,9,-35});
        result.divisibilityChecker(new int[]{});
        result.divisibilityChecker(new int[]{0});
        result.divisibilityChecker(new int[]{-60, -70,-50});
    }

    public void divisibilityChecker(int[] myArray) {
        int[] divNumArr = {2, 3, 5, 7, 35};
        for (int divNum = 0; divNum < divNumArr.length; divNum++) {
            int[] resultArr = new int[myArray.length];
            int s = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % divNumArr[divNum] == 0) {
                    resultArr[s] = myArray[i];
                    s += 1;
                }
            }

            System.out.println("Array Numbers Divisible by "+divNumArr[divNum]+": "+Arrays.toString(resultArr));
        }
    }
}
