package exemplos.unidade05;

import java.util.Scanner;

public class ExemploDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu = 0;
        do {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Desligar");

            menu = sc.nextInt();

            if (menu != 0) {
                System.out.println("Informe o valor 1:");
                double valor1 = sc.nextDouble();

                System.out.println("Informe o valor 2:");
                double valor2 = sc.nextDouble();

                switch (menu) {
                    case 1:
                        System.out.println(valor1 + valor2);
                        break;
                    case 2:
                        System.out.println(valor1 - valor2);
                        break;
                    case 3:
                        System.out.println(valor1 * valor2);
                        break;
                    case 4:
                        System.out.println(valor1 / valor2);
                        break;
                }
                
            }

        } while (menu != 0);

    }


}
