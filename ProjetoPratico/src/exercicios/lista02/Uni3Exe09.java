package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da lata em cm:");
        double raio = scan.nextDouble();

        System.out.println("Informe a altura da lata em cm:");
        double altura = scan.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);
    }

}
