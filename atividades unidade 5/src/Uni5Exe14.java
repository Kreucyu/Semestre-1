import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mercadorias = 20;
        double valorT = 0;
        double valorV = 0;
        double lucroT = 0;
        double m1 = 0;
        double m2 = 0;
        double m3 = 0;


        for (int i = 1; i <= mercadorias; i++) {

          System.out.print("\nDigite o nome do produto " + i + ": ");
          String nome = sc.next();

          System.out.print("\nDigite o preço de compra do produto " + i + ": ");
          double pc = sc.nextDouble();
          valorT += pc;

          System.out.print("\nDigite o preço de venda do produto " + i + ": ");
          double pv = sc.nextDouble();
          valorV += pv;

          double lucro = (pv - pc) / pc * 100;
          

          if (lucro < 10) {
            m1 += 1;
          } else if (lucro >= 10 && lucro <= 20) {
            m2 += 1;
          } else if (lucro > 20) {
            m3 += 1;
          }

          lucroT = valorV - valorT;

        }
        System.out.println("\nA quantidade de mercadorias com lucro menor que 10% é de " + m1);
        System.out.println("\nA quantidade de mercadorias com lucro entre 10% a 20% é de " + m2);
        System.out.println("\nA quantidade de mercadorias com lucro maior de 20% é de " + m3);
        System.out.println("\nO valor total de compra dos produtos é de R$ " + valorT);
        System.out.println("\nO valor total de venda dos produtos é de R$ " + valorV);
        System.out.println("\nO lucro total dos produtos é de R$ " + lucroT);
        sc.close();
    }
}
