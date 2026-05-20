package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe06.java - Faça um programa que leia um valor N inteiro. 
 * Com base neste valor, crie um vetor do tipo real. 
 * Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
 * Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
 * Informe para o usuário se este valor informado se encontra cadastrado no vetor. 
 * Faça um método para ler o vetor 
 * e outro, que retorne verdadeiro ou falso, para encontrar o valor.
 */
public class Uni6Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor (N): ");
        final int vetorTamanho = teclado.nextInt();
        double vetor[] = new double[vetorTamanho];

        // Ler vetor/preencher
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor: ");
            vetor[i] = teclado.nextDouble();
        }

        // Pesquisa vetor
        System.out.println("Informe valor a ser pesquisado: ");
        double valorPesquisado = teclado.nextDouble();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisado) {
                System.out.println("Encontrou..");
                break;
            }
        }

        teclado.close();

    }
}
