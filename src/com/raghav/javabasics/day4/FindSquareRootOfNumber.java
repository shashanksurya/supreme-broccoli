package com.raghav.javabasics.day4;

public class FindSquareRootOfNumber {
    public static void main(String args[]) {
        FindSquareRootOfNumber result = new FindSquareRootOfNumber();
        result.findSqrRoot(25);
        result.findSqrRoot(10);

    }

    public void findSqrRoot(int x) {
        if (x == 0 || x == 1) {
            System.out.println(x);
        }
        int i = 1, result = 1;
        while (result <= x){
            i++;
            result = i * i;
        }
        System.out.println(i - 1);
    }
}