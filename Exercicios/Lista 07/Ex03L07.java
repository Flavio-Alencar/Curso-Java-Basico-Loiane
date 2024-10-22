//Exercício 03 - Lista 07
//Escreva uma class para representar um Aluno. Adicione atributos relacionados às
//caracteristicas de um Aluno, como nome, matricula, curso que está matriculado,
//nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva
//um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em
//uma determinada disciplina. Escreva um programa para testar essa classe, que pede
//as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra
//as notas e mostra se o aluno foi aprovado ou não. 
//Autor: Flávio Alencar - 21OUT24 - 10h00 AM
//Vinculado à classe Aluno.

package exercicios.Lista07;
import java.util.Scanner;

public class Ex03L07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.print("Digite o Nome do Aluno: ");
        aluno.nome = scan.nextLine();
        System.out.println();
        
        System.out.print("Digite o Nome do Curso: ");
        aluno.curso = scan.nextLine();
        System.out.println();
        
        System.out.print("Digite Matricula do Aluno: ");
        aluno.matricula = scan.nextLine();
        System.out.println();
        
        aluno.disciplinas = new String[3];
        
        for (int i = 0; i < aluno.disciplinas.length; i++)
        {
        System.out.print("Digite o Nome da Disciplina " +(i+1) +": ");
        aluno.disciplinas[i] = scan.nextLine();
        System.out.println();            
        }
        
        aluno.notasDisciplinas = new double[3][4];
        
        for (int i = 0; i < aluno.notasDisciplinas.length; i++)
        {
            System.out.println("Disciplina " +aluno.disciplinas[i] +": ");
            for(int j = 0; j < aluno.notasDisciplinas[i].length; j++)
            {
                System.out.print("Digite a Nota " +(j+1) +": ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
                System.out.println();                
            }
        }
        
        aluno.mostarInfo();
        
        for(int i = 0; i < aluno.disciplinas.length; i++)
        {
            if(aluno.VerificarAprovado(i))
            {
                System.out.print("Disciplina " +aluno.disciplinas[i]);
                System.out.println();
                System.out.print("Média: " +aluno.CalcularMedia(i));
                System.out.println();
                System.out.print("Status: APROVADO!");
                System.out.println();
            }
            else
            {
                System.out.print("Disciplina " +aluno.disciplinas[i] +" : REPROVADO");
                System.out.println();
                System.out.print("Média: " +aluno.CalcularMedia(i));
                System.out.println();
                System.out.print("Status: REPROVADO!");
                System.out.println();
            }
            System.out.println();    
        }
    }
}
