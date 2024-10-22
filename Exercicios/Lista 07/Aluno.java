//Exercício 03 - Lista 07
//Escreva uma class para representar um Aluno. Adicione atributos relacionados às
//caracteristicas de um Aluno, como nome, matricula, curso que está matriculado,
//nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva
//um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em
//uma determinada disciplina. Escreva um programa para testar essa classe, que pede
//as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra
//as notas e mostra se o aluno foi aprovado ou não. 
//Autor: Flávio Alencar - 21OUT24 - 10h00 AM

package exercicios.Lista07;

public class Aluno
{   
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    String nome;
    String matricula;
    String curso;
    String[] disciplinas; 
    double[][] notasDisciplinas;
    //--------------------------------------------------------------------------
    
    void mostarInfo()
    {
        System.out.println("          FACULDADE TABAJARA          ");
        System.out.println("--------------------------------------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Matricula: %s%n", matricula);
        System.out.printf("Curso: %s%n", curso);
        System.out.println();
        
        for (int i = 0; i < disciplinas.length; i++)
        {
            System.out.println("Notas da Disciplina: " +disciplinas[i]);
            
            for(int j = 0; j < notasDisciplinas[i].length; j++)
            {
                System.out.print("Nota " +(j+1) +": " +notasDisciplinas[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
    
    double CalcularMedia(int indice)
    {
        double soma = 0;
        for(int i=0; i < notasDisciplinas[indice].length; i++)
        {
            soma += notasDisciplinas[indice][i];
        }
        
        double media = soma/notasDisciplinas[indice].length;
        return media;
    }
    
    boolean VerificarAprovado(int indice)
    {
        double soma = 0;
        for(int i=0; i < notasDisciplinas[indice].length; i++)
        {
            soma += notasDisciplinas[indice][i];
        }
        
        double media = soma/notasDisciplinas[indice].length;
        
        if(media >= 7)
        {
            return true;
        }
        else
        {
            return false;
        }
          
    }
    
}
