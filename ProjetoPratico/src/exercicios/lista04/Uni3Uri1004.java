import java.util.Scanner;

public class Uni3Uri1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

		sc.close();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);
	}
}