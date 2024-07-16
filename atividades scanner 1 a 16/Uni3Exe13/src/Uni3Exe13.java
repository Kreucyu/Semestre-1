import java.util.Scanner;

public class Uni3Exe13 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int apm = 9;
	double un = 12.5;

	System.out.println("Digite a altura da parede");
	   double altura = sc.nextDouble();
	   System.out.println("Digite o comprimento da parede");
	   double comprimento = sc.nextDouble();
	   double metrosq = comprimento * altura ;
	   double azulejos = metrosq * apm;
	   double valor = azulejos * un;
	   System.out.println("Sua parede com " + metrosq + " metros quadrados vai custar R$ " + valor);
	   sc.close();
	

 }
}
