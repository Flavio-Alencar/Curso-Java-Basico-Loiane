//Exercício 25 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 
//quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 16h14 

import java.util.Scanner;

public class Ex25A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];                //Array A
        int[] vetorB = new int[vetorA.length];     //Array B
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro: ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] % 2 == 0)
            {
                vetorB[i] = 1;
            }
            else
            {
                vetorB[i] = 0;
            }
        }
        
        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print(vetorA[i] +" ");
        }
        
        System.out.println();
        System.out.println("Vetor B");
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print(vetorB[i] +" ");
        }
        
    }
    
}
