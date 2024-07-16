import java.util.Scanner;

public class qstprova {
    public static void main(String[] args) {
        new qstprova();
    }
    public qstprova(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o tamanho da mochila: ");
        int tamanhoMochila = sc.nextInt();
        System.out.print("\nQual a capacidade máxima da mochila (Kg)?  ");
        int capacidadeMochila = sc.nextInt();

        int ps[] = new int[tamanhoMochila];
        String tm[] = new String[tamanhoMochila];
        int opcao;
        int mfim = 0;
        int maisp = Integer.MIN_VALUE;
        String itemp = "";

        do {
            System.out.println("\nO você deseja fazer?\n");
            System.out.println("1 - Adicionar item à mochila");
            System.out.println("2 - Verificar a mochila (inversa)");
            System.out.println("3 - O valor do item mais pesado");
            System.out.println("4 - Ordenar a mochila");
            System.out.println("5 - Excluir item da mochila");
            System.out.println("6 - Sair do programa\n");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    mfim = inserir(ps, tm, sc, mfim, capacidadeMochila, tamanhoMochila);
                break;

                case 2:
                    ImprimirMochila(ps, tm, sc, mfim);
                break;

                case 3:
                    maisp = valorItemMaisPesado(ps, tm, mfim, maisp, itemp);
                break;

                case 4:
                    ordenarMochila(ps, tm, mfim);
                break;
                case 5:
                    excluirItemMochila(ps, tm, mfim, sc);
                break;

                case 6:
                System.out.println("\nSaindo do programa...");
                break;

                default: 
                System.out.println("\nOpção inválida");
                break;
            }

        } while (opcao != 6);
    }
    private int inserir(int[] ps, String[] tm, Scanner sc, int mfim, int capacidadeMochila, int tamanhoMochila) {
        if (mfim < tm.length) {
            System.out.print("\nInsira o peso do item: ");
            int peso = sc.nextInt();
            int paMochila = capacidadeMochila;
            for (int i = 0; i < ps.length; i++) {
                paMochila -= ps[i];
            }
            if (peso > paMochila) {
                System.out.println("\nPeso do item excede a capacidade restante da mochila. Item não adicionado.");
            return mfim;
            }
            ps[mfim] = peso;
            System.out.print("\nInsira o nome do item: ");
            tm[mfim] = sc.next();
            mfim++;
            System.out.println("\nItem adicionado na mochila");
            System.out.print("\nMochila atual: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(tm[i] + " ");
            }
             System.out.println();
             System.out.print("\nPesos atuais: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(ps[i] + " ");
            }
            System.out.println();   
        } else {
            System.out.println("\nNão é possível adicionar o item");
            System.out.println("\nTamanho da mochila: " + tamanhoMochila);
            System.out.println("\nCapacidade da mochila: " + capacidadeMochila);
            System.out.print("\nMochila atual: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(tm[i] + " ");
            }
            System.out.print("\nPesos atuais: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(ps[i] + " ");
            }
        }
        return mfim;
    }
    private void ImprimirMochila(int[] ps, String[] tm, Scanner sc, int mfim) {
          int temp;
          String temp1;
        for (int i = 0; i < mfim; i++) {
            for (int x = 0; x < i; x++) {
            temp = ps[i];
            ps[i] = ps[x];
            ps[x] = temp;

            temp1 = tm[i];
            tm[i] = tm[x];
            tm[x] = temp1;
            }
        }
        System.out.print("\nMochila atual: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(tm[i] + " ");
        }
             System.out.println();
             System.out.print("\nPesos atuais: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(ps[i] + " ");
        }
            System.out.println(); 
    }
    private int valorItemMaisPesado(int[] ps, String[] tm, int mfim, int maisp, String itemp) {
        for (int i = 0; i < mfim; i++) {
            if (ps[i] > maisp) {
                maisp = ps[i];
                itemp = tm[i];
            }
        }
        System.out.println("\nO item mais pesado da mochila é " + itemp + ", com o peso de " + maisp + "Kg");
        return 0;
    }
    private void ordenarMochila(int[] ps, String[] tm, int mfim) {
        int h;
        String hb;
        for (int i = 0; i < mfim -1; i++) {
            for (int j = 0; j < mfim - 1 - i; j++) {
                if (ps[j] > ps[j + 1]) {
                    h = ps[j];
                    ps[j] = ps[j+1];
                    ps[j+1] = h;

                    hb = tm[j];
                    tm[j] = tm[j+1];
                    tm[j+1] = hb;
                }
            }
        }
        System.out.println("\nMochila Ordenada!");
        System.out.print("\nMochila atual: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(tm[i]+ " ");
        }
             System.out.println();
             System.out.print("\nPesos atuais: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(ps[i] + " ");
        }
            System.out.println(); 
    }
    private int pesquisarItemExclusao(int[] ps, String[] tm, int mfim, Scanner sc) {
        System.out.print("\nQual item você deseja excluir? ");
        String item = sc.next();
        for (int i = 0; i < mfim; i++) {
            if (tm[i].equals(item)) {
                System.out.println("\nItem encontrado na posição " + i);
                return i;
            }
        }
        System.out.println("\nItem não encontrado");
            return -1;
    }
    
    private int excluirItemMochila(int[] ps, String[] tm, int mfim, Scanner sc) {
        int valor1 = pesquisarItemExclusao(ps, tm, mfim, sc);
        if (valor1 != -1) {
            for (int i = valor1; i < mfim - 1; i++) {
                ps[i] = ps[i + 1];
                tm[i] = tm[i + 1];
            }
            mfim--;
            System.out.println("\nO item foi excluído");
        } 
        System.out.print("\nMochila atual: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(tm[i] + " ");
        }
             System.out.println();
             System.out.print("\nPesos atuais: ");
            for (int i = 0; i < mfim; i++) {
            System.out.print(ps[i] + " ");
        }
            System.out.println(); 
        return mfim;
    }
}
