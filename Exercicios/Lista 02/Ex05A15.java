//Exercício 05 - Aula 15

//Faça um programa para a leitura de duas notas parciais de um aluno.
//Usando o Comando if - else
//Autor: Flávio Alencar - 27AGO24 - 21h26

import java.util.Scanner; //Importando a classe Scanner

public class Ex05A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double n1; //nota 1
        double n2; //nota 2
        double n3; //nota 3
        double media; //media das notas
        
        System.out.println("Cálculo da Média das Provas");
        System.out.println("                           ");
        System.out.print("Digite o valor da Primeira Nota: ");
        n1 = scan.nextDouble();
        
        System.out.print("Digite o valor da Segunda Nota: ");
        n2 = scan.nextDouble();
        
        System.out.print("Digite o valor da Terceira Nota: ");
        n3 = scan.nextDouble();
        
        System.out.println("                           ");
        
        media = ((n1 + n2 + n3)/3);
        
        if (media >= 7 && media < 10)
        {
            System.out.println("Média Final: " +media);
            System.out.print("Aprovado");
        }
        
        else if (media < 7)
        {
            System.out.println("Média Final: " +media);
            System.out.print("Reprovado");
        }
        
        else if (media == 10)
        {
            System.out.println("Média Final: " +media);
            System.out.print("Aprovado com Distinção");            
        }        
        
    }
    
}
