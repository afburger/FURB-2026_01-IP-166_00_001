package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        double nota1, nota2, media;

        while (!nome.equals("fim")) {
            System.out.print("Informe o nome: ");
            nome = sc.next();
            if (!nome.equals("fim")) {
                System.out.println("Informe a nota 1: ");
                nota1 = sc.nextDouble();
                
                System.out.println("Informe a nota 2:");
                nota2 = sc.nextDouble();

                media = (nota1 + nota2) / 2;

                System.out.println("Média: " + media);
            }
        }

    }
}
