import java.util.Scanner;

public class Uni3Exe03 {
	public static void main(String[] args) {
	
	double valorGas = 5.80;
	
	System.out.println("Bem vindo");
	System.out.println("Valor da gasolina é R$ " + valorGas );
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Quanto você deseja abastecer?");
	double pagamento = scanner.nextDouble();
	System.out.println("Valor do abastecimento: " + pagamento);
	
	double litros = pagamento / valorGas;
	System.out.println("Você abastaceu " + litros + " litros");
	 
	scanner.close();
	
	}

}
