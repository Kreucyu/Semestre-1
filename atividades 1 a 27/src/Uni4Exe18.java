import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia do pagamento");
        int diaPagto = sc.nextInt();
        System.out.println("Digite o valor da prestação");
        double valPres = sc.nextDouble();
        int diaVenc = 10;
        int val = diaPagto - diaVenc;

        if (diaPagto <= diaVenc){
            double desc = valPres * 0.10;
            double vPago = valPres - desc;
            System.out.printf("O pagamento está em dia! ");
            System.out.printf("O valor a ser pago é de R$ " + vPago);
        } else if (diaPagto > diaVenc) {
          if (val > 0 && val <= 5) {
            System.out.println("O valor da prestação é de R$ " + valPres);
        } else if (val >= 6 && val <= 31){
            double taxa = valPres * 0.02;
            double aPagar = valPres + taxa;
            System.out.println("O valor a da prestação é de R$ " + aPagar);
        }   sc.close();
        }
    }
}