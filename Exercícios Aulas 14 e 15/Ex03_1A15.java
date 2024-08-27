//Exercício 03 - Aula 15

//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
//Usando o Comando switch - case
//Autor: Flávio Alencar - 27AGO24 - 17h30

import java.util.Scanner;

public class Ex03_1A15 
{
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        char gender;    
        
        System.out.print("Enter the Gender (M for male or F for female): ");
        gender = scan.next().charAt(0);
        System.out.printf("%s%n", "                                     ");
        
        switch(gender)
        {
            case 'M': System.out.println("Male"); break;
            case 'm': System.out.println("Male");break;
            case 'F': System.out.println("Female"); break;
            case 'f': System.out.println("Female"); break;
            default: System.out.println("Invalid Gender"); break;
            
        }
          
               
    }
   
}

