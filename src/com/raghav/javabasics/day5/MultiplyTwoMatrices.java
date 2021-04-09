package com.raghav.javabasics.day5;
// Write a java program to multiply two matrices.
public class MultiplyTwoMatrices {
    public static void main(String args[]) {
        int a[][] = {{0, 3},
                     {1, 1}};
        int b[][] = {{1, 0},
                     {1, 1}};
        MultiplyTwoMatrices result = new MultiplyTwoMatrices();
        result.multiplyMatrices(a, b);
    }

    public void multiplyMatrices(int[][] a, int[][] b) {
        if(a[0].length != 2 || a[1].length!= 2 || b[0].length != 2 || b[1].length != 2) {
            System.out.println("Enter 2 by 2 matrix");
            return;
        }
        int c[][] = new int[2][2];
        for(int i=0; i<b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {//a row
            for (int j = 0; j < b.length; j++) {//b coloumn
                for (int k = 0; k < a.length; k++) {// a coloumn
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}


