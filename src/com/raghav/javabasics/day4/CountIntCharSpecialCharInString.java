package com.raghav.javabasics.day4;
//Write a program to count number of integers, number of characters and number of special characters.
public class CountIntCharSpecialCharInString {
    public static void main(String[] args) {
        CountIntCharSpecialCharInString result = new CountIntCharSpecialCharInString();
        result.charCount("abcdefghijklmnopqrstuvwxyz0123456789 !@#$%^&*()_+");
        result.charCount("");
        result.charCount(null);
        result.charCount("cccc0000c ");
        result.charCount("ascisa%%%-1");
        result.charCount("abhddabc123*(&");
    }

    public void charCount(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Array is Empty/Null");
            return;
        }
        char[] arr = new char[128];
        int val;
        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i);
            arr[val] += 1;
        }
        count(arr);
    }
    public void count(char[] arr){
        int letterCount=0;
        int numCount=0;
        int specialCount=0;

        for(int i=0; i< arr.length;i++){
            if((i>=65 && i<=90)|| (i>=97 && i<= 122)){
                if(arr[i]==1){
                    letterCount+=1;
                }
                else if(arr[i]>1){
                    letterCount=letterCount+arr[i];
                }
            }
            else if(i>=48 && i<=57){
                if(arr[i]==1){
                    numCount+=1;
                }
                else if(arr[i]>1){
                    numCount=numCount+arr[i];
                }
            }
            else{
                if(arr[i]==1){
                    specialCount+=1;
                }
                else if(arr[i]>1){
                    specialCount=specialCount+arr[i];
                }
            }
        }
        System.out.println("Letter count: "+letterCount+"   Number Count: "+numCount+"   Special Char Count: "+specialCount);
    }
}
