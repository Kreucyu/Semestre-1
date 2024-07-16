import java.util.Scanner;

public class Uni4Exe16 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade da mulher 1");
        int m1 = sc.nextInt();
        System.out.println("Digite a idade da mulher 2");
        int m2 = sc.nextInt();
        System.out.println("Digite a idade do homem 1");
        int h1 = sc.nextInt();
        System.out.println("Digite a idade do home 2");
        int h2 = sc.nextInt();

        if (m1 > m2 && h1 > h2){
            int prd = m1 * h2;
            int som = h1 + m2;
            System.out.println("O produto é " + prd + " e a soma é " + som);
        } else if (m1 < m2 && h1 < h2) {
            int prd = m2 * h1;
            int som = h2 + m1;
            System.out.println("O produto é " + prd + " e a soma é " + som);
        } else if (m1 < m2 && h1 > h2){
            int prd = m2 * h2;
            int som = h1 + m1;
            System.out.println("O produto é " + prd + " e a soma é " + som);
        } else if (m1 > m2 && h1 < h2){
            int prd = m1 * h1;
            int som = m2 + h2;
            System.out.println("O produto é " + prd + " e a soma é " + som);
        } sc.close();
    }   
}