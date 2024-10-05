//Exercício 17 - Aula 19
//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo
//de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas
//que possuem idade superior a 35 anos.
//Method: Array - for - if
//Autor: Flávio Alencar - 29SET24 - 16h29 AM

import java.util.Scanner;

public class Ex17A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int total = 0;                  //Variável que armazena a quantidade de elementos maiores que 35.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com Idade: ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] >= 35)
            {
                ++total;
            }
        }
        
        System.out.println("Quantidade de Pessoas com Idade Acima de 35 Anos: " +total);
    }
}
