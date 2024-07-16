import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd1 = 0, cd2 = 0, cd3 = 0, cd4 = 0, vn5 = 0, vb6 = 0, opcao;
        
        do {
            System.out.println("\nEscolha sua opção: ");
            System.out.println("\n[0] Sair");
            System.out.println("[1] Candidato 1");
            System.out.println("[2] Candidato 2");
            System.out.println("[3] Candidato 3");
            System.out.println("[4] Candidato 4");
            System.out.println("[5] Voto nulo");
            System.out.println("[6] Voto em branco\n");
            opcao = sc.nextInt();
            if (opcao == 0){
                break;
            } else if (opcao == 1) {
                cd1++;
            } else if (opcao == 2) {
                cd2++;
            } else if (opcao == 3) {
                cd3++;
            } else if (opcao == 4) {
                cd4++;
            } else if (opcao == 5) {
                vn5++;
            } else if (opcao == 6) {
                vb6++;
            } else {
                System.out.println("\nOpção inválida\n");
            }
        } while (opcao != 0);

        double total = cd1 + cd2 + cd3 + cd4 + vn5 + vb6;
        double percentualn = (vn5 / total) * 100;
        double percentualb = (vb6 / total) * 100;
        System.out.println("\nTotal de votos para o candidato 1: " + cd1);
        System.out.println("Total de votos para o candidato 2: " + cd2);
        System.out.println("Total de votos para o candidato 3: " + cd3);
        System.out.println("Total de votos para o candidato 4: " + cd4);
        System.out.println("Total de votos nulos: " + vn5); 
        System.out.println("Total de votos em branco: " + vb6);
        System.out.println("\nO percentual de votos nulos " + percentualn + "%");
        System.out.println("O percentual de votos em branco é " + percentualb + "%");
        sc.close();
    }
}
