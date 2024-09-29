//Exercício 12 - Aula 17

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número 
//inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 13SET24 - 22h17

import java.util.Scanner;

public class Ex12A17 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int num1 = 0;                             //Variável que armazena o valor da tabuada.
        int produto = 0;                          //Variável que armazena o produto da tabuada.
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Digite o Valor da Tabuada [1 - 10]: ");
        num1 = scan.nextInt();
        System.out.println();
        
        System.out.printf("Tabuada de %s%n%n", num1);
        
        for(int i = 0; i <= 10; i++)
        {
            produto = num1 * i;
            System.out.printf("%d%s%d%s%d%n", num1, " X ", i, " = ", produto);
        }
        
    }
    
}
