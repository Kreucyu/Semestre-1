import java.util.Scanner;

public class Uni3Exe15 {
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("digite seu número de até 3 dígitos");
	    int numero = sc.nextInt();

	    int centenas = numero / 100;
	    int dezenas = (numero % 100) / 10;
	    int unidades = numero % 10;

	    System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");
		
	

    } 
}
