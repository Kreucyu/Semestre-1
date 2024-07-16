import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fc = true;
        int tm = 0;
        int tt = 0;
        int dmp = 0;
        int qtmp = 0;

        while (fc) {
            System.out.print("\nDigite o dia: ");
            int dia = sc.nextInt();
            if (dia < 1 || dia > 30) {
                System.out.println("\nDia inválido");
            } if (dia > 0 && dia < 31) {
            System.out.print("\nQual foi o total de peças produzidas no turno da manhã? ");
            int pm = sc.nextInt();
            tm += pm;
            System.out.print("\nQual foi o total de peças produzidas no turno da tarde? ");
            int pt = sc.nextInt();
            tt += pt;
            int total = pm + pt;
            qtmp = total;
            dmp = dia;
              if (dia > 0 && dia < 16) {
               if (total > 100 && pm > 30 && pt > 30) {
                double vr = total * 0.8;
                System.out.println("\nR$ " + vr + " (valor recebido)");
              } else {
                double vr1 = total * 0.5;
                System.out.println("\nR$ " + vr1 + " (valor recebido)");
              }
            } if (dia > 15 && dia < 31) {
                double vm = pm * 0.4;
                double vt = pt * 0.3;
                double vp = vm + vt;
                System.out.println("\nR$ " + vp + " (valor recebido)");
            }
            }
            System.out.print("\nNovo funcionário (1.sim 2.não)? ");
            int nf = sc.nextInt();
            if (nf != 1) {
                fc = false;
            } 
            }
            System.out.println("\nO dia mais produzido foi " + dmp + " com a quantidade total de " + qtmp);
         if (tt > tm) {
            System.out.println("\nO período mais produzido foi o da tarde");
        } if (tm > tt) {
            System.out.println("\nO período mais produzido foi o da manhã");
        }
        
    }
}

