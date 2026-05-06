package exercicios.lista07;

public class Uni5Exe02B {

    public static void main(String[] args) {
        
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 2; i <= 100; i+=2) {
            somaPar += i;
        }

        for (int i = 1; i <= 100; i+=2) {
            somaImpar += i;
        }

        System.out.println("Soma de par: " + somaPar);
        System.out.println("Soma de ímpar " + somaImpar);

    }
}
