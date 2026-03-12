package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe06 {

    public static void main(String[] args) {
        final double valorKg = 25.0;
        final double tara = 0.750;

        Scanner scan = new Scanner(System.in);

        double pesoPrato = scan.nextDouble();

        double valorPrato = (pesoPrato - tara) * valorKg;

        System.out.println("O valor do prato do cliente é R$ " + valorPrato);
    }

}
