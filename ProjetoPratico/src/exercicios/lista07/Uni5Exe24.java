package exercicios.lista07;

import java.util.Scanner;

public class Uni5Exe24 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o limite de peso do dia em kg:");
    double limitePeso = teclado.nextDouble();
    
    double totalPesado = 0;
    
    while (limitePeso > totalPesado) {
		
    	System.out.println("Informe o peso do peixe em gramas:");
        double pesoPeixe = teclado.nextDouble();
        
        totalPesado += pesoPeixe / 1000;
    	
        System.out.println("O total de peixes pesados até o momento é de: " + totalPesado + "kg");
        
    	System.out.println("Deseja informar o peso de mais um peixe? (Sim/Não)");
    	String deseja = teclado.next();
    	if (deseja.equals("Não")) {
    		break;
    	}
    	
    	System.out.println("Total do dia em kg: " + totalPesado);
	}
    
    teclado.close();
  }

}

