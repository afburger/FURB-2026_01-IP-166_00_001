package exemplos.unidade06;

import java.util.Scanner;

public class ExemploVetorDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos que você possui:");
        int qtdAlunos = sc.nextInt();

        double[] notas = new double[qtdAlunos];
        String[] nomes = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Informe o nome do aluno [" + i + "]: ");
            nomes[i] = sc.next();

            System.out.println("Informe a nota do aluno [" + i + "]: ");
            notas[i] = sc.nextDouble();
        }
        

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Aluno: " + nomes[i] + " tem nota: " + notas[i]);
        }
    }

}
