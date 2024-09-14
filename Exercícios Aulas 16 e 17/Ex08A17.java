//Exercício 08 - Aula 17

//Faça um programa que leia 5 números e informe a soma e a média dos números.
//Method: do - while - if - else 
//Autor: Flávio Alencar - 13SET24 - 22h17 

import java.util.Scanner;

public class Ex08A17 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                             Variaveis
        //-----------------------------------------------------------------------------------
        int num = 0;                             //Variável que armazena o valor digitado.
        int soma = 0;                            //Variável que armazena a soma dos números.
        double media = 0;                        //Variável qeu armazena a média dos números.
        //-----------------------------------------------------------------------------------
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Digite um Número Inteiro: ");
            num = scan.nextInt();
            System.out.println();
            soma +=num;
        }
        
        media = (double)soma/5;
        
        System.out.println("Soma dos Números Digitados: " +soma);
        System.out.println("Média dos Números Digitados: " +media);
    }
    
}
