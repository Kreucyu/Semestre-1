package Uni3Exe13;

import java.util.Scanner;

public class Dados {
   public parede(); {
	   
   }
   
   double un;
   double apm;
   
   public void paredeCalculo () {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Digite a altura da parede");
	   double altura = scanner.nextDouble();
	   System.out.println("Digite o comprimento da parede");
	   double comprimento = scanner.nextDouble();
	   double metrosq = comprimento * altura ;
	   double azulejos = metrosq * apm;
	   double valor = azulejos * un;
	   System.out.println("Sua parede com " + metrosq + " metros quadrados vai custar R$ " + valor);
   }
   
   
   
   
   
}
