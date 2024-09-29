//Exercício 15 - Aula 15

//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. 
//Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Autor: Flávio Alencar - 30AGO24 - 14h02

import java.util.Scanner; //Importando a classe Scanner 

public class Ex15A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int lado1;     //Valor do Lado 1.
        int lado2;     //Valor do Lado 2.
        int lado3;     //Valor do Lado 3.
        
        //----------------------------------
        
        System.out.print("Digite o Valor do Lado 1 (Inteiro): ");
        lado1 = scan.nextInt();
        System.out.println("                        ");
        
        System.out.print("Digite o Valor do Lado 2 (Inteiro): ");
        lado2 = scan.nextInt();
        System.out.println("                        ");
        
        System.out.print("Digite o Valor do Lado 3 (Inteiro): ");
        lado3 = scan.nextInt();
        System.out.println("                        ");
        
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1)
        {
                  
            if (lado1 == lado2 && lado2 == lado3 && lado3 ==lado1)
            {
                System.out.println("Os Lados Formam um Triângulo Equilátero");                
            }
            
            else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1)
            {
            System.out.println("Os Lados Formam um Triângulo Isóceles!");
            }
        
            else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
            {
            System.out.println("Os Lados Formam um Triângulo Escaleno!");
            }
            
        }
        
        else
        {
            System.out.println("Os Lados NÃO Formam um Triângulo!");
            
        }
        
    }
}
