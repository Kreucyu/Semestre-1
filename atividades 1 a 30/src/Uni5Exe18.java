import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac4 = 0;
        int ac5 = 0;
        int ac9 = 0;
        int ac12 = 0;

        while (true) {
            System.out.print("\nQual canal estava sendo assistido na casa? (0 = FIM) ");
            int canal = sc.nextInt();
            if (canal == 0) {
              System.out.println("\nFim");
              break;
            } 
            else if (canal == 4) {
                System.out.print("\nQuantas pessoas estavam assistindo? ");
                int p4 = sc.nextInt();
                ac4 += p4;
            } else if (canal == 5) {
                System.out.print("\nQuantas pessoas estavam assistindo? ");
                int p5 = sc.nextInt();
                ac5 += p5;
            } else if (canal == 9) {
                System.out.print("\nQuantas pessoas estavam assistindo? ");
                int p9 = sc.nextInt();
                ac9 += p9;
            } else if (canal == 12) {
                System.out.print("\nQuantas pessoas estavam assistindo? ");
                int p12 = sc.nextInt();
                ac12 += p12;
            } else {
              System.out.println("\nCanal inválido");
              break;
            }
          }

            double adTotal = (ac4 + ac5 + ac9 + ac12);
            double pAd4 = (ac4 / adTotal) * 100;
            double pAd5 = (ac5 / adTotal) * 100;
            double pAd9 = (ac9 / adTotal) * 100;
            double pAd12 = (ac12 / adTotal) * 100;
            System.out.println("\nA audiência do canal 4 foi de " + pAd4 + "% da audiência total");
            System.out.println("\nA audiência do canal 5 foi de " + pAd5 + "% da audiência total");
            System.out.println("\nA audiência do canal 9 foi de " + pAd9 + "% da audiência total");
            System.out.println("\nA audiência do canal 12 foi de " + pAd12 + "% da audiência total");
            sc.close();
       }
            
    }

