package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro:");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número inteiro:");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O valor " + numero1 + " é maior do que o valor " + numero2);
		} else {
			System.out.println("O valor " + numero2 + " é maior do que o valor " + numero1);
		}
		
		sc.close();
	}
}
