package exemplos.unidade04;

import java.util.Scanner;

public class ExeSelecaoComposta {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você possui combustível?");
        String possuiCombustivel = sc.next();

        // Converte tudo para maiúsculo.
        possuiCombustivel = possuiCombustivel.toUpperCase();

        // Verifca se o valor informado, é SIM.
        if (possuiCombustivel.equals("SIM")) {
            // Se for SIM, vai dizer para ir de carro.
            System.out.println("Vá de carro!");
        } else {
            // Se for diferente de SIM, vai dizer para ir de ônibus.
            System.out.println("Vá de ônibus!");
        }

    }

}
