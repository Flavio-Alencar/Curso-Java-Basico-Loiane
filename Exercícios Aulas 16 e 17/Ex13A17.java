//Exercício 12 - Aula 17

//Faça um programa que peça dois números, base e expoente, calcule e mostre 
//o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 16SET24 - 15h35

import java.util.Scanner;

public class Ex13A17
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int base = 0;                             //Variável que armazena o valor base.
        int expoente = 0;                         //Variável que armazena o valor expoente.
        int resultado = 1;                        //Variável que armazena o resultado.   
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Digite o Valor da Base [Inteiro]: ");
        base = scan.nextInt();
        System.out.println();
        
        System.out.print("Digite o Valor do Expoente [Inteiro]: ");
        expoente = scan.nextInt();
        System.out.println();
        
        for(int i = 1; i <= expoente; i++)
        {
            resultado *= base;            
        }
        
        System.out.println("O Resultado de " +base +" elevado a " +expoente +" é: " +resultado);
        
    }
    
}
