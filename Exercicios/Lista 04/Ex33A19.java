//Exercício 33 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima 
//cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é 
//um número primo ou não.
//Method: Array - for - if - else - break
//Autor: Flávio Alencar - 01OUT24 - 20h48 

import java.util.Scanner;

public class Ex33A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array A
        boolean verf = true;                   //Verificador true para número primo
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] <= 1)
            {
               verf = false;
            }
            
            if (vetorA[i] == 2)
            {
                verf = true;
            }
            
            for(int j = 2; j <= (vetorA[i] - 1); j++)
                {
                    if (vetorA[i] % j == 0)
                    {
                        verf = false;
                        break;
                    }
                    else
                    {
                        verf = true;
                    }
                }
            
            if (verf == true)
            {
                System.out.println(vetorA[i] +" É um Número Primo");   
                System.out.println();
            }
            else
            {
                System.out.println(vetorA[i] +" NÃO é um Número Primo");   
                System.out.println();
            }
        }
    }
}
