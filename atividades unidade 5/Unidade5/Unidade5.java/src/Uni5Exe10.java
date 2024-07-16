public class Uni5Exe10 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int n1 = i / 10;
            int n2 = i % 10;
            int soma = n1 + n2;
            int qd = n1 * 10 + n2;
            int qdf = qd * qd;
          if (soma == qdf) {
            System.out.println("O número encontrado foi: " + i);
          }
       }
       
    } 
}
