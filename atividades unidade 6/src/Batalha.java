//importando as classes que utilizarei
import java.util.Scanner;
import java.util.Random;

//iniciando o código
public class Batalha {
    public static void main(String[] args) {
        new Batalha();
    }
    public Batalha() {
        Scanner sc = new Scanner(System.in);
        Random navios = new Random();
        int linha = 8; //definindo linhas do tabulerio
        int coluna = 8; //definindo colunas do tabuleiro
        int aleatorio = 0; //variável para colocar os navios no tabuleiro
        char[][] tabuleiroVisualizavel = new char[linha][coluna]; //criando matriz do tabuleiro que será exibido
        char[][] tabuleiroReal = new char[linha][coluna]; //criando matriz do tabuleiro que será jogado
        preenchendoMatrizes(tabuleiroReal, tabuleiroVisualizavel, linha, coluna, aleatorio, navios); //metódo para preencher a matriz
        iniciandoJogo(tabuleiroReal, tabuleiroVisualizavel, linha, coluna, sc); //metódo do jogo
    }

    public void preenchendoMatrizes(char[][] tabuleiroReal, char[][] tabuleiroVisualizavel, int linha, int coluna, int aleatorio, Random navios) {
        for (int i = 0; i < linha; i++) { //preenchendo as matrizes com a "água"
            for (int j = 0; j < coluna; j++) {
                tabuleiroVisualizavel[i][j] = '~';
                tabuleiroReal[i][j] = '~';
            }
        };
        while(aleatorio < 10) { //while para fazer o contador de 10 navios no tabuleiro
            int i = navios.nextInt(linha);
            int j = navios.nextInt(coluna);

            if (tabuleiroReal[i][j] == '~') { //verificando se esta vazio o local selecionado
                tabuleiroReal[i][j] = 'N'; //colocando os navios no tabuleiro
                aleatorio++;
            }
        }
       
    }
    public void iniciandoJogo(char[][] tabuleiroReal, char[][] tabuleiroVisualizavel, int linha, int coluna, Scanner sc) {
        System.out.println("Bem-vindo ao jogo de Batalha Naval! (O objetivo é afundar todos os 10 navios)"); //Mensagens iniciais
        int jogadas = 0; //variável para checar as jogadas
        int quantidadeNavios = 10; //variável para checar a quantidade de navios
        int quantidadeAcertos = 0; //variável para checar os acertos
        do { //loop de jogadas limitado em 30
        System.out.println("\nDigite a linha e a coluna do local que você deseja atacar (0 a 7)\n"); //iniciando os ataques
        System.out.print("  ");
        for (int i = 0; i < tabuleiroVisualizavel.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < tabuleiroVisualizavel.length; i++) { // exibindo tabuleiro ao usuário
            System.out.print(i + " ");
            for(int j = 0; j < tabuleiroVisualizavel[i].length; j++) {
                System.out.print(tabuleiroVisualizavel[i][j] + " ");
            }
            System.out.println();   
        }
        System.out.println();
        int linhaAtaque = sc.nextInt(); //recebendo comando da linha    
        int colunaAtaque = sc.nextInt(); //recebendo comando da coluna
        if (linhaAtaque >= 0 && linhaAtaque <= 7 && colunaAtaque >= 0 && colunaAtaque <= 7) { //verifica se a coluna e linha estão no tabuleiro
            if (tabuleiroReal[linhaAtaque][colunaAtaque] == 'N') { //verifica se acertou um navio
                System.out.println("\nVocê acertou um navio!\n"); //mensagem de acerto
                tabuleiroVisualizavel[linhaAtaque][colunaAtaque] = 'X'; //adiciona o acerto ao tabulerio visível
                tabuleiroReal[linhaAtaque][colunaAtaque] = 'X'; //adiciona o acerto ao tabuleiro real
                quantidadeNavios--; //remove -1 da quantidade de navios
                quantidadeAcertos++; //incrementa +1 a quantidade de acertos
                jogadas++; //incrementa +1 as jogadas 
            }
            else if (tabuleiroReal[linhaAtaque][colunaAtaque] == 'X' || tabuleiroReal[linhaAtaque][colunaAtaque] == 'O') { //verifica se já foi feita uma jogada na casa
                System.out.println("\nVocê já atacou este local anteriormente!\n"); //mensagem de aviso de repetição
                //não é adicionado a quantidade de jogadas pois não fez nenhuma diferença ao jogo
            } else {
                System.out.println("\nVocê errou! Tente novamente.\n"); //mensagem caso tenha errado o navio
                tabuleiroVisualizavel[linhaAtaque][colunaAtaque] = 'O'; //adiciona o erro ao tabuleiro visível
                tabuleiroReal[linhaAtaque][colunaAtaque] = 'O'; //adiciona o erro ao tabuleiro Real
                jogadas++; //incrementa +1 as jogadas
            }
            } else {
                System.out.println("\nCoordenadas inválidas! Tente novamente.\n"); //mensagem caso as coordenadas estejam incorretas
            }
                System.out.print("  ");
            for (int i = 0; i < tabuleiroVisualizavel.length; i++) {
                System.out.print(i + " ");
            }
                System.out.println(); 
            for (int i = 0; i < tabuleiroVisualizavel.length; i++) { //exibe o tabuleiro novamente
                System.out.print(i + " ");
                for(int j = 0; j < tabuleiroVisualizavel[i].length; j++) {
                    System.out.print(tabuleiroVisualizavel[i][j] + " ");
                }
                System.out.println();
            }
            if (quantidadeNavios == 0 && quantidadeAcertos == 10) { //caso tenha destruído todos os navios e ganhou o jogo
                System.out.println("\nParabéns! Você afundou todos os navios em " + jogadas + " jogadas\n"); //mensagem de vitória
                System.out.print("  ");
                for (int i = 0; i < tabuleiroVisualizavel.length; i++) {
                    System.out.print(i + " ");
            }
            System.out.println();
                for (int i = 0; i < tabuleiroReal.length; i++) { //exibe o tabuleiro real ao usuário
                    System.out.print(i + " ");
                    for(int j = 0; j < tabuleiroReal[i].length; j++) {
                        System.out.print(tabuleiroReal[i][j] + " ");
                    }
                    System.out.println();
                }
                break; //finaliza o loop
            }
            System.out.println();
        } while (jogadas < 30); //regra do loop
        if (jogadas >= 30) { //caso o loop encerrou com 30 jogadas 
            System.out.println("\nVocê perdeu! Os navios restantes são:\n"); //mensagem de perda
            System.out.print("  ");
            for (int i = 0; i < tabuleiroReal.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < tabuleiroReal.length; i++) { //exibe o tabuleiro real ao usuário
                System.out.print(i + " ");
                for(int j = 0; j < tabuleiroReal[i].length; j++) {
                    System.out.print(tabuleiroReal[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
    //OBS: TODOS OS "System.out.println();" FORAM UTILIZADOS APENAS PARA QUE A VISUALIZAÇÃO DAS MATRIZES E MENSAGENS E PARA A MELHOR COMPREENSÃO DO USUÁRIO
    //CÓDIGO FEITO NO VSCODE
    //ALUNO: ELCIO CLEITON WIPPEL
}


    
    
