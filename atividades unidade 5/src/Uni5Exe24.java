import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQual o limite diário? (em KG) ");
        float l = sc.nextInt();
        float limite = l * 1000;
        float pesoT = 0;
        boolean peixe = true;

        while (peixe && pesoT < limite) {
            System.out.print("\nInforme o peso do peixe em gramas ");
            float peso = sc.nextFloat();
            pesoT += peso;
            System.out.println("\nO peso total obtido até o momento é " + pesoT + " gramas ");
            if (pesoT > limite) {
                System.out.println("\nO limite diário foi excedido");
            } else {
            System.out.print("\nDeseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            String e = sc.next();
            String escolha = e.toLowerCase();
            if (!escolha.equals("s")) {
                peixe = false;
            } 
        }
        }
        sc.close();
    }

}
