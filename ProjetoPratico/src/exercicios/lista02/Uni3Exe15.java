package exercicios.lista02;

import java.util.Scanner;

/**
 * Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
 * X centena(s)  Y dezena(s) K unidade(s)  
 * 
 * Exemplo, se for submetido o número 384, o programa deverá exibir:
 * 3 centena(s)  8 dezena(s) 4 unidade(s)  
 * 
 * 
 * Exemplos de entrada				Exemplos de saída
 * 816								8 centena(s) 1 dezena(s) 6 unidade(s)
 * 
 * 974								9 centena(s) 7 dezena(s) 4 unidade(s)
 * 
 */
public class Uni3Exe15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número de até 3 dígitos");
		int numero = teclado.nextInt();

		teclado.close();

		int centena = numero / 100;
		numero = numero - (centena * 100);

		int dezena = numero / 10;
		numero = numero - (dezena * 10);

		int unidade = numero / 1;

		System.out.println(centena + " centena(s) " 
		+ dezena + " dezena(s) " + unidade + " unidade(s)");

	}
}
