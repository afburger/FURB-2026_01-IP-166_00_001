package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe12 {

        public static void main(String[] args) {
        final double valorHoraTrabalhada = 10;
        final double valorDependente = 60;
        final double percentualINSS = 0.085;
        final double percentualIR = 0.05;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scan.next();

        System.out.println("Informe a quantidade de horas trabalhadas:");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("Informe a quantidade de dependentes: ");
        int quantiadeDependentes = scan.nextInt();

        double salarioHoras = horasTrabalhadas * valorHoraTrabalhada;
        double salarioDependentes = valorDependente * quantiadeDependentes;

        double valorIR = salarioHoras * percentualIR;
        double valorINSS = salarioHoras * percentualINSS;

        double salarioLiquido = salarioHoras - (valorIR + valorINSS);

        double salarioFinal = salarioLiquido + salarioDependentes;
        double salarioBruto = salarioHoras + salarioDependentes;

        System.out.println("O funcionário " + nome + "possui um salário bruto de: " + salarioBruto + " e um salário liquido de:" + salarioFinal);

    }

}
