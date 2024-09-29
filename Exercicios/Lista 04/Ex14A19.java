//Exercício 14 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
//e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 11h38 AM

import java.util.Scanner; 

public class Ex14A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int conter = 0;                 //Contador de números multiplos de 5.
        int soma = 0;                   //Variável que armazena a soma dos números ultiplos de 5.
        double media = 0.0;             //Variável que armazena a média dos numeros multiplos de 5.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            int num = vetorA[i] % 5;
            
            if (num == 0)
            {
                ++conter;
                soma += vetorA[i];
            }
        }
        
        media = (double) soma/conter;
                
       System.out.printf("Média dos Números Multiplos de 5: %,.2f", media);
       
    }
    
}
