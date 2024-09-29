//Exercício 19 - Aula 19
//Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas
//informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa
//que calcule a média aritmética simples das notas informadas armazenando o
//resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados
//exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7
//o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 29SET24 - 16h29 AM

import java.util.Scanner;

public class Ex19A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] nota1 = new int[10];            //Array Nota1
        int[] nota2 = new int[10];            //Array Nota2
        double[] result = new double[10];     //Array Média das Notas.
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < nota1.length; i++)
        {
            int count = i+1;
            System.out.println("          Aluno " +count);
            System.out.printf("Entre com a Nota 1 [0-100]: ");
            nota1[i] = scan.nextInt();
            System.out.printf("Entre com a Nota 2 [0-100]: ");
            nota2[i] = scan.nextInt();
            System.out.println();
             
            
            int soma = nota1[i] + nota2[i];
            result[i] = (double) soma/2;
        }
        
        for (int i = 0; i < 10; i++)
        {
            int count = i+1;
            
            if (result[i] >= 70)
            {
                System.out.println("Aluno " +count);
                System.out.println("APROVADO");
                System.out.println("Média: " +result[i]);
                System.out.println();
            }
            else
            {
                System.out.println("Aluno " +count);
                System.out.println("REPROVADO");
                System.out.println("Média: " +result[i]);
                System.out.println();
                
            }
        }
    }
}
