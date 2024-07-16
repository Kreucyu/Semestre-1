import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] reais = new double[12];

        leitura(reais);
        ajuste(reais);
        saida(reais);
      
    }
    public static void leitura(double[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nDigite o valor " + i + ": ");
            vetor[i] = sc.nextDouble();
        } sc.close();
    }
    public static void ajuste(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                double adc = vetor[i] * 0.02;
                vetor[i] = vetor[i] + adc;
            } else {
                double adc = vetor[i] * 0.05;
                vetor[i] = vetor[i] + adc;
            }
        }
    }
    public static void saida(double[] vetor) {
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor do vetor " + i + " após alteração é " + vetor[i]);
    }

    }
}   
