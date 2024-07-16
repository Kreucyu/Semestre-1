import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a nota da prova 1");
        float nota1 = sc.nextFloat();
        System.out.println("Escreva a nota da prova 2");
        float nota2 = sc.nextFloat();
        System.out.println("Escreva a nota da prova 3");
        float nota3 = sc.nextFloat();
        System.out.println("Escreva a nota do exercício");
        float nota4 = sc.nextFloat();

        float media = (nota1 + (nota2*2) + (nota3*3) + nota4) / 7;

        if (media >= 9){
          System.out.println("Nota A, aluno aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Nota B, aluno aprovado");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Nota C, aluno aprovado");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Nota D, aluno reprovado");
        } else if (media < 4.0) {
            System.out.println("Nota E, Aluno reprovado");
        } sc.close();
    }
}