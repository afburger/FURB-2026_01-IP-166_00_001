package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe22 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe até que ano deve ser calculado:");
    int anoLimite = teclado.nextInt();

    int ano = 1995;
    double salario = 2000;
    double percentualAumento = 1.5;
    double valorAumento = (salario * percentualAumento) / 100;
    
    while (ano < anoLimite) {
    	salario +=  valorAumento;
    	valorAumento = valorAumento * 2;
    	ano++;
	  }
    
    System.out.println("O salário atual é de: R$ " + salario);
    
    teclado.close();
  }

}

