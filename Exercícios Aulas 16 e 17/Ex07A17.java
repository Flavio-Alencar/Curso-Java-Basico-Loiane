//Exercício 07 - Aula 17

//Faça um programa que leia 5 números e informe o maior número.
//Method: do - while - if - else 
//Autor: Flávio Alencar - 13SET24 - 21h26 

import java.util.Scanner;

public class Ex07A17
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                             Variaveis
        //-----------------------------------------------------------------------------------
        double num = 0;                             //Variável que armazena o valor digitado.
        double maxNum = Integer.MIN_VALUE;          //Variável que armazena o maior número.
        //-----------------------------------------------------------------------------------
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Digite um Número: ");
            num = scan.nextDouble();
            System.out.println();
            
            if (num > maxNum)
            {
                maxNum = num;
            }
                
        }
        
        System.out.println("O Maior Número Digitado foi: " +maxNum);
    }
    
}
