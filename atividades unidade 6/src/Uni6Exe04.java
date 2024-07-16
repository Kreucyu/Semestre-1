import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        leitura(vetor1, vetor2);
        soma(vetor1, vetor2, vetor3);
        escrita(vetor1, vetor2, vetor3);
        
    }
    public static void leitura(int[] vetor1, int[] vetor2) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("\nDigite o valor " + i + " do vetor 1: ");
            vetor1[i] = sc.nextInt();
        } 
        for (int j = 0; j < vetor2.length; j++) {
            System.out.print("\nDigite o valor " + j + " do vetor 2: ");
            vetor2[j] = sc.nextInt();
        } sc.close();
    }
    public static void soma(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }
    public static void escrita(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.println();
        System.out.println("\n      vetor1   vetor2  vetor3\n");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("\t" + vetor1[i] + "\t " + vetor2[i] + "\t " + vetor3[i]);
        }
    }

}
