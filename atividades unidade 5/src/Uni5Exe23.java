import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.print("\nQual o nome do funcionário? ");
            String nome = sc.next();
            System.out.print("\nQuantos produtos o funcionário vendeu? ");
            int produtos = sc.nextInt();
            double valorpds = 0;

            for (int i = 1; i <= produtos; i++) {
                System.out.print("\nQual a quantidade vendida e o valor do produto " + i + ": ");
                int qt = sc.nextInt();
                double val = sc.nextDouble();
                double ganho = val * qt;    
                valorpds += ganho;
            } 
                double salario = valorpds * 0.3;
                System.out.println("\nO funcionário " + nome + ", vendeu R$ " + valorpds + " e seu salário é de R$" + salario);
                System.out.print("\nDeseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
                String resp = sc.next();
                String escolha = resp.toLowerCase();
                
            if (!escolha.equals("s")) {
                repetir = false;
            } 
     } 
     sc.close(); 
   }
}