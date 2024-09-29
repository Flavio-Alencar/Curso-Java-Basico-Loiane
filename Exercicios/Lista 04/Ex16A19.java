//Exercício 16 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule 
//e escreva: 
//a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
//b) a quantidade de elementos armazenados no vetor que são iguais a 15; 
//c) a média dos elementos armazenados no vetor que são superiores a 15.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 29SET24 - 12h20 AM

import java.util.Scanner;

public class Ex16A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int somamenor = 0;              //Variável que armazena a soma dos números menores que 15.
        int somamaior = 0;              //Variável que armazena a soma dos números maiores que 15.
        int igual = 0;                  //Variável que armazena a quantidade de números iguais que 15.
        int total = 0;                  //Variável que armazena a quantidade de elementos maiores que 15.
        double media = 0;               //Variável que armazena a media de números maiores que 15.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] < 15)
            {
                somamenor += vetorA[i];
            }
            else if (vetorA[i] == 15)
            {
                ++igual;
            }
            else if (vetorA[i] > 15)
            {
                ++total;
                somamaior += vetorA[i];
            }
        }
        
       media = (double) somamaior/total;
        
       System.out.printf("Soma dos Números Manores que 15: %d%n", somamenor);
       System.out.printf("Quantidade de Números Iguais a 15: %d%n", igual);
       System.out.printf("Média dos Números Maiores que 15: %.2f%n", media);
        
    }
}