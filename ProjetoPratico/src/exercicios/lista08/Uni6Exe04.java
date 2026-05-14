package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe04.java - Faça um programa para ler os valores de dois vetores de
 * inteiros,
 * cada um contendo 10 elementos.
 * Crie um terceiro vetor em que cada elemento é a soma dos valores
 * contidos nas posições respectivas dos vetores originais.
 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
 * Exiba, ao final, os três vetores na tela.
 * 
 * Faça três métodos: um método para ler valores dos vetores,
 * outro para somar e outro para escrever os vetores.
 */
public class Uni6Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = 4;
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetor3 = new int[tamanho];


        // Faz a leitura dos valores
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o valor [" + i + "] do vetor 1:");
            vetor1[i] = sc.nextInt();

            System.out.println("Informe o valor [" + i + "] do vetor 2:");
            vetor2[i] = sc.nextInt();
        }


        // Faz a soma dos valores
        for (int i = 0; i < tamanho; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        // Exibe os valores
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Soma de [" + i + "] " +
                vetor1[i] + " + " + vetor2[i] + " = " + vetor3[i]);
        }

    }

}
