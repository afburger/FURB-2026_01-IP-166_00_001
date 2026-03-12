package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do litro da gasolina:");
        double precoGasolina = scan.nextDouble();

        System.out.println("Informe o valor total pago:");
        double valorTotalPago = scan.nextDouble();

        double litros = valorTotalPago / precoGasolina;

        System.out.println("O motorista conseguiu colocar: " + litros + " litros.");
    }

}
