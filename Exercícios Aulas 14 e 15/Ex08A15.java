//Exercício 08 - Aula 15

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
//Usando o Comando if - else
//Autor: Flávio Alencar - 28AGO24 - 15h31

import java.util.Scanner; //Importando a classe Scanner

public class Ex08A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double n1; //Primeiro preço
        double n2; //Segundo preço.
        double n3; //Terceiro preço.
        //-----------------------------------
        
        System.out.print("Digite o Primeiro Preço (R$): ");
        n1 = scan.nextDouble();
        System.out.println("                        ");
        
        System.out.print("Digite o Segundo Preço (R$): ");
        n2 = scan.nextDouble();
        System.out.println("                        ");      
        
        System.out.print("Digite o Terceiro Preço (R$): ");
        n3 = scan.nextDouble();
        System.out.println("                        ");
        
        if (n1 > n2 && n1 > n3 && n2 > n3)
        {
            System.out.println("Você deve Comprar o Produco com o Preço de : " +"R$" +n3);
        }
        
        if (n1 > n2 && n1 > n3 && n2 < n3)
        {
            System.out.println("Você deve Comprar o Produco com o Preço de: " +"R$" +n2);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 < n3 )
        {
            System.out.println("Você deve Comprar o Produco com o Preço de: " +"R$" +n1);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 > n3 )
        {
           System.out.println("Você deve Comprar o Produco com o Preço de: " +"R$" +n3);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 > n1)
        {
            System.out.println("Você deve Comprar o Produco com o Preço de: " +"R$" +n1);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 < n1 )
        {
            System.out.println("Você deve Comprar o Produco com o Preço de: " +"R$" +n2);
            
        }
        
    }
    
}
