//Exercício 07 - Aula 15

//Faça um Programa que leia três números e mostre o maior e o menor deles.
//Usando o Comando if - else
//Autor: Flávio Alencar - 28AGO24 - 15h31

import java.util.Scanner; //Importando a classe Scanner
public class Ex07A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double n1; //Primeiro Número
        double n2; //Segundo Número.
        double n3; //Terceiro Número.
        //-----------------------------------
        
        System.out.print("Digite o Primeiro Número: ");
        n1 = scan.nextDouble();
        System.out.println("                        ");
        
        System.out.print("Digite o Segundo Número: ");
        n2 = scan.nextDouble();
        System.out.println("                        ");      
        
        System.out.print("Digite o Terceiro Número: ");
        n3 = scan.nextDouble();
        System.out.println("                        ");
        
        if (n1 > n2 && n1 > n3 && n2 > n3)
        {
            System.out.println("O maior Número é: " +n1);
            System.out.println("O menor Número é: " +n3);
        }
        
        if (n1 > n2 && n1 > n3 && n2 < n3)
        {
            System.out.println("O maior Número é: " +n1);
            System.out.println("O menor Número é: " +n2);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 < n3 )
        {
            System.out.println("O maior Número é: " +n2);
            System.out.println("O menor Número é: " +n1);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 > n3 )
        {
            System.out.println("O maior Número é: " +n2);
            System.out.println("O menor Número é: " +n3);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 > n1)
        {
            System.out.println("O maior Número é: " +n3);
            System.out.println("O menor Número é: " +n1);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 < n1 )
        {
            System.out.println("O maior Número é: " +n3);
            System.out.println("O menor Número é: " +n2);
            
        }
        
    }
}    
