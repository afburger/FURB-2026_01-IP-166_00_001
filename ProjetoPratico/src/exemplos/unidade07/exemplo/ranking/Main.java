package exemplos.unidade07.exemplo.ranking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Ranking ranking = new Ranking();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Registrar jogador");
            System.out.println("2 - Exibir ranking");
            System.out.println("0 - Sair");
            menu = sc.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Desligando o sistema...");
                    break;
                case 1:
                    System.out.println("Digite a posição (de 1 a 5) do jogador");
                    int posicao = sc.nextInt();

                    System.out.println("Digite o nome do jogador:");
                    String nomeJogador = sc.next();

                    System.out.println("Informe a pontuação do jogador:");
                    int pontuacao = sc.nextInt();

                    ranking.registrar(posicao, nomeJogador, pontuacao);

                    break;
            
                case 2:
                    ranking.exibir();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (menu != 0);
    }

}
