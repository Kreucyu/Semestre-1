package Uni3Exe14;

import java.util.Scanner;

public class Dados {
	 public carro();{

	    }

	    int kml;

	    public void carroCalculo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Qual foi a distância em km percorrida?");
	        double dp = sc.nextDouble();
	        System.out.println("Qual foi o tempo gasto em horas na viagem?");
	        double tg = sc.nextDouble();
	        double vm = dp / tg;
	        double cg = dp / kml;
	        System.out.println("A velocidade média percorrida foi de " + vm + " km/h e a quantdade gasta de gasolina foi de " + cg + " litros");
	    }

}
