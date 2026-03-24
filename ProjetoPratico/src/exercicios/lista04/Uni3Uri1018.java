package exercicios.lista04;

import java.util.Scanner;

public class Uni3Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double notaA = teclado.nextDouble();
        double notaB = teclado.nextDouble();
        double media;
        
        teclado.close();

        media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.println(String.format("MEDIA = ", media));

    }
}
