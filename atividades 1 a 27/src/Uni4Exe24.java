import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os 3 valores ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Qual ordem você deseja?");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior no meio");
        int ordem = sc.nextInt();
        

        if (ordem == 2) {
            if (b > c && c > a){
                System.out.println("A ordem é: " + b + ", " + c + ", " + a);
            } else if (c > b && b > a) {
                System.out.println("A ordem é: " + c + ", " + b + ", " + a);
            } else if (a > b && b > c) {
                System.out.println("A ordem é: " + a + ", " + b + ", " + c);
            } else if (a > c && c > b) {
                System.out.println("A ordem é: " + a + ", " + c + ", " + b);
            } else if (b > a && a > c) {
                System.out.println("A ordem é: " + b + ", " + a + ", " + c);
            } else if (c > a && a> b) {
                System.out.println("A ordem é: " + c + ", " + a + ", " + b);
            }
        } else if (ordem == 1) {
            if (a < b && b < c){
                System.out.println("A ordem é: " + a + ", " + b + ", " + c);
            } else if (a < c && c < b) {
                System.out.println("A ordem é: " + a + ", " + c + ", " + c);
            } else if (b < c && c < a)  {
                System.out.println("A ordem é: " + b + ", " + c + ", " + a);
            } else if (b < a  && a < c) {
                System.out.println("A ordem é: " + b + ", " + a + ", " + c);
            } else if (c < a && a < b) {
                System.out.println("A ordem é: " + c + ", " + a + ", " + b);
            }else if (c < b && b < a) {
                System.out.println("A ordem é: " + c + ", " + b + ", " + a);
            }
        } else if (ordem == 3) {
            if (c < a && b < a) {
                System.out.println("A ordem é: " + c + ", " + a + ", " + b);
            } else if (b < a && c < a) {
                System.out.println("A ordem é: " + b + ", " + a + ", " + c);
            } else if (a < b && c < b) {
                System.out.println("A ordem é: " + a + ", " + b + ", " + c);
            } else if (c < b && a < b) {
                System.out.println("A ordem é: " + c + ", " + b + ", " + a);
            } else if (a < c && b < c) {
                System.out.println("A ordem é: " + a + ", " + c + ", " + b);
            } else if (b < c && c < a) {
                System.out.println("A ordem é: " + b + ", " + c + ", " + a);
            }
        } else {
            System.out.println("Opção inválida");
        } sc.close();
    }
}
