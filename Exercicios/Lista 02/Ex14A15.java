//Exercício 14 - Aula 15

//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média.
//O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C 
//ou “REPROVADO” se o conceito for D ou E.
//Usando o Comando if - else switch - case
//Autor: Flávio Alencar - 29AGO24 - 21h56

import java.util.Scanner; //Importando a classe Scanner 

public class Ex14A15 
{
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double nota1;           //Valor da Primeira Nota.
        double nota2;           //Valor da Segunda Nota.
        double media;           //Valor da Média das Notas.
        char conceito = '*';    //Conceito.       
        
        //-----------------------------------
        
        System.out.print("Digite o Valor da Primeira Nota: ");
        nota1 = scan.nextDouble();
        System.out.println("                               ");
        
        System.out.print("Digite o Valor da Segunda Nota: ");
        nota2 = scan.nextDouble();
        System.out.println("                               ");
        
        media = ((nota1 + nota2)/2);
        
        if (media >= 9.0 && media <= 10.0)
        {
            conceito = 'A';
        }
        
        else if (media >= 7.5 && media < 9.0)
        {
            conceito = 'B';
        }
        
        else if (media >= 6.0 && media < 7.5)
        {
            conceito = 'C';
        }
        
        else if (media >= 4.0 && media < 6.0)
        {
            conceito = 'D';
        }
        
        else if (media >= 0.0 && media < 4.0)
        {
            conceito = 'E';
        }
        
        switch(conceito)
        {
            case 'A':
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota1);
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota2);
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("Conceito: A");
            System.out.println("               APROVADO                   "); break;
            
            case 'B':
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota1);
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota2);
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("Conceito: B");
            System.out.println("               APROVADO                   "); break;
            
            case 'C':
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota1);
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota2);
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("Conceito: C");
            System.out.println("               APROVADO                   "); break;
            
            case 'D':
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota1);
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota2);
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("Conceito: D");
            System.out.println("               REPROVADO                   "); break;
            
            case 'E':
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota1);
            System.out.println("                                          ");
            System.out.printf("Valor da Primeira Nota: %.2f%n", nota2);
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("Conceito: E");
            System.out.println("               REPROVADO                   "); break;
            
            default: System.out.println("Valor Inválido");          
                
        }
        
    }         
        
}   
        
            
        
        
        

 