//Exercício 30 - Aula 19
//Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos
//vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 18h23 

import java.util.Scanner;

public class Ex30A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[20];                //Array A
        int[] vetorB = new int[20];                //Array B com os valores pares de Array A
        int[] vetorC = new int[20];                //Array C com os valores ímpares de Array A
        int posB = 0;                              //ìndice da posição do vetor B
        int posC = 0;                              //ìndice da posição do vetor C
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
            else
            {
                vetorC[posC] = vetorA[i];
                posC++;
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
        for (int i = 0; i < posB; i++)
        {
            System.out.print(vetorB[i] +" ");
        }
        System.out.println();
        
        System.out.println();
        System.out.println("Vetor C");
        System.out.println();
        for (int i = 0; i < posC; i++)
        {
            System.out.print(vetorC[i] +" ");
        }
        
    }
    
}
