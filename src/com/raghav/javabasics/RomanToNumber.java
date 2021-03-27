package com.raghav.javabasics;

public class RomanToNumber{
    public static void main(String args[])
    {
        RomanToNumber rn = new RomanToNumber();
        System.out.println("Integer form of Roman Numeral is: "+ rn.romanToDecimal("VXIII"));
        System.out.println("Integer form of Roman Numeral is: "+ rn.romanToDecimal("v"));

    }

    int romanValue(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            int s1 = romanValue(str.charAt(i));
            if (i + 1 < str.length()){
                int s2 = romanValue(str.charAt(i + 1));
                if (s1 >= s2){
                    result = result + s1;
                }
                else{
                    result = result + s2 - s1;
                    i++;
                }
            }
            else{
                result = result + s1;
            }
        }
        return result;
    }
}