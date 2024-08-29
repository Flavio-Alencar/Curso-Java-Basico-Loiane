//Exercício 09 - Aula 15

//Faça um Programa que leia três números e mostre-os em ordem decrescente.
//Usando o Comando if - else
//Autor: Flávio Alencar - 28AGO24 - 20h45

import java.util.Scanner; //Importando a classe Scanner

public class Ex09A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int n1; //Primeiro Número Inteiro
        int n2; //Segundo Número Inteiro
        int n3; //Terceiro Número Inteiro
        //-----------------------------------
        
        System.out.print("Digite o Primeiro Número Inteiro: ");
        n1 = scan.nextInt();
        System.out.println("                        ");
        
        System.out.print("Digite o Segundo Número Inteiro: ");
        n2 = scan.nextInt();
        System.out.println("                        ");      
        
        System.out.print("Digite o Número Inteiro: ");
        n3 = scan.nextInt();
        System.out.println("                        ");
        
        if (n1 > n2 && n1 > n3 && n2 > n3)
        {
            System.out.println("Sequência em Ordem Decrescente: " +n1 +"-" +n2 +"-" +n3);
        }
        
        if (n1 > n2 && n1 > n3 && n2 < n3)
        {
            System.out.println("Sequência em Ordem Decrescente: " +n1 +"-" +n3 +"-" +n2);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 < n3 )
        {
            System.out.println("Sequência em Ordem Decrescente: " +n2 +"-" +n3 +"-" +n1);
        }
        
        else if (n2 > n1 && n2 > n3 && n1 > n3 )
        {
           System.out.println("Sequência em Ordem Decrescente: " +n2 +"-" +n1 +"-" +n3);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 > n1)
        {
            System.out.println("Sequência em Ordem Decrescente: " +n3 +"-" +n2 +"-" +n1);
        }
        
        else if (n3 > n1 && n3 > n2 && n2 < n1 )
        {
            System.out.println("Sequência em Ordem Decrescente: " +n3 +"-" +n1 +"-" +n2);
            
        }
        
    }
    
}
