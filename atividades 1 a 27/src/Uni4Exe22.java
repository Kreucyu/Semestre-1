import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione o curso: 1-Ciência da Computação, 2-Licenciatura em Computação e 3-Sistemas de Informação");
        int curso = sc.nextInt();

        if (curso == 1){
            System.out.println("Bacharel em Ciência da Computação");
        } else if (curso == 2){
            System.out.println("Licenciado em Computação");
        } else if (curso == 3){
            System.out.println("Bacharel em Sistemas de Informação");
        } sc.close();
    }
}
