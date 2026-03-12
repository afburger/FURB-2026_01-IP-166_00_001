package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        final double percentualDesconto = 12.0;

        System.out.println("Informe o valor do sapato:");
        double valorSapato = scan.nextDouble();

        double valorDesconto = (valorSapato * percentualDesconto) / 100;
        double valorLiquidoSapato = valorSapato - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);

        System.out.println("O preço do par de sapatos com desconto é R$ " + valorLiquidoSapato);

    }

}
