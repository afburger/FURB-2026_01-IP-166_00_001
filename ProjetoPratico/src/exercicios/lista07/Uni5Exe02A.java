package exercicios.lista07;

public class Uni5Exe02A {

    public static void main(String[] args) {
        
        int somaPar = 0;
        int somaImpar = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                somaPar += numero;
            } else {
                somaImpar += numero;
            }

        }

        System.out.println("Soma de par: " + somaPar);
        System.out.println("Soma de ímpar " + somaImpar);

    }
}
