package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a idade de Marquinhos:");
		int idadeMarquinhos  = sc.nextInt();
		
		System.out.println("Informe a idade de Zezinho:");
		int idadeZezinho  = sc.nextInt();
		
		System.out.println("Informe a idade da Luluzinha:");
		int idadeLuluzinha  = sc.nextInt();
		
		if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
			System.out.println("Marquinhos é o caçula");
		}
		
		if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
			System.out.println("Zezinho é o caçula");
		}
		
		if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha< idadeZezinho) {
			System.out.println("Luluzinha é a caçula");
		}
		
		sc.close();
		
		
	}
}
