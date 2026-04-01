package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalSwitchErro2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor total da compra:");
        double valorTotal = sc.nextDouble();
    
        sc.close();

        // // Não é recomendado.
        // switch (valorTotal) {
        //     case 10.625:
        //         System.out.println("Teste");
        //         break;
        
        //     default:
        //         break;
        // }

    }

}
