package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe07.java - Faça um programa que leia um valor N inteiro 
 * limitado a 20 posições. 
 * Com base neste valor, crie um vetor do tipo inteiro. 
 * Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
 * Esse número deverá ser armazenado no vetor caso ainda não exista, 
 * e se o valor já existir deve ser pedido um novo valor. 
 * Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. 
 * Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
 * Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, 
 * conforme no exemplo: 
 * OBSERVAÇÃO: Não utilize o Arrays.sort

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

Crie um método para inserir os valores no vetor, outro para ordenar o vetor 
e outro para informar o vetor resultante. Para "método ordenar" se pode usar o "método bolha" explicado neste vídeo.
 */
public class Uni6Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetTamanho;

        // Ler um valor válido
        do {
            System.out.print("Informe a quantidade de elementos do vetor [1..20]: ");
            vetTamanho = teclado.nextInt();
        } while (vetTamanho < 1 || vetTamanho > 20);
        int vetor[] = new int[vetTamanho];

        // Ler dados e preencher o vetor
        System.out.println(" __ Informando valores");
        int valor;
        
        /**
         * Preenchomento do vetor com while.
         */
        int i = 0;
        int vetorPos = 0;
        while (i < vetor.length) {
            System.out.print("Vetor[" + i + "]: ");
            valor = teclado.nextInt();

            // verifica se o valor já existe no vetor
            boolean existe = false;
            for (int idx = 0; idx < vetorPos; idx++) {
                if (valor == vetor[idx]) {
                    existe = true;
                    break;
                }
            }

            // Se ainda não existe o valor no vetor, adiciona o mesmo.
            if (!existe) {
                vetor[i] = valor;
                vetorPos++;
                i++;
            }
        }

        /**
         * Prenchimento do vetor com for
         */
        // for (int i = 0; i < vetor.length; i++) {  // Mantém o mesmo i até conseguir adicionar um valor
        //     System.out.print("Vetor[" + i + "]: ");
        //     valor = teclado.nextInt();
        
        //     // verifica se o valor já existe no vetor
        //     boolean duplicado = false;
        //     for (int idx = 0; idx < vetor.length; idx++) {
        //         if (valor == vetor[idx]) {
        //             i--;
        //             duplicado = true;
        //             break;
        //         } 
        //     }
        //     if (!duplicado) {
        //         vetor[i] = valor;
        //     }
        // }


        /**
         * Ordenação com While
         */

        // Ordenar o vetor
        System.out.println(" __ Ordenando o vetor");
        // int bolha;
        // int indice = 0;
        // while (indice < vetor.length - 1) {
        //     if (vetor[indice] > vetor[indice + 1]) {
        //         bolha = vetor[indice];
        //         vetor[indice] = vetor[indice + 1];
        //         vetor[indice + 1] = bolha;
        //         indice = 0;
        //     } else {
        //         indice++;
        //     }
        // }

        /**
         * Ordenação com for
         */

        // Loop externo para controlar as passagens pelo array
        for (int idx = 0; idx < vetor.length - 1; idx++) {
            // Loop interno para comparações e trocas
            for (int j = 0; j < vetor.length - idx - 1; j++) {
                // Se o elemento atual for maior que o próximo elemento
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Imprimir o vetor
        System.out.println(" __ Imprimindo o vetor");
        for (int idx = 0; idx < vetor.length; idx++) {
            System.out.println("Vetor[" + idx + "]: " + vetor[idx]);
        }

        teclado.close();
    }
}
