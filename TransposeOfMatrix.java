package com.tahirkaplan98;

import java.util.Random;
import java.util.Scanner;

public class TransposeOfMatrix {

    static int matrix[][];
    static int matrixT[][];
    static int i,j;

    static Scanner scanner;
    static Random random;

    public static void main(String[] args) {

        System.out.print("Enter the row and the column number of matrix: ");

        scanner = new Scanner(System.in);
        i = scanner.nextInt();
        j = scanner.nextInt();

        matrix = new int[i][j];

        random = new Random();

        for (int x=0;x<i;x++){

            for (int y=0;y<j;y++){

                matrix[x][y] = random.nextInt(10);
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();

        }

        matrixT = new int[j][i];

        System.out.println();

        for (int x=0;x<j;x++){

            for (int y=0;y<i;y++){
                matrixT[x][y] = matrix[y][x];
                System.out.print(matrixT[x][y]+" ");
            }
            System.out.println();
        }
    }
}
