import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a temperatura que deseja converter");
        double celcius = sc.nextDouble();

        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("Sua temperatura foi convertida, em Fahrenheit é " + fahrenheit + " graus");
    }
}
