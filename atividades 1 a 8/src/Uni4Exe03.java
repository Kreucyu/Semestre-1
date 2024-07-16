import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva seu primeiro valor : ");
        int num1 = sc.nextInt();
        System.out.println("Escreva seu segundo valor : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O valor 1 é maior"); } 
        else if (num1 == num2) {
            System.out.println("Os valores são iguais");}
        else {
            System.out.println("O valor 2 é maior");}

        sc.close();

    }
}
