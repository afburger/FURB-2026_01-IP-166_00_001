package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontosD = 0; 
        int pontosE = 0; 
        String ponto;
        boolean fimJogo = false;
        
        System.out.println("Digite 'D' para ponto do jogador da direita e 'E' para ponto do jogador da esquerda");
                
        while (!fimJogo) {
            System.out.print("Informe quem marcou o ponto (D/E): ");
            ponto = scanner.next().toUpperCase();
        
            switch (ponto) {
                case "D":
                    pontosD++;    
                    break;
                case "E":
                    pontosE++;
                    break;
                default:
                    System.out.println("Entrada inválida! Use apenas 'D' ou 'E'.");
                    break;
            }
                       
            System.out.println("Placar: Jogador D " + pontosD + " x " + pontosE + " Jogador E");
            
            // Verifica condições de fim de jogo
            if ((pontosD >= 21 || pontosE >= 21) && Math.abs(pontosD - pontosE) >= 2) {
                fimJogo = true;
            }

        }
        
        // Determina o vencedor
        if (pontosD > pontosE) {
            System.out.println("O jogador da direita (D) venceu!");
        } else {
            System.out.println("O jogador da esquerda (E) venceu!");
        }
        
        System.out.println("Placar final: Jogador D " + pontosD + " x " + pontosE + " Jogador E");
        
        scanner.close();
    }
}
