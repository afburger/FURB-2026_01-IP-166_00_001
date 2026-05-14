package exercicios.lista08;

import java.util.Scanner;

/**
 * Uni6Exe05.java - Com o objetivo de determinar o índice de afinidade
 * entre um rapaz e uma moça cada um respondeu um
 * questionário com 5 perguntas, como por exemplo:
 * 
 * Gosta de música sertaneja?
 * Gosta de futebol?
 * Gosta de seriados?
 * Gosta de redes sociais?
 * Gosta da Oktoberfest?
 * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente).
 * O índice de afinidade é medido da seguinte maneira:
 * 
 * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
 * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
 * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
 * Crie um vetor para armazenar as respostas do rapaz
 * e outro para armazenar as respostas da moça.
 * Crie um método que possa ler tanto as respostas do rapaz como da moça,
 * e outro para calcular e retornar a afinidade.
 * Por fim, escreva a afinidade considerando os seguintes intervalos:
 * 
 * Afinidade Mensagem
 * 15 “Casem!
 * 10 a 14 “Vocês têm muita coisa em comum!”
 * 5 a 9 “Talvez não dê certo :(”
 * 0 a 4 “Vale um encontro.”
 * -1 a -9 “Melhor não perder tempo”
 * -10 “Vocês se odeiam!”
 */

public class Uni6Exe05POO {

    public static void main(String[] args) {
        String[] rapaz = new String[5];
        String[] moca = new String[5];

        fazPerguntas(rapaz, moca);

        int afinidade = calculaAfinidade(rapaz, moca);

        imprimeResultado(afinidade);

    }

    public static void fazPerguntas(String[] rapaz, String[] moca) {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Gosta de música sertaneja?",
                                "Gosta de futebol?",
                                "Gosta de seriados?",
                                "Gosta de redes sociais?",
                                "Gosta da Oktoberfest?"};

        System.out.println("Informe as respostas (SIM, NÃO, IND do rapaz:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i] + ": ");
            rapaz[i] = sc.next().toUpperCase();
        }

        System.out.println("Informe as respostas (SIM, NÃO, IND da moça:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i] + ": ");
            moca[i] = sc.next().toUpperCase();
        }
    }

    public static int calculaAfinidade(String[] rapaz, String[] moca) {
        // Calcula a afinidade
        int afinidade = 0;
        for (int idx = 0; idx < rapaz.length; idx++) {
            if (rapaz[idx].equals(moca[idx])) {
                afinidade += 3;
            } else {
                if ((rapaz[idx].equals("IND") 
                    && (moca[idx].equals("SIM") || moca[idx].equals("NÃO")))
                    || (moca[idx].equals("IND") 
                    && (rapaz[idx].equals("SIM") || rapaz[idx].equals("NÃO")))) {
                        afinidade += 1;

                } else {
                    if ((rapaz[idx].equals("SIM") && moca[idx].equals("NÃO")
                        || rapaz[idx].equals("NÃO") && moca[idx].equals("SIM"))) {
                        afinidade -= 2;
                    }
                }
            }
        }
        return afinidade;
    }

    public static void imprimeResultado(int afinidade) {
        System.out.println("Afinidade entre o rapaz e a moça:");
        
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo!");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("VocÊs se odeiam!");
        }
    }
}
