package com.raghav.javabasics.day5;

public class CountVowelsInString {
    public static void main(String args[]) {
        CountVowelsInString result = new CountVowelsInString();
        result.vowelCount("CountVowelsInString");
        result.vowelCount("abcdcbaesa");
        result.vowelCount("AEIOUaeiou");
        result.vowelCount("!@#45");
        result.vowelCount("");
        result.vowelCount(null);
    }

    private void vowelCount(String str) {
        if(str == null || str.length() == 0){
            System.out.println("Array is Empty/Null");
            return;
        }
        int count = 0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) =='e' ||str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u' ||
                    str.charAt(i) == 'A' || str.charAt(i) =='E' ||str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U'){
                count += 1;
            }
        }
        System.out.println("Number of vowels are: "+ count);
    }
}
