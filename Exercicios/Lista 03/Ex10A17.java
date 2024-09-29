//Exercício 10 - Aula 17

//Faça um programa que receba dois números inteiros e gere os números inteiros 
//que estão no intervalo compreendido por eles.
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 13SET24 - 22h17

import java.util.Scanner;

public class Ex10A17 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int num1 = 0;                             //Variável que armazena o valor digitado.
        int num2 = 0;                             //Variável que armazena o segundo valor digitado.
        int maxNum = 0;                           //Variável que armazena o maior valor.
        int minNum = 0;                           //Variável que armazena o menor valor
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Digite um Número Inteiro: ");
        num1 = scan.nextInt();
        System.out.println();
        
        System.out.print("Digite um Segundo Número Inteiro: ");
        num2 = scan.nextInt();
        System.out.println();
        
        if (num1 > num2)
        {
            maxNum = num1;
            minNum = num2;
        }
        else
        {
            maxNum = num2;
            minNum = num1;
        }
        
       for (int i = minNum; i <= maxNum; i++)
        {
            System.out.println(i);
        }
        
    }    
}
