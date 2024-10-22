//Exercício 04 - Lista 07
//Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para
//representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo. 
//Autor: Flávio Alencar - 21OUT24 - 16h09 
//Vinculado a Classe JogoDaVelha

package exercicios.Lista07;
import java.util.Scanner;

public class Ex04L07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        
        //                               VARIAVEIS 
        //----------------------------------------------------------------------
        char sinal = '0';
        boolean ganhou = false;
        int linha;
        int coluna;
        //----------------------------------------------------------------------
        
        
        
        jogo.ApresentarJogo();
        
        while (!ganhou)
        {
            if (jogo.VezJogador1())
            {
                System.out.println("Vez do Jogador 1");
                System.out.println("Escolha Linha e Coluna [1-3]: ");
                sinal = 'X';
                System.out.println();
            }
            if (jogo.VezJogador2())
            {
                System.out.println("Vez do Jogador 2");
                System.out.println("Escolha Linha e Coluna [1-3]: ");
                sinal = 'O';
                System.out.println(); 
            }
        
            linha = Valor("Linha", scan);
            coluna = Valor("Coluna", scan);
        
            jogo.ValidarJogada(linha, coluna, sinal);
            jogo.ImprimirTabuleiro();
        
            if(jogo.VerificarGanhador('X'))
            {
            ganhou = true;
            System.out.println("PARABÉNS, O Jogador 1 GANHOU!!!"); 
             }
            else if(jogo.VerificarGanhador('O'))
            {
            ganhou = true;
            System.out.println("PARABÉNS, O Jogador 2 GANHOU!!!");             
            }
            else if(jogo.jogada > 9)
            {
            ganhou = true;
            System.out.println("Ninguem Ganhou!!!");
            }
        }
    }
        
        static int Valor(String tipoValor, Scanner scan)
        {
            boolean valorValido = false;
            int valor = 0;
            
            while (!valorValido)
            {
                System.out.print("Entre com a " +tipoValor +" [1-2-3]: ");
                valor = scan.nextInt();
                System.out.println();
                
                if (valor >= 1 && valor <= 3)
                {
                    valorValido = true;
                }
                else
                {
                    System.out.println("Entrada Inválida, Entre com a Linha [1-2-3]");
                }
            }
            valor--;
            return valor;
        }
}
