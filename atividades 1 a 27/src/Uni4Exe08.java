import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a letra: ");
        String letr = sc.nextLine();
        String letra = letr.toUpperCase();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("É vogal");
        } else {
        System.out.println("NÃO é vogal");
        }
        sc.close();
    }
}
