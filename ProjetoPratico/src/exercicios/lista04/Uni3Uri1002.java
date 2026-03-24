package exercicios.lista04;

import java.util.Scanner;

public class Uni3Uri1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double A = 3.14159 * R * R;

		sc.close();

        System.out.printf("A=%.4f\n", A);
	}
}