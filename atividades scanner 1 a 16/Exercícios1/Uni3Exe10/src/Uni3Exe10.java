import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o valor do cateto 1");
        double cat1 = sc.nextDouble();

        System.out.println("Escreva o valor do cateto 2");
        double cat2 = sc.nextDouble();

        double hip = (cat1 * cat1) + (cat2 * cat2);
        double hipotenusa = Math.sqrt(hip);
        System.out.println("A hipotenusa do seu triângulo é " + hipotenusa);

    }
}
