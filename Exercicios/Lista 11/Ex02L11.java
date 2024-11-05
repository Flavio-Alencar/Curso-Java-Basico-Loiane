//Exercício 02 - Lista 11
//Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso
//tem um Professor, que possui nome, departamento e email. Cada Curso também pode 
//ter vários alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas. Escreva 
//um programa teste que crie um Curso com 5 alunos, e que preça para o usuário entrar
//com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo
//está aprovado (media maior ou igual a 7), e qual é a média da turma. 
//Autor: Flávio Alencar - 03OUT24 - 12h13 PM
//Vinculado a classe Curso

package exercicios.Lista11;
import java.util.Scanner;

public class Ex02L11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Curso curso = new Curso("Ciência da Computação", "08hs às 12hs");
        curso.setNomeCurso("Ciência da Computação");
        curso.setHorario("08hs às 12hs");
        
        Professor professor = new Professor("Prof(a) Loiane", "Computação", "dcc@unb.edu.br");
        professor.setNome("Prof(a) Loiane");
        professor.setDepartamento("Computação");
        professor.seteMail("dcc@unb.edu.br");
        
        Aluno[] alunos = new Aluno[5];
        double[] notas = new double[4];
        
        System.out.print("CADASTRO DE ALUNO");
        System.out.println();
        for(int i = 0; i < alunos.length; i++){
            System.out.print("Digite o Nome do Aluno: ");
            String nome = scan.nextLine();
            System.out.println();
                                    
            System.out.print("Digite a Matricula do Aluno: ");
            String matricula = scan.nextLine();
            System.out.println();
                                    
            for(int j = 0; j < notas.length; j++){
                System.out.print("Digite a nota " +(j+1) +": ");
                notas[j] = scan.nextDouble();
                scan.nextLine();
                System.out.println("");
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
}
