package unidade04.exercicios.lista;

import java.util.Scanner;

//FIXME: não é do tipo COMPOSTO (deveria ter && ou ||)

public class Uni4Exe18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o dia do vencimento: ");
    int diaDoVencimento = teclado.nextInt();
    
    System.out.println("Digite o dia do pagamento: ");
    int diaDoPagamento = teclado.nextInt();
   
    System.out.println("Digite o valor da prestacao: ");
    double valorDaPrestacao = teclado.nextDouble();
    
    double totalAPagar;
    
    if (diaDoPagamento <= diaDoVencimento) {
      System.out.println("O pagamento está em dia, foi gerado um desconto de 10%");
      totalAPagar = valorDaPrestacao - (valorDaPrestacao * 0.1);
    } else {
      if (diaDoPagamento <= diaDoVencimento + 5) {
        totalAPagar = valorDaPrestacao;
      } else {
        totalAPagar = valorDaPrestacao + (0.02 * valorDaPrestacao * (diaDoPagamento - diaDoVencimento));
      }
    }
    System.out.println("Total a pagar = " + totalAPagar);
    teclado.close();
  }
}
