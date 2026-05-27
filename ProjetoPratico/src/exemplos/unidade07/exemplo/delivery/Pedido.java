package exemplos.unidade07.exemplo.delivery;

public class Pedido {

    String nomeCliente;
    String descricaoItem;
    double valor;
    boolean entregue;

    public Pedido(String nome, String descricao, double valor) {
        nomeCliente = nome;
        descricaoItem = descricao;
        // this vai chamar o atributo da classe.
        this.valor = valor;
    }

    boolean entregar() {
        // Atualiza o valor do atributo;
        entregue = true;
        // retorna o valor atualizado do atributo
        return entregue;
    }

    void exibirStatus() {
        if (entregue) {
            System.out.println("Pedido do " + nomeCliente + " entregue");
        } else {
            System.out.println("Pedido do " + nomeCliente + " pendente");
        }
    }
}
