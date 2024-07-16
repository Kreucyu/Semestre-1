public class Uni5Exe05 {
    public static void main(String[] args){ 
        int n1 = 3;
        int numero = 3;
        int n2;
        System.out.println(n1);
        for (int i = 3; i < 20; i++) {
            if (i % 2 == 0) {
                numero = numero * 2;
                System.out.println(numero);
            } else {
                n2 = numero + 2;
                System.out.println(n2);
            } 
        }
    }
}