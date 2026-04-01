package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe26 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Escolha uma opção:\n" + "T: calcular a área de um triângulo de base b e altura h\n"
        + "Q: calcular a área de um quadrado de lado l\n" + "R: calcular a área de um retângulo de base b e altura h\n"
        + "C: calcular a área de um círculo de raio r");

    String opcao = teclado.next().toUpperCase();
    switch (opcao) {
      case "T":
        System.out.println("Digite a base e a altura: ");
        double base = teclado.nextDouble();
        double altura = teclado.nextDouble();
        System.out.println("Área do triângulo = " + base * altura / 2);
        break;
      case "Q":
        System.out.println("Digite o lado");
        double lado = teclado.nextDouble();
        System.out.println("Área do quadrado = " + lado * lado);
        break;
      case "R":
        System.out.println("Digite a base e a altura: ");
        double b = teclado.nextDouble();
        double h = teclado.nextDouble();
        System.out.println("Área do retângulo = " + b * h);
        break;
      case "C":
        System.out.println("Digite o raio: ");
        double r = teclado.nextDouble();
        System.out.println("Area do circulo: " + Math.PI * Math.pow(r, 2));
        break;
      default:
        System.out.println("Opção inválida");
    }
    teclado.close();
  }
}
