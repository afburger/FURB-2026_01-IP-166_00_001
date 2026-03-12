package exercicios.lista02;

import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) {
        final double conteudoLata = 350;
        final double conteudo600 = 600;
        final double conteudo2L = 2000;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de latas de 350ml:");
        int quantidadeLata = scan.nextInt();

        System.out.println("Informe a quantidade de garrafas de 600ml:");
        int quantidade600 = scan.nextInt();

        System.out.println("Infomre a quantidade de garrafas de 2L: ");
        int quantidade2L = scan.nextInt();

        double totalLata = quantidadeLata * conteudoLata;
        double total600 = quantidade600 * conteudo600;
        double total2L = quantidade2L * conteudo2L;

        // Converte a quantidade para litros.
        double totalLitros = (totalLata + total600 + total2L) / 1000;

        System.out.println("O cliente comprou ao total " + totalLitros +" litros.");
    }

}
