import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aF = 0;
        int mulheres = 0;
        double mediaF = 0;
        double aM = 0;
        int homens = 0;
        double mediaM = 0;
        double aO = 0;
        int outros = 0;
        double mediaO = 0;
        double mediaT = 0;

        while(true) {
            System.out.print("\nDigite o gênero (M = Masculino, F = Feminino e O = Outro): ");
            String gen = sc.next();
            String genero = gen.toUpperCase();

             if (genero.equals("F")) {
                System.out.print("\nDigite a altura da pessoa (0 = FIM): ");
                double altura = sc.nextDouble();
                if (altura == 0) {
                    break;
                }
                aF += altura;
                mulheres += 1;
            } else if (genero.equals("M")) {
                System.out.print("\nDigite a altura da pessoa (0 = FIM): ");
                double altura = sc.nextDouble();
                if (altura == 0) {
                    break;
                }
                aM += altura;
                homens += 1;
            } else if (genero.equals("O")) {
                System.out.print("\nDigite a altura da pessoa(0 = FIM): ");
                double altura = sc.nextDouble();
                if (altura == 0) {
                    break;
                }
                aO += altura;
                outros += 1;
            }
        }
        mediaF = aF / mulheres;
        mediaM = aM / homens;
        mediaO = aO / outros;
        mediaT = (mediaF + mediaM + mediaO) / 3;

        System.out.println("\nA média feminina é " + mediaF);
        System.out.println("\nA média total é " + mediaT);
        sc.close();
    }
}

