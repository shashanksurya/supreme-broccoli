package com.raghav.javabasics.day4;
//Given a string, write a program to print the duplicate characters in the String.

public class PrintDuplicateCharInString {
    boolean abc= false;
    public static void main(String[] args) {
        PrintDuplicateCharInString result = new PrintDuplicateCharInString();
        result.findDuplicates("ryali venkata sai raghava ram");
    }
    public void findDuplicates(String str) {
        if(str==null || str.length()==0){
            System.out.println("Array is Empty/Null");
            return;
        }
        char[] newArray = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && searchNewArray(newArray, str.charAt(i)) == true) {
                    newArray[count] = str.charAt(i);
                    count += 1;
                    abc=true;
                }
            }
        }
        for(int l =0; l<=count;l++){
            System.out.print("["+newArray[l]+"]");
        }

    }

    public boolean searchNewArray(char[] newArray, char searchNum) {
        if(abc==false) {
            return true;
        } else {
            for (int k = 0; k < newArray.length; k++) {
                if (newArray[k] == searchNum) {
                    return false;
                }
            }
            return true;
        }
    }
}
