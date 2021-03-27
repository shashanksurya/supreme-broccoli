package com.raghav.javabasics;
// words, char, lines

public class Counter {
    public static void main(String[] args) {
      String paragraph = "Change an Array\n" +
              "new\n" +
              "out\n" +
              "Element";
      Counter cnt = new Counter();
     int[] temp =  cnt.wordsCharLines(paragraph);
        System.out.println(paragraph);

        for (int i=0;i<temp.length;i++)
        System.out.println(temp[i]);
    }
    public int words(String paragraph){
        int wordCount=1;
        for(int i=0;i<paragraph.length();i++){

            char c = paragraph.charAt(i);
            if(c == ' ' || c == '\n'){
                wordCount = wordCount+1;
            }
        }
        return wordCount;
    }
    public int characters(String paragraph){
        int charCount=0;
        for(int i=0;i<paragraph.length();i++){

            char c = paragraph.charAt(i);
            charCount = charCount+1;
        }
        return charCount;
    }
    public int lines(String paragraph){
        int lineCount=1;
        for(int i=0;i<paragraph.length();i++){
            char c = paragraph.charAt(i);
            if(c == '\n'){
                lineCount = lineCount+1;
            }
        }
        return lineCount;
    }
    public int[] wordsCharLines(String paragraph){
        int[] result= new int[3];
        result[0]=words(paragraph);
        result[1]=characters(paragraph);
        result[2]=lines(paragraph);
        System.out.println("Hello");
    return result;
    }
}
