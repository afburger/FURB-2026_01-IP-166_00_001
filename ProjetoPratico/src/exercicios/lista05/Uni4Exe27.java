package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe27 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("horChegada: ");
		int horChegada = teclado.nextInt();
		
		System.out.print("minChegada: ");
		int minChegada = teclado.nextInt();
		
		System.out.print("horSaida:   ");
		int horSaida = teclado.nextInt();
		
		System.out.print("minSaida:   ");
		int minSaida = teclado.nextInt();

		// Chegada/Saida hora[0..24] minuto[0..60]
		if (horChegada >= 0 && horChegada <= 24 && minChegada >= 0 && minChegada <= 60 && horSaida >= 0 && horSaida <= 24
				&& minSaida >= 0 && minSaida <= 60 && horSaida >= horChegada) {

			// Quantidade de horas que ficou estacionado
			int minChegadaTotal = (horChegada * 60) + minChegada; // converter hora para minutos
			int minSaidaTotal = (horSaida * 60) + minSaida; // converter hora para minutos
			int minTotal = minSaidaTotal - minChegadaTotal;
			int qtdHoras = minTotal / 60;
			int qtdMinutos = (minTotal % 60);

			System.out.println("Ficou estacionado " + qtdHoras + " horas e " + qtdMinutos + " minutos");
			if (qtdMinutos >= 30) {
				qtdHoras += 1;
			}
			System.out.println("Vai pagar por " + qtdHoras + " horas");

			// Definir a faixa de valores que deve pagar pelas horas estacionada.
			double precoCobrado = 0;
			switch (qtdHoras) {
				case 0: // 5,00
				case 1: // 5,00
					precoCobrado = 5;
					break;
				case 2: // 5,00+5,00 = 10,00
					precoCobrado = 10;
					break;
				case 3: // 5,00+5,00+7,5 = 17,5
					precoCobrado = 17.5;
					break;
				case 4: // 5,00+5,00+7,5+7,5 = 25,00
					precoCobrado = 25;
					break;
				default: // 25,00 + (10 * (5 - 4))
					precoCobrado = 25 + (10 * (qtdHoras - 4));
					break;
			}
			System.out.println("Preço cobrado: " + precoCobrado);
		} else {
			System.out.println(" Hora/Minuto ERRADO");
		}
		teclado.close();
	}
}