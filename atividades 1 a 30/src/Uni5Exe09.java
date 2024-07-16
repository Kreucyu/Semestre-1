import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEscreva a quantidade de alunos");
        int n = sc.nextInt();
        int vt = 0;
        for (int i = 1; i <= n; i++ ) {
            System.out.println("\nEscreva o nome e idade do seu aluno " + i);
            String nome = sc.next();
            int idade = sc.nextInt();

            if (idade == 18) {
                System.out.println("\nO aluno " + nome + " tem 18 anos");
            } else if (idade >= 20) {
                vt += 1;
            }
        }
        System.out.println("\n" + vt + " alunos com mais de 20 anos");
        sc.close();
    }
}
