package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) {
        final int anelChip = 1;
        final int anelAlimento = 2;
        final double valorAnelChip = 4.0;
        final double valorAnelAlimento = 3.50;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de galinhas que deseja marcar:");
        int quantidadeGalinhas = scan.nextInt();

        double gastoAnelChip = anelChip * valorAnelChip;
        double gastoAnelAlimento = anelAlimento * valorAnelAlimento;

        double gastoTotalAnelChip = gastoAnelChip * quantidadeGalinhas;
        double gastoTotalAnelAlimento = gastoAnelAlimento * quantidadeGalinhas;

        double valorTotal = gastoTotalAnelChip + gastoTotalAnelAlimento;

        System.out.println("O gasto total para marcar " + quantidadeGalinhas + " é R$ " + valorTotal);

    }

}
