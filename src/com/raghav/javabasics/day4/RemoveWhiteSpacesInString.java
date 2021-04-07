package com.raghav.javabasics.day4;
//Write a java program to remove all the white-spaces in the String.

public class RemoveWhiteSpacesInString {
    public static void main(String args[]){
        RemoveWhiteSpacesInString result = new RemoveWhiteSpacesInString();
        result.removeSpaces("Write a java program, to remove all the white-spaces in the String");
        result.removeSpaces("");
        result.removeSpaces(null);

    }
    public void removeSpaces(String str){
        if(str==null || str.length()==0){
            System.out.println("Array is Empty/Null");
            return;
        }
        char[] finalArray = new char[str.length()];
        int count =0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)!=' '){
                finalArray[count] = str.charAt(i);
                count+=1;
            }
        }
        for(int i=0; i<count; i++){
            System.out.print(finalArray[i]+" ");
        }
    }
}
