//Exercício 14 - Aula 17

//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade 
//de números pares e a quantidade de números impares.
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 16SET24 - 15h49

import java.util.Scanner;

public class Ex14A17 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int qntPar = 0;                           //Variável que armazena a quantidade de números pares
        int qntImpar = 0;                         //Variavel que armazena a quantidade de números ímpares
        //-----------------------------------------------------------------------------------------
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Digite um Número Inteiro: ");
            int num = scan.nextInt();
            System.out.println();
            int resto = num % 2;
            
            if (resto == 0)
            {
                ++qntPar;
            }
            
            else
            {
                ++qntImpar;
            }
        }
        
        System.out.println("Quantidade de Números Pares: " +qntPar);
        System.out.println("Quantidade de Números Impares: " +qntImpar);
        
    }
    
}
