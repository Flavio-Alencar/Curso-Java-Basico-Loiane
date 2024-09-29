//Exercício 03 - Aula 19
//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo
//e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do 
//respectivo elemento de A, ou seja: B[i] = A[i] * A[i].
//Method: Array - for
//Autor: Flávio Alencar - 28SET24 - 17h15

import java.util.Scanner;

public class Ex03A19 
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
            //vetorB[i] = vetorA[i] * vetorA[i];
            vetorB[i] = Math.pow(vetorA[i], 2);
            System.out.println();
        }
        
        System.out.printf("%s%12s%n", "Vetor A", "Vetor B");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%4f%12f%n", vetorA[i], vetorB[i]);
        }
    }
    }
    
}
