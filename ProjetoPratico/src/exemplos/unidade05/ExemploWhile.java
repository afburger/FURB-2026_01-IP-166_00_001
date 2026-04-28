package exemplos.unidade05;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome de usuário:");
        String nomeUsuario = sc.nextLine();

        while (!"afburger".equals(nomeUsuario)) {
            System.out.println("Usuário incorreto!");
            System.out.println("Digite novamente:");
            nomeUsuario = sc.nextLine();
        }

        int contador = 1;
        int limite = 10;

        while (contador <= limite) {
            System.out.println("7 x " + contador + " = " + 7 * contador);
            contador++;
        }


    }
}
