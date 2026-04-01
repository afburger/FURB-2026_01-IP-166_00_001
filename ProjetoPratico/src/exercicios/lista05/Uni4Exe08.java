package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe a letra: ");
    String letra2 = teclado.next();
    char letra = letra2.charAt(0);
    

    letra2 = letra2.toUpperCase();
    letra = Character.toUpperCase(letra);

    // Opção com string.
    if (letra2.equals("A") 
          || letra2.equals("E")
          || letra2.equals("I")
          || letra2.equals("O")
          || letra2.equals("U")) {
            
            System.out.println("É vogal");
    } else {
      System.out.println("NÃO é vogal");
    }

    // Opção com char
    if (letra == 'A' || letra == 'E' || letra == 'I' 
    		|| letra == 'O' || letra == 'U') {
      System.out.println("É vogal");
    } else {
      System.out.println("NÃO é vogal");
    }

    teclado.close();
  }
}
