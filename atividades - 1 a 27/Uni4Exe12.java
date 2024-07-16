import java.util.Scanner;

public class Uni4Exe12 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado 1: ");
        float lado1 = sc.nextFloat();
        System.out.println("Digite o lado 2: ");
        float lado2 = sc.nextFloat();
        System.out.println("Digite o lado 3: ");
        float lado3 = sc.nextFloat();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 ||lado1 == lado3) {
                System.out.println("é isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }sc.close();
    }
}