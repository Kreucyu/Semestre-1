import java.util.Scanner;

public class Uni03Exe08 {
    public static void main(String[] args) {

        System.out.println("Bem vindo!");
        Scanner scanner = new Scanner(System.in);

        double valorDolar = 4.99;

        System.out.println("Quantos dólares você deseja converter em reais?");
        double dolar = scanner.nextDouble();
        System.out.println("O valor do dolar é " + valorDolar + " você estará convertendo $ " + dolar + " em reais");
        double real = dolar * valorDolar;
        System.out.println("Você converteu $ " + dolar + " em R$ " + real);

        scanner.close();
    }
}
