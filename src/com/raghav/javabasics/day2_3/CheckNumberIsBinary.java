package com.raghav.javabasics.day2_3;
// Write a java program to check whether given number is binary or not. A binary number is a number which contains only 0 or 1.

public class CheckNumberIsBinary {

    public static void main(String args[]) {
        CheckNumberIsBinary binary = new CheckNumberIsBinary();
        binary.isBinary(10101011);
        binary.isBinary(2545);
        binary.isBinary(-10101011);
        binary.isBinary(1);
        binary.isBinary(0);
    }

    public void isBinary(long num1){
        String s = String.valueOf(num1);
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='0' || s.charAt(i)=='1'){
                count = count+1;
            }
            else {
                System.out.println("not binary");
                break;
            }
        }
        if(count==s.length())
        System.out.println("binary");
    }
}
