package com.raghav.javabasics.day9;

import com.raghav.javabasics.day5.MultiplyTwoMatrices;

public class Multiply2nBynMatrices {
    public static void main(String args[]) {
        int a[][] = {{1,1,1},
                {1,1,1},
                {1,1,1}};
        int b[][] = {{1,1,1},
                {1,1,1},
                {1,1,1}};
        Multiply2nBynMatrices result = new Multiply2nBynMatrices();
        result.multiplyMatrices(a, b);
    }

    public void multiplyMatrices(int[][] a, int[][] b) {
        if(a.length != b[0].length) {
            System.out.println("Cannot multiply the matrices");
            return;
        }
        if(a == null || a.length == 0 || b == null || b.length == 0){
            System.out.println("Array is Null");
            return;
        }
        int c[][] = new int[a.length][b[0].length];

        for (int aRow = 0; aRow < a.length; aRow++) {//a aRow
            for (int bCol = 0; bCol < b.length; bCol++) {//b coloumn
                for (int aCol = 0; aCol < a.length; aCol++) {// a coloumn
                    c[aRow][bCol] = c[aRow][bCol] + (a[aRow][aCol] * b[aCol][bCol]);
                }
            }
        }
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < b[0].length; col++)
                System.out.print(c[row][col] + " ");
            System.out.println();
        }
    }
}
