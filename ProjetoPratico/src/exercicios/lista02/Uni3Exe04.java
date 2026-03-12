package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final float pesoNota1 = 5f;
        final float pesoNota2 = 3f;
        final float pesoNota3 = 2f;

        System.out.println("Informe a nota 1:");
        float nota1 = scan.nextFloat();

        System.out.println("Informe a nota 2:");
        float nota2 = scan.nextFloat();

        System.out.println("Informe a nota 3:");
        float nota3 = scan.nextFloat();

        float nota1Ponderada = (nota1 * pesoNota1) / 10f;
        float nota2Ponderada = (nota2 * pesoNota2) / 10f;
        float nota3Ponderada = (nota3 * pesoNota3) / 10f;

        float media = nota1Ponderada + nota2Ponderada + nota3Ponderada;

        System.out.println("A média final do aluno é: " + media);
    }

}
