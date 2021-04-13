package com.raghav.javabasics.day2_3;
import java.util.Arrays;

public class SortIntegerArray {
    public static void main(String[] args) {
        SortIntegerArray result = new SortIntegerArray();
        result.sortIntegerArray(new int[]{5,-5,6,2,1,99,23});
        result.sortIntegerArray(new int[]{});
    }
    /**
     * this method sorts an array
     * @param myArray input arrayof int values
     */
        public void sortIntegerArray(int[] myArray){
        int[] newArray=myArray;
        for (int i = 0; i < myArray.length; i++) {
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[i] >= myArray[j]){
                    int swapValue;
                    swapValue = myArray[i];
                    newArray[i] = myArray[j];
                    newArray[j] = swapValue;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        }
}

