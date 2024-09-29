//Exercício 05 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento
//de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 17h15

import java.util.Scanner;

public class Ex05A19
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
            System.out.print("Entre com o Valor Inteiro da posição " +i +": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
            System.out.println();
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%04d%12d%n", vetorA[i], vetorB[i]);
        }
    }
    
}
