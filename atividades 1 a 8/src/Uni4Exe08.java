import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua letra: ");
        String let = sc.nextLine();
        String letra = let.toUpperCase();
        if (letra.equals("A")){
            System.out.println("É vogal");
        }
        else if(letra.equals("E")){
            System.out.println("É vogal");
        }
        else if(letra.equals("I")){
            System.out.println("É vogal");
        }
        else if(letra.equals("O")){
            System.out.println("É vogal");
        }
        else if(letra.equals("U")){
            System.out.println("É vogal");
        }
        else{
            System.out.println("NÃO é vogal");
        }
    }
    
}
