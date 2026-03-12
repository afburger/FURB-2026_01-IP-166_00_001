package exercicios.lista02;

import java.util.Scanner;

/**
 * Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
 * 
 * °F = (9/5) °C + 32
 * 
 * Exemplos de entrada			Exemplos de saída
 * 36							96.80
 * 2							35.60
 * 
 */
public class Uni3Exe11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a temperatura em Grau Celsius:");
		double grausCelcius = scanner.nextDouble();
		
		double fahrenheit = ((9.0/5.0) * grausCelcius) + 32;
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
		
		scanner.close();
	}
}
