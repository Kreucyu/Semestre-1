import java.util.Scanner;

public class Uni3Exe04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = "";
		Double nota1, nota2, nota3;
		
		System.out.println("Insira o nome do Aluno");
		nome = scanner.next();
		
		System.out.println("Insira a nota 1");
		nota1 = scanner.nextDouble();
		
		System.out.println("Insira a nota 2");
		nota2 = scanner.nextDouble();
		
		System.out.println("Insira a nota 3");
		nota3 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A media do Aluno " + nome + " é " + media);
		
		scanner.close();
		
	}
}
