import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vFd = 0;

        while(true) {
            System.out.print("\nDigite o valor da sua compra em R$: ");
            double vC = sc.nextDouble();

            if (vC > 500) {
                double dc = vC * 0.2;
                double aPg = vC - dc;
                vFd += aPg;
                System.out.println("\nO total a pagar é igual a R$ " + aPg);
            } else if (vC <= 500 && vC > 0) {
                double dc1 = vC * 0.15;
                double aPg1 = vC - dc1;
                vFd += aPg1;
                System.out.println("\nO total a pagar é igual a R$ " + aPg1);
            } else if (vC == 0) {
                System.out.println("\nFim");
                break;
            }
        }
        System.out.println("\nO total recebido no fim do dia foi R$ " + vFd);
        sc.close();
    }
}
