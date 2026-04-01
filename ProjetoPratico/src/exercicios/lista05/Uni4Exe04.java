package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número real");
		
		double numero = teclado.nextDouble();
		
		if (numero - Math.floor(numero) != 0.0) {
			System.out.println("Tem casas decimais");
		} else {
			System.out.println("Não tem casas decimais");
		}
		teclado.close();
	}
}
