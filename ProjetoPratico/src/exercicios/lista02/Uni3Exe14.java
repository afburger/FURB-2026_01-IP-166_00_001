package exercicios.lista02;

import java.util.Scanner;

/**
 * Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
 * calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
 * 
 * Exemplos de entrada				Exemplos de saída
 * 
 * Distância: 240
 * Tempo: 4							A velocidade média foi de 60,00 km/h e a quantidade de combustível usado foi 20,00 litros.
 * 
 * Distância: 150
 * Tempo: 2							A velocidade média foi de 75,00 km/h e a quantidade de combustível usado foi 12,50 litros.
 * 
 */
public class Uni3Exe14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int autonomia = 12;
		
		System.out.println("Informe o tempo gasto na viagem em horas: ");
		int tempoGasto = scanner.nextInt();
		
		System.out.println("Informe a distância percorrida na viagem: ");
		int distanciaPercorrida = scanner.nextInt();
		
		double velocidadeMedia = distanciaPercorrida / tempoGasto;
				
		double gastoCombustivel = distanciaPercorrida / autonomia;
		
		System.out.println("A velocidade média foi de "+ velocidadeMedia +" km/h e a quantidade de combustível usado foi "+ gastoCombustivel +" litros");
		
		scanner.close();
	}
}
