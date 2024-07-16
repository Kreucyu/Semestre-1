public class Uni5Exe04 {
    public static void main(String[] args) {
        int numerador = 3;
        int denominador = 2;
        int apoio = 4;
        double calculo = 0;

        for (int i = 1; i < 20; i++) {
            if (i > 1){
                numerador += 2;
                denominador += apoio;
                apoio += 2;
                double conta = (double) numerador / denominador;
                calculo += conta;
                System.out.println(numerador + "/" + denominador);
            } else {
                double conta = (double) numerador / denominador;
                calculo += conta;
                System.out.println(numerador + "/" + denominador);
            }
        }
        System.out.println("S = " + calculo);
    }
}
