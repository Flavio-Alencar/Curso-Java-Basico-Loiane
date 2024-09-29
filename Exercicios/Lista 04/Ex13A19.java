//Exercício 13 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine
//a soma dos elementos armazenados neste vetor que são múltiplos de 5.
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 11h22 AM

import java.util.Scanner;

public class Ex13A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int soma = 0;                   //Variável que armazena a soma dos numeros multiplos de 5.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            int num = vetorA[i] % 5;
            
            if (num == 0)
            {
                soma += vetorA[i];
            }
        }
        
       System.out.println("Soma: " +soma);
       
    }
}
