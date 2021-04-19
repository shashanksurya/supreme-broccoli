package com.raghav.javabasics.day9;
// Write a java program to check whether two given strings are anagram.
import java.util.Hashtable;

public class CheckStringsAreAnagram {
    public static void main(String args[]){
        CheckStringsAreAnagram result = new CheckStringsAreAnagram();
        System.out.println(result.checkAnagram("abadddaccc", "accacbddda"));
    }

    private boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return false;
        }
        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for(int i = 0; i < str1.length(); i++){
            if(hashtable.containsKey(str1.charAt(i))){
                hashtable.put(str1.charAt(i), hashtable.get(str1.charAt(i)) + 1);
            }
            else{
                hashtable.put(str1.charAt(i), 1);
            }
        }
        for(int i = 0; i < str2.length(); i++) {
            if (!hashtable.containsKey(str2.charAt(i))) {
                return false;
            }
            else if (hashtable.containsKey(str2.charAt(i))) {
                if (hashtable.get(str2.charAt(i)) >= 1) {
                    hashtable.put(str2.charAt(i), hashtable.get(str2.charAt(i)) - 1);
                }
            }
        }
        for(Character character : hashtable.keySet()){
            if(hashtable.get(character) != 0){
                return false;
            }
        }
        return true;
    }
}

