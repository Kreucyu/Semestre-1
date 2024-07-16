import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        String resp = res.toUpperCase();
        if (resp.equals("M")) {
            System.out.println("Masculino");
        }
        else if (resp.equals("F")) {
            System.out.println("Feminino");
        }
        else if (resp.equals("I")) {
            System.out.println("Não Informado");
        }
        else {
            System.out.println("Entrada incorreta");
        }
        sc.close();

    }
    
}
