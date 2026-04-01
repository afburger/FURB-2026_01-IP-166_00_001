package unidade04.exercicios.lista;

import java.util.Scanner;

//FIXME: não é do tipo COMPOSTO (deveria ter && ou ||)

public class Uni4Exe21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura em metros: ");
		double altura = teclado.nextDouble();
		
		System.out.println("Digite sua massa em quilogramas: ");
		double massa = teclado.nextDouble();
		
		double imc = massa / Math.pow(altura, 2);
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else {
			if (imc <= 24.9) {
				System.out.println("Saudavel");
			} else {
				if (imc <= 29.9) {
					System.out.println("Sobrepeso");
				} else {
					if (imc <= 34.9) {
						System.out.println("Obesidade Grau 1");
					} else {
						if (imc <= 39.9) {
							System.out.println("Obesidade Grau 2");
						} else {
							System.out.println("Obesidade Grau 3");
						}
					}
				}
			}
		}
		teclado.close();
	}
}
