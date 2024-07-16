import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        new Uni6Exe10();
    }
    public Uni6Exe10() {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[50];
        int vfim = 0;
        int escolha;

        do {
        System.out.println("\nEscolha a sua opção:\n");
        System.out.println("1 - Inserir elemento no vetor");
        System.out.println("2 - Pesquisar elemento no vetor");
        System.out.println("3 - Alterar valor do vetor");
        System.out.println("4 - Excluir elemento do vetor");
        System.out.println("5 - Mostrar todos os elementos do vetor");
        System.out.println("6 - Ordenar valores do vetor");
        System.out.println("7 - Inverter valores do vetor");
        System.out.println("8 - Sair do programa\n");
        escolha = sc.nextInt();

            switch (escolha) {
            case 1:
                vfim = op1(vetor, vfim, sc);
            break;

            case 2:
                op2(vetor, vfim, sc);
            break;

            case 3:
                op3(vetor, vfim, sc);
            break;

            case 4:
               vfim = op4(vetor, vfim, sc);
            break;

            case 5:
                op5(vetor, vfim);
            break;

            case 6:
                op6(vetor, vfim);
            break;

            case 7:
                op7(vetor, vfim);
            break;

            case 8:
                System.out.println("\nSaindo do programa...");
            break;

            default:
            System.out.println("\nOpção inválida");
            break;
        }
        }while (escolha != 8);
    }
    private int op1(int[] vetor,  int vfim, Scanner sc) {
        if (vfim < vetor.length) {
        System.out.print("\nDigite o valor a ser adicionado: ");
        vetor[vfim] = sc.nextInt();
        vfim++;
        System.out.println("\nValor adicionado");
        } else {
            System.out.println("\nVetor cheio");
        }
        return vfim;
    }
    private int op2(int[] vetor,  int vfim, Scanner sc) {
        System.out.print("\nQual o valor que você deseja pesquisar? ");
        int valor = sc.nextInt();
        for (int i = 0; i < vfim; i++) {
            if (vetor[i] == valor) {
                System.out.println("\nValor encontrado na posição " + i);
                return i;
            }
        }
        System.out.println("\nValor não encontrado");
        return -1;
    
    }
    private void op3(int[] vetor, int vfim, Scanner sc) {
        int valor1 = op2(vetor, vfim, sc);
        if (valor1 != -1) {
            System.out.print("\nDigite o novo valor: ");
            vetor[valor1] = sc.nextInt();
            System.out.println("\nValor alterado na posição " + valor1);
        }
    }
    private int op4(int[] vetor, int vfim, Scanner sc) {
        double valor1 = op2(vetor, vfim, sc);
        if (valor1 != -1) {
            for (int i = (int) valor1; i < vfim - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vfim--;
            System.out.println("\nO valor foi excluído");
        }
        return vfim;
    }
    private void op5(int[] vetor, int vfim) {
        System.out.println("\nVetor: ");
        for (int i = 0; i < vfim; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    private void op6(int[] vetor, int vfim) {
        for (int i = 0; i < vfim -1; i++) {
            for (int j = 0; j < vfim - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int h = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = h;
                }
            }
        }
        System.out.println("\nOs valores foram ordenados");
    }
    private void op7(int[] vetor, int vfim) {
        int temp = 0;
        for (int i = 0; i < vfim / 2 ; i++) {
            temp = vetor[i];
            vetor[i] = vetor[vfim - i - 1];
            vetor[vfim - i - 1] = temp;
          }
          System.out.println("\nValores invertidos");
        }
    }

