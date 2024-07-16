import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] reais = new double[12];
        
        leitura(reais);
        double vM = media(reais);
        saida(reais, vM);

    }
    public static void leitura(double[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nDigite o valor " + i + ": ");
            vetor[i] = sc.nextDouble();
        } sc.close();
    }
    public static double media(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }
    public static void saida(double[] vetor, double vM) {
        System.out.println("\nValores maiores que a média (" + vM + ")\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vM) {
                System.out.println(vetor[i] + " é maior que a média");
            }
        }
    }


}
