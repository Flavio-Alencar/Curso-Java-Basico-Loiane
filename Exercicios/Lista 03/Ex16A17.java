//Exercício 16 - Aula 17

//A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
//Faça um programa que gere a série até que o valor seja maior que 500.
//fn = n1 + n2  Sequenia de Fibonacci
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 16SET24 - 20h07

import java.util.Scanner;

public class Ex16A17
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int n1 = 1;                          //Variável que armazena o valor n-1.
        int n2 = 0;                          //Variável que armazena o valor n-2
        int fn = 1;                          //Variável que armazena a Sequencia de Fibonacci.
        //-----------------------------------------------------------------------------------------
        
        while (fn <= 500)
        {
            System.out.print(fn +" ");
            fn = n1 + n2;            
            n2 = n1;
            n1 = fn; 
            
        }
        
    }
}
