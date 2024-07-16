import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        int[] dez = new int[10];
        leitura(dez);
        escritaI(dez);
    }
    public static void leitura(int[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nDigite o valor do vetor " + i + ": ");
            vetor[i] = sc.nextInt();
    } sc.close();
}
    public static void escritaI(int[] vetor) {
        System.out.println();
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}