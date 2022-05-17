package com.forlabs;

public class Lab2 {
    public static void main(String[] args) {
        //1514 - номер залікової книжки

        //Визначаємо константи відповідно до варіанту
        final int C5 = 1514 % 5;
        System.out.println("C5 = " + C5 + " => operation 'A * B'");
        final int C7 = 1514 % 7;
        System.out.println("C7 = " + C7 + " => type 'short'");
        final int C11 = 1514 % 11;
        System.out.println("C11 = " + C11);

        short[][] matrixA = {
                {1, 1, 3},
                {1, 2, 3},
                {1, 1, 3},
        };
        short[][] matrixB = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };

        System.out.println("First matrix:");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[0].length; j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSecond matrix:");
        for (int i = 0; i < matrixB.length; i++){
            for (int j = 0; j < matrixB[0].length; j++){
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        int m = matrixA.length;
        int n = matrixB[0].length;
        int o = matrixB.length;
        short[][] matrixC = new short[m][n];

        //Множення матриць А та В
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < o; k++){
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("\nMatrix C:");
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.format("%5d ", matrixC[i][j]);
            }
            System.out.println();
        }
        //Визначимо суму макс ел-тів в парних стовпцях
        int sum_max = 0;
        for (int j = 1; j < matrixC[0].length; j += 2){
            int max = matrixC[0][j];
            for (int i = 1; i < matrixC.length; i++){
                if (matrixC[i][j] > max){
                    max = matrixC[i][j];
                }
            }
            System.out.println(max);
            sum_max += max;
        }
        System.out.println("Sum of the max el in even columns: " + sum_max);

        //Визначимо суму мін ел-тів в непарних стовпцях
        int sum_min = 0;
        for (int j = 0; j < matrixC[0].length; j += 2){
            int min = matrixC[0][j];
            for (int i = 1; i < matrixC.length; i++){
                if (matrixC[i][j] < min){
                    min = matrixC[i][j];
                }
            }
            System.out.println(min);
            sum_min += min;
        }
        System.out.println("Sum of the min el in odd columns: " + sum_min);
    }
}
