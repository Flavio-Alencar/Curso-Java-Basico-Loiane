//Exercício 06 - Aula 17

//Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
//Depois modifique o programa para que ele mostre os números um ao lado do outro.
//Method: do - while - if - else 
//Autor: Flávio Alencar - 13SET24 - 21h26 

import java.util.Scanner;

public class Ex06A17
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
        //                             Variaveis
        //----------------------------------------------------------------------
        int a = 1;                   //Variável nº 1.
        int b = 1;                   //Variável nº 2.
        //----------------------------------------------------------------------
        
        do
        {
            System.out.println(a);
            ++a;
        } while (a <= 20);
        
        for (b = 1; b <= 20; b++)
        {
            System.out.print(b +" ");
        }
        
        
    }
    
}
