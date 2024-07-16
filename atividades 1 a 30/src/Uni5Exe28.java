import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean vt = true;
        double nn = 0;
        double cpm = 0;
        double sk = 0;
        double jq = 0;

            while (vt) {

                System.out.println("\nEscolha o conjunto: ");
                System.out.println("[1] - Nenhum de nós");
                System.out.println("[2] - CPM22");
                System.out.println("[3] - Skank");
                System.out.println("[4] - Jota Quest");
                System.out.println("");
                int cj = sc.nextInt();

                if (cj == 1) {
                    nn += 1;
                } else if (cj == 2) {
                    cpm += 1;
                } else if (cj == 3) {
                    sk += 1;
                } else if (cj == 4) {
                    jq += 1;
                } else {
                    System.out.println("\nInválido");
                }

                System.out.print("\nmais um voto? (s = SIM ou n = NÃO) ");
                String v = sc.next();
                String voto = v.toLowerCase();
        
                if (!voto.equals("s")) {
                    vt = false; 
                }
            } 

        double tv = nn + cpm + sk + jq;
        double pn = (nn / tv) * 100;
        double pc = (cpm / tv) * 100;
        double ps = (sk / tv) * 100;
        double pj = (jq / tv) * 100;

        System.out.println("\n O total de votos para Nenhum de nós foi " + nn + " com um percentual de " + pn + "%");
        System.out.println("\n O total de votos para CPM22 foi " + cpm + " com um percentual de " + pc + "%");
        System.out.println("\n O total de votos para Skank foi " + sk + " com um percentual de " + ps + "%");
        System.out.println("\n O total de votos para Jota Quest foi " + jq + " com um percentual de " + pj + "%");

        if (nn > cpm && nn > sk && nn > jq) {
            System.out.println("\nO vencedor foi Nenhum de nós");
        } else if (cpm > nn && cpm > sk & cpm > jq) {
            System.out.println("\nO vencedor foi CPM22");
        } else if (sk > nn && sk > cpm && sk > jq) {
            System.out.println("\nO vencedor foi Skank");
        } else if (jq > nn && jq > sk && jq > cpm) {
            System.out.println("\nO vencedor foi Jota Quest");
        } 
        sc.close();
    }
}
