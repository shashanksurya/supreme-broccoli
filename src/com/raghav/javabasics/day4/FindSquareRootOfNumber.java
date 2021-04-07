package com.raghav.javabasics.day4;

public class FindSquareRootOfNumber {
    public static void main(String args[]) {
        FindSquareRootOfNumber result = new FindSquareRootOfNumber();
        result.findSqrRoot(625);
        result.findSqrRoot(10);
        result.findSqrRoot(0);
        result.findSqrRoot(1);
        result.findSqrRoot(-25);
    }

    public void findSqrRoot(int x) {
        if (x == 0 || x == 1 || x<0) {
            System.out.println("Cant find Square root!!!");
        }
        else{
            int i = 1, result = 1;
            while (result < x){
                i++;
                result = i * i;
            }
            System.out.println(i);
        }

    }
}