public class Uni5Exe03 {
        public static void main(String[] args) {
            double somat = 0;
            for (int n = 1; n <= 100; n++) {
                double sm = 1.0 / n;
                somat += sm; 
                System.out.println(1 + " / " + n + ": " + sm);
            } System.out.println("\nSoma total é " + somat);
        }
    }