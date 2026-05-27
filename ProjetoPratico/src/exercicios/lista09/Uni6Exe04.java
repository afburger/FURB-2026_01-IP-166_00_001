package exercicios.lista09;

import java.util.Scanner;

/**
 * Uni6Exe04.java - Programa de salários por departamento.
 * Lê departamentos (max 10) e funcionários por departamento (max 20).
 * Informa maior salário, média por departamento e funcionários acima da média geral.
 */
public class Uni6Exe04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Numero de departamentos (max 10): ");
        int numDept = sc.nextInt();
        if (numDept > 10) numDept = 10;

        System.out.print("Numero de funcionarios por departamento (max 20): ");
        int numFunc = sc.nextInt();
        if (numFunc > 20) numFunc = 20;

        double[][] salarios = lerMatriz(numDept, numFunc);
        encontrarMaiorSalario(salarios, numDept, numFunc);
        exibirMediasDepartamentos(salarios, numDept, numFunc);
        contarAcimaMediaGeral(salarios, numDept, numFunc);
    }

    static double[][] lerMatriz(int linhas, int colunas) {
        double[][] m = new double[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            System.out.println("Departamento " + (i + 1) + ":");
            for (int j = 0; j < colunas; j++) {
                System.out.print("  Funcionario " + (j + 1) + " - salario: ");
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }

    static void encontrarMaiorSalario(double[][] m, int linhas, int colunas) {
        double maior = m[0][0];
        int deptMaior = 0, posMaior = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    deptMaior = i;
                    posMaior = j;
                }
            }
        }
        System.out.printf("Maior salario: R$ %.2f (Departamento %d, Funcionario %d)%n",
                maior, deptMaior + 1, posMaior + 1);
    }

    static void exibirMediasDepartamentos(double[][] m, int linhas, int colunas) {
        System.out.println("Media salarial por departamento:");
        for (int i = 0; i < linhas; i++) {
            double soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += m[i][j];
            }
            System.out.printf("  Departamento %d: R$ %.2f%n", (i + 1), soma / colunas);
        }
    }

    static void contarAcimaMediaGeral(double[][] m, int linhas, int colunas) {
        double somaGeral = 0;
        int total = linhas * colunas;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaGeral += m[i][j];
            }
        }
        double mediaGeral = somaGeral / total;

        int contador = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (m[i][j] > mediaGeral) {
                    contador++;
                }
            }
        }
        System.out.printf("Media geral da empresa: R$ %.2f%n", mediaGeral);
        System.out.println("Funcionarios acima da media geral: " + contador);
    }
}
