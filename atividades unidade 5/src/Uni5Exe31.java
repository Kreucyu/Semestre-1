import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite seu número inteiro: ");
        int n = sc.nextInt();
        System.out.println("\n\tNúmero   Decompositor");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println("\t " + n + "\t      " + i);
                n = n / i;
            }
        }
        System.out.println("\t 1");
    }
}

