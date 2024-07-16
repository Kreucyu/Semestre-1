import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQual o valor do vetor? ");
        int n = sc.nextInt();
        if (n <= 20) {
            double[] vetor = new double[n];
            double[] valoresD = new double[n];
            int[] contagem = new int[n];
            entrada(sc, vetor);
            verificador(sc, vetor, valoresD, contagem);
            tabela(valoresD, contagem);
        } else {
            System.out.println("\nO vetor não pode ter mais de 20 elementos");
        }

    }
    public static void entrada(Scanner sc, double[] vetor){
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("\nDigite seu valor " + i + ": ");
            vetor[i] = sc.nextDouble();
        }

    }
    public static void verificador(Scanner sc, double[] vetor, double[] valoresD, int[] contagem) {
        int x = 0;
        
        for(int i = 0; i < vetor.length; i++) {
            boolean dif = false;
            double valor = vetor[i];
            for (int j = 0; j < x; j++) {
                if (valoresD[j] == valor) {
                    contagem[j]++;
                    dif = true;
                    break;
                } 
            }
            if (!dif) {
                valoresD[x] = valor;
                contagem[x]++;
                x += 1;
            }
        }
    }
    public static void tabela(double [] valoresD, int[] contagem) {
        System.out.println();
        System.out.println("Valor\tOcorrências");
        for(int i = 0; i < valoresD.length; i++)
        if (valoresD[i] != 0) {
            System.out.println(valoresD[i] + "\t" + contagem[i]);
        }
    }
}

