package com.raghav.javabasics.day8;

import java.util.Hashtable;

public class ReturnIndicesAddToTarget {
    public static void main(String args[]) {
        ReturnIndicesAddToTarget result = new ReturnIndicesAddToTarget();
        int[] array = result.checkNumsThatAddUpToTarget(new int[]{1,2,3,3,4,3,3,4,6,7,8}, 10);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public int[] checkNumsThatAddUpToTarget(int[] arr, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int i = 0; i < arr.length; i++){
            if(hashtable.containsKey(arr[i]) && hashtable.get(arr[i]) >= 1){
                hashtable.put(arr[i], hashtable.get(arr[i]) + 1);
            }
            else{
                hashtable.put(arr[i], 1);
            }
        }
        int[] returnArr = new int[2];
        for(Integer key : hashtable.keySet()){
            int x = target - key;
            if (hashtable.containsKey(x)) {
                if((2 * x) == target && hashtable.get(key) > 1){
                    returnArr[0] = x;
                    returnArr[1] = x;
                    return returnArr;
                }
                else{
                    returnArr[0] = key;
                    returnArr[1] = x;
                    break;
                }
            }
        }
        return returnArr;
    }
}
