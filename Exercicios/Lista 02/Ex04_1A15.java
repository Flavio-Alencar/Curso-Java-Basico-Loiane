//Exercício 04 - Aula 15

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
//Usando o Comando switch - case
//Autor: Flávio Alencar - 27AGO24 - 20h49

import java.util.Scanner; //Importando a classe Scanner

public class Ex04_1A15
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        char letra;    
        
        System.out.print("Digite uma Letra: "); //Comando print a entreada de dados será feita na mesma linha.
        letra = scan.next().charAt(0);         //comando para a leitura de um caractere char
        System.out.println("                                     "); //Comando para pular uma linha.
        
        switch (letra)
        {
            case 'A': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'a': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'E': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'e': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'I': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'i': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'O': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'o': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'U': System.out.println("A Letra Digitada é uma Vogal"); break;
            case 'u': System.out.println("A Letra Digitada é uma Vogal"); break;
            default:  System.out.println("A Letra Digitada é uma Consoante"); break;
        }
    }
    
}
