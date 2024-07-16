import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pM = 7.00;
        int nP = 0;
        int tI = 0;
        int a150aP = 0;
        boolean pedagio = true; 

        while (pedagio) {
            System.out.print("\nQual o valor do pedágio e a distância da rota (em KM)? ");
            double vP = sc.nextDouble();
            if (vP < 0) {
              pedagio = false;
            } else {
              double di = sc.nextDouble();
              if (vP >= pM) {
                nP++;
              } if (di > 0) {
                tI++;
              } if (vP < pM && di > 150) {
                a150aP++;
              }
            }
        }
        System.out.println("\ntrechos com valor acima do qual ele nega-se a pagar: " + nP);
        System.out.println("\nquantidade de trechos informados: " + tI);
        System.out.println("\ntrechos acima de 150km com valor aceito por ele: " + a150aP);
        sc.close();
    }
}
