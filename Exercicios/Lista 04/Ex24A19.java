//Exercício 24 - Aula 19
//Números palíndromos são aqueles que escritos da direita para a esquerda têm o
//mesmo valor quando escritos da esquerda para a direita. 
//Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique
//se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o
//primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é
//igual ao penúltimo e assim por diante até verificar todos os elementos ou
//chegar a conclusão que o vetor não é um palíndromo.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 15h39 AM

import java.util.Scanner;

public class Ex24A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array vetorA
        boolean palindromo = true;             //Variável para indicar palidromo
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro: ");
            vetorA[i] = scan.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < vetorA.length/2; i++)
        {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i])
            {
                palindromo = false;
                break;
            }
        }
        
        System.out.println("Vetor A");
        
        for(int i = 0; i < vetorA.length; i++)
        {
            System.out.print(vetorA[i] +" ");
        }
        
        System.out.println();
        
        if (palindromo)
        {
            System.out.println("O Vetor é um Palíndromo");
        }
        else
        {
            System.out.println("O Vetor não é um Palíndromo");
        }
    }
}
