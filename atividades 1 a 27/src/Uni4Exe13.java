import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua primeira carta");
        int n1 = sc.nextInt();
        System.out.println("Insira sua segunda carta");
        int n2 = sc.nextInt();
        System.out.println("Insira sua terceira carta");
        int n3 = sc.nextInt();
        int cartasB = 0;

        if (n1 == 1 || n1 == 2 || n1 == 3) {
            cartasB++;
        } if (n2 == 1 || n2 == 2 || n2 == 3) {
            cartasB++;
        } if (n3 == 1 || n3 == 2 || n3 == 3) {
            cartasB++;
        }
        if (cartasB == 1) {
            System.out.println("TRUCO");
        }else if (cartasB == 2) {
            System.out.println("SEIS");
        } else if (cartasB == 3) {
            System.out.println("NOVE");
        } sc.close();
    }
}
