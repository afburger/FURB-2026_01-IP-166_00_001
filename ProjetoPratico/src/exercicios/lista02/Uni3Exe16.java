package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe16 {

    public static void main(String[] args) {
        final int notaCem = 100;
        final int notaDez = 10;
        final int notaUm = 1;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor da compra:");
        int valorCompra = scan.nextInt();

        System.out.print("Informe o valor pago:");
        int valorPago = scan.nextInt();

        int valorTroco = valorPago - valorCompra;

        int notas100 = valorTroco / notaCem;
        valorTroco = valorTroco - (notas100 * notaCem);

        int notas10 = valorTroco / notaDez;
        valorTroco = valorTroco - (notas10 * notaDez);

        int notas1 = valorTroco / notaUm;
        valorTroco = valorTroco - (notas1 * notaUm);

        int totalNotas = notas100 + notas10 + notas1;

        System.out.println("O número mínimo de notas de troco é:" + totalNotas);

        System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);
    }

}
