import java.util.Scanner;

public class Uni3Exe02 {
	public static void main(String[] args) {
		 System.out.println("Bem vindo a FURB Calçados");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o valor do seu produto: ");
		double sapato = scanner.nextDouble();
		System.out.println("O valor do seu calçado é R$ " + sapato);
		
		double cupom = sapato * 12 / 100;
		System.out.println("O valor do desconto é R$  " + cupom);
		double desconto = sapato - cupom;
		System.out.println("O valor do sapato com desconto é R$ " + desconto);
		
		scanner.close();
	}
}
