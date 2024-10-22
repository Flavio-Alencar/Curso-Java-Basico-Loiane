//Exercício 04 - Lista 07
//Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para
//representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo. 
//Autor: Flávio Alencar - 21OUT24 - 16h09 

package exercicios.Lista07;

public class JogoDaVelha
{
    //                               VARIAVEIS GLOBAIS
        //-----------------------------------------------------------------------------------------
        char[][] jogo = new char[3][3];        //Array 3X3 Tabuleiro do Jogo da Velha.
        char sinal;                            //Variavel que indica X ou O para o Jogo da Velha.
        boolean ganhou = false;                //Variavel Flag para indicar quem ganhou o jogo.
        boolean linhaValida;                   //Variavel para verificar se a linha é valida.
        boolean colunaValida;                  //Variavel para verificar se a Coluna é Falsa.
        int jogada = 1;                            //variavel que armazena a quantidade de jogadas.
        int linha;                             //Variavel que armazena X ou O na linha.
        int coluna;                            //Variavel que armazena X ou O na coluna.
        //-----------------------------------------------------------------------------------------
        
        void ApresentarJogo()
        {
            System.out.println("          JOGO DA VELHA          ");            
            System.out.println("---------------------------------");
            System.out.println("Jogador 1 = X");
            System.out.println();
            System.out.println("Jogador 2 = O");
            System.out.println("---------------------------------");
            System.out.println();
        }
        
        boolean ValidarJogada(int linha, int coluna, char sinal)
        {
            if (jogo[linha][coluna] == 'X' || jogo [linha][coluna] == 'O')
            {
                return false;
            }
            else //Jogada Válida
            {
                jogo[linha][coluna] = sinal;
                jogada++;
                return true;
            }
        }
        
        void ImprimirTabuleiro()
        {
            for(int i = 0; i < jogo.length; i++)
            {
                for(int j = 0; j < jogo[i].length; j++)
                {
                     System.out.print(jogo[i][j] + " | ");
                }
                System.out.println();
            }
        }
        
        boolean VerificarGanhador(char sinal)
        {
            if ((jogo[0][0] == sinal && jogo[0][1] == sinal && jogo[0][2] == sinal) || (jogo[1][0] == sinal && jogo[1][1] == sinal && jogo[1][2] == sinal)
            || (jogo[2][0] == sinal && jogo[2][1] == sinal&& jogo[2][2] == sinal) || (jogo[0][0] == sinal && jogo[1][0] == sinal&& jogo[2][0] == sinal)
            || (jogo[0][1] == sinal && jogo[1][1] == sinal && jogo[2][1] == sinal) || (jogo[0][2] == sinal && jogo[1][2] == sinal && jogo[2][2] == sinal)
            || (jogo[0][0] == sinal && jogo[1][1] == sinal && jogo[2][2] == sinal))
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        
        boolean VezJogador1()
        {
            if (jogada % 2 == 1)
            {
                return true;
            }
            else
            {
                return false; 
            }
        }
        
        boolean VezJogador2()
        {
            if (jogada % 2 == 0)
            {
               return true;
            }
            else
            {
                return false;                
            }
        }
    
}
