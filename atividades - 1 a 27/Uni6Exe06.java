import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor do seu vetor: ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        valorV(vetor, sc);
        vouf(vetor, sc);
    }
    public static void valorV(double[] vetor, Scanner sc) {
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nQual o valor do vetor " + i + "? ");
            vetor[i] = sc.nextDouble();
        }
    
    }
    public static void vouf(double[] vetor, Scanner sc) {
      
        System.out.print("\nQual o valor que deseja verificar? ");
        double ver = sc.nextDouble();
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == ver) {
                achou = true;
            }
        }
            if (achou) {
                System.out.println("\nValor encontrado!");
            } else {
                System.out.println("\nValor não encontrado");
            }
            sc.close();
        }
        
    }
    
    

