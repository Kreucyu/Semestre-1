package Exercício5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri5 {
	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	DecimalFormat format = new DecimalFormat("0.0000");
	    	double A = sc.nextDouble();
	    	double B = sc.nextDouble();
	    	double C = sc.nextDouble();
	    	double D = sc.nextDouble();
	    	format.format(A);
	    	format.format(B);
	    	format.format(C);
	    	format.format(D);
	    	double DIF = A * B - C * D;
	    	System.out.println("DIFERENCA = " + DIF);
	    	sc.close();
	    	
}
	
}
