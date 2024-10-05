//Exercício 35 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
//cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.
//Method: Array - for - if
//Autor: Flávio Alencar - 04OUT24 - 17h46 

import java.util.Scanner;

public class Ex35A19 
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
            
            for(int j = 1; j <= (vetorA[i]); j++)
                {
                    if (vetorA[i] % j == 0)
                    {
                        System.out.println(vetorA[i] +" é divisível por " +j);
                    }
                }
            System.out.println();
        }
    }
    
}
