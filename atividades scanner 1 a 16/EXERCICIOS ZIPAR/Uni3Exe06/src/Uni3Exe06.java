import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        double prato = 0.750;
        double quilo = 25.0;
        
        System.out.println("Digite o peso do prato");
        double peso = scanner.nextDouble();
        
        double quilos = peso - prato;
        System.out.println("O peso do prato é " + quilos + " Kg ");
      
        double valor = quilos * quilo;
        System.out.println("Seu prato custa R$ " + valor);
  
        scanner.close();
  

    }
   

}

