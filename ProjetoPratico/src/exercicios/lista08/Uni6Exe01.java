package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros 
 * e os coloque em um vetor de 10 posições do tipo inteiro. 
 * Escreva na ordem inversa em que foram lidos. 
 * Faça um método para ler e outro para escrever.
 */
public class Uni6Exe01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número inteiro [" + i + "]: " );
            vetor[i] = sc.nextInt();
        }

        // Escrita
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Valor da posição [" + i + "] = " + vetor[i]);
        }
    }

}
