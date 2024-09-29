//Exercício 04 - Aula 19
//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
//tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do 
//respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 17h15

import java.util.Scanner;

public class Ex04A19
{
    public static void main (String[] args)
    {
        {
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        double[] vetorA = new double[15]; 
        double[] vetorB = new double[vetorA.length];
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com o Valor Inteiro da posição " +i +": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println();
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%04.2f%12.2f%n", vetorA[i], vetorB[i]);
        }
    }
    }
    
}
