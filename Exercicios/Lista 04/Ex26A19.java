//Exercício 26 - Aula 19
//Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor
//C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
//a) Ci deverá receber 1 quando Ai for maior que Bi;
//b) Ci deverá receber 0 quando Ai for igual a Bi; 
//c) Ci deverá receber -1 quando Ai for menor que Bi.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 16h50 

import java.util.Scanner;

public class Ex26A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];                //Array A
        int[] vetorB = new int[vetorA.length];     //Array B
        int[] vetorC = new int[vetorA.length];     //Array C
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" :");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            System.out.print("Digite um Número Inteiro do Vetor B na Posição " +i +" :");
            vetorB[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] > vetorB[i])
            {
                vetorC[i] = 1;
            }
            else if (vetorA[i] == vetorB[i])
            {
                vetorC[i] = 0;
            }
            else if (vetorA[i] < vetorB[i])
            {
                vetorC[i] = -1;
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
        
        System.out.println();
        System.out.println("Vetor C");
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print(vetorC[i] +" ");
        }
        
    }
    
}
