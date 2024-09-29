//Exercício 15 - Aula 17

//A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
//Faça um programa capaz de gerar a série até o n−ésimo termo.
//fn = n1 + n2  Sequenia de Fibonacci
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 16SET24 - 20h07

import java.util.Scanner;

public class Ex15A17
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int nTermo = 0;                      //Variável que armazena o valor do n-termo da sequencia de Fibonacci.
        int n1 = 1;                          //Variável que armazena o valor n-1.
        int n2 = 0;                          //Variável que armazena o valor n-2
        int fn = 1;                          //Variável que armazena a Sequencia de Fibonacci.
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Digite o Último Termo da Sequência de Finonacci: ");
        nTermo = scan.nextInt();
        System.out.println();
        
        for (int i = 1; i <= nTermo; i++)
        {
            System.out.print(fn +" ");
            fn = n1 + n2;            
            n2 = n1;
            n1 = fn;
                        
        }
        
        
    }
}
