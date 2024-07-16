package Exercício2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double raio = sc.nextDouble();
    	final double pi = 3.14159;
    	double R = Math.pow(raio, 2);
    	double A = R * pi;
    	DecimalFormat format = new DecimalFormat("0.0000");
    	System.out.println("A=" + format.format(A));
    	sc.close();
    	
    }
}
