import java.util.Scanner;

public class Uni3Uri1019 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tempo = teclado.nextInt();
		int horas = tempo / 3600;
		int minutos = (tempo % 3600) / 60;
		int segundos = (tempo % 3600) % 60;
		
		teclado.close();

		System.out.println(horas + ":" + minutos + ":" + segundos);
	}
}
