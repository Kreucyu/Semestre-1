import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor inicial (N): ");
        int N = sc.nextInt();

        System.out.print("\nDigite o decremento (K): ");
        int K = sc.nextInt();

        System.out.print("\nDigite o tamanho da mochila (M): ");
        int M = sc.nextInt();

        int somaNm = 0;
        int somaFm = 0;
        int i = N;

        String eM = "";
        String eF = "";
        String emt = "";

        while (i > 0) {
            if (i <= M - somaNm) {
                eM += i + " ";
                somaNm += i;
            } else {
                eF += i + " ";
                somaFm += i;
            }
            emt += i + " ";
            i -= K;
        }
        System.out.println("\nTodos os elementos: " + emt);
        
        System.out.println("\nElementos na mochila: " + eM);
        System.out.println("\nSoma dos elementos na mochila: " + somaNm);

        System.out.println("\nElementos fora da mochila: " + eF);
        System.out.println("\nSoma dos elementos fora da mochila: " + somaFm);
        
        sc.close();
    }
}
