import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a idade do 1 irmão");
        int idade1 = sc.nextInt();
        System.out.println("Escreva a idade do 2 irmão");
        int idade2 = sc.nextInt();
        System.out.println("Escreva a idade do 3 irmão");
        int idade3 = sc.nextInt();

        if (idade1 == idade2 && idade1 == idade3 && idade2 == idade3) {
            System.out.println("TRIGÊMEOS");  
        } else if (idade1 != idade2 && idade2 == idade3 || idade1 != idade3 && idade3 == idade2 || idade3 != idade2 && idade2 == idade1 || idade1 != idade2 && idade1 == idade3){
            System.out.println("GÊMEOS");
        } else if (idade1 != idade2 && idade2 != idade3 && idade1 != idade3){
            System.out.println("APENAS IRMÃOS");
        }
        sc.close();
    }
    }
