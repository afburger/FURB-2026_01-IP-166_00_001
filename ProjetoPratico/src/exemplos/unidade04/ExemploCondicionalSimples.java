package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = sc.nextInt();
        System.out.println("Informe a senha:");
        int senha = sc.nextInt();
        System.out.println("Informe o seu nome:");
        String nome = sc.next();


        // Forma opcional sem "{}"
        // if (idade >= 18) System.out.println("Você é adulto!");

        if (idade >= 18) {
            System.out.println("Você é adulto!");
        }
        
        if (idade == 18) {
            System.out.println("Você chegou na maior idade.");
        }

        if (idade < 12) {
            System.out.println("Você é uma criança");
        }

        if (senha != 12345) {
            System.out.println("Senha incorreta!");
        }
        
        // Quando o nome for diferente, precisa usar o "!" antes da verificação
        // Se for diferente apresenta a mensagem.
        if (!nome.equals("Felipe")) {
            System.out.println("Você não é o Felipe.");
        }

        // Quando o nome for igual, apresenta a mensagem
        if (nome.equals("Andre")) {
            System.out.println("Você é o André");
        }

    }

}
