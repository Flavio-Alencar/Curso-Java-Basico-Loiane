//Exercício 23 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique
//se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do 
//vetor não for par o processo de repetição para percorrer os elementos do vetor
//deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir
//este propósito.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 15h20 AM

import java.util.Scanner;

public class Ex23A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array vetorA
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro: ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] % 2 != 0)
            {
                break;
            }
            
        }
        
    }
    
}
