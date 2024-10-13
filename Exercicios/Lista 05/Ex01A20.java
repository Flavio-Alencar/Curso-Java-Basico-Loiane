//Exercício 01 - Aula 20
//Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso 
//determine o maior número da matriz e a sua posição (linha, coluna).
//Method: Array - for 
//Autor: Flávio Alencar - 12OUT24 - 21h15

import java.util.Scanner;

public class Ex01A20 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[][] matriz = new int[4][4];               //Array 4X4.
        int nummax = Integer.MIN_VALUE;                               //Maior Número do Array;
        int nummin = Integer.MAX_VALUE;                               //Menor Número do Array;
        int linhamax = 0;                                             //Linha do Maior Valor
        int colunamax = 0;                                            //Coluna do Maior Valor
        int linhamin = 0;                                             //Linha do Menor Valor
        int colunamin = 0;                                            //Coluna do Menor Valor
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print("Digite um Valor de [0-100] da Linha " +i +" Coluna " +j +" : ");
                matriz[i][j] = scan.nextInt();
                System.out.println();                
            }            
        }
        
        System.out.println("Matriz A 4X4");
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] +" ");                
            }
        System.out.println();
        }
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (nummax < matriz[i][j])
                {
                    nummax = matriz[i][j];
                    linhamax = i;
                    colunamax = j;
                }
                
                if (nummin > matriz[i][j])
                {
                    nummin = matriz[i][j];
                    linhamin = i;
                    colunamin = j;
                }
            }            
        }
        
        System.out.println("O Maior Numero da Matriz é: " +nummax);
        System.out.println("Na Linha " +linhamax +" na Coluna " +colunamax);
        System.out.println();
        System.out.println("O Menor Numero da Matriz é: " +nummin);
        System.out.println("Na Linha " +linhamin +" na Coluna " +colunamin);   
    }
}
