import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o peso da carta");
        float peso = sc.nextFloat();
        
            if (peso <= 50){
                double valorN = 0.45;
                System.out.println("Custo do selo R$ " + valorN);
            }  
            else {
                double pesoE = peso - 50;
                double adicional = (pesoE / 20) + 1;
                double valorE = 0.45 + 0.45 * adicional;
                System.out.println("Custo do selo R$ " + valorE);
            }          
            sc.close();
        }
    }
    

