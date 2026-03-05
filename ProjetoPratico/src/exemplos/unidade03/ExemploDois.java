package exemplos.unidade03;
// Podem ignorar a informação do package no projeto de vocês, 
// todos os fontes devem ficar diretamente dentro da pasta src

import java.util.Scanner;

public class ExemploDois {

    public static void main(String[] args) {

        // Imprime uma mensagem no console
        System.out.println("Informe o seu nome");

        // Criar o objeto scanner para realizar a leitura
        Scanner teclado = new Scanner(System.in);

        // Faz a leitura do que o usuário digitou no console
        String nome = teclado.next();

        System.out.println("Seja bem-vindo: " + nome);
        
    }
}
