//Exercício 15 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
//o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 28SET24 - 11h54 AM

import java.util.Scanner;

public class Ex15A19 
{
     public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int par = 0;                    //Variável que armazena a quantidade de números pares.
        int impar = 0;                  //Variável que armazena a quantidade de números impares.
        double ppar = 0.0;              //Variavel porcentagem de numeros pares;
        double pimpar = 0.0;            //Variavel porcentagem de numeros impares;
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            int num = vetorA[i] % 2;
            
            if (num == 0)
            {
                ++par;
            }
            else
            {
                ++impar;
            }
        }
        
        ppar = (double) par/10;
        pimpar = (double) impar/10;
        
       System.out.printf("Números Pares: %.2f%s%n", ppar*100, "%");
       System.out.printf("Números Impares: %.2f%s%n", pimpar*100, "%");
        
    }
    
}
