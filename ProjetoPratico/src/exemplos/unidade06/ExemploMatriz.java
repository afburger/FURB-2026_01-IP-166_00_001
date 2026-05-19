package exemplos.unidade06;

import java.util.Scanner;

public class ExemploMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos nessa turma:");
        int qtdAlunos = sc.nextInt();

        System.out.println("Informe a quantidade de notas:");
        int qtdNotas = sc.nextInt();

        // Declarar a matriz
        int[][] notas = new int[qtdAlunos][qtdNotas];

        // Adicionar dados na matriz.
        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[lin].length; col++) {
                System.out.println("Informe a nota["+col+"] do aluno[" + lin + "]:");
                notas[lin][col] = sc.nextInt();
            }
        }

        int somaGeral = 0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            int somaAluno = 0;
            
            for (int nota = 0; nota < notas[aluno].length; nota++) {
                int notaAluno = notas[aluno][nota];
                somaAluno += notaAluno;
                somaGeral += notaAluno;
            }

            int media = somaAluno / notas[aluno].length;
            System.out.println("A média do aluno["+ aluno + "] = " + media);
        }
        
        int mediaGeral = somaGeral / (notas.length * notas[0].length);
        System.out.println("A média geral da turma é: " + mediaGeral);
    }

}
