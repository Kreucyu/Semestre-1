import java.util.Scanner;

public class Uni3Exe05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double frango;
		int anelChip = 4;
		double anelAlimento = 3.5;
		
		System.out.println("Insira a quantidade de frangos em sua granja");
		frango = scanner.nextDouble();
		
		double gasto = (anelChip + (anelAlimento * 2)) * frango;
		System.out.println("O valor total gasto com os anéis será de R$ " + gasto);
		
		scanner.close();
		
	}
}
