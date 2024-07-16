import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a sua opção: ");
        System.out.println("1 - Soma entre dois números ");
        System.out.println("2 - Diferença entre dois números ");
        System.out.println("3 - Produto entre dois números ");
        System.out.println("4 - Divisão entre dois números ");
        int opcao = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = sc.nextFloat();
        
        if (opcao == 1) {
            float soma = n1 + n2;
            System.out.println("A soma entre os dois números é: " + soma);
        } else if (opcao == 2) {
            float diferenca = n1 - n2;
            System.out.println("A diferença entre os dois números é: " + diferenca);
        } else if (opcao == 3) {
            float produto = n1 * n2;
            System.out.println("O produto entre os dois números é: " + produto);
        } else if (opcao == 4) {
            if (n2 == 0) {
                System.out.println("Não é possível dividir por zero");
            } else if (n2 != 0) {
                float divisao = n1 / n2;
                System.out.println("A divisão entre os dois números é: " + divisao);
            }
        } else {
            System.out.println("Opção inválida");
        }sc.close();
    }
}
