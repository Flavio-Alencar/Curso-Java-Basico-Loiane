//Exercício 04 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para 
//representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo.. 
//Autor: Flávio Alencar - 28OUT24 - 15h51 .

package exercicios.Lista08;
import java.util.Scanner;

public class Ex04L08 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoVelha jogoVelha = new JogoVelha();
        
        //                               VARIAVEIS 
        //----------------------------------------------------------------------
        char sinal;
        boolean ganhou = false;
        int linha = 0;
        int coluna = 0;
        //----------------------------------------------------------------------
        
        jogoVelha.ApresentarJogo();
        
        while (!ganhou)
        {
            if (jogoVelha.VezJogador1())
            {
                System.out.println("Vez do Jogador 1");
                System.out.println("Escolha Linha e Coluna [1-3]: ");
                sinal = 'X';
                System.out.println();
            }
            else{
                System.out.println("Vez do Jogador 2");
                System.out.println("Escolha Linha e Coluna [1-3]: ");
                sinal = 'O';
                System.out.println(); 
            }
        
            linha = Valor("Linha", scan);
            coluna = Valor("Coluna", scan);
            
            if (!jogoVelha.ValidarJogada(linha, coluna, sinal)){
                System.out.println("Posição Usada, Tente Novamente");
            }
            
            jogoVelha.ImprimirTabuleiro();
        
            if(jogoVelha.VerificarGanhador('X')){
            ganhou = true;
            System.out.println("PARABÉNS, O Jogador 1 GANHOU!!!"); 
             }
            else if(jogoVelha.VerificarGanhador('O')){
            ganhou = true;
            System.out.println("PARABÉNS, O Jogador 2 GANHOU!!!");             
            }
            else if(jogoVelha.getJogada() > 9)
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
            
            while (!valorValido){
                System.out.print("Entre com a " +tipoValor +" [1-2-3]: ");
                valor = scan.nextInt();
                System.out.println();
                
                if (valor >= 1 && valor <= 3){
                    valorValido = true;
                }
                else{
                    System.out.println("Entrada Inválida, Entre com a Linha [1-2-3]");
                }
            }
            valor--;
            return valor;
    }
    
}
