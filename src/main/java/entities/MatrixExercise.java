package entities;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = fillMatrix();

        System.out.print("Enter number to find: ");
        int target = sc.nextInt();

        for (int i=0; i<matrix.length;i++) {
            for (int j=0; j<matrix[i].length;j++) {
                if (matrix[i][j] == target) {
                    System.out.printf("Target position: %d,%d\n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d\n", matrix[i][j-1]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.printf("Right: %d\n", matrix[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.printf("Top: %d\n", matrix[i-1][j]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.printf("Bottom: %d\n", matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }

    public static int[][] fillMatrix() {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 10;
        matrix[0][1] = 8;
        matrix[0][2] = 15;
        matrix[0][3] = 12;
        matrix[1][0] = 21;
        matrix[1][1] = 11;
        matrix[1][2] = 23;
        matrix[1][3] = 8;
        matrix[2][0] = 14;
        matrix[2][1] = 5;
        matrix[2][2] = 13;
        matrix[2][3] = 19;

        return matrix;
    }
}
