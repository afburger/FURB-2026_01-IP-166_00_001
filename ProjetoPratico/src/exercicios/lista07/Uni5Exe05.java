package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe n (n>2): ");
		int qtd = teclado.nextInt();

		int numero = 8, soma = 0;
		for (int cont = 1; cont <= qtd; cont++) {
			System.out.print(numero + ", " + (numero + 2) + ", ");
			soma = soma + numero + (numero + 2);
			numero = numero * 2;
		}
		teclado.close();
	}

}
