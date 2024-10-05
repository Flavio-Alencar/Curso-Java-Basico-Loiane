//Exercício 37 - Aula 19
//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
//tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento 
//correspondente em A.
//Method: Array - for 
//Autor: Flávio Alencar - 05OUT24 - 10h05

import java.util.Scanner;

public class Ex37A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[15];               //Array A
        int[] vetorB = new int[vetorA.length];    //VetorB
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorB[i] = 1;
            
            for (int j = 1; j <= vetorA[i]; j++)
            {
                vetorB[i] *= j;
            }
        }
        
        System.out.printf("%s%15s%n", "Vetor A", "Vetor B");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%d%16d%n", vetorA[i], vetorB[i]);
        }
        
    }
    
}
