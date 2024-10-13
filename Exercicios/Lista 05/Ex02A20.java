//Exercício 02 - Aula 20
//Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso 
//indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor 
//valor da coluna 7.
//Method: Array - for 
//Autor: Flávio Alencar - 13OUT24 - 10h11 AM

import java.util.Random;

public class Ex02A20 
{
    public static void main(String[] args)
    {
        Random ran = new Random();
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[][] matriz = new int[10][10];               //Array 10X10
        int nummaxL5 = Integer.MIN_VALUE;               //Maior Número do Array na Linha 5;
        int numminL5 = Integer.MAX_VALUE;               //Menor Número do Array na Linha 5;
        int nummaxC7 = Integer.MIN_VALUE;               //Maior Número do Array na Coluna 7;
        int numminC7 = Integer.MAX_VALUE;               //Menor Número do Array na Coluna 7.
        //-----------------------------------------------------------------------------------------    
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = ran.nextInt(100);
            }
        }
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (nummaxL5 < matriz[5][j])
                {
                    nummaxL5 = matriz[5][j];
                }
                
                if (numminL5 > matriz[5][j])
                {
                    numminL5 = matriz[5][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++)
        {
            if (nummaxC7 < matriz[i][7])
                {
                    nummaxC7 = matriz[i][7];
                }
                
                if (numminC7 > matriz[i][7])
                {
                    numminC7 = matriz[i][7];
                }
        }
        
        System.out.println("Matriz A 10X10");
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("O Maior Número da Linha 5: " +nummaxL5);
        System.out.println("O Menor Número da Linha 5: " +numminL5);
        System.out.println();
        System.out.println("O Maior Número da Coluna 7: " +nummaxC7);
        System.out.println("O Menor Número da Coluna 7: " +numminC7);
        
        
    }
}
