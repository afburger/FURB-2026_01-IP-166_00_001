package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe08.java - Faça um programa que leia um valor N inteiro limitado a 20 posições. 
 * Com base neste valor, crie um vetor do tipo real. 
 * Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. 
 * Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).
 */
public class Uni6Exe08 {

   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar e validar o tamanho do vetor
        int tamVet;
        do {
            System.out.print("Tamanho Vetor: ");
            tamVet = teclado.nextInt();
        } while ((tamVet < 1) || (tamVet > 20));
        
        // Criar e preencher o vetor
        double vet[] = new double[tamVet];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("vet[" + i + "]: ");
            vet[i] = teclado.nextDouble();
        }
        
        // Escrever os valores do vetor
        System.out.println("---");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        
        // Calcular e mostrar a frequência de cada valor
        System.out.println("---");
        boolean achou[] = new boolean[vet.length];
        
        for (int i = 0; i < achou.length; i++) {
            achou[i] = false;
        }
        
        System.out.println();
        System.out.println("VALOR   |  FREQÜÊNCIA  ");
        int contador;
        for (int i = 0; i < vet.length; i++) {
            contador = 0;
            for (int j = 0; j < vet.length; j++) {
                if (!achou[j]) {
                    if (vet[i] == vet[j]) {
                        achou[j] = true;
                        contador++;
                    }
                }
            }
            if (contador > 0) {
                System.out.println(vet[i] + " | " + contador);
            }
        }
        
        teclado.close();
    }
}
