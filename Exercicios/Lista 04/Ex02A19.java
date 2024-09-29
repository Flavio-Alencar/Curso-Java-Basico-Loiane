//Exercício 02 - Aula 19
//Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo 
//e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: 
//B[i] = A[i] * 2.
//Method: Array
//Autor: Flávio Alencar - 28SET24 - 17h00

import java.util.Scanner;

public class Ex02A19 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[5]; 
        int[] vetorB = new int[vetorA.length];
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro da posição " +i +": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = 2 * vetorA[i];
            System.out.println();
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%4d%12d%n", vetorA[i], vetorB[i]);
        }
    }
    
}
