import java.util.Scanner;

import java.util.Scanner;

public class Dados {
  
    public Dados() {

    }
        int vdep;
        int vhora; 
        double inss;
        double imp;

        public void funcionario () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        String nome = scanner.next();
        System.out.println("O nome do funcionário é " + nome);
        }

        public void salario () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas mensais do funcionário");
        double horasm = scanner.nextDouble();
        System.out.println("Escreva a quantidade de dependentes do funcionário ");
        int dep = scanner.nextInt();
        double horasv = horasm * vhora;
        double hdep = dep * vdep;
        double salb = hdep + horasv;
        double vinss = salb * inss;
        double vimp = salb * imp;
        double desc = (salb - vinss) - vimp;
        System.out.println("O salário bruto do funcionário é R$ " + salb + " e o salário líquido é R$ " + desc);
        }


        


   
}