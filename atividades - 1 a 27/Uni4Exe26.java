import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular a área de um triângulo de base b e altura h ");
        System.out.println("Q: calcular a área de um quadrado de lado l ");
        System.out.println("R: calcular a área de um retângulo de base b e altura h ");
        System.out.println("C: calcular a área de um círculo de raio r ");
        String op = sc.nextLine();
        String opcao = op.toUpperCase();

        switch (opcao) {
            case "T":
            System.out.println("Digite a base do triângulo");
            float base = sc.nextFloat();
            System.out.println("Digite a altura do triângulo");
            float altura = sc.nextFloat();
            System.out.println("A área do triângulo é: " + (base * altura /2));
            break;
            case "Q":
            System.out.println("Digite o lado do quadrado");
            float lado = sc.nextFloat();
            System.out.println("A área do quadrado é: " + (lado * lado));
            break;
            case "R":   
            System.out.println("Digite a base do triângulo");
            float base1 = sc.nextFloat();
            System.out.println("Digite a altura do triângulo");
            float altura1 = sc.nextFloat();
            System.out.println("A área do triângulo é: " + (base1 * altura1));
            break;
            case "C":   
            System.out.println("Digite o raio ");
            float raio = sc.nextFloat();
            System.out.println("A área do triângulo é: " + (3.14 * (raio * raio)));
            break;
            default:
            System.out.println("Opção inválida");

        }

    }
}
