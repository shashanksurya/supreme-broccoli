package com.raghav.javabasics.day9;
// Given a string, write a program to return the highest occurred character in a String.
import java.util.Hashtable;

public class HighestOccurredCharInString {
    public static void main(String args[]){
        HighestOccurredCharInString result = new HighestOccurredCharInString();
        result.findHighestOccurredChar("aabddb");
    }

    public void findHighestOccurredChar(String str) {
        if (str == null || str.length() == 0) {
            System.out.print("Array is Empty/Null");
            return;
        }
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i< str.length(); i++){
            if(hashtable.containsKey(str.charAt(i))){
                hashtable.put(str.charAt(i), hashtable.get(str.charAt(i)) + 1);
            }
            else{
                hashtable.put(str.charAt(i), 1);
            }
        }
        int count = 0;
        for(Character key : hashtable.keySet()){
            if(hashtable.get(key) >= 1 && hashtable.get(key) >= count){
                count = hashtable.get(key);
            }
        }
        for(Character character : hashtable.keySet()){
            if(hashtable.get(character) == count){
                System.out.print("MAX occurred char is: " + character + " - " + hashtable.get(character) +", ");
            }
        }
    }
}
