package exemplos.unidade05;

import java.util.Scanner;

public class ExemploFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos carros você tem para lavar hoje:");
        int carros = sc.nextInt();

        double valorLavacao = 50;

        double faturamento = 0;

        for (int i = 1; i <= carros; i++) {
            faturamento = faturamento + valorLavacao;
        }

        System.out.println("O faturamento do dia, foi de: " + faturamento);

        for (int x = carros; x > 0; x--) {
            System.out.println("Restam " + x + " carros para lavar");
        }

        // Exemplo incorreto com laço infinito.
        for (int idx = 10; idx >= 0; idx--) {
            System.out.println("Número" + idx);
        }

    }
}
