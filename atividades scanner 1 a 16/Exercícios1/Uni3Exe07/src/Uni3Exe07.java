import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args){
        System.out.println("Bem vindo a Coca-Cola Inc.");
        Scanner sc = new Scanner(System.in);
        
        double lata = 0.350;
        double garrafa = 0.600;
        double litrao = 2;
        
        System.out.println("Quantas latas de 350ml você está comprando?");
        double latas = sc.nextDouble();
        
        System.out.println("Quantas garrafas de 600ml você está comprando?");
        double garrafas = sc.nextDouble();
        
        System.out.println("Quantas garrafas de 2l você está comprando?");
        double litroes = sc.nextDouble();
        
        double mls1 = latas * lata;
        double mls2 = garrafas * garrafa;
        double lts1 = litroes * litrao;
        
        double litro = mls1 + mls2 + lts1;
        System.out.println("Você está comprando " + litro + " litros de Coca-Cola");

        scanner.close();
   }   
}
