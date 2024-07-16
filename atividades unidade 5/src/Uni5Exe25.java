import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pD = 0;
        int pE = 0;
        boolean pontos = true;

            while (pontos) {
                System.out.print("\nQuem marcou o ponto? D ou E ");
                String pt = sc.next();
                String ponto = pt.toUpperCase();
                if (ponto.equals("D")) {
                    pD++;
                } else if (ponto.equals("E")) {
                    pE++;
                }
                if (pD == 8 && pE < 7 || pD > 8 && pD - pE >= 2) {
                    System.out.println("\nO vencedor foi o jogador da direita");
                    pontos = false;
                } else if (pE == 8 && pD < 7|| pE > 8 && pE - pD >= 2) {
                    System.out.println("\nO vencedor foi o jogador da esquerda");
                    pontos = false;
                } 
            }
        sc.close();
    }

}
