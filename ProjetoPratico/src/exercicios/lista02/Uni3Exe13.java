package exercicios.lista02;

import java.util.Scanner;

/**
 * Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
 * Faça um programa para ler o comprimento e altura de uma parede (em metros), 
 * e depois escrever o valor gasto com a compra de azulejos. 
 * Considere que um metro quadrado é formado por 9 azulejos.
 * 
 * Exemplos de entrada						Exemplos de saída
 * Altura: 2
 * Comprimento: 6							O valor final é R$1350,00
 * 
 * Altura: 1.8	
 * Comprimento: 2.6							O valor final é R$526,50
 * 
 */
public class Uni3Exe13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double valorAzuleijo = 12.50;
		final double azuleijosMetro = 9.0;

		System.out.println("Informe o comprimento da parede: ");
		double comprimento = scanner.nextDouble();
		
		System.out.println("Informe a altura da parede: ");
		double altura = scanner.nextDouble();
		
		double metragemQuadrada = comprimento * altura;
		double quantidadeAzuleijos = metragemQuadrada * azuleijosMetro;
		double valorTotal = quantidadeAzuleijos * valorAzuleijo;

		System.out.println("O valor final é R$ " + valorTotal);
		
		scanner.close();
	}
}
