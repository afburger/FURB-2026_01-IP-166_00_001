package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

// Nome de classe sempre seguindo o padrão CamelCase
// Primeira letra de cada palavra em maiusculo.
// Nunca começa com número.
public class RevisaoProva01 {

    public static void main(String[] args) {
        // exemplo de nomenclatura de varável
        String nomeCompleto = "Andre Felipe Bürger";

        // declaração de variável
        int valor;

        // declaração de variável com atribuição
        int valor2 = 10;

        // declaração de constante
        final double precoDolar = 5.27;

        // várias variáveis do mesmo tipo, posso declarar tudo em uma única linha
        char a, b, c;
        char d = 'd', f = 'f', g = 'g';

        // Difernça para atribuir valor entre String e char
        char x = 'x';
        String xyz = "xyz";

        // Scanner para ler informações do console
        // é necessário fazer o import.
        Scanner sc = new Scanner (System.in);


        // Para imprimir ou mostrar coisas no console
        System.out.println("Mostra no console");


        System.out.println("Informe uma letra");
        // Para leitura de char utilize o next e pegue o primeiro caractere da string.
        char letra = sc.next().charAt(0);

        // Converter letra pra maíusculo
        letra = Character.toUpperCase(letra);

        System.out.println("Informe uma palavra");
        String palavra = sc.next();
        // Converter a String pra maíusculo
        palavra = palavra.toUpperCase();

        // Exemplos utilizando if, if/else, switch
        System.out.println("Informe o modelo do veículo");
        String modelo = sc.next();

        System.out.println("Informe o ano do veículo");
        int ano = sc.nextInt();

        System.out.println("Informe o valo da FIPE do veículo");
        double fipe = sc.nextDouble();

        if (2026 - ano >= 30) {
            System.out.println("Isento de IPVA");
        }

        // Exemplo de comparação de String
        if (modelo.equals("Fusca")
            || modelo.equals("Kombi")
            || modelo.equals("Brasilia")) {
                System.out.println("Você é raiz");
            } else {
                System.out.println("Você é nutella");
            }

        // Exemplo utilizando switch
        switch (ano) {
            case 2026:
                System.out.println("Carro zero");
                break;
            case 1964:
                System.out.println("É um clássico");
                break;
            default:
                System.out.println("É um semi-novo");
                break;
        }

        // Exeplo de formação de números reais
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("Valor da FIPE:" + df.format(fipe));

    }

}
