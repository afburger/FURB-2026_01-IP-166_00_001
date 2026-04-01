package unidade04.exercicios.lista;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com peso da carta: ");
		int peso = teclado.nextInt();

		float valorPagar = 0;
		
		if (peso <= 50) {
			valorPagar = 0.45f;
		} else {
			int pesoExcedido = peso - 50;
			float qtAdicional = (pesoExcedido / 20f) + 1;
			valorPagar = 0.45f + (0.45f * qtAdicional);
		}

		DecimalFormat df_2 = new DecimalFormat("0.####");
		System.out.println("Custo do selo: " + df_2.format(valorPagar));
		teclado.close();
	}
}
