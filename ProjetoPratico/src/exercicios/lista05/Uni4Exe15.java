package unidade04.exercicios.lista;

import java.util.Scanner;


//FIXME: não é do tipo COMPOSTO (deveria ter && ou ||)


public class Uni4Exe15 {
  public static void main(String[] args) {
    System.out.println("Digite o tempo de contrato atual, em meses: ");
    
    Scanner teclado = new Scanner(System.in);
    
    int tempoDeContratacao = teclado.nextInt();
    
    if (tempoDeContratacao <= 12) {
      System.out.println("5% de reajuste");
    } else if (tempoDeContratacao < 49) {
      System.out.println("7% de reajuste");
    }
    teclado.close();
  }
}
