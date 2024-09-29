//Exercício 11 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
//e escreva a quantidade de elementos armazenados neste vetor que são pares.
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 10h57 AM

import java.util.Scanner;

public class Ex11A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int par = 0;                    //Variável que armazena a quantidade de números pares.
        int impar = 0;                  //Variável que armazena a quantidade de números impares.
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
        
       System.out.println("Qtd Números Pares: " +par);
       System.out.println("Qtd Números Impares: " +impar);
        
    }
}
