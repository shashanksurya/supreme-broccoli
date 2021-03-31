package com.raghav.javabasics;
// words, char, lines

public class Counter {

    public static void main(String[] args) {
        Counter cnt = new Counter();
        cnt.wordsCharLines("hi my name is chaitu");
        cnt.wordsCharLines("");
        cnt.wordsCharLines(null);
        cnt.wordsCharLines("this,is.also.a.sentence");
        cnt.wordsCharLines("\n !@#$% !@#$%\n");
        cnt.wordsCharLines("Change an Array\n" +
                "new\n" +
                "out\n" +
                "Element");
    }

    public int words(String paragraph){
        int wordCount=1;
        for(int i=0;i<paragraph.length();i++){
            char c = paragraph.charAt(i);
            if(c == ' ' || c == '\n'|| c == ','|| c == '.'){
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
    public void wordsCharLines(String paragraph){
        if(paragraph==null || paragraph.length()==0){
            System.out.println("String is empty/null");
        }
        else {
            int[] result = new int[3];
            result[0] = words(paragraph);
            result[1] = characters(paragraph);
            result[2] = lines(paragraph);
            for (int i = 0; i < result.length; i++)
                System.out.println(result[i]);        }
    }
}
