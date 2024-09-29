//Exercício 20 - Aula 15
//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
//Autor: Flávio Alencar - 31AGO24 - 10h36

import java.util.Scanner; //Importando a classe Scanner

public class Ex20A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double nota1;           //Valor da Primeira Nota.
        double nota2;           //Valor da Segunda Nota.
        double nota3;           //Valor da Terceira Nota.
        double media;           //Valor da Média das Notas.
               
        //-----------------------------------
        
        System.out.print("Digite o Valor da Primeira Nota: ");
        nota1 = scan.nextDouble();
        System.out.println("                               ");
        
        System.out.print("Digite o Valor da Segunda Nota: ");
        nota2 = scan.nextDouble();
        System.out.println("                               ");
        
        System.out.print("Digite o Valor da Terceira Nota: ");
        nota3 = scan.nextDouble();
        System.out.println("                               ");
        
        media = ((nota1 + nota2 + nota3)/3);
        
        if (media == 10)
        {            
        System.out.println("------------------------------------------");
        System.out.println("                BOLETIM                   ");
        System.out.println("------------------------------------------");
        System.out.println("                                          ");
        System.out.printf("Média: %.2f%n", media);
        System.out.println("                                          ");
        System.out.println("        APROVADO COM DISTINÇÃO            ");             
        }

        else if (media >= 7.0)
        {
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("               APROVADO                   ");             
        }
        
        else if (media < 7.0)
        {
            System.out.println("------------------------------------------");
            System.out.println("                BOLETIM                   ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("                                          ");
            System.out.println("               REPROVADO                   "); 
        }
        
    }      
              
                
}
        
       

