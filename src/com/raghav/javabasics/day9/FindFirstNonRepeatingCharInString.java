package com.raghav.javabasics.day9;
// Given a string, write a program to print the first non-repeating character in the String.
import java.util.Hashtable;

public class FindFirstNonRepeatingCharInString {
    public static void main(String args[]){
        FindFirstNonRepeatingCharInString result = new FindFirstNonRepeatingCharInString();
        char c = result.findFirstNonRepeatingCharInString("raghavrghv");
        if(c != ' '){
            System.out.println(c);
        }
        else{
            System.out.println("No non-repeating char in the string");
        }

    }
    public char findFirstNonRepeatingCharInString(String str){
        if (str == null || str.length() == 0) {
            System.out.print("Array is Empty/Null");
            return ' ';
        }
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i < str.length(); i++){
            if(hashtable.containsKey(str.charAt(i))){
                hashtable.put(str.charAt(i), hashtable.get(str.charAt(i)) + 1);
            }
            else{
                hashtable.put(str.charAt(i), 1);
            }
        }
        for(int i = 0; i < str.length(); i++){
            if(hashtable.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }

        return ' ';
    }
}
