package provas.prova01;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class VooBem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do passageiro:");
		String nome = sc.nextLine();

		System.out.println("Informe o número da classe da passagem:");
		System.out.println("1 - Econômica");
		System.out.println("2 - Executiva");
		System.out.println("3 - Primeira Classe");
		int classe = sc.nextInt();

		System.out.println("Informe o peso da bagagem:");
		double peso = sc.nextDouble();

		String nomeClasse = "";
		double franquia = 0;
		double tarifa = 0;
		double excesso = 0;
		double taxa = 0;
		String status = "";

		switch (classe) {
			case 1:
				nomeClasse = "Econômica";
				franquia = 23.00;
				tarifa = 15.00;
				break;
			case 2:
				nomeClasse = "Executiva";
				franquia = 32.00;
				tarifa = 10.00;
				break;
			case 3:
				nomeClasse = "Primeira Classe";
				franquia = 46.00;
				tarifa = 7.00;
				break;
			default:
				System.out.println("Classe inválida");
				break;
		}

		if (peso > franquia) {
			excesso = peso - franquia;
			taxa = excesso * tarifa;
			status = "Bagagem excedente";
		} else {
			excesso = 0;
			taxa = 0;
			status = "Dentro do limite";
		}

		System.out.println("--- Check-in VooBem ---");
		System.out.println("Passageiro: " + nome);
		System.out.println("Classe: " + nomeClasse);
		System.out.println("Franquia: " + franquia + "kg");
		System.out.println("Peso da bagagem: " + peso + "kg");
		System.out.println("Status: " + status);

		if (taxa > 0) {
			System.out.printf("Taxa adicional: R$ %.2f%n", taxa);
			System.out.println("Dirija-se ao caixa para pagamento antes do embarque.");
		} else {
			System.out.println("Taxa adicional: R$ 0,00");
			System.out.println("Boa viagem!");
		}



	}
}
