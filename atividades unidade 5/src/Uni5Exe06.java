import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotaldePessoas = 20;
        double MediadeAltura = 0;

        for (int i = 1; i <= TotaldePessoas; i++) {
          System.out.print("\nAltura da pessoa " + i + " em metros: ");
          double Altura = sc.nextDouble();
          MediadeAltura += Altura;
        }   
          double media = MediadeAltura / TotaldePessoas;
          System.out.println("\nA média de altura das pessoas é " + media);
          sc.close();
    }
}
