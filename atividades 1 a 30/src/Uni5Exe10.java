public class Uni5Exe10 {
    public static void main(String[] args) {
      int cont = 0;
      String qdp, qdk;
      int soma = 0;
      int qd = 0;
       
      for (int i = 0; i <= 10000; i++) {
        for(int j = 0; j <= 10000; j++) {
          soma = i + j;
          qd = soma * soma;
          qdk = qd + "";
          qdp = i + "" + j;
          
             if (qdk.equals(qdp)) {
            cont++;
            System.out.println("\nOs números " + i + " e " + j + ", formam o quadrado de " + soma + " que é igual a " + qd);
               if (cont >= 10) {
               break;
              } 
          }
      }
      if (cont >= 10) {
        break;
      } 
      }
    } 
  }

