import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A cor é azul?");
        System.out.println("Digite 'S' para sim e 'N' para não");
        String resposta = sc.nextLine();
        String resposta1 = resposta.toUpperCase();
        if (resposta1.equals("S")) {
            System.out.println("Sim");
        } else if (resposta1.equals("N")){
            System.out.println("Não");
        }
        else {
            System.out.println("Reinicie o programa e tente novamente");
        }
        sc.close();
    }
}
