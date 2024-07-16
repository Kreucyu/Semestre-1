import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua renda anual");
        double renda = sc.nextDouble();
        System.out.println("Digite a quantidade de dependentes");
        double dep = sc.nextDouble();
        double deps = (renda - (renda * (dep * 0.02))) / 12;
        

    if (deps < 2.000){
        System.out.println("Não será necessário pagar imposto de renda");
    } else if (deps >= 2.000 && deps < 5.000) {
        double imp = deps * 0.05;
        System.out.println("O seu imposto de renda será de R$ " + imp);
    } else if (deps >= 5.000 && deps < 10.000) {
        double imp = deps * 0.10;
        System.out.println("O seu imposto de renda é de R$ " + imp);
    } else if (deps >= 10.000) {
        double imp = deps * 0.15;
        System.out.println("O seu  imposto de renda é de R$ " + imp);
    } sc.close();
  }
}