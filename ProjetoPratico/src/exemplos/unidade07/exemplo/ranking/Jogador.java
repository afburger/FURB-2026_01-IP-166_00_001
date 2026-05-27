package exemplos.unidade07.exemplo.ranking;

public class Jogador {

    String nome;
    int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

boolean eDestaque() {
        if (pontuacao > 1000) {
            return true;
        } else {
            return false;
        }
    }

    void exibir(int posicao) {

        String asterisco = "";
        if (eDestaque()) {
            asterisco =  "*";
        }
        //nome - pontuacao pts *
        System.out.println(posicao
            + "° " + nome
            + " - " + pontuacao + " pts " + asterisco
        );
    }

}
