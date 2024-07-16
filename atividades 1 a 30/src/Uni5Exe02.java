public class Uni5Exe02 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;
        for (double n1 = 1; n1 <= 100; n1++) {
            if (n1 % 2 == 0) {
                par++;
            } else if (n1 % 2 != 0) {
                impar++;
            } 
        } System.out.println("\nA soma dos número pares é " + par + " e a soma dos números ímpares é " + impar);
    }
}
