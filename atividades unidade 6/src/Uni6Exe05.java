import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        String[] vetor1 = new String[5];
        String[] vetor2 = new String[5];
        String[] vetor3 = new String[5];

        vetor3[0] = "Gosta de séries?";
        vetor3[1] = "Gosta de sair?";
        vetor3[2] = "Gosta de música?";
        vetor3[3] = "Gosta de viajar?";
        vetor3[4] = "Gosta de animais?";

        leitura(vetor1, vetor2, vetor3);
        afinidade(vetor1, vetor2);
        int af = afinidade(vetor1, vetor2);
        resultado(vetor1, vetor2, af);
    }

    public static void leitura(String[] vetor1, String[] vetor2, String[] vetor3) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println();
            System.out.println(vetor3[i]);
            System.out.print("\nQual a resposta do rapaz? (sim, não ou ind) ");
            vetor1[i] = sc.next();
            System.out.print("\nQual a resposta da moça? (sim, não ou ind) ");
            vetor2[i] = sc.next();
        } sc.close();
    }
    public static int afinidade(String[] vetor1, String[] vetor2) {
        int res = (int) 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i].equals("sim") && vetor2[i].equals("sim") || vetor1[i].equals("não") && vetor2[i].equals("não") || vetor1[i].equals("ind") && vetor2[i].equals("ind")) {
                res += 3;
            } if (vetor1[i].equals("sim") && vetor2[i].equals("não") || vetor1[i].equals("não") && vetor2[i].equals("sim")) {
                res -= 2;
            } if (vetor1[i].equals("ind") && vetor2[i].equals("sim") || vetor1[i].equals("ind") && vetor2[i].equals("não") || vetor1[i].equals("sim") && vetor2[i].equals("ind") || vetor1[i].equals("não") && vetor2[i].equals("ind")) {
                res += 1;
            }
        } 
        return res;
    }
    public static void resultado(String[] vetor1, String[] vetor2, int af) {
        if (af == 15) {
            System.out.println("\nCasem");
        } else if (af < 15 && af > 9) {
            System.out.println("\nVocês têm muita coisa em comum!");
        } else if (af < 10 && af > 4) {
            System.out.println("\nTalvez não dê certo :(");
        } else if (af < 5 && af >= 0) {
            System.out.println("\nVale um encontro.");
        } else if (af <= -1 && af >= -9) {
            System.out.println("\nMelhor não perder tempo");
        } else if (af == -10) {
            System.out.println("\nVocês se odeiam!");
        }
        
    }
}
