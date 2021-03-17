package com.raghav.javabasics;
import java.util.Scanner;

class PascalTriangle {
    public static void main (String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        printPascalTriangle(rows);
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