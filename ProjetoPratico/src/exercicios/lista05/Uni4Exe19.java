package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("x = ");
    double x = teclado.nextDouble();
    
    System.out.println("y = ");
    double y = teclado.nextDouble();
    
    if (x == 0 && y == 0) {
      System.out.println("Quadrante 0");
    } else {
      if (x > 0 && y > 0) {
        System.out.println("Quadrante 1");
      } else {
        if (x > 0 && y < 0) {
          System.out.println("Quadrante 2");
        } else {
          if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
          } else { // (x < 0 && y > 0)
            System.out.println("Quadrante 4");
          }
        }
      }
    }
    teclado.close();
  }
}
