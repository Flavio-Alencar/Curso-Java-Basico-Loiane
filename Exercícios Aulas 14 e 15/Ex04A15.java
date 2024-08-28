//Exercício 04 - Aula 15

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
//Usando o Comando if - else
//Autor: Flávio Alencar - 27AGO24 - 20h49

import java.util.Scanner; //Importando a classe Scanner


public class Ex04A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String letra;    
        
        System.out.print("Digite uma letra: "); //Comando print a entreada de dados será feita na mesma linha.
        letra = scan.next();
        System.out.println("                                     "); //Comando para pular uma linha.
        
        if (letra.equalsIgnoreCase("a")) //Como a vaeriavel gender esta definida pela classe String, é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String.
        {
            System.out.println("A Letra Digitada é uma Vogal");
            
        }
        
        else if (letra.equalsIgnoreCase("e")) //Como a variavel gender esta definida pela classe String é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String. 
        {                                 
            System.out.println("A Letra Digitada é uma Vogal");
            
        }
        
        else if (letra.equalsIgnoreCase("i")) //Como a variavel gender esta definida pela classe String é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String. 
        {                                 
            System.out.println("A Letra Digitada é uma Vogal");
            
        }
        
        else if (letra.equalsIgnoreCase("o")) //Como a variavel gender esta definida pela classe String é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String. 
        {                                 
            System.out.println("A Letra Digitada é uma Vogal");
            
        }
        
        else if (letra.equalsIgnoreCase("u")) //Como a variavel gender esta definida pela classe String é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String. 
        {                                 
            System.out.println("A Letra Digitada é uma Vogal");
            
        }
        
        else
        {
           System.out.println("A Letra Digitada é uma Consoante"); 
        }

    }        

  }
