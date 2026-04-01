package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as horas trabalhadas no mês:");
		int horasMes = sc.nextInt();
		
		System.out.println("Entre com o valor pago por hora:");
		double horasValor = sc.nextDouble();
		
		sc.close();

		double salarioTotal = horasMes * horasValor;
		
		if (horasMes > 160) {
			double salarioExtra = (horasMes - 160) * (horasValor / 2);
			salarioTotal = salarioTotal + salarioExtra;
		}
		
		System.out.println("O salário total é: " + salarioTotal);
		
		
	}
}
