package exemplos.unidade07.exemplo.delivery;

public class AppDelivery {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(
            "André","Pizza Frango com catupiry", 89.90);

        Pedido pedido2 = new Pedido(
            "José", "Chocolate branco com morango", 92.50);
        
        // chamada para o método entregar e armazena o valor retornado
        boolean situacaoPedido1 = pedido1.entregar();

        // chamada para o método exibirStatus
        pedido1.exibirStatus();
        pedido2.exibirStatus();
    }

}
