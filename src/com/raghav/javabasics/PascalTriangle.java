package com.raghav.javabasics;

class PascalTriangle {
    public static void main (String[] args) {
       PascalTriangle result = new PascalTriangle();
        result.printPascalTriangle(5);
        result.printPascalTriangle(8);
    }

    public static void printPascalTriangle(int rows)
    {
        int[][] arr = new int[rows][rows];

        for (int line = 0; line < rows; line++){
            for(int j = 0; j < rows-line; j++){
                System.out.print(" ");
            }
            for (int i = 0; i <= line; i++){
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];

                System.out.print(" ");
                System.out.print(arr[line][i]);
            }
            System.out.println("");


        }
    }
} 