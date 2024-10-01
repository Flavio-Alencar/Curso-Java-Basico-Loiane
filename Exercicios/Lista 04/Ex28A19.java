//Exercício 28 - Aula 19
//Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho
//e com os mesmos elementos de A, sendo que estes deverão estar invertidos, 
//ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento
//de A passa a ser o penúltimo de B e assim por diante.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 17h46 

import java.util.Scanner;

public class Ex28A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array vetorA
        int[] vetorB = new int[10];            //Array vetorB
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }
        
        System.out.printf("%s%10s%n","Vetor A", "Vetor B");
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%3d%10s%n", vetorA[i], vetorB[i]);
        }
    }
    
}
