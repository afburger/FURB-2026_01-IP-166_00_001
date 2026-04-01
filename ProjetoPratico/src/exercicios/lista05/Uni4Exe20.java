package unidade04.exercicios.lista;

import java.util.Scanner;

//FIXME: não é do tipo COMPOSTO (deveria ter && ou ||)

public class Uni4Exe20 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double notaP1, notaP2, notaP3, notaExercicios;
		
		System.out.println("Digite nota1: ");
		notaP1 = teclado.nextDouble();
		
		System.out.println("Digite nota2: ");
		notaP2 = teclado.nextDouble();
		
		System.out.println("Digite nota3: ");
		notaP3 = teclado.nextDouble();
		
		System.out.println("Digite média dos exercícios: ");
		notaExercicios = teclado.nextDouble();
		
		double mediaDeAproveiramento = (notaP1 + (notaP2 * 2) + (notaP3 * 3) + notaExercicios) / 7;
		
		if (mediaDeAproveiramento >= 9.0) {
			System.out.println("A: aprovado");
		} else {
			if (mediaDeAproveiramento >= 7.5) {
				System.out.println("B: aprovado");
			} else {
				if (mediaDeAproveiramento >= 6.0) {
					System.out.println("C: aprovado");
				} else {
					if (mediaDeAproveiramento >= 4) {
						System.out.println("D: reprovado");
					} else {
						if (mediaDeAproveiramento >= 0) {
							System.out.println("E: reprovado");
						} else {
							System.out.println("Entrada inválida");
						}
					}
				}
			}
		}
		teclado.close();
	}
}
