package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite a medida do lado A do terreno:");
        float ladoA = leitura.nextFloat();
        
        System.out.println("Digite a medida do lado B do terreno:");
        float ladoB = leitura.nextFloat();

        float area = ladoA * ladoB;

        System.out.println("Esse terreno possui uma área de: " + area + "m2");

        leitura.close();
    }

}
