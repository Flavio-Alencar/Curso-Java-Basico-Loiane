//Exercício 29 - Aula 19
//Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho
//e com os mesmos elementos de A, sendo que estes deverão estar invertidos, 
//ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento
//de A passa a ser o penúltimo de B e assim por diante.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 17h54 

import java.util.Scanner;

public class Ex29A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array A
        int[] vetorB = new int[10];            //Array B
        int[] vetorC = new int[20];            //Array C
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            System.out.print("Digite um Número Inteiro do Vetor B na Posição " +i +" : ");
            vetorB[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorC[i] = vetorA[i];
            vetorC[10+i] = vetorB[i];
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
        System.out.println();
        
        System.out.println();
        System.out.println("Vetor C");
        System.out.println();
        for (int i = 0; i < vetorC.length; i++)
        {
            System.out.print(vetorC[i] +" ");
        }
    }
    
}
