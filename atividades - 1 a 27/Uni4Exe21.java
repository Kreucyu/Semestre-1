import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com sua altura em metros");
        double altura = sc.nextDouble();
        System.out.println("Entre com seu peso em KG");
        double peso = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("O valor do IMC é " + imc);
        
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grau III (mórbida)");
        }sc.close();
        
    }
}
