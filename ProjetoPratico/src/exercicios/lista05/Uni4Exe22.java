package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe22 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com a opção: ");
    
    int opcaoAluno = teclado.nextInt();
    
    switch (opcaoAluno) {
      case 1:
        System.out.println("Bacharel em Ciência da Computação");
        break;
      case 2:
        System.out.println("Licenciado em Computação");
        break;
      case 3:
        System.out.println("Bacharel em Sistemas de Informação");
        break;
      default:
        System.out.println(" .. opção não definida");
        break;
    }
    teclado.close();
  }
}
