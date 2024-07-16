import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números deseja digitar?");
        int n = sc.nextInt();
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        for (int i = 1; i <= n; i++) {
          System.out.println("Digite seu " + i + " número");
          double num = sc.nextDouble();
            if (maior < num) {
                maior = num;
          } else if (menor > num) {
                menor = num;
          }
        }
          System.out.println("O maior número " + maior + " e o menor número é " + menor);
          sc.close();
    } 
}
