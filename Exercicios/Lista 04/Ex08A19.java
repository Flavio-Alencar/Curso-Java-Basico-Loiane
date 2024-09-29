//Exercício 08 - Aula 19
//Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
//onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, 
//ou seja: C[i] = A[i] * B[i].
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 17h15

import java.util.Scanner;

public class Ex08A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10]; 
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorB.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de B na posição " +i +": ");
            vetorB[i] = scan.nextInt();
            System.out.println();         
        }
        
         for (int i = 0; i < vetorC.length; i++)
        {
            vetorC[i] = vetorA[i] * vetorB[i];            
        }
        
        System.out.printf("%s%12s%16s%n", "Vetor A", "Vetor B", "Vetor C");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%4d%12d%16d%n", vetorA[i], vetorB[i], vetorC[i]);
        }
    }
    
}