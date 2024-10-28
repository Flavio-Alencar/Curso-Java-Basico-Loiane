//Exercício 03 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Escreva uma classe para representar um Aluno. Adicione atributos relacionados 
//às caracteristicas de um Aluno, como nome, matricula, curso que está matriculado, 
//nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva 
//um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em
//uma determinada disciplina. Escreva um programa para testar essa classe, que
//pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, 
//mostra as notas e mostra se o aluno foi aprovado ou não.
//Autor: Flávio Alencar - 27OUT24 - 10h39 AM
//Vinculado à classe Aluno.

package exercicios.Lista08;
import java.util.Scanner;

public class Ex03L08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
                
        System.out.print("Digite o Nome: ");
        aluno1.setNome(scan.nextLine());
        System.out.println();
        
        System.out.print("Digite a Matricula: ");
        aluno1.setMatricula(scan.nextLine());
        System.out.println();
        
        System.out.print("Digite o Curso: ");
        aluno1.setCurso(scan.nextLine());
        System.out.println();
        
        for(int i = 0; i < aluno1.getDisciplinas().length; i++){
            System.out.print("Digite a Disciplina " +(i+1) +": ");
            aluno1.setDisciplinasPos(i, scan.nextLine());
            System.out.println();
        }
        
       for(int i = 0; i < aluno1.getDisciplinas().length; i++){
           System.out.println("Insira as Notas da Disciplina " +aluno1.getDisciplinas()[i] +": ");
           for(int j = 0; j < aluno1.getNotas()[i].length; j++){
               System.out.print("Nota " +(j+1) +": ");
               aluno1.setNotasPos(i, j, scan.nextDouble());
           }
           System.out.println("");
       }
       
       aluno1.mostrarInfo();
       aluno1.calcularMedia();
    }
           
}        
         
        
        
      
    

