//Exercício 02 - Aula 15

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
//Autor: Flávio Alencar - 26AGO24 - 21h40

import java.util.Scanner;

public class Ex02A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double n1;
        
        System.out.print("Enter a Real Number: "); //Gosto de utilizar o comando print ao invés de println pois a entrada de dado fica na mesma linha.
        n1 = scan.nextDouble();
        System.out.printf("%s%n", "           "); //esse Comando irá pular uma linha. o comando printf("%s%n", argumento) o %s indica a leitura de uma string e %n irá pular uma linha.
        
        if (n1 >= 0)
        {
            System.out.print("The Number is Positive");
        }
        else
        {
            System.out.print("The Number is Negative");
        }
    }
    
}
