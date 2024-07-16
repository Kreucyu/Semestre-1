import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQual o valor? ");
        int valor = sc.nextInt();
        int vt = valor / 20;
        int dz = (valor % 20) / 10;
        int cc = (valor % 10) / 5;
        int ds = (valor % 5) / 2;
        int um = (valor % 5) % 2;

        System.out.println(+ vt + " cédula(s) de 20, " + dz + " cédula(s) de 10, " + cc + " cédula(s) de 5, " + ds + " cédula(s) de 2 e " + um + " cédula(s) de 1");
    }
}
