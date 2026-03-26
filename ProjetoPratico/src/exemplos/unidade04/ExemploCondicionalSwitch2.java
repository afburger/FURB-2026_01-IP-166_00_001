package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalSwitch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de peças:");
        int quantidade = sc.nextInt();
        System.out.println("Informe o valor total da compra:");
        double valorTotal = sc.nextDouble();
        double desconto;
        switch (quantidade) {
            case 1:
                System.out.println("Não tem desconto e ficou um total de R$ " + valorTotal);
                break;
            case 2:
                desconto = valorTotal * 0.05;
                valorTotal = valorTotal -  desconto;
                System.out.println("Você teve 5% de desconta e ficou um total de R$ " + valorTotal);
                break;
            case 3:
                desconto = valorTotal * 0.07;
                valorTotal = valorTotal -  desconto;
                System.out.println("Você teve 7% de desconta e ficou um total de R$ " + valorTotal);
                break;
            case 4:
                desconto = valorTotal * 0.10;
                valorTotal = valorTotal -  desconto;
                System.out.println("Você teve 10% de desconta e ficou um total de R$ " + valorTotal);
                break;
            case 5:
                desconto = valorTotal * 0.12;
                valorTotal = valorTotal -  desconto;
                System.out.println("Você teve 12% de desconta e ficou um total de R$ " + valorTotal);
                break;
            default:
                desconto = valorTotal * 0.15;
                valorTotal = valorTotal -  desconto;
                System.out.println("Você teve 15% de desconta e ficou um total de R$ " + valorTotal);
                break;
        }

        // Não é recomendado.
        switch (valorTotal) {
            case 10.625:
                System.out.println("Teste");
                break;
        
            default:
                break;
        }

    }

}
