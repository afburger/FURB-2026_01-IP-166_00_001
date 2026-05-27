package exercicios.lista09;

import java.util.Scanner;

/**
 * Uni6Exe05.java - Jogo da velha (tic-tac-toe) com matriz 3x3.
 * Menu: 1-Jogar, 2-Exibir tabuleiro, 3-Sair.
 * Desafio: ao final pergunta se jogadores querem jogar novamente.
 */
public class Uni6Exe05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean jogarNovamente = true;
        while (jogarNovamente) {
            char[][] tabuleiro = new char[3][3];
            inicializarTabuleiro(tabuleiro);
            char jogadorAtual = 'X';
            boolean jogoAtivo = true;

            while (jogoAtivo) {
                System.out.println("\n--- Jogo da Velha ---");
                System.out.println("Vez do jogador: " + jogadorAtual);
                System.out.println("1 - Jogar");
                System.out.println("2 - Exibir tabuleiro");
                System.out.println("3 - Sair");
                System.out.print("Opcao: ");
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        registrarJogada(tabuleiro, jogadorAtual);
                        if (verificarVencedor(tabuleiro, jogadorAtual)) {
                            exibirTabuleiro(tabuleiro);
                            System.out.println("Jogador " + jogadorAtual + " venceu!");
                            jogoAtivo = false;
                        } else if (verificarVelha(tabuleiro)) {
                            exibirTabuleiro(tabuleiro);
                            System.out.println("Deu velha! Empate!");
                            jogoAtivo = false;
                        } else {
                            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                        }
                        break;
                    case 2:
                        exibirTabuleiro(tabuleiro);
                        break;
                    case 3:
                        System.out.println("Encerrando o jogo.");
                        jogoAtivo = false;
                        jogarNovamente = false;
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
            }

            if (jogarNovamente) {
                System.out.print("Desejam jogar novamente? (S/N): ");
                String resposta = sc.next().toUpperCase();
                jogarNovamente = resposta.equals("S");
            }
        }
        System.out.println("Obrigado por jogar!");
    }

    static void inicializarTabuleiro(char[][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = ' ';
            }
        }
    }

    static void exibirTabuleiro(char[][] t) {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " " + t[i][0] + " | " + t[i][1] + " | " + t[i][2]);
            System.out.println();
            if (i < 2) {
                System.out.println("  ---------");
            }
        }
    }

    static void registrarJogada(char[][] t, char jogador) {
        int linha, coluna;
        do {
            System.out.print("Linha (0-2): ");
            linha = sc.nextInt();
            System.out.print("Coluna (0-2): ");
            coluna = sc.nextInt();
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posicao invalida. Tente novamente.");
            } else if (t[linha][coluna] != ' ') {
                System.out.println("Posicao ja ocupada. Tente novamente.");
            } else {
                break;
            }
        } while (true);
        t[linha][coluna] = jogador;
    }

    static boolean verificarVencedor(char[][] t, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) return true;
            if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) return true;
        }
        if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) return true;
        if (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador) return true;
        return false;
    }

    static boolean verificarVelha(char[][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
