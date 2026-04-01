package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe25 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite dois numeros");
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
   
    System.out.println("Escolha uma opção:");
    System.out.println("1 -Soma de dois números.");
    System.out.println("2 -Diferença entre dois números.");
    System.out.println("3 -Produto entre dois números.");
    System.out.println("4 -Divisão entre dois números (o denominador não pode ser zero).");
    int opcao = teclado.nextInt();
    switch (opcao) {
      case 1:
        System.out.println(a + b);
        break;
      case 2:
        System.out.println(a - b);
        break;
      case 3:
        System.out.println(a * b);
        break;
      case 4:
        if (b == 0) {
          System.out.println("Denominador inválido");
        } else {
          System.out.println(a / b);
        }
        break;
      default:
        System.out.println("OPção do menu inválida");
        break;
    }
    teclado.close();
  }
}
