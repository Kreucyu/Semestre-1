import java.util.Scanner;

public class Uni4Exe10 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade do Marquinhos");
        int mq = sc.nextInt();
        System.out.println("Informe a idade do Zezinho");
        int ze = sc.nextInt();
        System.out.println("Informe a idade da Luluzinha");
        int lu = sc.nextInt();
        
        if (mq < ze && mq < lu) {
            System.out.println("Marquinhos é o caçula");

        } else if (ze < mq && ze < lu){
            System.out.println("Zezinho é o caçula");

        } else if (lu < mq && lu < ze ) {
            System.out.println("Luluzinha é a caçula");
        }
        sc.close();
}
}