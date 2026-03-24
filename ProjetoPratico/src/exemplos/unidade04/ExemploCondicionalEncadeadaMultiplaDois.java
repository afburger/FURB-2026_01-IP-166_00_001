package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalEncadeadaMultiplaDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você possui combustível? informe true se possui e false se não possui");
        boolean possuiCombustivel = sc.nextBoolean();

        System.out.println("Informe se está chuvendo:");
        boolean chuva = sc.nextBoolean();

        // As duas instruções tem o mesmo comportamento
        //if (possuiCombustivel == false)
        if (!possuiCombustivel) {
            System.out.println("Vá de ônibus!");
        } else if (chuva) {
            System.out.println("Vá de carro!");
        } else {
            System.out.println("Vá de moto!");
        }

    }

}
