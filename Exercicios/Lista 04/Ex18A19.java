//Exercício 18 - Aula 19
//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo
//de pessoas. Escreva um programa que determine e escreva a menor e a maior idades
//e suas respectivas posições.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 29SET24 - 16h29 AM

import java.util.Scanner;

public class Ex18A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];     //Array 
        int maiorIdade = 0;                  //Variável que armazena a maior idade.
        int menorIdade = 200;                //Variável que armazena a menor idade.
        int pmaiorIdade = 0;                 //Variável que armazena a posição da maior idade.
        int pmenorIdade = 0;                 //Variável que armazena a posição da menor idade.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Entre com Idade: ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] > maiorIdade)
            {
                maiorIdade = vetorA[i];
                pmaiorIdade = i;
            }
            else if (vetorA[i] < menorIdade)
            {
                menorIdade = vetorA[i];
                pmenorIdade = i;
            }
        }
        
        System.out.println("//           RESULTADO");
        System.out.println("--------------------------------------------------");
        System.out.println("Maior Idade: " +maiorIdade);
        System.out.println();
        System.out.println("Posição da Maior Idade no Vetor: " +pmaiorIdade);
        System.out.println();
        System.out.println("Menor Idade: " +menorIdade);
        System.out.println();
        System.out.println("Posição da Menor Idade no Vetor: " +pmenorIdade);
    }
    
}
