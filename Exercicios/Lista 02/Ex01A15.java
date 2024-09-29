//Exercício 01 - Aula 15

//Faça um Programa que peça dois números e imprima o maior deles.
//Autor: Flávio Alencar - 26AGO24 - 21h16

import java.util.Scanner; //Importanto a classe Scanner

public class Ex01A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n1; //Armazena o 1º número inteiro
        int n2; //Armazena o 2º número inteiro
        
        System.out.print("Enter First Integer: ");
        n1 = scan.nextInt();
        System.out.println("                   ");
        
        System.out.print("Enter Second Integer: ");
        n2 = scan.nextInt();
        System.out.println("                   ");
        
        if (n1 == n2)
        {
            System.out.print("The Numbers are Equal");
        }
        if (n1 < n2)
        {
            System.out.print("The Higher number is: " +n2);         
        }
        if (n1 > n2)
        {
            System.out.println("The Higher Number is: " +n1);
        }
    }


}
