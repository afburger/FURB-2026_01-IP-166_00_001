package exercicios.lista09;

import java.util.Scanner;

/**
 * Uni6Exe02.java - Lê valores reais para preencher uma matriz 3x5 (notas de 3 alunos em 5 provas).
 * Calcula e exibe a média de cada aluno (linha) e a média de cada prova (coluna).
 */
public class Uni6Exe02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] notas = lerMatriz();
        exibirMediasAlunos(notas);
        exibirMediasProvas(notas);
    }

    static double[][] lerMatriz() {
        double[][] m = new double[3][5];
        System.out.println("Informe as notas (3 alunos x 5 provas):");
        for (int i = 0; i < 3; i++) {
            System.out.println("  Aluno " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("    Prova " + (j + 1) + ": ");
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }

    static void exibirMediasAlunos(double[][] m) {
        System.out.println("Media de cada aluno:");
        for (int i = 0; i < m.length; i++) {
            double soma = 0;
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
            System.out.printf("  Aluno %d: %.2f%n", (i + 1), soma / m[i].length);
        }
    }

    static void exibirMediasProvas(double[][] m) {
        System.out.println("Media de cada prova:");
        for (int j = 0; j < m[0].length; j++) {
            double soma = 0;
            for (int i = 0; i < m.length; i++) {
                soma += m[i][j];
            }
            System.out.printf("  Prova %d: %.2f%n", (j + 1), soma / m.length);
        }
    }
}
