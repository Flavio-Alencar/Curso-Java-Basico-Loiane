package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 18 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 21JUL26 - 20h09
//Descrição: Faça um programa que peça o tamanho de um arquivo para download (em MB)
//e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
//aproximado de download do arquivo usando este link (em minutos).
//------------------------------------------------------------------------------

public class Exercicio18 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double arquivo;
        double velocidade;
        double tempo;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.print("Digite o Tamanho do Arquivo [MB]: ");
        arquivo = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Velocidade de Download [Mbps]: ");
        velocidade = scan.nextDouble();
        System.out.println(" ");
        
        tempo = (arquivo * 8) / (velocidade);
        
        System.out.printf("Tempo de Download: %.2f%s", tempo / 60, "min");        
        
    }
}
