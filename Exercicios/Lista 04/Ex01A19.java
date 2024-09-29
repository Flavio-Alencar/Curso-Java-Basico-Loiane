//Exercício 01 - Aula 19
//Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo 
//e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
//Method: Array
//Autor: Flávio Alencar - 28SET24 - 16h31

import java.util.Scanner;

public class Ex01A19
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
            vetorB[i] = vetorA[i];
            System.out.println();
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%3d%12d%n", vetorA[i], vetorB[i]);
        }
    }
}
