import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotaldePessoas = 5;
        double MediadeAltura = 0;
        System.out.println("Digite a altura das pessoas");

        for (int i = 1; i <= TotaldePessoas; i++) {
          System.out.println("Altura da pessoa " + i + " em metros");
          double Altura = sc.nextDouble();
          MediadeAltura += Altura;
        }   
          double media = MediadeAltura / TotaldePessoas;
          System.out.println("A média de altura das pessoas é " + media);
          sc.close();
    }
}
