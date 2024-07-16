import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a hora que você entrou (hh mm) ");
        int horaEntrada = sc.nextInt();
        int minutoEntrada = sc.nextInt();
        System.out.println("Escreva a hora que você saiu (hh mm) ");
        int horaSaida = sc.nextInt();
        int minutoSaida = sc.nextInt();
        int hora = horaSaida - horaEntrada;
        int minutos = minutoEntrada - minutoSaida;
        int valor1h = 5;
        double valor3h = 7.5;
        int valor5h = 10;
        
        if (minutos < 0) {
            minutos = -minutos;
            if (hora == 0 && minutos >= 0){
                System.out.println("Seu tempo no estacionamento foi de " + minutos + " minuto(s) ");
                System.out.println("O valor a ser pago é de R$ " + valor1h);
            } else if (hora > 0 && hora < 25 && minutos >= 0) {
                if ((hora >= 1 && hora <= 2 && minutos < 30) || (hora == 1 && minutos >= 30 && minutos < 60)) {
                    System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor1h);
                } else if ((hora >= 3 && hora <= 4 && minutos < 30) || (hora >= 2 && hora <= 3 && minutos >= 30 && minutos < 60)) {
                System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor3h); 
                } else if ((hora >= 5 && hora < 24 && minutos >= 0 && minutos <= 60) || (hora == 4 && minutos > 30 && minutos < 60)) {
                    System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor5h);
                }
            }
        } else if (minutos >= 0 && minutos <= 60) {
            if (hora == 0 && minutos >= 0){
                System.out.println("Seu tempo no estacionamento foi de " + minutos + " minuto(s) ");
                System.out.println("O valor a ser pago é de R$ " + valor1h);
            } else if (hora > 0 && hora < 25 && minutos >= 0) {
                if ((hora >= 1 && hora <= 2 && minutos < 30) || (hora == 1 && minutos >= 30 && minutos < 60)) {
                    System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor1h);
                } else if ((hora >= 3 && hora <= 4 && minutos < 30) || (hora >= 2 && hora <= 3 && minutos >= 30 && minutos < 60)) {
                System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor3h); 
                } else if ((hora >= 5 && hora < 24 && minutos >= 0 && minutos <= 60) || (hora == 4 && minutos > 30 && minutos < 60)) {
                    System.out.println("Seu tempo no estacionamento foi de " + hora + " hora(s) " + minutos + " minuto(s) ");
                    System.out.println("O valor a ser pago é de R$ " + valor5h);
                } 
            }
    } else {
        System.out.println("Inválido");
    }sc.close();
}
}
