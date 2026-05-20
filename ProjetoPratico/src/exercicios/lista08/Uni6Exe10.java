package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe10.java - Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, 
 * faça um programa que construa um menu com as seguintes opções:
 * 
 *  “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
 *  “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
 *  “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
 *  “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
 *  “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
 *  “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
 *  “7 – Inverter valores”: desafio (ver abaixo);
 *  “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
 *  OBSERVAÇÃO: Não utilize o Arrays.sort
 *  
 *  Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
 *  Para a opção "6 - Ordenar valores" se pode usar o "método bolha" 
 */
public class Uni6Exe10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[50];
        int posicaoFim = 0;

        int menu;

        do {
            System.out.println("______________MENU______________");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    // Insere um valor
                    if (posicaoFim < vetor.length) {
                        System.out.println("Digite o valor:");
                        vetor[posicaoFim] = teclado.nextInt();
                        System.out.println("__Valor inserido em vetor[" + posicaoFim + "].");
                        posicaoFim++;
                    } else {
                        System.out.println("__Não foi possível inserir, vetor cheio.");
                    }
                    break;
                case 2:
                    // Pesquisa um valor
                    System.out.println("Digite o valor a ser pesquisado:");
                    int valorPesquisa = teclado.nextInt();
                    int posicaoEncontrada = pesquisaValor(valorPesquisa, vetor, posicaoFim);
                    if (posicaoEncontrada >= 0) {
                        System.out.println("__Valor encontrado no vetor[" + posicaoEncontrada + "]");
                    } else {
                        System.out.println("__Valor não encontrado no vetor");
                    }
                    break;
                case 3:
                    // Alterar um valor
                    System.out.println("Digite o valor que deseja alterar:");
                    int valorAlterar = teclado.nextInt();
                    int posicaoAlterar = pesquisaValor(valorAlterar, vetor, posicaoFim);
                    
                    if (posicaoAlterar == -1) {
                        System.out.println("__Valor não encontrado no vetor");
                    } else {
                        System.out.println("Digite o novo valor:");
                        int novoValor = teclado.nextInt();
                        vetor[posicaoAlterar] = novoValor;
                        System.out.println("__Valor alterado no vetor["+posicaoAlterar+
                                            "] = " + vetor[posicaoAlterar]);
                    }
                    break;
                case 4:
                    // Excluir um valor
                    System.out.println("Digite o valor que deseja excluir:");
                    int valorExcluir = teclado.nextInt();
                    int posicaoExcluir = pesquisaValor(valorExcluir, vetor, posicaoFim);
                    if (posicaoExcluir == -1) {
                        System.out.println("__ Valor não encontrado no vetor");
                    } else {
                        for (int i = posicaoExcluir; i < posicaoFim; i++) {
                            vetor[i] = vetor[i + 1];
                        }
                        posicaoFim--;
                        System.out.println("__Valor excluido com sucesso!");
                    }
                    break;
                case 5:
                    // Mostrar todos os valores
                    System.out.println("______Valores do vetor______");
                    for (int i = 0; i < posicaoFim; i++) {
                        System.out.println("Vetor[" + i + "] = " + vetor[i]);
                    }
                    break;
                case 6:
                    // Ordenar de forma crescente
                    for (int i = 0; i < posicaoFim; i++) {
                        for (int j = 0; j < posicaoFim - i - 1; j++) {
                            if (vetor[j] > vetor[j + 1]) {
                                int temp = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("__Valores ordenados de forma crescente");
                    break;
                case 7:
                    // Inversão do valores
                    for (int i = 0; i < posicaoFim; i++) {
                        for (int x = 0; x < i; x++) {
                            int valorTemp = vetor[i];
                            vetor[i] = vetor[x];
                            vetor[x] = valorTemp;
                        }
                    }
                    System.out.println("__Valores invertidos");
                    break;
                case 8:
                    System.out.println("__Encerrando o sistema.__");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        } while (menu != 8);
    }

    public static int pesquisaValor(int valorPesquisa, int[] vetor, int posicaoFim) {
        int posicaoEncontrada = -1;

        for (int i = 0; i < posicaoFim; i++) {
            if (valorPesquisa == vetor[i]) { 
                posicaoEncontrada = i;
                break;
            }
        }
        return posicaoEncontrada;
    }
}