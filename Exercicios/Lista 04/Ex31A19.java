//Exercício 31 - Aula 19
//Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A 
//utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os
//elementos pares de A e nas posições restantes do vetor B armazene os elementos
//de A que são ímpares.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 20h53 

import java.util.Scanner;

public class Ex31A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array A
        int[] vetorB = new int[10];            //Array B armazena os 10 primenros elementos pares, e os 10 restantes ímpares.
        int posB = 0;                        //Variável índice para os elementos pares;
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
           if (vetorA[i] % 2 == 0)
           {
               vetorB[posB] = vetorA[i];
               posB++;
           }
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            if (vetorA[i] % 2 != 0)
           {
               vetorB[posB] = vetorA[i];
               posB++;
           }
        }
        
        System.out.println("Vetor A");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        System.out.println();        
        System.out.println("Vetor B");
        System.out.println();
        for (int i = 0; i < vetorB.length; i++)
        {
            System.out.print(vetorB[i] +" ");
        }
    }
}
