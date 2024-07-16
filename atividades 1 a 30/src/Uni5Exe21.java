public class Uni5Exe21 {
    public static void main(String[] args) {
        int chico = 150;
        int ze = 110;
        int anos = 0;

        while (ze <= chico) {
            chico += 2;
            ze += 3;
            anos += 1;
        }
        System.out.println("Vai levar " + anos + " anos para que Zé seja maior que Chico");
    }
}
