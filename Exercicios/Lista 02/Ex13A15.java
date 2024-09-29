//Exercício 13 - Aula 15

//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
//se digitar outro valor deve aparecer valor inválido.
//Usando o Comando if - else
//Autor: Flávio Alencar - 29AGO24 - 13h19

import java.util.Scanner; //Importando a classe Scanner 

public class Ex13A15
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int diasemana;     //Valor do dia da Semana.        
        
        //-----------------------------------
        
        System.out.println("--------------------------------------------------------");
        System.out.println("                    Dia da Semana                       ");
        System.out.println("--------------------------------------------------------");
        System.out.print("Digite um Número Inteiro Correspondente ao Dia da Semana: ");
        diasemana = scan.nextInt();
        System.out.println("                                                        ");
        
        switch (diasemana)
        {
            case (1): System.out.println("Domingo"); break;
            case (2): System.out.println("Segunda-Feira"); break;
            case (3): System.out.println("Terça-Feira"); break;
            case (4): System.out.println("Quarta-Feira"); break;
            case (5): System.out.println("Quinta-Feira"); break;
            case (6): System.out.println("Sexta-Feira"); break;
            case (7): System.out.println("Sábado"); break;
            default:  System.out.println("Valor Inválido"); break;
        }
        
    }
    
}
