import java.util.Scanner;

public class Uni4Exe15 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de meses da admição do funcionário");
        int mes = sc.nextInt();

        if (mes <= 12) {
            System.out.println("O reajuste será de 5% do salário");
        } else if (mes >= 13 & mes <= 48) {
            System.out.println("O reajuste será de 7% do salário");
        } else {
            System.out.println("Não será necessário reajustar");
        } sc.close();
    }
}