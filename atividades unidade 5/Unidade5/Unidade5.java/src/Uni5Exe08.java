import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Quantos números você deseja?");
     int n = sc.nextInt();
     double menor = Double.MAX_VALUE;
     double qt = 0;
     double qtp = 0;

     for (int i = 1; i <= n; i++) {
        System.out.println("Escreva o seu número " + i);
        double num = sc.nextDouble();
        if (0 > num) {
            if (menor > num) {
            menor = num;
        }
        } else if (num >= 0) {
            qt += num;
            if (num >= 0) {
                qtp += 1;
            }
        } 
     }
     System.out.println("O menor número negativo é " + menor);
     double media = qt / qtp;
     System.out.println("A media dos valores positivos é " + media);
     sc.close();
    }
}