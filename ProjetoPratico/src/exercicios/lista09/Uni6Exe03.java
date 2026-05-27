package exercicios.lista09;

import java.util.Scanner;

/**
 * Uni6Exe03.java - Lê duas matrizes 3x3 inteiras, calcula o produto matricial
 * e exibe as três matrizes.
 */
public class Uni6Exe03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Matriz A:");
        int[][] matrizA = lerMatriz();
        System.out.println("Matriz B:");
        int[][] matrizB = lerMatriz();

        int[][] matrizC = multiplicar(matrizA, matrizB);

        System.out.println("Matriz A:");
        exibirMatriz(matrizA);
        System.out.println("Matriz B:");
        exibirMatriz(matrizB);
        System.out.println("Resultado A x B:");
        exibirMatriz(matrizC);
    }

    static int[][] lerMatriz() {
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static int[][] multiplicar(int[][] a, int[][] b) {
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }

    static void exibirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("  |");
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf(" %4d", m[i][j]);
            }
            System.out.println(" |");
        }
    }
}
