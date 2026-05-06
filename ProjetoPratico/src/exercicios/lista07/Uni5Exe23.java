package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe23 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double percentualComissao = 30;
    
    String desejaInformarNovoVendedor = "Sim";
    String relatorio = "";
    while (desejaInformarNovoVendedor.equals("Sim")) {
		System.out.println("Informe o nome do vendedor:");
		String nome = teclado.next();
		
		System.out.println("Informe o numero de produtos vendidos pelo vendedor:");
		int qtdProdutos = teclado.nextInt();
		
		double salario = 0;
		int totalVendas = 0;
		
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Informe a quantidade vendida do produto: " + i);
			int qtdVendas = teclado.nextInt();
			
			totalVendas += qtdVendas;
			
			System.out.println("Informe o valor unitário do produto: " + i);
			double valorUnitario = teclado.nextDouble();
		
			double valorSalarioProduto = (valorUnitario * percentualComissao) / 100;
		
			salario += valorSalarioProduto * qtdVendas;
			
		}
		System.out.println("Deseja informar mais um vendedor? (Sim ou Não");
		desejaInformarNovoVendedor = teclado.next();
		
		relatorio += "O vendedor " + nome + "teve um total de " + totalVendas + "vendas e seu salário é de: " + salario +  "\n";
    }
    
    
    System.out.println(relatorio);
    
    teclado.close();
  }

}

