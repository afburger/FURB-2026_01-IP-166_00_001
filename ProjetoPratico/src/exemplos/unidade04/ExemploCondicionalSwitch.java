package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cor do semaforo:");
        System.out.println("R - para vermelho");
        System.out.println("Y - para amarelo");
        System.out.println("G - para verde");

        char cor = sc.next().charAt(0);


        switch (cor) {
            case 'R':
                System.out.println("PARE!");
                break;
            case 'Y':
                System.out.println("Cuidado");
                break;
            case 'G':
                System.out.println("Siga em frente!");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
        }

    }

}
