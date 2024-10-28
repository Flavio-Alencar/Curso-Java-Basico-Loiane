//Exercício 04 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe para 
//representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo.. 
//Autor: Flávio Alencar - 28OUT24 - 15h51 AM. 
package exercicios.Lista08;

public class JogoVelha {

    //                               VARIAVEIS GLOBAIS
    //-----------------------------------------------------------------------------------------
    private char[][] jogoVelha;        //Array 3X3 Tabuleiro do Jogo da Velha.
    private int jogada;                        //variavel que armazena a quantidade de jogadas.
    //-----------------------------------------------------------------------------------------

    public JogoVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    void ApresentarJogo() {
        System.out.println("          JOGO DA VELHA          ");
        System.out.println("---------------------------------");
        System.out.println("Jogador 1 = X");
        System.out.println();
        System.out.println("Jogador 2 = O");
        System.out.println("---------------------------------");
        System.out.println();
    }

    public boolean ValidarJogada(int linha, int coluna, char sinal) {
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            return false;
        } 
        else{ //Jogada Válida
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
    
    public void ImprimirTabuleiro(){        
        for(int i = 0; i < jogoVelha.length; i++){
            
            for(int j = 0; j < jogoVelha[i].length; j++){
                
                System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
        }
    
    public boolean VerificarGanhador(char sinal){
            if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal)
            || (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal&& jogoVelha[2][2] == sinal) || (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal&& jogoVelha[2][0] == sinal)
            || (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)
            || (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)||(jogoVelha[2][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[0][2] == sinal)){
                return true;
            }
            else{
                return false;
            }
    }
    
    public boolean VezJogador1()
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
        
        

}
