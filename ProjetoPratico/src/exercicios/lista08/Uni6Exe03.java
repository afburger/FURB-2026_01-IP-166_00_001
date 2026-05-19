package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe03.java - Descreva um algoritmo que leia 12 valores reais
 * e os coloque em um vetor de 12 posições do tipo real.
 * 
 * Em seguida, modifique o vetor de modo que os valores das posições ímpares
 * sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
 * Imprima o vetor resultante.
 * 
 * Faça um método para ler os valores,
 * outro para ajustar os valores dentro do vetor
 * e outro para escrever os valores atualizados do vetor.
 */
public class Uni6Exe03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[12];

        // Faz a leitura dos valores
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor [" + i + "]:");
            valores[i] = sc.nextDouble();
        }

        double[] valoresAtualizados = new double[12];

        for (int idx = 0; idx < valores.length; idx++) {
            // Se for ímpar, incrementa 5%
            double valor = valores[idx];
            if (idx % 2 != 0) {
                valoresAtualizados[idx] = valor + (valor * 0.05);
            } else {
                // Se for par, incrementa 2%
                valoresAtualizados[idx] = valor + (valor * 0.02);
            }
        }

        // Imprimir os valores atualizados
        for (int idx = 0; idx < valoresAtualizados.length; idx++) {
            System.out.println("Valor original [" + idx + "] = " + valores[idx]
                + " Valor atualizado [" + idx + "] = " + valoresAtualizados[idx]
            );
        }

    }

}
