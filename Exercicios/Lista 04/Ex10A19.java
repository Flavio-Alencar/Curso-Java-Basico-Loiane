//Exercício 10 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do
//respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2.
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 1h31

import java.util.Scanner;

public class Ex10A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10]; 
        int[] vetorB = new int[vetorA.length];
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro de A na posição " +i +": ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorB.length; i++)
        {
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%4d%12d%n", vetorA[i], vetorB[i]);
        }
    }
    
}