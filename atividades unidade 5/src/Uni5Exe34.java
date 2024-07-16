import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hqt = 0;
        int opcao;
        do {
            System.out.println("\nSelecione uma opção: ");
            System.out.println("\n(1) encerrar a conta de um hóspede");
            System.out.println("\n(2) verificar número de contas encerradas");
            System.out.println("\n(3) sair\n");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("\nQual o nome do hóspede? ");
                String nome = sc.next();
                System.out.print("\nQuantas diárias ele ficou hospedado? ");
                int ds = sc.nextInt();
                hqt++;
                if (ds < 15) {
                    double vdmt = ds * 57.50;
                    System.out.println("\nO hóspede " + nome + " terá de pagar R$ " + vdmt);
                } else if (ds == 15) {
                    double vdmt = ds * 56.50;
                    System.out.println("\nO hóspede " + nome + " terá de pagar R$ " + vdmt);
                } else if (ds > 15) {
                    double vdmt = ds * 55;
                    System.out.println("\nO hóspede " + nome + " terá de pagar R$ " + vdmt);
                }
            } else if (opcao == 2) {
                System.out.println("\nO total de contas encerradas foi " + hqt);
            } else {
                System.out.println("\nSaindo...");
                break;
            }
        } while (opcao != 0);
        sc.close();
    }
}
