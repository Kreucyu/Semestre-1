import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        while (true){
            System.out.print("\nDigite o nome do aluno do aluno ('fim' para encerrar): ");
            String nome = sc.next();
            String end = nome.toLowerCase();
        
            if (end.equals("\nfim")){
                break;
            } else {
                System.out.print("\nDigite as notas do aluno: ");
                double nt1 = sc.nextDouble();
                double nt2 = sc.nextDouble();
                media = (nt1 + nt2) / 2;
                System.out.println("\nA média do aluno " + nome + " é " + media);

            }
        }
        sc.close();
    }
}
