import java.util.Scanner;

public class Uni3Exe01 {
 public static void main(String[] args) {
	 System.out.println("Bem vindo ao calculador de área");
	Scanner scanner = new Scanner(System.in);
	
	
	        System.out.println("Escreva a Largura do terreno:");
	double largura = scanner.nextDouble();
			System.out.println("Largura do Terreno: " + largura);
			
			System.out.println("Escreva a Altura do terreno: ");
	double altura = scanner.nextDouble();
	        System.out.println("Altura do Terreno: " + altura);
	        
	        
	        double area = largura * altura;
	        System.out.println("A área do terreno é: " + area);
	        
	 scanner.close();
	        
}
}
