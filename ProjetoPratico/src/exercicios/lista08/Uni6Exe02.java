package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais
 * e os coloque em um vetor de 12 posições do tipo real.
 * Imprima quais valores desses informados são maiores que a média dos valores.
 * Faça um método para ler os valores, outro para calcular a média e outro para
 * informar os valores maiores que a média.
 */
public class Uni6Exe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[12];

        // Leitura
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição [" + i + "]:");
            vetor[i] = sc.nextDouble();
        }

        // Calcular a média
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        // Escrever os valores acima da média
        System.out.println("Média = " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Valor da posição [" + i + "] = " + vetor[i]);
            }
        }
    }

}
