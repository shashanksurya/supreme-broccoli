package com.raghav.javabasics;
// words, char, lines

public class Counter {

    public static void main(String[] args) {
        Counter cnt = new Counter();
        cnt.wordsCharLines("");
//        cnt.wordsCharLines("");
//        cnt.wordsCharLines(null);
//        cnt.wordsCharLines("\n !@#$% !@#$%\n");
//        cnt.wordsCharLines("Change an Array\n" +
//                "new\n" +
//                "out\n" +
//                "Element\n");
        cnt.wordsCharLines("raghav!!4334 ram");

    }
    public boolean isLetter(char c){
        int asciiValue= (int)c;
        if((asciiValue >= 97 && asciiValue <= 122) || (asciiValue >= 65 && asciiValue <=90)){
            return true;
        }
        return false;
    }
// 2 pointer technique
    public int words1(String paragraph) {
        int wordCount =0;
        if(isLetter(paragraph.charAt(0))){
            wordCount+=1;
        }
        for (int i=1; i<paragraph.length();i++){
            if(paragraph.charAt(i-1)==' ' && isLetter(paragraph.charAt(i))){
                wordCount+=1;
            }
        }

        return wordCount;
    }
        private void wordsCharLines(String paragraph) {
        if (paragraph == null || paragraph.length() == 0) {
            System.out.println("String is empty/null");
        } else {
            int[] result = new int[3];
            result[0] = words1(paragraph);
            result[1] = characters(paragraph);
            result[2] = lines(paragraph);
            for (int i = 0; i < result.length; i++)
                System.out.println(result[i]);
        }
    }

    private int lines(String paragraph) {
        int lineCount = 1;
        for (int i = 0; i < paragraph.length() - 2; i++) {
            char c = paragraph.charAt(i);
            if (c == '\n') {
                lineCount = lineCount + 1;
            }
        }
        return lineCount;
    }

    private int characters(String paragraph) {
        int charCount = 0;
        for (int i = 0; i < paragraph.length(); i++) {

            char c = paragraph.charAt(i);
            charCount = charCount + 1;
        }
        return charCount;
    }

    public int words(String paragraph) {
        int length= paragraph.length();
        int wordCount = 0;
        if(length==1 ) {
            if(paragraph.charAt(0) == ' ' || paragraph.charAt(0) == '\n' || paragraph.charAt(0) == ',' || paragraph.charAt(0) == '.' || paragraph.charAt(0) =='!' )
                return 0;
        }
        else {
            for (int i = 0; i < paragraph.length(); i++) {

                char c = paragraph.charAt(i);
                if (i >= 1) {
                    char d = paragraph.charAt(i - 1);
                    if (c == ' ' || c == '\n' || c == ',' || c == '.' || c == '!') {
                        if (d == ' ' || d == '\n' || d == ',' || d == '.' || d == '!') {
                            wordCount = wordCount + 0;
                        }
                        else {
                            wordCount = wordCount + 1;
                        }
                    }
                }
            }
        }
        return wordCount;
    }
}
