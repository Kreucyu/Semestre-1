import java.util.Scanner;

public class Uni4Exe14 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0){
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Válida");
            } else if (mes  != 2 && dia < 31) {
                System.out.println("Válida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Válida");
            } else if (dia == 29 && ano % 4  == 0 && !(ano % 100 == 0  && ano % 400 != 0)) {
                System.out.println("Válida");
            } else {
                System.out.println("Não válida");
            }
        }
        sc.close();
    }
}