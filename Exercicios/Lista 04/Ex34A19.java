//Exercício 34 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
//cada elemento do vetor A e a relação de todos os pares de 0 até o respectivo
//elemento.
//Method: Array - for - if
//Autor: Flávio Alencar - 04OUT24 - 14h18 

import java.util.Scanner;

public class Ex34A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array A
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Analisando o Número " +vetorA[i]);
            System.out.println();
            
            for(int j = 0; j < (vetorA[i]); j++)
                {
                    if (j % 2 == 0)
                    {
                        System.out.println(j +" é par!");
                    }
                }
            System.out.println();
        }
    }
}
