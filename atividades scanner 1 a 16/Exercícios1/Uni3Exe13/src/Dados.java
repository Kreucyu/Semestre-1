import java.util.Scanner;

public class Dados {
    public dados() {

    }

    float un;
    float vm;


    public void calculo () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura da parede");
        float alt = sc.nextFloat();
        System.out.println("Digite o comprimento da parede");
        float com = sc.nextFloat();
        float mq = alt * com;
        float valor = mq * vm;
        System.out.println("sua parede com " + mq + "metros quadrados vai custar R$ " + valor);
        sc.close();

    }

}
