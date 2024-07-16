import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu valor em R$");
        int reais = sc.nextInt();

        int centena = reais / 100;
        int dezena = (reais % 100) / 10;
        int unidade = reais % 10;

        System.out.println(centena + " nota(s) de 100 reais " + dezena + " nota(s) de 10 reais " + unidade + " nota(s) de 1 real ");
    }
}