import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número");
        float num = sc.nextFloat();
        int numi = (int) num;


        if (num - numi == 0) {
            System.out.println("Não foram digitadas casas decimais");
        }
        else{
            System.out.println("Foram digitadas casas decimais");
            
        }
        sc.close();

    }
}
