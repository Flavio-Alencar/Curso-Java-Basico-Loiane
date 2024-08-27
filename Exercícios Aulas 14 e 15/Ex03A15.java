//Exercício 03 - Aula 15

//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
//Usando o Comando if-else if - else
//Autor: Flávio Alencar - 27AGO24 - 16h36

import java.util.Scanner; //Importando a classe Scanner

public class Ex03A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String gender;    
        
        System.out.print("Enter the Gender (M for male or F for female): "); //Comando print a entreada de dados será feita na mesma linha.
        gender = scan.next();
        System.out.printf("%s%n", "                                     "); //Comando parecido com o println.
        
        if (gender.equalsIgnoreCase("m")) //Como a vaeriavel gender esta definida pela classe String, é necessário usar o comando .equalsIgnoreCase("") para fazer uma relação logica com a classe String.
        {
            System.out.println("Male");
        }
        else if (gender.equalsIgnoreCase("f"))
        {
            System.out.println("Female");            
        }
        else
        {
            System.out.println("Invalid Gender");           
        }
        
           
    }
    
}
