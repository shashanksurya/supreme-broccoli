package com.raghav.javabasics.day4;
//Write a java program to find factorial of a given number.

public class FindFactorialOfNumber {
    public  static void main(String args[]){
        FindFactorialOfNumber result = new FindFactorialOfNumber();
        result.findFactorial(40);
        result.findFactorial(0);
        result.findFactorial(10);
        result.findFactorial(-10);
        result.findFactorial(1);
    }

    public void findFactorial(int factNum) {
        long num =1 ;
        if (factNum > 0 && factNum <40) {
            for(int i =1; i<=factNum;i++){
                num = num*i;
            }
            System.out.println(num);
        }
        else{
            System.out.println("Enter integerS between 1 - 40");
        }
    }
}
