import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor 1");
        int n1 = sc.nextInt();
        System.out.println("Escreva o valor 2");
        int n2 = sc.nextInt();
        
        if (n1 % n2 == 0 || n2 % n1 == 0){
                System.out.println("São múltiplos");
            } else {
                System.out.println("Não é múltiplo");
        } sc.close();
    }
}