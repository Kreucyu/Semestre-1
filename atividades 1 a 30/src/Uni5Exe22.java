public class Uni5Exe22 {
    public static void main(String[] args) {
    int anosT = 27;
    int ano = 0;
    double salario = 2000;
    double qaumento = 1.015;
    double vaumento = salario * qaumento;

    while (ano < anosT) {
    vaumento *= 2;
    salario += vaumento;
    ano += 1;

    }
    System.out.println("O salário atual é de R$ " + salario);
    }
    
}
