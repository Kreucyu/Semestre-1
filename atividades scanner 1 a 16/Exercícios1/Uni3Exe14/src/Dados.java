public class Dados {
    public dados (){

    }

    int kml;

    public void calculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a distância em km percorrida?");
        double dp = sc.nextDouble();
        System.out.prntln("Qual foi o tempo gasto em horas na viagem?");
        double tg = sc.nextDouble();
        double vm = dp / tg;
        double cg = dp / kml;
        System.out.println("A velocidade média percorrida foi de " + vm + " km/h e a quantdade gasta de gasolina foi de " + cg + " litros");
    }

}
