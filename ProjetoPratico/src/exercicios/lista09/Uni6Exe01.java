package exercicios.lista09;

import java.util.Scanner;

/**
 * Uni6Exe01.java - Lê valores inteiros para preencher uma matriz 4x4.
 * Escreve os valores da diagonal principal e a soma desses valores.
 */
public class Uni6Exe01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = lerMatriz();
        exibirDiagonal(matriz);
        int soma = somarDiagonal(matriz);
        System.out.println("Soma da diagonal principal: " + soma);
    }

    static int[][] lerMatriz() {
        int[][] m = new int[4][4];
        System.out.println("Informe os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("  Posicao [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static void exibirDiagonal(int[][] m) {
        System.out.println("Diagonal principal:");
        for (int i = 0; i < m.length; i++) {
            System.out.println("  [" + i + "][" + i + "] = " + m[i][i]);
        }
    }

    static int somarDiagonal(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][i];
        }
        return soma;
    }
}
