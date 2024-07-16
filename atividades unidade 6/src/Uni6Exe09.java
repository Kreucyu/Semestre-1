import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        //variáveis iniciais
        Scanner sc = new Scanner(System.in);
        int clientes = 5;
        int resp = 3;
        int geral[][] = new int[clientes][resp];
        dadosC(geral, sc, clientes, resp);
        calcularMds(geral, sc, clientes, resp);
        
}
private static void dadosC(int geral[][], Scanner sc, int clientes, int resp) {
    //entrada de dados
        for (int i = 0; i < clientes; i++) {
        System.out.print("\nQual o sexo do cliente " + (i + 1) + "? (1=f e 2=m) ");
        geral[i][0] = sc.nextInt();
        System.out.print("\nQual a idade do cliente " + (i + 1) +  "? ");
        geral[i][1] = sc.nextInt();
        System.out.print("\nQual a nota do cliente " + (i + 1) +  "? (0 a 10) ");
        geral[i][2] = sc.nextInt();
        }
    }
    private static void calcularMds(int geral[][], Scanner sc, int clientes, int resp) {
        //dados base
        double mediaNG = 0;
        int Tn = 0;
        double mH = 0;
        int qtdH = 0;
        int nHs = 0;
        int mjid = -1;
        int mlj = Integer.MAX_VALUE;
        int nmj = 0;
        int cqm = 0;
        

        //média geral cálculo
        for (int i = 0; i < clientes; i++) {
            Tn += geral[i][2];
        }
        mediaNG = (double) Tn / clientes;

        //média dos homens 
        for (int i = 0; i < clientes; i++) {
            if (geral[i][0] == 2) {
                qtdH += 1;
                nHs += geral[i][2];
            }
        }
        if (qtdH > 0) {
            mH = (double) nHs / qtdH;
        }
        else {
            mH = 0;
        }

        //descobrir mulher mais jovem e sua nota
        for (int i = 0; i < clientes; i++) {
            if (geral[i][0] == 1) {
                if (geral[i][1] < mlj) {
                    mjid = geral[i][1];
                    nmj = geral[i][2];
                }
            }
        }

        //mulheres acima de 50 anos com nota maior que a média
        for (int i = 0; i < clientes; i++) {
            if (geral[i][0] == 1 && geral[i][1] > 50) {
                if (geral[i][2] > mediaNG) {
                    cqm++;
                }
            }
        }
        //exibição de resultados
        System.out.println("\nA média geral é " + mediaNG);
        System.out.println("\nA nota média dos homens é " + mH);
        System.out.println("\nA nota atribuida pela mulher mais jovem é " + nmj);
        System.out.println("\nA quantidade de mulheres acima de 50 anos com nota maior que a media geral é " + cqm);
    }
}
