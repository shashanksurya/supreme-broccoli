//Search for an element in a given array and return true if the element is found, else false.
package com.raghav.javabasics;

public class FindElementInArray {
    public static void main(String[] args) {
        FindElementInArray result = new FindElementInArray();
        result.findElement(new int[]{5,-5,6,2,1,99,23}, 99);
    }

    public void findElement(int[] myArray,int findNumSomething){
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == findNumSomething) {
                System.out.println("Element found in the array");
                break;
            }
            else if(i==myArray.length-1)
                System.out.println("Element not found in the array");
        }
    }
}
