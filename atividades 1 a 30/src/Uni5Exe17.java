import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaA = 0;
        double qtA = 0;
        double maiorA = 0;
        double menorA = 0;
        double menor = Double.MAX_VALUE;
        double maior = 0;

        while (true) {
            System.out.print("\nInforme o número de inscrição (0 = FIM): ");
            int nI = sc.nextInt();

            if (nI == 0) {
                break;
            } 

            System.out.print("\nInforme a altura do atleta: ");
            double altura = sc.nextDouble();
            qtA += 1;
            mediaA += altura;

            if (altura > maior) {
                    maior = altura;
                    maiorA = nI;
            } else if (altura < menor) {
                    menor = altura;
                    menorA = nI;
            }
        }

        System.out.println("\nO maior atleta é " + maiorA + " com altura de " + maior + " metros");
        System.out.println("\nO menor atleta é " + menorA + " com altura de " + menor + " metros");
        mediaA = mediaA / qtA;
        System.out.println("\nA média das alturas é: " + mediaA + " metros");
        sc.close();

    }
}
