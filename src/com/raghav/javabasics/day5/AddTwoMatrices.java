package com.raghav.javabasics.day5;
// Write a java program to add two matrices.

public class AddTwoMatrices {
    public static void main(String args[]){
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{1, 20}, {3, 4}};
        AddTwoMatrices result= new AddTwoMatrices();
        result.addMatrices(a, b);

    }
    public void addMatrices(int[][]a, int[][]b){
        if(a[0].length != 2 || a[1].length!= 2 || b[0].length != 2 || b[1].length != 2) {
            System.out.println("Enter 2 by 2 matrix");
            return;
        }
        int c[][] = new int[2][2];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
