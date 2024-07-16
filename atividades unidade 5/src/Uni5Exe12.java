import java.util.Scanner;
public class Uni5Exe12 {
    public static void main(String[] args) {
        int numero = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQuantas linhas você deseja? ");
        int linhas = sc.nextInt();
        for (int fl = 1; fl < linhas; fl++){
            for (int cl = 1; cl <= fl; cl++){
                System.out.print(numero + " ");
                numero++;
            } 
            System.out.println();
        } 
        sc.close();
    }
}
