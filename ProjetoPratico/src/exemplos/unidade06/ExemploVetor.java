package exemplos.unidade06;

public class ExemploVetor {

    public static void main(String[] args) {
        
        double[] notas = new double[10];
        notas[0] = 10;
        notas[1] = 5.5;
        notas[2] = 7;
        notas[3] = 9.5;
        notas[4] = 7.8;
        
        for (int idx = 5; idx < notas.length; idx++) {
            notas[idx] = 10;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota [" + i + "] = " + notas[i]);
        }
    }

}
