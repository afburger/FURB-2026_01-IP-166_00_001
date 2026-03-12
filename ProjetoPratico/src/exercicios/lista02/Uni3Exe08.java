package exercicios.lista02;

import java.util.Scanner;

/**
 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
 * Para isto ela entregou um valor em dólares para o atendente. 
 * Considerando que o atendente tem a cotação do dólar, 
 * descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
 * 
 * Exemplo de entrada										Exemplo de saída
 * Valor em dólares recebido pelo cliente: 440	
 * Cotação do dólar hoje: 5.65								O atendente deve devolver R$2486,00 para o cliente.
 * 
 */
public class Uni3Exe08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade em dólares:");
		double valorDolar = scan.nextDouble();

		System.out.println("Informe a cotação do dia:");
		double cotacao = scan.nextDouble();

		scan.close();

		double valorReal = valorDolar * cotacao;

		System.out.println("O atendente deve devolver R$ "
		+ valorReal + " para o cliente.");
	}
}
