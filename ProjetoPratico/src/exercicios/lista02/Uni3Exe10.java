package exercicios.lista02;

import java.util.Scanner;

/**
 * Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
 * Fórmula:
 * hipotenusa^2 = cateto1^2 + cateto^2
 * 
 * Exemplos de entrada				Exemplos de saída
 * 
 * Cateto oposto: 3
 * Cateto adjacente: 4				A hipotenusa é: 5.00
 * 
 * Cateto oposto: 5
 * Cateto adjacente: 12	A hipotenusa é: 13.00
 * 
 */
public class Uni3Exe10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o cateto 1:");
		double cateto1 = scanner.nextDouble();
		
		System.out.println("Informe o cateto 2:");
		double cateto2 = scanner.nextDouble();
		
		scanner.close();
		
		double hipotenusaQuadrado = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		double hipotenusa = Math.sqrt(hipotenusaQuadrado);

		System.out.println("A Hipotenusa do triangulo informado é: " + hipotenusa);
	}
}
