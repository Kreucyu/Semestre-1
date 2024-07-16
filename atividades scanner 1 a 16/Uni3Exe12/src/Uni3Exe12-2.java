import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário");
        String nome = scanner.nextLine();
        System.out.println("Digite a quantidade de horas mensais do funcionário");
        double horasm = scanner.nextDouble();
        System.out.println("Escreva a quantidade de dependentes do funcionário ");
        int dep = scanner.nextInt();

        int vdep = 60;
        int vhora = 10;
        double inss = 0.085;
        double imp = 0.05;

        double horasv = horasm * vhora;
        double hdep = dep * vdep;
        double salb = hdep + horasv;
        double vinss = salb * inss;
        double vimp = salb * imp;
        double sall = (salb - vinss) - vimp;

        System.out.println("O salário bruto do funcionário " + nome + " é R$ " + salb);
        System.out.println("O salário líquido do funcionário " + nome + " é R$ " + sall);
        scanner.close();
    
    }
}