/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

/**
 *
 * @author Guillermo
 */
public class matrices { 
    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int filasA = A.length;
        int columnasA = A[0].length;
        int columnasB = B[0].length;

        int[][] C = new int[filasA][columnasB];

        // Multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {

                    C[i][j] += A[i][k] * B[k][j];

                }
            }
        }

        // Mostrar matriz C
        System.out.println("Matriz resultante C:");

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    

