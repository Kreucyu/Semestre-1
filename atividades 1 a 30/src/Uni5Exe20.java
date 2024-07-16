import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a massa inicial? ");
        double massaI = sc.nextDouble();
        double massa = massaI;
        int tempo = 0;
        double massaF = 0;

        while (massa > 0.0005) {
            massa /= 2;
            tempo += 50;
        }
        massaF = massa * 1000;
        System.out.println("\nA massa inicial é " + massaI + " quilogramas");
        System.out.println("\nA massa Final é " + massaF + " gramas");
        System.out.println("\nO tempo decorrido foi de " + tempo + " segundos");
        sc.close();
    }
}
