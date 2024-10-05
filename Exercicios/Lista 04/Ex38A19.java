//Exercício 38 - Aula 19
//Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho,
//sendo que cada elemento de B deverá ser o seguinte somatório: Bi = Somatório 
//de Aj, para todo j variando de i até 10.
//Method: Array - for - 
//Autor: Flávio Alencar - 05OUT24 - 17h15

import java.util.Scanner;


public class Ex38A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];               //Array A
        int[] vetorB = new int[vetorA.length];    //VetorB
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length; i++)
        {
            for (int j = i; j < vetorA.length; j++)
            {
                vetorB[i] += vetorA[j];
            }
        }
        
        System.out.printf("%s%15s%n", "Vetor A", "Vetor B");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%d%16d%n", vetorA[i], vetorB[i]);
        }
        
    }
    
}
