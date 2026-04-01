package unidade04.exercicios.lista;

import java.util.Scanner;

//FIXME: não é do tipo COMPOSTO (deveria ter && ou ||)

public class Uni4Exe16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro homem:");
		int idadeHomem1 = teclado.nextInt();
		
		System.out.println("Digite a idade do segundo homem:");
		int idadeHomem2 = teclado.nextInt();
		
		System.out.println("Digite a idade da primeira mulher:");
		int idadeMulher1 = teclado.nextInt();
		
		System.out.println("Digite a idade da segunda mulher");
		int idadeMulher2 = teclado.nextInt();
		
		int somaHomemVelho_MulherNova, produtoHomemNovo_MulherVelha;
		
		if (idadeHomem1 > idadeHomem2) {
			if (idadeMulher1 > idadeMulher2) {
				// homem velho = 1 e mulher nova = 2
				somaHomemVelho_MulherNova = idadeHomem1 + idadeMulher2;
				produtoHomemNovo_MulherVelha = idadeHomem2 * idadeMulher1;
			} else {
				// homem velho = 1 e mulher nova = 1
				somaHomemVelho_MulherNova = idadeHomem1 + idadeMulher1;
				produtoHomemNovo_MulherVelha = idadeHomem2 * idadeMulher2;
			}
		} else {
			if (idadeMulher1 > idadeMulher2) {
				// homem velho = 2 e mulher nova = 2
				somaHomemVelho_MulherNova = idadeHomem2 + idadeMulher2;
				produtoHomemNovo_MulherVelha = idadeHomem1 * idadeMulher1;
			} else {
				// homem velho = 2 e mulher nova = 1
				somaHomemVelho_MulherNova = idadeHomem2 + idadeMulher1;
				produtoHomemNovo_MulherVelha = idadeHomem1 * idadeMulher2;
			}
		}
		System.out.println("Soma homem velho com mulher nova = " + somaHomemVelho_MulherNova);
		System.out.println("Produto homem novo com mulher velha = " + produtoHomemNovo_MulherVelha);
		teclado.close();
	}
}
