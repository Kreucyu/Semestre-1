import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nQual dia da semana inicia o mês (1-Dom, 2-Seg, ...)? ");
        int pDia = sc.nextInt();

        System.out.print("\nDigite o número de dias no mês: ");
        int qtDias = sc.nextInt();

        System.out.println("\nD  S  T  Q  Q  S  S\n");

        int dAtual = 1;

        for (int i = 1; i < pDia; i++) {
            System.out.print("   ");
        }

        while (dAtual <= qtDias) {
            System.out.printf("%2d ", dAtual);
            if ((dAtual + pDia - 1) % 7 == 0 && dAtual != qtDias) {
                System.out.println(); 
            }
            dAtual++;
        }

        sc.close();
    }
}
