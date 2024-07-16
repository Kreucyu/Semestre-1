import java.util.Scanner;

public class Uni03Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Escreva a altura de sua lata");
        double altura = sc.nextDouble();

        System.out.println("Escreva o diâmetro de sua lata");
        double diametro = sc.nextDouble();

        double raio = diametro / 2;
        double volume = pi * (raio * raio) * altura;
        System.out.println("O volume de sua lata de óleo é " + volume);
        
        sc.close();



    }
}
