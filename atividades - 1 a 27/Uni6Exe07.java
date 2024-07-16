import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQual o valor do vetor? ");
        int n = sc.nextInt();
        if (n <= 20) {
            int[] vetor = new int[n];
            coletor(vetor, sc);
            ordenar(vetor, sc);
            fim(vetor);
        } else {
            System.out.println("\nO vetor não pode ter mais de 20 elementos");
        }

    }
    public static void coletor(int[] vetor, Scanner sc) {
        
        int i = 0;
        while (i < vetor.length) {
            System.out.print("\nDigite um número para verificar: ");
            int num = sc.nextInt();
            
            boolean tent = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == num) {
                    tent = true;
                    break;
                }
            }
            
            if (tent) {
                System.out.println("\nValor já armazenado");
            } else {
                vetor[i] = num;
                i++;
            }
        }

    }
    public static void ordenar(int[] vetor, Scanner sc) {

        for (int i = 0; i < vetor.length -1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int h = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = h;
                }
            }
        }
    }
    public static void fim(int[] vetor) {

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
