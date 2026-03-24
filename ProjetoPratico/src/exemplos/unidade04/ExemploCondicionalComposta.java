package exemplos.unidade04;

import java.util.Scanner;

public class ExemploCondicionalComposta {

    /*
     * Escolha de frete do iFood.
     * Pedido minimo 40 reais e usuário do clube ou horario das 17 às 18 : o frete é grátis. 
     * Pedido mínimo 40 reais ou usuario do clube o frete tem desconto.
     * Se não atender nenhuma das situações acima o frete é normal. 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do pedido.");
        int valorPedido = sc.nextInt();

        System.out.println("Informe se você possui o clube:");
        boolean temClube = sc.nextBoolean();

        System.out.println("Informe a hora do pedido:");
        int horaPedido = sc.nextInt();


        boolean horaDoDesconto = horaPedido >= 17 && horaPedido <= 18;

        if (horaDoDesconto || (valorPedido > 40 && temClube)) {
            System.out.println("Frete grátis");
        } else if (valorPedido > 40 || temClube) {
            System.out.println("Frete tem desconto!");
        } else {
            System.out.println("Frete normal");
        }


        /*
        if (valorPedido > 40 && temClube) {
            System.out.println("Frete grátis");
        } else {
            if (valorPedido > 40 || temClube) {
                System.out.println("Frete tem desconto");
            } else {
                System.out.println("Frete normal");
            }
        }
        */
    }


}
