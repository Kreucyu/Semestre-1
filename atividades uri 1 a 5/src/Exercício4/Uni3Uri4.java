package Exercício4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri4 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	DecimalFormat format1 = new DecimalFormat("0.0");
	    	double nota1 = sc.nextDouble();
	    	double nota2 = sc.nextDouble();
	    	double notaA = nota1 * 0.350;
	    	double notaB = nota2 * 0.750;
	    	format1.format(notaA);
	    	format1.format(notaB);
	    	double media = (notaA + notaB) / 1.1;
            DecimalFormat format = new DecimalFormat("0.00000");   
	    	System.out.println("MEDIA = " + format.format(media));
	    	sc.close();
	    	
	    }
}
